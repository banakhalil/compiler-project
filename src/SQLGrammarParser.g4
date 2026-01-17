parser grammar SQLGrammarParser;

options { tokenVocab = SQLGrammarLexer; }

sql_sdecript
    : (statement SEMICOLON? | GO(SEMICOLON)?)* EOF
    ;

statement
    : dml_statement
    | ddlStatement
    | cursor_statement
    |declaration_statement
    | with_clause
    | print_statement
    | close_cursor
    | deallocate_cursor
    |while_statement
    |block_statement
    ;
//************************

while_statement
    : WHILE expression statement
    ;
block_statement
    : BEGIN (statement SEMICOLON?)* END
    ;

declaration_statement
    : DECLARE variable_declaration (COMMA variable_declaration)*
    ;

variable_declaration
    : USER_VARIABLE dataType (EQUAL expression)?
    ;



//****************
dml_statement
    : select_statement
    | insert_statement
    | update_statement
    | delete_statement
    ;


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
//    | function_call (AS? column_name)? (COMMA select_element)*
     ;

select_element
    : expression (AS? alias)?
    | identifier EQUAL expression
    ;

insert_statement
    : INSERT INTO? table_name
      (LPAREN column_list RPAREN)?
      (
          VALUES row_value_constructor_list
        | select_statement
        | DEFAULT VALUES
      )
    ;

row_value_constructor_list
    : row_value_constructor (COMMA row_value_constructor)*
    ;

row_value_constructor
    : LPAREN expression_list RPAREN
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
ddlStatement
    : createStatement
    | alterStatement
    | dropStatement
    | truncateStatement
    | otherStatements
    | returnStatement
    ;

createStatement
    : createTable
    | createDatabase
    | createSchema
    | createProcedure
    | createFunction
    | createIndex
    | createView
    ;

alterStatement
    : alterTable
    | alterDatabase
    | alterIndex
    | alterView
    | alterProcedure
    | alterFunction
    | alterSchema
    ;

dropStatement:
     DROP (TABLE | VIEW | DATABASE | PROCEDURE | PROC | FUNCTION | SCHEMA)
      (IF EXISTS)? fullIdentifier (COMMA fullIdentifier)*
    | DROP INDEX (IF EXISTS)? fullIdentifier (ON fullIdentifier)?
    ;
truncateStatement:
    TRUNCATE TABLE fullIdentifier
        ;
otherStatements:
SET (identifier | USER_VARIABLE) EQUAL (value | expression)
    ;

returnStatement:
RETURN expression (SEMICOLON)?
    ;

tableElement
    : columnDefinition
    | tableConstraint
    ;

columnDefinition
    : columnName=identifier
      (
          (dataType (columnConstraint)* (AS LPAREN expression RPAREN)?)
          | (AS LPAREN expression RPAREN)
      )
    ;

dataType
    : DOUBLE (PRECISION)?
    | FLOAT
    | REAL
    | (VARCHAR | NVARCHAR | CHAR | NCHAR | BINARY | VARBINARY)
        (LPAREN (NUMBER | MAX) RPAREN)?
        (LPAREN (NUMBER | AVG) RPAREN)?
        (COLLATE identifier)?
    | (DECIMAL | NUMERIC)
        (LPAREN NUMBER (COMMA NUMBER)? RPAREN)?
    | INT | INTEGER | BIGINT | SMALLINT | TINYINT
    | DATE | DATETIME | DATETIME2 (LPAREN NUMBER RPAREN)? | TIMESTAMP | TIME
    | TEXT | BIT | MONEY
    | UNIQUEIDENTIFIER
    | XML
    | JSON
    | INTERVAL (DAY | HOUR | MINUTE | SECOND) TO (SECOND | MINUTE | HOUR)
    ;

columnConstraint
    : (CONSTRAINT identifier)?
      (
          PRIMARY KEY (CLUSTERED | NONCLUSTERED)?
        | NOT NULL
        | NULL
        | UNIQUE (CLUSTERED | NONCLUSTERED)?
        | IDENTITY (LPAREN NUMBER (COMMA NUMBER)? RPAREN)?
        | DEFAULT defaultValue
        | CHECK LPAREN expression RPAREN
        | REFERENCES fullIdentifier
            (LPAREN identifier RPAREN)?
            (ON DELETE action)?
            (ON UPDATE action)?
      )
    ;

createTable
    : CREATE TABLE tableName=fullIdentifier
      LPAREN tableElement (COMMA tableElement)* RPAREN
      (ON fileGroup)? (TEXTIMAGE_ON fileGroup)?
    ;

createDatabase
    : CREATE DATABASE identifier
    ;

createSchema
    : CREATE SCHEMA identifier (AUTHORIZATION identifier)?
    ;

createProcedure
    : CREATE (PROCEDURE | PROC) fullIdentifier
      (LPAREN parameterList? RPAREN | parameterList)?
      AS
      BEGIN
          (statement SEMICOLON?)*
      END
    ;

createFunction
    : CREATE FUNCTION fullIdentifier
      (LPAREN parameterList? RPAREN)?
      RETURNS dataType
      AS
      BEGIN
          (statement SEMICOLON?)*
      END
    ;
createIndex
    : CREATE (UNIQUE)? (CLUSTERED | NONCLUSTERED)? INDEX fullIdentifier
      ON fullIdentifier LPAREN indexColumn (COMMA indexColumn)* RPAREN
    ;

indexColumn
    : identifier (ASC | DESC)?
    ;

createView
    : CREATE VIEW fullIdentifier AS select_statement
    ;
alterTable
    : ALTER TABLE fullIdentifier
      alterTableAction (COMMA alterTableAction)*
    ;

alterTableAction
    : (ADD (columnDefinition | tableConstraint))
    | (DROP (COLUMN | CONSTRAINT)? identifier)
    | (ALTER COLUMN identifier dataType)
    ;

alterDatabase
    : ALTER DATABASE identifier (MODIFY NAME EQUAL identifier | SET identifier identifier)
    ;

alterIndex
    : ALTER INDEX (identifier | ALL) ON fullIdentifier (REBUILD | DISABLE)
    ;

alterView
    : ALTER VIEW fullIdentifier AS select_statement
    ;

alterProcedure
    : ALTER (PROCEDURE | PROC) fullIdentifier
      (LPAREN parameterList? RPAREN | parameterList)?
      AS
      BEGIN
          (statement SEMICOLON?)*
      END
    ;

alterFunction
    : ALTER FUNCTION fullIdentifier
      (LPAREN parameterList? RPAREN)?
      RETURNS dataType
      AS
      BEGIN
          (statement SEMICOLON?)*
      END
    ;

alterSchema
    : ALTER SCHEMA identifier
      TRANSFER (OBJECT DOUBLE_COLON)? fullIdentifier
    ;


tableConstraint
    : (CONSTRAINT identifier)?
      (
          PRIMARY KEY (CLUSTERED | NONCLUSTERED)? LPAREN identifier (COMMA identifier)* RPAREN
        | UNIQUE (CLUSTERED | NONCLUSTERED)? LPAREN identifier (COMMA identifier)* RPAREN
        | FOREIGN KEY LPAREN identifier (COMMA identifier)* RPAREN
           REFERENCES fullIdentifier
               (LPAREN identifier (COMMA identifier)* RPAREN)?
            (ON DELETE action)?
            (ON UPDATE action)?
        | CHECK LPAREN expression RPAREN
      )
    ;



parameterList
    : parameter (COMMA parameter)*
    ;

parameter
    : (USER_VARIABLE | identifier) dataType (EQUAL defaultValue)? (OUTPUT)?
    ;

fileGroup
    : identifier | PRIMARY
    ;

action : CASCADE | (NO ACTION) | (SET NULL) | (SET DEFAULT) | RESTRICT ;

defaultValue
    : STRING
    | NUMBER
    | MINUS? NUMBER
    | NULL
    | CURRENT_TIMESTAMP
    | identifier (LPAREN (expression (COMMA expression)*)? RPAREN)?
    ;

columnList
    : (STAR | identifier (COMMA identifier)*)
    ;
identifier
    : IDENTIFIER
    | DELIMITED_IDENTIFIER_BRACKET
    | DELIMITED_IDENTIFIER_QUOTE
    | anyKeywordAsIdentifier
    ;

anyKeywordAsIdentifier
    : AVG | SUM | COUNT | MIN | MAX
    | NAME | VALUE | ID | CODE | STATUS | TYPE | DATE | TIME | TEXT | RECOVERY
    | FULL | SIMPLE | LOG | GETDATE | DATEADD | DATEDIFF | NEWID
    | SYSDATETIMEOFFSET | SYSDATETIME | CLUSTERED | NONCLUSTERED | AS
    | IF | NULL | ON | YEAR | MONTH | DAY | USER | ROLE | KEY
    ;

fullIdentifier
    : identifier (DOT identifier)*
    ;
valueList
    : value (COMMA value)*
    ;

value
    : identifier (LPAREN (expression (COMMA expression)*)? RPAREN)?
    | USER_VARIABLE
    | NUMBER
    | STRING
    | NULL
    ;



//********************************

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


//************************************
expression
    : primary_expression
    | expression (STAR | DIV | MOD) expression
    | expression (PLUS | MINUS) expression
    | expression (EQUAL | NOT_EQUAL | LESS | LESS_EQUAL | GREATER | GREATER_EQUAL | LIKE) expression
    | expression NOT? IN (LPAREN (expression_list | select_statement) RPAREN | expression)
    | expression NOT? BETWEEN expression AND expression
    | expression IS NOT? NULL
        | exists_predicate
    | NOT exists_predicate
        | NOT expression
    | scalar_subquery
    | expression AND expression
    | expression OR expression
    | CASE (when_clause)+ (ELSE expression)? END
    ;

exists_predicate
    : EXISTS subquery
    | NOT EXISTS subquery
    ;
subquery
    : LPAREN select_statement RPAREN
    ;


when_clause
    : WHEN expression THEN expression
    ;

primary_expression
    : column_name
    | constant
    | identifier
    | USER_VARIABLE
    | function_call
    | LPAREN expression RPAREN
    | scalar_subquery
    ;


table_source
    : identifier_ref (AS? table_alias)?
    | LPAREN select_statement RPAREN AS? table_alias
    ;

join_clause
    : (INNER | LEFT OUTER? | RIGHT OUTER? | FULL OUTER |CROSS )? JOIN table_source ON expression
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
    : function_name LPAREN (STAR | expression_list)? RPAREN
    ;
function_name
    : IDENTIFIER
    | AVG | SUM | COUNT | MIN | MAX | GETDATE
    | QUOTENAME | OBJECT_NAME
    ;

scalar_subquery : LPAREN select_statement RPAREN ;
having_clause : HAVING expression ;
where_clause : WHERE expression ;
assignment : column_name (EQUAL | PLUS) expression ;
expression_list : expression (COMMA expression)* ;
column_list : identifier_ref (COMMA identifier_ref)* ;

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

alias
    : identifier
    | STRING
    ;