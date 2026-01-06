parser grammar SQLGrammarParser;

options { tokenVocab = SQLGrammarLexer; }

// --- القاعدة الأساسية للسكربت ---
sql_script
    : (statement SEMICOLON? | GO)* EOF
    ;

statement
    : dml_statement
    | cursor_statement
    | with_clause
    | print_statement
    | close_cursor
    | deallocate_cursor
    ;

dml_statement
    : select_statement
    | insert_statement
    | update_statement
    | delete_statement
    ;

// --- 1. تعليمات الاستعلام (DML) ---

select_statement
    : SELECT (DISTINCT | ALL)? (TOP NUMBER)? select_list
      (FROM table_source (join_clause)*)?
      (where_clause)?
      (group_by_clause)?
      (having_clause)?
      (order_by_clause)?
    ;

select_list
    : STAR
    | select_element (COMMA select_element)*
    | function_call (AS? column_name)? (COMMA select_element)* ;

select_element
    : expression (AS? column_name)?
    | column_name EQUAL expression
    ;

insert_statement
    : INSERT INTO? table_name
      (LPAREN column_list RPAREN)?
      (VALUES LPAREN expression_list RPAREN | select_statement)
    ;

update_statement
    : UPDATE table_name
      SET assignment (COMMA assignment)* (FROM table_source (join_clause)*)?
      (where_clause)?
    ;

delete_statement
    : DELETE FROM? table_name
      (where_clause)?
    ;

// --- 2. تعليمات الـ Cursor والتعليمات الإضافية ---

cursor_statement
    : declare_cursor
    | open_cursor
    | fetch_statement
    ;

declare_cursor
    : DECLARE cursor_name CURSOR
      (LOCAL | GLOBAL)?
      (FORWARD_ONLY | SCROLL)?
      (STATIC | KEYSET | DYNAMIC | FAST_FORWARD)?
      (READ_ONLY | SCROLL_LOCKS | OPTIMISTIC)?
      TYPE_WARNING?
      FOR
      select_statement
      (FOR UPDATE (OF column_name (COMMA column_name)*)?)?
    ;

open_cursor
    : OPEN (GLOBAL? cursor_name | cursor_variable_name)
    ;

fetch_statement
    : FETCH (fetch_direction FROM)?
      (GLOBAL? cursor_name | USER_VARIABLE)
      (INTO USER_VARIABLE (COMMA USER_VARIABLE)*)?
    ;

fetch_direction
    : NEXT | PRIOR | FIRST | LAST
    | ABSOLUTE (NUMBER | USER_VARIABLE)
    | RELATIVE (NUMBER | USER_VARIABLE)
    ;

close_cursor
    : CLOSE (GLOBAL? identifier_ref | USER_VARIABLE)
    ;

deallocate_cursor
    : DEALLOCATE (GLOBAL? identifier_ref | USER_VARIABLE)
    ;

print_statement
    : PRINT (expression | USER_VARIABLE)*
    ;

with_clause
    : WITH common_table_expression (COMMA common_table_expression)*
      select_statement
    ;

common_table_expression
    : identifier_ref (LPAREN column_list RPAREN)? AS LPAREN select_statement RPAREN
    ;

// --- 3. نظام التعبيرات (Expressions) والأولويات ---

expression
    : primary_expression
    | expression (STAR | DIV | MOD) expression
    | expression (PLUS | MINUS) expression
    | expression (EQUAL | NOT_EQUAL | LESS | LESS_EQUAL | GREATER | GREATER_EQUAL | LIKE) expression
    | expression NOT? IN (LPAREN (expression_list | select_statement) RPAREN | expression)
    | expression NOT? BETWEEN expression AND expression
    | expression IS NOT? NULL
    | NOT expression
    | expression AND expression
    | expression OR expression
    | CASE (when_clause)+ (ELSE expression)? END
    ;

when_clause
    : WHEN expression THEN expression
    ;

primary_expression
    : column_name
    | constant
    | USER_VARIABLE
    | function_call
    | LPAREN expression RPAREN
    | scalar_subquery
    ;

// --- 4. القواعد المساعدة (Helper Rules) ---

table_source
    : identifier_ref (AS? table_alias)?
    | LPAREN select_statement RPAREN AS? table_alias
    ;

join_clause
    : (INNER | LEFT OUTER? | RIGHT OUTER? | CROSS)? JOIN table_source ON expression
    ;

group_by_clause
    : GROUP BY group_by_item (COMMA group_by_item)* ;

group_by_item
    : expression
    | ROLLUP LPAREN expression_list RPAREN
    | CUBE LPAREN expression_list RPAREN
    | GROUPING SETS LPAREN grouping_set_list RPAREN
    ;

grouping_set_list
    : grouping_set (COMMA grouping_set)* ;

grouping_set
    : expression
    | LPAREN expression_list? RPAREN
    ;

order_by_clause
    : ORDER BY order_by_expression (COMMA order_by_expression)* ;

order_by_expression
    : expression (ASC | DESC)?
    ;

function_call
    : (IDENTIFIER | QUOTENAME | OBJECT_NAME | AVG | SUM | COUNT | MIN | MAX | GETDATE)
      LPAREN (STAR | expression_list)? RPAREN
    ;

scalar_subquery : LPAREN select_statement RPAREN ;
having_clause : HAVING expression ;
where_clause : WHERE expression ;
assignment : column_name (EQUAL | PLUS) expression ;
expression_list : expression (COMMA expression)* ;
column_list : identifier_ref (COMMA identifier_ref)* ;

// التصحيح النهائي لقاعدة المعرفات لضمان قبول النقاط والأقواس المربعة
identifier_ref
    : IDENTIFIER (DOT IDENTIFIER)?
    | (IDENTIFIER DOT)? DELIMITED_IDENTIFIER_BRACKET
    | DELIMITED_IDENTIFIER_BRACKET
    ;

constant
    : NUMBER | STRING | HEX_STRING | NULL
    ;

table_name           : identifier_ref ;
column_name          : identifier_ref ;
table_alias          : IDENTIFIER ;
cursor_name          : IDENTIFIER ;
cursor_variable_name : USER_VARIABLE ;