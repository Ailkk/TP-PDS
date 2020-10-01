parser grammar TurtleParser;

options {
  language = Java;
  tokenVocab = TurtleLexer;
}

@header {
  package TP1;
}

document returns [ASD.Document out]
  : s=statements EOF { $out = new ASD.Document($s.out); }
  ;


statements returns [List<ASD.Sentence> out = ArrayList<>()]
	: (s = statement {$out.add($s.out);)+
// Fill here!
