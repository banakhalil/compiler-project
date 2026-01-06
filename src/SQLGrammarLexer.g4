
lexer grammar SQLGrammarLexer;
options {
    caseInsensitive = true;
}

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

TRIM : T R I M ;
UPPER : U P P E R ;
LOWER : L O W E R ;
SUBSTRING : S U B S T R I N G ;
REPLACE : R E P L A C E ;
REPLICATE : R E P L I C A T E ;
REVERSE : R E V E R S E ;
RTRIM : R T R I M ;
LTRIM : L T R I M ;
NCHAR : N C H A R ;
DATEADD : D A T E A D D ;
DAY : D A Y ;
GETDATE : G E T D A T E ;
ISDATE : I S D A T E ;
MONTH : M O N T H ;
YEAR : Y E A R ;
CAST : C A S T ;
ISNULL : I S N U L L ;
ISNUMERIC : I S N U M E R I C ;
NEWID : N E W I D ;
NULLIF : N U L L I F ;
PARSENAME : P A R S E N A M E ;


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
PRINT   : P R I N T ;

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

// cursor
CURSOR : C U R S O R ;
LOCAL : L O C A L;
GLOBAL : G L O B A L;
FORWARD_ONLY : F O R W A R D '_' O N L Y;
SCROLL  : S C R O L L;
STATIC : S T A T I C;
KEYSET : K E Y S E T;
DYNAMIC : D Y N A M I C;
FAST_FORWARD : F A S T '_' F O R W A R D;
READ_ONLY : R E A D '_' O N L Y;
SCROLL_LOCKS : S C R O L L '_' L O C K S;
OPTIMISTIC : O P T I M I S T I C;
TYPE_WARNING : T Y P E '_' W A R N I N G;
FOR : F O R;
OF : O F;
OPEN : O P E N ;
PRIOR:P R I O R ;
FIRST: F I R S T ;
LAST:L A S T ;
ABSOLUTE: A B S O L U T E;
RELATIVE: R E L A T I V E ;
CLOSE : C L O S E ;
DEALLOCATE : D E A L L O C A T E;


LINE_COMMENT: '--' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' (BLOCK_COMMENT | .)*? '*/' -> skip;

fragment LINE_CONTINUATION : '\\' [\r\n]+;

STRING
    : '\'' ( ~['\\] | '\'\'' | '\\' [\r\n]+ | '\\' ~[\r\n] )* '\''
      {
        String originalText = getText();
        if (originalText.length() >= 2) {
            String content = originalText.substring(1, originalText.length() - 1);
            content = content.replaceAll("\\\\[ \t]*[\\r\\n]+[ \t]*", "");
            content = content.replaceAll("''", "'");
            setText(content);
        } else {
            setText("");
        }
      }
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

IDENTIFIER
    : (LETTER | '_') (LETTER | DIGIT | '_')*
    ;

WS : [ \t\r\n]+ -> skip;