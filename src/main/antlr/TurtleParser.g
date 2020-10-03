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
	
	
statement returns [String EntityS, List<ASD.RestOfSentence> out = ArrayList<>()]
	: (s = subjectE {$out.add($s.out); (r = verb {$out.add($r.out))+);
	
	
verb returns [String ASD.EntityV, List<ASD.Verb> out = ArrayList<>()]
	: (s = verbE {$out.add($s.out); (c = object {$out.add($c.out))+);
	
	
object returns [(String ASD.EntityO | String ASD.Text) out = ArrayList<>()]
	: (s = objectE {$out.add($s.out) | (c = text {$out.add($c.out)));
	
	
	
	
	
	
	
	
	
	
	
	
// Fill here!
