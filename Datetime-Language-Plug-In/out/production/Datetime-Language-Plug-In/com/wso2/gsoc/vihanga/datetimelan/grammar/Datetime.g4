grammar Datetime;

date_time
   : ((day ',')? date time)* EOF
   ;

day
   : 'Mon'
   | 'Tue'
   | 'Wed'
   | 'Thu'
   | 'Fri'
   | 'Sat'
   | 'Sun'
   ;

date
   : two_digit + month two_digit
   ;

month
   : 'Jan'
   | 'Feb'
   | 'Mar'
   | 'Apr'
   | 'May'
   | 'Jun'
   | 'Jul'
   | 'Aug'
   | 'Sep'
   | 'Oct'
   | 'Nov'
   | 'Dec'
   ;

time
   : hour zone
   ;

hour
   : two_digit ':' two_digit (':' two_digit)?
   ;

zone
   : 'UT'
   | 'GMT'
   | 'EST'
   | 'EDT'
   | 'CST'
   | 'CDT'
   | 'MST'
   | 'MDT'
   | 'PST'
   | 'PDT'
   | ALPHA
   | (('+' | '-') four_digit)
   ;

two_digit
   : alphanumeric alphanumeric
   ;

four_digit
   : alphanumeric alphanumeric alphanumeric alphanumeric
   ;

alphanumeric
   : ALPHA
   | DIGIT
   ;

fragment CHAR
   : [\u0000-\u007F]
   ;

ALPHA
   : [a-zA-Z]
   ;

DIGIT
   : [0-9]
   ;

fragment NOTALPHANUMERIC
   : ~ [a-zA-Z0-9]
   ;

LINE_COMMENT : '//' .*? ('\n'|EOF)	-> channel(HIDDEN) ;
COMMENT      : '/*' .*? '*/'    	-> channel(HIDDEN) ;

WS : [ \t\n\r]+ -> channel(HIDDEN) ;

MON : 'Mon';
TUE : 'Tue';
WED : 'Wed';
THU : 'Thu';
FRI : 'Fri';
SAT : 'Sat';
SUN : 'Sun';

JAN : 'Jan';
FEB : 'Feb';
MAR : 'Mar';
APR : 'Apr';
MAY : 'May';
JUN : 'Jun';
JUL : 'Jul';
AUG : 'Aug';
SEP : 'Sep';
OCT : 'Oct';
NOV : 'Nov';
DEC : 'Dec';

ERRCHAR
	:	.	-> channel(HIDDEN)
	;