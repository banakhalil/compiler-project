parser grammar SQLGrammarParser;

options { tokenVocab = SQLGrammarLexer; }


sql_script
    : (statement | SEMICOLON)* EOF
    ;

statement
    : declare_cursor| open_cursor | fetch_statement |PRINT (USER_VARIABLE)*| close_cursor| deallocate_cursor |with_clause | common_table_expression | select_statement
    ;


declare_cursor:
DECLARE cursor_name CURSOR
(LOCAL | GLOBAL)?
(FORWARD_ONLY | SCROLL)?
(STATIC | KEYSET | DYNAMIC | FAST_FORWARD)?
(READ_ONLY | SCROLL_LOCKS| OPTIMISTIC)?
TYPE_WARNING?
FOR
select_statement
(FOR UPDATE (OF column_name (COMMA column_name)*)?)?SEMICOLON?;

cursor_name : IDENTIFIER;
column_name:IDENTIFIER;

//SELECT is meant to be added by Sarah or Hala
select_statement
    : SELECT (STAR | column_list) FROM identifier_ref
    ;
    column_list : identifier_ref (COMMA identifier_ref)* ;

    identifier_ref : IDENTIFIER | DELIMITED_IDENTIFIER_BRACKET ;


open_cursor:
OPEN
((GLOBAL) ? cursor_name | cursor_variable_name) SEMICOLON?;
cursor_variable_name : USER_VARIABLE;

fetch_statement: FETCH
      (fetch_direction FROM)?
      ( (GLOBAL)? cursor_name | USER_VARIABLE )
      (INTO USER_VARIABLE (COMMA USER_VARIABLE)*)?
      SEMICOLON?
    ;

fetch_direction: NEXT | PRIOR | FIRST | LAST | ABSOLUTE (NUMBER | USER_VARIABLE)| RELATIVE (NUMBER | USER_VARIABLE);

close_cursor
    : CLOSE ( (GLOBAL? identifier_ref) | USER_VARIABLE ) SEMICOLON?
    ;

deallocate_cursor
    : DEALLOCATE ( (GLOBAL? identifier_ref) | USER_VARIABLE ) SEMICOLON?
    ;

with_clause
    : WITH common_table_expression (COMMA common_table_expression)*
    ;

common_table_expression
    : identifier_ref (LPAREN column_list RPAREN)? AS LPAREN select_statement RPAREN
    ;




