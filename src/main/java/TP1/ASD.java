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
    	String res="";
    	for (Sentence sentence : sentences) {
			res += sentence.toString()+"\n";
			res = res.substring(0, res.length() - 1);
			res += ".";
		}
    	return res;
    }
    
    public String toNtriples() {
    	String res = "";
    	
    	for (Sentence sentence : sentences) {
    		res += sentence.toNTtriples();
		}
    	
      return res;
    }
  }//Document
  
  static public class Sentence {
	  private Subject subject;
	  private List<RestOfSentence> listRestSent;
	  
	  public Subject getSubject() {return subject;}
	  public List<RestOfSentence> getListRestSent(){return listRestSent;}
	  
	  public Sentence(Subject s, List<RestOfSentence> listRos) {
		  subject = s;
		  listRestSent = new ArrayList<RestOfSentence>(listRos);
	  }
	  
	  public String toString() {
		  String res = subject.toString();
		  for (RestOfSentence restOfSentence : listRestSent) {
			res += "\n   " + restOfSentence.toString()+"";
			res = res.substring(0, res.length() - 1);
			res += ";";
		  }
		  return res;
	  }
	  
	  public String toNTtriples() {
		  String res = "";
		  for (RestOfSentence restOfSentence : listRestSent) {
			res += restOfSentence.toNtriples(this.subject);
		}
		  return res;
	  }
  }//Sentence
  
  static public class Subject {
	  private String subjString;
	  
	  public Subject(String s) {
		  subjString = "<"+s+">";
	  }
	  
	  public String toString() {
		  return subjString;
	  }
  }//Subject
  
  static public class RestOfSentence {
	  private Verb verb;
	  private List<Complement> complements;
	  
	  public Verb getVerb() {return verb;}
	  
	  public List<Complement> getComplements(){return complements;}
	  
	  public RestOfSentence(Verb v, List<Complement> c) {
		  if(c.size() >= 1) {
			  verb = v;
			  complements = new ArrayList<Complement>(c);
		  }
		  else
			  System.out.println("The list of complements must contains at least 1 complement.");
	  }
	  
	  public String toString() {
		  String res = verb.toString();
		  for (Complement complement : complements) {
			res += complement.toString()+",";
		}
		  return res;
	  }
	  
	  public String toNtriples(Subject s) {
		  String res = "";
		  
		  for (Complement complement : complements) {
			res += complement.toNtriples(s, this.verb);
		}
		  return res;
	  }
  }//RestOfSentence
  
  static public class Verb {
	  private String verbString;
	  
	  public Verb(String v) {
		  verbString = "<"+v+">";
	  }
	  
	  public String toString() {
		  return verbString;
	  }
  }//Verb
  
  static public abstract class Complement {

	public abstract String toNtriples(Subject s, Verb verb);
	  
  }//Complement
  
  static public class Ident extends Complement {
	  private String ident;
	  
	  public Ident(String id) {
		  ident = "<"+id+">";
	  }
	  
	  public String toString() {
		 return ident;
	  }
	  
	  public String toNtriples(Subject s, Verb v) {
		  
		  return s.toString() + v.toString() + this.toString() + ".\n";
	  }
  }//Ident
  
  static public class Title extends Complement {
	  private String title;
	  
	  public Title(String t) {
		  title = '"'+t+'"';
	  }
	  
	  public String toString() {
		  return title;
	  }
	  
	  public String toNtriples(Subject s, Verb v) {
		  
		  return s.toString() + v.toString() + this.toString() + ".\n";
	  }
  }//Title

}//ASD
