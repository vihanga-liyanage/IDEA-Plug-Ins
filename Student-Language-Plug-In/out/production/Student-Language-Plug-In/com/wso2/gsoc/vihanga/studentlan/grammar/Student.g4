grammar Student;

script
	: student* EOF
	;

//    Student {
//        ID : S001
//        Name : Vihanga,
//        Age : 24,
//        Address {
//            No. 24/A, Station Road, Pinwatte,
//            Panadura,
//            12500.
//            Sri Lanka
//        }
//    };

student
    :   'Student' '{' sid ',' name ',' age ',' address '}' ';'
    ;

sid : 'SID' ':' ID;
name : 'Name' ':' STRING;
age : 'Age' ':' INT;
address : 'Address' '{' streetAddress ',' city ',' postalCode ',' country '}';

streetAddress : (STRING | INT | ADDRESS_SYMBOLS)+;
city : STRING;
postalCode : INT;
country : STRING;

ID  : [a-zA-Z_] [a-zA-Z0-9_]* ;
INT : [0-9]+ ;
ADDRESS_SYMBOLS : [,./-];

STRING :  '"' (ESC | ~["\\])* '"' ;
fragment ESC :   '\\' ["\bfnrt] ;
LINEEND : ';';
LPAREN : '(' ;
RPAREN : ')' ;

LINE_COMMENT : '//' .*? ('\n'|EOF)	-> channel(HIDDEN) ;
COMMENT      : '/*' .*? '*/'    	-> channel(HIDDEN) ;

WS : [ \t\n\r]+ -> channel(HIDDEN) ;

STUDENT : 'Student';
SID : 'SID';
NAME : 'Name';
AGE : 'Age';
ADDRESS : 'Address';
