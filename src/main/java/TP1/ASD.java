package TP1;

import java.util.ArrayList;
import java.util.List;

public class ASD {
  static public class Document {
    List<Sentence> sentences;
    
    public Document(List<Sentence> p0) {
    	if(p0.size() >= 1)
    		sentences = new ArrayList<Sentence>(p0);
    	else
    		System.out.println("The list of sentences must contains at least 1 sentence.");

    }
    
    public String toString() {
    	String res = "Document[";
    	for (Sentence sentence : sentences) {
			res += sentence.toString()+"\n";
		}
    	res += "]";
    	return res;
    }
    
    public String toNtriples() {
      return "…";
    }
  }//Document
  
  static public class Sentence {
	  Subject subject;
	  List<RestOfSentence> listRestSent;
	  
	  public Sentence(Subject s, List<RestOfSentence> listRos) {
		  subject = s;
		  listRestSent = new ArrayList<RestOfSentence>(listRos);
	  }
	  
	  public String toString() {
		  String res = "Sentence["+subject.toString();
		  for (RestOfSentence restOfSentence : listRestSent) {
			res += restOfSentence.toString();
		  }
		  res += "]";
		  return res;
	  }
  }//Sentence
  
  static public class Subject {
	  String subjString;
	  
	  public Subject(String s) {
		  subjString = "<"+s+">";
	  }
	  
	  public String toString() {
		  return subjString;
	  }
  }//Subject
  
  static public class RestOfSentence {
	  Verb verb;
	  List<Complement> complements;
	  
	  public RestOfSentence(Verb v, List<Complement> c) {
		  if(c.size() >= 1) {
			  verb = v;
			  complements = new ArrayList<Complement>(c);
		  }
		  else
			  System.out.println("The list of complements must contains at least 1 complement.");
	  }
	  
	  public String toString() {
		  String res = "RestOfSentence["+verb.toString();
		  for (Complement complement : complements) {
			res += complement.toString();
		}
		  res += "]";
		  return res;
	  }
  }//RestOfSentence
  
  static public class Verb {
	  String verbString;
	  
	  public Verb(String v) {
		  verbString = "<"+v+">";
	  }
	  
	  public String toString() {
		  return verbString;
	  }
  }//Verb
  
  static public abstract class Complement {
	  
  }//Complement
  
  static public class Ident extends Complement {
	  String ident;
	  
	  public Ident(String id) {
		  ident = "<"+id+">";
	  }
	  
	  public String toString() {
		  return ident;
	  }
  }//Ident
  
  static public class Title extends Complement {
	  String title;
	  
	  public Title(String t) {
		  title = '"'+t+'"';
	  }
	  
	  public String toString() {
		  return title;
	  }
  }//Title

}//ASD
