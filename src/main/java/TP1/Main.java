package TP1;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


import java.io.IOException;

/*
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
*/

public class Main {
  public static void main(String[] args) {
    //AST
	ASD.Subject poly117 = new ASD.Subject("poly117");
	ASD.Verb type = new ASD.Verb("type");
	ASD.Verb auteur = new ASD.Verb("auteur");
	ASD.Verb titre = new ASD.Verb("titre");
	ASD.Title compil = new ASD.Title("Compilation");
	ASD.Ident ridoux = new ASD.Ident("Ridoux");
	ASD.Ident ferre = new ASD.Ident("Ferre");
	ASD.Ident poly = new ASD.Ident("poly");
	
	List<ASD.Complement> listComp1 = new ArrayList<ASD.Complement>();
	listComp1.add(poly);
	ASD.RestOfSentence ros1 = new ASD.RestOfSentence(type, listComp1);
	
	List<ASD.Complement> listComp2 = new ArrayList<ASD.Complement>();
	listComp2.add(ridoux);
	listComp2.add(ferre);
	ASD.RestOfSentence ros2 = new ASD.RestOfSentence(auteur, listComp2);
	
	List<ASD.Complement> listComp3 = new ArrayList<ASD.Complement>();
	listComp3.add(compil);
	ASD.RestOfSentence ros3 = new ASD.RestOfSentence(titre, listComp3);
	
	List<ASD.RestOfSentence> listRestOfSent = new ArrayList<ASD.RestOfSentence>();
	listRestOfSent.add(ros1);
	listRestOfSent.add(ros2);
	listRestOfSent.add(ros3);
	
	
	ASD.Sentence sentence = new ASD.Sentence(poly117, listRestOfSent);
	
	List<ASD.Sentence> listSent = new ArrayList<ASD.Sentence>();
	listSent.add(sentence);
	
    ASD.Document ast = new ASD.Document(listSent);

    System.out.println(ast.toNtriples());


    // Use with lexer and parser
    /*
    try {
      // Set input
      CharStream input;
      if(args.length == 0) {
        // From standard input
        input = CharStreams.fromStream(System.in);
      }
      else {
        // From file set in first argument
        input = CharStreams.fromPath(Paths.get(args[0]));
      }

      // Instantiate Lexer
      TurtleLexer lexer = new TurtleLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);

      // Instantiate Parser
      TurtleParser parser = new TurtleParser(tokens);

      // Parse
      ASD.Document ast = parser.document().out;

      // Print as Ntriples
      System.out.println(ast.toNtriples());
    } catch(IOException e) {
      e.printStackTrace();
    }
    */
  }
}
