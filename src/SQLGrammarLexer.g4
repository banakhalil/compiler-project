
lexer grammar SQLGrammarLexer;
options {
    caseInsensitive = true;
}

RECOVERY: . {
    if (_input.LA(1) != ';' && _input.LA(1) != '\n') {
        skip();
    }
};

fragment A: 'a'; fragment B: 'b'; fragment C: 'c'; fragment D: 'd'; fragment E: 'e';
fragment F: 'f'; fragment G: 'g'; fragment H: 'h'; fragment I: 'i'; fragment J: 'j';
fragment K: 'k'; fragment L: 'l'; fragment M: 'm'; fragment N: 'n'; fragment O: 'o';
fragment P: 'p'; fragment Q: 'q'; fragment R: 'r'; fragment S: 's'; fragment T: 't';
fragment U: 'u'; fragment V: 'v'; fragment W: 'w'; fragment X: 'x'; fragment Y: 'y';
fragment Z: 'z';


fragment LETTER: [a-z];
fragment DIGIT: [0-9];
fragment HEX_DIGIT : [0-9a-f] ;


SELECT : S E L E C T ;
FROM   : F R O M ;
WHERE  : W H E R E ;
GROUP  : G R O U P ;
BY     : B Y ;
HAVING : H A V I N G ;
ORDER  : O R D E R ;
ASC    : A S C ;
DESC   : D E S C ;
UNION  : U N I O N ;
DISTINCT : D I S T I N C T ;
TOP    : T O P ;
INSERT : I N S E R T ;
DELETE : D E L E T E ;
UPDATE : U P D A T E ;
SET    : S E T ;
VALUES : V A L U E S ;
INTO   : I N T O ;

JOIN   : J O I N ;
INNER  : I N N E R ;
LEFT   : L E F T ;
RIGHT  : R I G H T ;
FULL   : F U L L ;
OUTER  : O U T E R ;
CROSS  : C R O S S ;
ON     : O N ;

AND    : A N D ;
OR     : O R ;
NOT    : N O T ;
NULL   : N U L L ;
TRUE   : T R U E ;
FALSE  : F A L S E ;
IS     : I S ;
IN     : I N ;
LIKE   : L I K E ;
BETWEEN : B E T W E E N ;
EXISTS : E X I S T S ;

CREATE : C R E A T E ;
ALTER  : A L T E R ;
DROP   : D R O P ;
TABLE  : T A B L E ;
VIEW   : V I E W ;
INDEX  : I N D E X ;
CONSTRAINT : C O N S T R A I N T ;
PRIMARY : P R I M A R Y ;
FOREIGN : F O R E I G N ;
KEY    : K E Y ;

DATABASE : D A T A B A S E ;
USE      : U S E ;
UNIQUE   : U N I Q U E ;
AUTO_INCREMENT : A U T O '_' I N C R E M E N T ;
TIMESTAMP: T I M E S T A M P ;
DEFAULT  : D E F A U L T ;
CURRENT_TIMESTAMP : C U R R E N T '_' T I M E S T A M P ;
REFERENCES : R E F E R E N C E S ;

COUNT   : C O U N T ;
SUM     : S U M ;
AVG     : A V G ;
MIN     : M I N ;
MAX     : M A X ;
QUOTENAME : Q U O T E N A M E ;
OBJECT_NAME : O B J E C T '_' N A M E ;

DECLARE : D E C L A R E ;
AS      : A S ;
GO      : G O ;
BEGIN   : B E G I N ;
END     : E N D ;
IF      : I F ;
ELSE    : E L S E ;
WHILE   : W H I L E ;
CASE    : C A S E ;
WHEN    : W H E N ;
THEN    : T H E N ;
TRY     : T R Y ;
CATCH   : C A T C H ;
ADD     : A D D ;
EXEC    : E X E C ;

START     : S T A R T ;
TRANSACTION : T R A N S A C T I O N ;
COMMIT    : C O M M I T ;
ROLLBACK  : R O L L B A C K ;
SAVEPOINT : S A V E P O I N T ;
RELEASE   : R E L E A S E ;
WORK      : W O R K ;

RANK    : R A N K ;
ROW_NUMBER : R O W '_' N U M B E R ;
DENSE_RANK : D E N S E '_' R A N K ;
OVER    : O V E R ;
PARTITION : P A R T I T I O N ;
WITH    : W I T H ;
RECURSIVE : R E C U R S I V E ;

LIMIT  : L I M I T ;
OFFSET : O F F S E T ;
FETCH  : F E T C H ;
NEXT   : N E X T ;
ROWS   : R O W S ;
ONLY   : O N L Y ;

VARCHAR : V A R C H A R ;
NVARCHAR: N V A R C H A R ;
INT     : I N T ;
INTEGER : I N T E G E R ;
CHAR    : C H A R ;
TEXT    : T E X T ;
DATE    : D A T E ;
DATETIME: D A T E T I M E ;
DECIMAL : D E C I M A L ;
MONEY   : M O N E Y ;
BIT     : B I T ;

LINE_COMMENT: '--' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' (BLOCK_COMMENT | .)*? '*/' -> skip;


fragment LINE_CONTINUATION : '\\' [\r\n]+;



STRING
    : '\'' ( ~['\r\n] | '\'\'' | '\\' [\r\n]+ )* '\''
    ;

UNTERMINATED_STRING
    : '\'' ( ~['\r\n] | '\'\'' | '\\' [\r\n]+ )+
    {

    }
    ;

IDENTIFIER
    : (LETTER | '_') (LETTER | DIGIT | '_')*
    ;

HEX_STRING
    : '0x' HEX_DIGIT+ ( '\\' [ \t]* [\r\n]+ [ \t]* HEX_DIGIT+ )*
      {
          String t = getText().replaceAll("\\\\[ \t]*[\\r\\n]+[ \t]*", "");
          setText(t);
      }
    ;
BIT_STRING : '0b' [01]+ ;
NUMBER
    : (DIGIT+ ('.' DIGIT*)? | '.' DIGIT+)
    ( E ('+' | '-')? DIGIT+ )?
    ;




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
BRACKET_OPEN    : '[';
BRACKET_CLOSE   : ']';


DELIMITED_IDENTIFIER_BRACKET
    : '[' ( ~[\]\r\n] | ']]' )+ ']'
    ;

DELIMITED_IDENTIFIER_QUOTE
    : '"' ( ~["\r\n] | '""' )+ '"'
    ;


USER_VARIABLE
    : '@' '@'? (LETTER | '_') (LETTER | DIGIT | '_')*
    ;

WS : [ \t\r\n]+ -> skip;