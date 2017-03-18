grammar Datetime;

date_time
   : (day ',')? date time
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

WS
   : [ \r\n\t] -> skip
;