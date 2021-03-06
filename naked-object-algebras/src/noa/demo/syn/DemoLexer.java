// Generated from src/noa/demo/syn/ by ANTLR 4.5

package noa.demo.syn;
import static noa.demo.syn.Tokens.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DemoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, NUM=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "NUM"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'avg'", "'('", "')'", "'*'", "'-'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "WS", "NUM"
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


	private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	private java.util.Stack<Integer> indents = new java.util.Stack<>();
	private int opened = 0;
	private Token lastToken = null;

	@Override
	public void emit(Token t) {
	  super.setToken(t);
	  tokens.offer(t);
	}

	@Override
	public Token nextToken() {
	  if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	    for (int i = tokens.size() - 1; i >= 0; i--) {
	      if (tokens.get(i).getType() == EOF) {
	        tokens.remove(i);
	      }
	    }
	    this.emit(commonToken(DemoParser.NEWLINE, "\n"));
	    while (!indents.isEmpty()) {
	      this.emit(createDedent());
	      indents.pop();
	    }
	    this.emit(commonToken(DemoParser.EOF, "<EOF>"));
	  }
	  Token next = super.nextToken();
	  if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	    this.lastToken = next;
	  }
	  return tokens.isEmpty() ? next : tokens.poll();
	}

	private Token createDedent() {
	  CommonToken dedent = commonToken(DemoParser.DEDENT, "");
	  dedent.setLine(this.lastToken.getLine());
	  return dedent;
	}

	private CommonToken commonToken(int type, String text) {
	  int stop = this.getCharIndex() - 1;
	  int start = text.isEmpty() ? stop : stop - text.length() + 1;
	  return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	}

	static int getIndentationCount(String spaces) {
	  int count = 0;
	  for (char ch : spaces.toCharArray()) {
	    switch (ch) {
	      case '\t':
	        count += 8 - (count % 8);
	        break;
	      default:
	        count++;
	    }
	  }
	  return count;
	}

	boolean atStartOfInput() {
	  return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	}


	public DemoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "syn"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n-\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\6\b#\n\b\r\b\16\b$\3\b\3"+
		"\b\3\t\6\t*\n\t\r\t\16\t+\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2"+
		"\4\3\2\"\"\3\2\62;.\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\23\3\2\2\2\5\27\3"+
		"\2\2\2\7\31\3\2\2\2\t\33\3\2\2\2\13\35\3\2\2\2\r\37\3\2\2\2\17\"\3\2\2"+
		"\2\21)\3\2\2\2\23\24\7c\2\2\24\25\7x\2\2\25\26\7i\2\2\26\4\3\2\2\2\27"+
		"\30\7*\2\2\30\6\3\2\2\2\31\32\7+\2\2\32\b\3\2\2\2\33\34\7,\2\2\34\n\3"+
		"\2\2\2\35\36\7/\2\2\36\f\3\2\2\2\37 \7-\2\2 \16\3\2\2\2!#\t\2\2\2\"!\3"+
		"\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%&\3\2\2\2&\'\b\b\2\2\'\20\3\2\2"+
		"\2(*\t\3\2\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\22\3\2\2\2\5\2$"+
		"+\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}