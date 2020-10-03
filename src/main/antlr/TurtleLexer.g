lexer grammar TurtleLexer;

options {
  language = Java;
}

@header {
  package TP1;
}

// ignore whitespaces
WS : (' '|'\n'|'\t'|'\r'|'\u000C')+ -> skip
   ;

fragment ASCII  : ~('\n'|'"'|'<'|'>');


// Fill here!


fragment LETTER : ('a'..'z'|'A'..'Z');

VIRG : ',';

POINT : '.';

POINTVIRG : ';';

ID : LETTER (LETTER)*;

ENTITYO : ('<' ID '>');

ENTITYV : ('<' ID '>');

ENTITYS : ('<' ID '>');

TEXTE : ('"' ID '"');

OBJECT : ENTITYO | TEXTE;

VERB : ENTITYV OBJECT (VIRG OBJECT)*;

SENTENCE : ENTITYS VERB (POINTVIRG VERB)*;

DOCUMENT : SENTENCE (POINT SENTENCE)*;
