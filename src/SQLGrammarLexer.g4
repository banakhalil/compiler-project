//
//lexer grammar SQLGrammarLexer;
//
//options {
//    caseInsensitive = true;
//}
////Modification group
//UPDATE    : 'UPDATE' ;
//DELETE   : 'DELETE' ;
//INSERT   : 'INSERT' ;
//SET   : 'SET' ;
//VALUES   : 'VALUES' ;
//MERGE  : 'MERGE' ;
//INTO   : 'INTO' ;
//TRUNCATE    : 'TRUNCATE' ;
//BULK  : 'BULK' ;
//IDENTITY_INSERT    :  'IDENTITY_INSERT' ;
//READTEXT   : 'READTEXT' ;
//UPDATETEXT    : 'UPDATETEXT' ;
//WRITETEXT     : 'WRITETEXT' ;
//
////Query group
//SELECT  :  'SELECT' ;
//FROM  :  'FROM' ;
//WHERE  :  'WHERE' ;
//BY : 'BY' ;
//GROUP   :  'GROUP' ;
//HAVING  : 'HAVING' ;
//UNION    : 'UNION' ;
//INTERSECT    : 'INTERSECT' ;
//EXCEPT  : 'EXCEPT' ;
//ORDER  : 'ORDER' ;
//DISTINCT    : 'DISTINCT' ;
//ASC  : 'ASC' ;
//DESC   : 'DESC' ;
//OFFSET    : 'OFFSET' ;
//TOP  : 'TOP' ;
//JOIN  : 'JOIN' ;
//ON  : 'ON' ;
//INNER    : 'INNER' ;
//OUTER    : 'OUTER' ;
//LEFT  : 'LEFT' ;
//RIGHT : 'RIGHT' ;
//FULL  : 'FULL' ;
//CROSS   : 'CROSS' ;
//PERCENT  : 'PERCENT' ;
//BROWSE    : 'BROWSE' ;
//COMPUTE    : 'COMPUTE' ;
//CONTAINS    :  'CONTAINS' ;
//CONTAINSTABLE     : 'CONTAINSTABLE' ;
//CURRENT  : 'CURRENT' ;
//FETCH   : 'FETCH' ;
//FOR   : 'FOR' ;
//FREETEXT     :  'FREETEXT' ;
//FREETEXTTABLE    : 'FREETEXTTABLE' ;
//IDENTITYCOL     :  'IDENTITYCOL' ;
//OPENDATASOURCE     :  'OPENDATASOURCE' ;
//OPENQUERY     :  'OPENQUERY' ;
//OPENROWSET    : 'OPENROWSET' ;
//OPENXML    :  'OPENXML' ;
//OPTION     : 'OPTION' ;
//OVER  : 'OVER' ;
//PIVOT : 'PIVOT' ;
//SEMANTICKEYPHRASETABLE     : 'SEMANTICKEYPHRASETABLE' ;
//SEMANTICSIMILARITYDETAILSTABLE    :  'SEMANTICSIMILARITYDETAILSTABLE' ;
//SEMANTICSIMILARITYTABLE    : 'SEMANTICSIMILARITYTABLE' ;
//TABLESAMPLE    : 'TABLESAMPLE' ;
//UNPIVOT     : 'UNPIVOT' ;
//WITH  : 'WITH' ;
//WITHINGROUP    : 'WITHINGROUP' ;
//
////Logical group
//ALL :  'ALL' ;
//ANY  : 'ANY' ;
//SOME : 'SOME' ;
//IS  :  'IS' ;
//AND : 'AND' ;
//OR   :  'OR' ;
//NOT  : 'NOT' ;
//IN  : 'IN' ;
//BETWEEN  : 'BETWEEN' ;
//LIKE  : 'LIKE' ;
//EXISTS  : 'EXISTS' ;
//NULL  : 'NULL' ;
//COALESCE    : 'COALESCE' ;
//CASE  : 'CASE' ;
//WHEN   : 'WHEN' ;
//THEN  : 'THEN' ;
//ELSE  : 'ELSE' ;
//END  : 'END' ;
//CONVERT   : 'CONVERT' ;
//ESCAPE    : 'ESCAPE' ;
//NULLIF   : 'NULLIF' ;
//TSEQUAL   :  'TSEQUAL' ;
//
////DDL qroup
//ALTER  : 'ALTER' ;
//DROP  : 'DROP' ;
//CREATE   :  'CREATE' ;
//TABLE  : 'TABLE' ;
//VIEW  : 'VIEW' ;
//INDEX  :  'INDEX' ;
//DATABASE  : 'DATABASE' ;
//COLUMN    : 'COLUMN' ;
//CONSTRAINT    :  'CONSTRAINT' ;
//KEY  : 'KEY' ;
//PRIMARY   : 'PRIMARY' ;
//FOREIGN    : 'FOREIGN' ;
//REFERENCES    : 'REFERENCES' ;
//DEFAULT   : 'DEFAULT' ;
//CHECK  : 'CHECK' ;
//UNIQUE  : 'UNIQUE' ;
//IDENTITY    : 'IDENTITY' ;
//PROCEDURE    :  'PROCEDURE' ;
//PROC  : 'PROC' ;
//FUNCTION   : 'FUNCTION' ;
//SCHEMA   : 'SCHEMA' ;
//TRIGGER  : 'TRIGGER' ;
//ADD : 'ADD' ;
//CASCADE   : 'CASCADE' ;
//CLUSTERED   :  'CLUSTERED' ;
//COLLATE   : 'COLLATE' ;
//DISK    : 'DISK' ;
//DOUBLE   : 'DOUBLE' ;
//EXTERNAL    :  'EXTERNAL' ;
//FILE    : 'FILE' ;
//FILLFACTOR   :  'FILLFACTOR' ;
//NATIONAL    :  'NATIONAL' ;
//NOCHECK    :  'NOCHECK' ;
//NONCLUSTERED   :  'NONCLUSTERED' ;
//PRECISION   : 'PRECISION' ;
//REPLICATION    :  'REPLICATION' ;
//RESTRICT   : 'RESTRICT' ;
//ROWGUIDCOL    : 'ROWGUIDCOL' ;
//RULE  : 'RULE' ;
//SECURITYAUDIT     :  'SECURITYAUDIT' ;
//STATISTICS    :  'STATISTICS' ;
//VARYING     : 'VARYING' ;
//
//
////TC group
//DECLARE  : 'DECLARE'   ;
//AS  : 'AS'  ;
//AUTHORIZATION    :    'AUTHORIZATION' ;
//BACKUP   : 'BACKUP' ;
//RESTORE    :  'RESTORE'   ;
//CHECKPOINT   :  'CHECKPOINT' ;
//DBCC  :  'DBCC' ;
//DENY   :  'DENY'   ;
//GRANT   : 'GRANT'    ;
//REVOKE     :  'REVOKE'  ;
//KILL  :   'KILL' ;
//RECONFIGURE    :  'RECONFIGURE'   ;
//SHUTDOWN    :  'SHUTDOWN' ;
//USE :  'USE'  ;
//USER :  'USER'  ;
//SESSION_USER    :  'SESSION_USER' ;
//SYSTEM_USER      : 'SYSTEM_USER' ;
//CURRENT_USER     :  'CURRENT_USER' ;
//CURRENT_DATE     :  'CURRENT_DATE'  ;
//CURRENT_TIME    : 'CURRENT_TIME' ;
//CURRENT_TIMESTAMP    :   'CURRENT_TIMESTAMP'  ;
//BEGIN  : 'BEGIN' ;
//COMMIT  : 'COMMIT'   ;
//ROLLBACK  : 'ROLLBACK' ;
//TRANSACTION   : 'TRANSACTION' ;
//TRAN   :  'TRAN' ;
//SAVE    : 'SAVE' ;
//IF    :  'IF'  ;
//WHILE   :  'WHILE' ;
//BREAK   :  'BREAK' ;
//CONTINUE   : 'CONTINUE' ;
//GOTO    :  'GOTO' ;
//RETURN   :  'RETURN' ;
//WAITFOR   :  'WAITFOR' ;
//TRY_CONVERT   :  'TRY_CONVERT' ;
//RAISERROR    :  'RAISERROR' ;
//PRINT   :  'PRINT' ;
//EXEC    :  'EXEC' ;
//EXECUTE   : 'EXECUTE'  ;
//CLOSE    :  'CLOSE' ;
//CURSOR    : 'CURSOR' ;
//DEALLOCATE   : 'DEALLOCATE' ;
//DISTRIBUTED    : 'DISTRIBUTED' ;
//DUMP    : 'DUMP' ;
//ERRLVL   : 'ERRLVL' ;
//EXIT   : 'EXIT' ;
//HOLDLOCK    :  'HOLDLOCK' ;
//LINENO   : 'LINENO' ;
//LOAD  : 'LOAD' ;
//OF  : 'OF' ;
//OFF  : 'OFF' ;
//OFFSETS    : 'OFFSETS' ;
//OPEN   :  'OPEN' ;
//PLAN  : 'PLAN' ;
//PUBLIC   : 'PUBLIC' ;
//READ  : 'READ' ;
//REVERT    :  'REVERT' ;
//ROWCOUNT    :  'ROWCOUNT' ;
//SETUSER  :  'SETUSER' ;
//TEXTSIZE    : 'TEXTSIZE' ;
//TO     : 'TO' ;
//// T-SQL Batch Separator
//GO_COMMAND: 'GO' ; // <-- إضافة
//
////////
//
////Boolean
//TRUE  : 'TRUE' ;
//FALSE : 'FALSE' ;
//
////Comments
//LINE_COMMENT:  '--' ~[\r\n]* -> skip;
////BLOCK_COMMENT: '/*' ( BLOCK_COMMENT | . )*? '*/' -> skip ;
//BLOCK_COMMENT: '/*' .*? '*/' -> skip ;
//
//
////Operators and Punctuation
//EQUAL: '=';
//NOT_EQUAL: '!=' | '<>';
//LESS: '<';
//GREATER: '>';
//LESS_EQUAL: '<=';
//GREATER_EQUAL: '>=';
//PLUS: '+' ;
//MINUS: '-' ;
//STAR: '*' ;
//DIV: '/' ;
//MOD: '%' ;
//
//COMMA: ',';
//SEMICOLON: ';';
//LPAREN: '(';
//RPAREN: ')';
//BRACKET_OPEN: '[' ;
//BRACKET_CLOSE: ']' ;
//
//DOT: '.' ; // <-- إضافة
//COLON: ':' ; // <-- إضافة
//
//// Delimited Identifiers (Priority 1)
//// T-SQL bracketed identifier (e.g., [Version], [My Table])
////DELIMITED_IDENTIFIER_BRACKET: '[' ( ~']' | ']]' )+ ']' ; // <-- إضافة
//DELIMITED_IDENTIFIER_BRACKET: '[' ( ~[\]\r\n] | ']]' )* ']' ;
//// ANSI-SQL quoted identifier (e.g., "My Table")
//DELIMITED_IDENTIFIER_QUOTE: '"' ( ~'"' | '""' )+ '"' ; // <-- إضافة
//
////USER_VARIABLE (Priority 2)
//USER_VARIABLE: '@' '@'? [a-z_] [a-z0-9_]* ;
//
////IDENTIFIER (Priority 3)
//IDENTIFIER :[a-z_] [a-z_0-9]* ;
//
////Strings
//STRING: '\'' ( ~['\r\n] | '\'\'' | '\\' [\r\n]+ )* '\'';
//HEX_STRING: '0x' ( [0-9a-f] | '\\' [\r\n]+ )+ ;
//BIT_STRING: '0b' [01]+ ;
//
////Number (Corrected to handle .5 and 5. correctly)
//NUMBER: [0-9]+ ('.' [0-9]*)? | '.' [0-9]+ ; // <-- تعديل
//
////White spaces
//WS: [ \t\r\n]+ -> skip;
//----------------------------------------------------------------------------------------------------------------------------------------



lexer grammar SQLGrammarLexer;


// 1) CASE-INSENSITIVE LETTER FRAGMENTS

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];


// 2) KEYWORDS (CASE-INSENSITIVE)

SELECT : S E L E C T ;
FROM   : F R O M ;
WHERE  : W H E R E ;
AND    : A N D ;
OR     : O R ;
NOT    : N O T ;
NULL   : N U L L ;
INSERT : I N S E R T ;
INTO   : I N T O ;
VALUES : V A L U E S ;
UPDATE : U P D A T E ;
DELETE : D E L E T E ;
SET    : S E T ;
JOIN   : J O I N ;
INNER  : I N N E R ;
LEFT   : L E F T ;
RIGHT  : R I G H T ;
FULL   : F U L L ;
OUTER  : O U T E R ;
ON     : O N ;
GROUP  : G R O U P ;
BY     : B Y ;
HAVING : H A V I N G ;
ORDER  : O R D E R ;
ASC    : A S C ;
DESC   : D E S C ;
TOP    : T O P ;
DISTINCT : D I S T I N C T ;
GO     : G O ;
ALL    : A L L ; //
DECLARE : D E C L A R E ;
AS      : A S ;

VARCHAR : V A R C H A R ;
NVARCHAR: N V A R C H A R ;
INT     : I N T ;
INTEGER : I N T E G E R ;
CHAR    : C H A R ;
TEXT    : T E X T ;
DATE    : D A T E ;
DATETIME: D A T E T I M E ;

TRUE    : T R U E ;
FALSE   : F A L S E ;


// 3) COMMENTS

LINE_COMMENT: '--' ~[\r\n]* -> skip;
//BLOCK_COMMENT: '/*' .*? '*/' -> skip;
BLOCK_COMMENT: '/*' (BLOCK_COMMENT | .)*? '*/' -> skip;//


// 4) STRINGS

// Handle escaped quotes ('') and backslash+newline continuation
STRING : '\'' ( ~['\r\n\\] | '\'\'' | '\\' [\r\n]+ )* '\'' ;

// Handle backslash+newline continuation for hex strings
HEX_STRING : '0x' ( [0-9a-fA-F] | '\\' [\r\n]+ )+ ;
BIT_STRING : '0b' [01]+ ;


// 5) NUMBERS

NUMBER
    : DIGIT+ ('.' DIGIT*)?
    | '.' DIGIT+
    ;


// 6) PUNCTUATION & OPERATORS

EQUAL           : '=';
NOT_EQUAL       : '!=' | '<>';
LESS            : '<';
GREATER         : '>';
LESS_EQUAL      : '<=';
GREATER_EQUAL   : '>=';
PLUS            : '+';
MINUS           : '-';
STAR            : '*';
DIV             : '/';
MOD             : '%';

COMMA           : ',';
SEMICOLON       : ';';
LPAREN          : '(';
RPAREN          : ')';
DOT             : '.';
COLON           : ':';


// 7) BRACKETED IDENTIFIERS (MUST COME BEFORE IDENTIFIER)

DELIMITED_IDENTIFIER_BRACKET
    : '[' ( ~[\]\r\n] | ']]' )+ ']'
    ;

DELIMITED_IDENTIFIER_QUOTE
    : '"' ( ~["\r\n] | '""' )+ '"'
    ;


// 8) USER VARIABLES

USER_VARIABLE
    : '@' '@'? LETTER (LETTER | DIGIT | '_')*
    ;


// 9) IDENTIFIER (LAST TOKEN)

IDENTIFIER
    : LETTER (LETTER | DIGIT | '_')*
    ;


// 10) WHITESPACE

WS : [ \t\r\n]+ -> skip;
