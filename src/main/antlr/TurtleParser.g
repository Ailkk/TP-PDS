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
    ;
    
statement returns [String ASD.EntityS, List<ASD.RestOfSentence> out = ArrayList<>()]
    : (s = ASD.EntityS {$out.add($s.out); (r = verb {$out.add($r.out))+);
    ;
    
verb returns [String ASD.EntityV, List<ASD.Verb> out = ArrayList<>()]
    : (s = ASD.EntityV {$out.add($s.out); (c = object {$out.add($c.out))+);
    ;
    
object returns [(String ASD.EntityO | String ASD.Text) out = ArrayList<>()]
    : (s = ASD.EntityO {$out.add($s.out) | (c = ASD.Text {$out.add($c.out)));
    ;