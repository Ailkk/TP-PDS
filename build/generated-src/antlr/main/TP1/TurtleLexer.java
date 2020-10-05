// Generated from TurtleLexer.g by ANTLR 4.7.1

  package TP1;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, VIRG=2, POINT=3, POINTVIRG=4, ID=5, ENTITYO=6, ENTITYV=7, ENTITYS=8, 
		TEXTE=9, OBJECT=10, VERB=11, SENTENCE=12, DOCUMENT=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "ASCII", "LETTER", "VIRG", "POINT", "POINTVIRG", "ID", "ENTITYO", 
		"ENTITYV", "ENTITYS", "TEXTE", "OBJECT", "VERB", "SENTENCE", "DOCUMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "','", "'.'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "VIRG", "POINT", "POINTVIRG", "ID", "ENTITYO", "ENTITYV", 
		"ENTITYS", "TEXTE", "OBJECT", "VERB", "SENTENCE", "DOCUMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TurtleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TurtleLexer.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17j\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2#\n\2\r\2\16"+
		"\2$\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\7\b\65\n\b"+
		"\f\b\16\b8\13\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\5\rL\n\r\3\16\3\16\3\16\3\16\3\16\7\16S\n\16\f"+
		"\16\16\16V\13\16\3\17\3\17\3\17\3\17\3\17\7\17]\n\17\f\17\16\17`\13\17"+
		"\3\20\3\20\3\20\3\20\7\20f\n\20\f\20\16\20i\13\20\2\2\21\3\3\5\2\7\2\t"+
		"\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17\3\2\5\5\2"+
		"\13\f\16\17\"\"\6\2\f\f$$>>@@\4\2C\\c|\2m\2\3\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3"+
		"\"\3\2\2\2\5(\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\17"+
		"\62\3\2\2\2\219\3\2\2\2\23=\3\2\2\2\25A\3\2\2\2\27E\3\2\2\2\31K\3\2\2"+
		"\2\33M\3\2\2\2\35W\3\2\2\2\37a\3\2\2\2!#\t\2\2\2\"!\3\2\2\2#$\3\2\2\2"+
		"$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\b\2\2\2\'\4\3\2\2\2()\n\3\2\2)\6\3"+
		"\2\2\2*+\t\4\2\2+\b\3\2\2\2,-\7.\2\2-\n\3\2\2\2./\7\60\2\2/\f\3\2\2\2"+
		"\60\61\7=\2\2\61\16\3\2\2\2\62\66\5\7\4\2\63\65\5\7\4\2\64\63\3\2\2\2"+
		"\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\20\3\2\2\28\66\3\2\2\29:\7"+
		">\2\2:;\5\17\b\2;<\7@\2\2<\22\3\2\2\2=>\7>\2\2>?\5\17\b\2?@\7@\2\2@\24"+
		"\3\2\2\2AB\7>\2\2BC\5\17\b\2CD\7@\2\2D\26\3\2\2\2EF\7$\2\2FG\5\17\b\2"+
		"GH\7$\2\2H\30\3\2\2\2IL\5\21\t\2JL\5\27\f\2KI\3\2\2\2KJ\3\2\2\2L\32\3"+
		"\2\2\2MN\5\23\n\2NT\5\31\r\2OP\5\t\5\2PQ\5\31\r\2QS\3\2\2\2RO\3\2\2\2"+
		"SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\34\3\2\2\2VT\3\2\2\2WX\5\25\13\2X^\5\33"+
		"\16\2YZ\5\r\7\2Z[\5\33\16\2[]\3\2\2\2\\Y\3\2\2\2]`\3\2\2\2^\\\3\2\2\2"+
		"^_\3\2\2\2_\36\3\2\2\2`^\3\2\2\2ag\5\35\17\2bc\5\13\6\2cd\5\35\17\2df"+
		"\3\2\2\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h \3\2\2\2ig\3\2\2\2\t"+
		"\2$\66KT^g\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}