// Generated from /Users/mac/IdeaProjects/language-translator-java/src/main/resources/MegaLanguage.g4 by ANTLR 4.13.1

package language;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MegaLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, COMMENT=13, LBRACKET=14, RBRACKET=15, EQ=16, 
		WS=17, LPAREN=18, RPAREN=19, PLUS=20, MINUS=21, TIMES=22, DIV=23, NUMBER=24, 
		VARIABLE=25, DIGIT=26, LETTER=27, LINE_END=28, SPACE=29;
	public static final int
		RULE_typeExpression = 0, RULE_atom = 1, RULE_program = 2, RULE_command = 3, 
		RULE_commands = 4, RULE_varDeclaration = 5, RULE_print = 6, RULE_read = 7, 
		RULE_condition = 8, RULE_while = 9, RULE_commandBlock = 10, RULE_comp_op = 11, 
		RULE_expression = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"typeExpression", "atom", "program", "command", "commands", "varDeclaration", 
			"print", "read", "condition", "while", "commandBlock", "comp_op", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u043F\\u0435\\u0447\\u0430\\u0442\\u044C'", "'\\u0441\\u0447\\u0438\\u0442\\u0430\\u0442\\u044C\\u0427\\u0438\\u0441\\u043B\\u043E'", 
			"'\\u0441\\u0447\\u0438\\u0442\\u0430\\u0442\\u044C\\u041B\\u043E\\u0433\\u0438\\u0447'", 
			"'\\u0435\\u0441\\u043B\\u0438'", "'\\u0438\\u043D\\u0430\\u0447\\u0435'", 
			"'\\u043F\\u043E\\u043A\\u0430'", "'<'", "'>'", "'=='", "'>='", "'<='", 
			"'!='", null, "'{'", "'}'", "'='", null, "'('", "')'", "'+'", "'-'", 
			"'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "COMMENT", "LBRACKET", "RBRACKET", "EQ", "WS", "LPAREN", "RPAREN", 
			"PLUS", "MINUS", "TIMES", "DIV", "NUMBER", "VARIABLE", "DIGIT", "LETTER", 
			"LINE_END", "SPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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

	@Override
	public String getGrammarFileName() { return "MegaLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MegaLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeExpressionContext extends ParserRuleContext {
		public ExpressionType type;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TypeExpressionContext> typeExpression() {
			return getRuleContexts(TypeExpressionContext.class);
		}
		public TypeExpressionContext typeExpression(int i) {
			return getRuleContext(TypeExpressionContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TypeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitTypeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitTypeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeExpressionContext typeExpression() throws RecognitionException {
		return typeExpression(0);
	}

	private TypeExpressionContext typeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeExpressionContext _localctx = new TypeExpressionContext(_ctx, _parentState);
		TypeExpressionContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_typeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(27);
			expression(0);
			((TypeExpressionContext)_localctx).type =  ExpressionType.INT;
			}
			_ctx.stop = _input.LT(-1);
			setState(37);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeExpression);
					setState(30);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(31);
					comp_op();
					setState(32);
					typeExpression(3);
					((TypeExpressionContext)_localctx).type =  ExpressionType.BOOLEAN;
					}
					} 
				}
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public Token VARIABLE;
		public TerminalNode NUMBER() { return getToken(MegaLanguageParser.NUMBER, 0); }
		public TerminalNode VARIABLE() { return getToken(MegaLanguageParser.VARIABLE, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atom);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				((AtomContext)_localctx).VARIABLE = match(VARIABLE);

				   	if ( !((CommandsContext)getInvokingContext(4)).variables.containsKey((((AtomContext)_localctx).VARIABLE!=null?((AtomContext)_localctx).VARIABLE.getText():null)) ) {
				   	    throw new language.UnknownVariableException((((AtomContext)_localctx).VARIABLE!=null?((AtomContext)_localctx).VARIABLE.getText():null), this);
				   	}
				   
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			commands(new java.util.HashMap<>());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public java.util.Map<String, ExpressionType> variables;
		public CommandContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CommandContext(ParserRuleContext parent, int invokingState, java.util.Map<String, ExpressionType> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
			this.variables = ctx.variables;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends CommandContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public StatementContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseCommandContext extends CommandContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public BaseCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterBaseCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitBaseCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitBaseCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command(java.util.Map<String, ExpressionType> variables) throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState(), variables);
		enterRule(_localctx, 6, RULE_command);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new BaseCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				varDeclaration(variables);
				}
				break;
			case T__0:
				_localctx = new BaseCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				print();
				}
				break;
			case T__3:
				_localctx = new StatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				condition(variables);
				}
				break;
			case T__5:
				_localctx = new StatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				while_(variables);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandsContext extends ParserRuleContext {
		public java.util.Map<String, ExpressionType> variables;
		public List<TerminalNode> LINE_END() { return getTokens(MegaLanguageParser.LINE_END); }
		public TerminalNode LINE_END(int i) {
			return getToken(MegaLanguageParser.LINE_END, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CommandsContext(ParserRuleContext parent, int invokingState, java.util.Map<String, ExpressionType> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands(java.util.Map<String, ExpressionType> variables) throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState(), variables);
		enterRule(_localctx, 8, RULE_commands);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(53);
				match(LINE_END);
				}
				break;
			}
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33554514L) != 0)) {
				{
				setState(56);
				command(variables);
				}
			}

			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(59);
					match(LINE_END);
					setState(60);
					command(variables);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_END) {
				{
				setState(66);
				match(LINE_END);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public java.util.Map<String, ExpressionType> variables;
		public ExpressionType type;
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState, java.util.Map<String, ExpressionType> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
			this.variables = ctx.variables;
			this.type = ctx.type;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarEvaluatedContext extends VarDeclarationContext {
		public Token VARIABLE;
		public TypeExpressionContext typeExpression;
		public TerminalNode VARIABLE() { return getToken(MegaLanguageParser.VARIABLE, 0); }
		public TerminalNode EQ() { return getToken(MegaLanguageParser.EQ, 0); }
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public VarEvaluatedContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterVarEvaluated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitVarEvaluated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitVarEvaluated(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarReadContext extends VarDeclarationContext {
		public Token VARIABLE;
		public ReadContext read;
		public TerminalNode VARIABLE() { return getToken(MegaLanguageParser.VARIABLE, 0); }
		public TerminalNode EQ() { return getToken(MegaLanguageParser.EQ, 0); }
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public VarReadContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterVarRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitVarRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitVarRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration(java.util.Map<String, ExpressionType> variables) throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState(), variables);
		enterRule(_localctx, 10, RULE_varDeclaration);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new VarEvaluatedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				((VarEvaluatedContext)_localctx).VARIABLE = match(VARIABLE);
				setState(70);
				match(EQ);
				setState(71);
				((VarEvaluatedContext)_localctx).typeExpression = typeExpression(0);

				        ((VarEvaluatedContext)_localctx).type =  ((VarEvaluatedContext)_localctx).typeExpression.type;
				        _localctx.variables.put((((VarEvaluatedContext)_localctx).VARIABLE!=null?((VarEvaluatedContext)_localctx).VARIABLE.getText():null), _localctx.type);
				    
				}
				break;
			case 2:
				_localctx = new VarReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((VarReadContext)_localctx).VARIABLE = match(VARIABLE);
				setState(75);
				match(EQ);
				setState(76);
				((VarReadContext)_localctx).read = read((((VarReadContext)_localctx).VARIABLE!=null?((VarReadContext)_localctx).VARIABLE.getText():null));

				        ((VarReadContext)_localctx).type =  ((VarReadContext)_localctx).read.type;
				        _localctx.variables.put((((VarReadContext)_localctx).VARIABLE!=null?((VarReadContext)_localctx).VARIABLE.getText():null), _localctx.type);
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			typeExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends ParserRuleContext {
		public String name;
		public ExpressionType type;
		public ReadContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ReadContext(ParserRuleContext parent, int invokingState, String name) {
			super(parent, invokingState);
			this.name = name;
		}
		@Override public int getRuleIndex() { return RULE_read; }
	 
		public ReadContext() { }
		public void copyFrom(ReadContext ctx) {
			super.copyFrom(ctx);
			this.name = ctx.name;
			this.type = ctx.type;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadBooleanContext extends ReadContext {
		public ReadBooleanContext(ReadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterReadBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitReadBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitReadBoolean(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadIntContext extends ReadContext {
		public ReadIntContext(ReadContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterReadInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitReadInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitReadInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read(String name) throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState(), name);
		enterRule(_localctx, 14, RULE_read);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				_localctx = new ReadIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__1);
				((ReadIntContext)_localctx).type =  ExpressionType.INT;
				}
				break;
			case T__2:
				_localctx = new ReadBooleanContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__2);
				((ReadBooleanContext)_localctx).type =  ExpressionType.BOOLEAN;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public java.util.Map<String, ExpressionType> variables;
		public Token else_;
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public List<CommandBlockContext> commandBlock() {
			return getRuleContexts(CommandBlockContext.class);
		}
		public CommandBlockContext commandBlock(int i) {
			return getRuleContext(CommandBlockContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConditionContext(ParserRuleContext parent, int invokingState, java.util.Map<String, ExpressionType> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition(java.util.Map<String, ExpressionType> variables) throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState(), variables);
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__3);
			setState(91);
			typeExpression(0);
			setState(92);
			commandBlock(variables);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(93);
				((ConditionContext)_localctx).else_ = match(T__4);
				setState(94);
				commandBlock(variables);
				}
			}


			        List<String> ambiguousVariables = _localctx.commandBlock().stream()
			            .map(v -> v.innerVariables)

			            .map(java.util.Map::entrySet)
			            .flatMap(java.util.Collection::stream)
			            .collect(java.util.stream.Collectors.groupingBy(
			                   java.util.Map.Entry::getKey,
			                   java.util.stream.Collectors.mapping(
			                           java.util.Map.Entry::getValue,
			                           java.util.stream.Collectors.toSet()
			                   )
			            )).entrySet().stream().filter(
			                    v -> v.getValue().size() > 1
			            ).map(java.util.Map.Entry::getKey).toList();
			        if (!ambiguousVariables.isEmpty()) {
			            throw new AmbiguousVariableException(ambiguousVariables, this);
			        }
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public java.util.Map<String, ExpressionType> variables;
		public TypeExpressionContext typeExpression() {
			return getRuleContext(TypeExpressionContext.class,0);
		}
		public CommandBlockContext commandBlock() {
			return getRuleContext(CommandBlockContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WhileContext(ParserRuleContext parent, int invokingState, java.util.Map<String, ExpressionType> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_(java.util.Map<String, ExpressionType> variables) throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState(), variables);
		enterRule(_localctx, 18, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__5);
			setState(100);
			typeExpression(0);
			setState(101);
			commandBlock(variables);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandBlockContext extends ParserRuleContext {
		public java.util.Map<String, ExpressionType> variables;
		public java.util.Map<String, ExpressionType> innerVariables;
		public TerminalNode LBRACKET() { return getToken(MegaLanguageParser.LBRACKET, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MegaLanguageParser.RBRACKET, 0); }
		public CommandBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CommandBlockContext(ParserRuleContext parent, int invokingState, java.util.Map<String, ExpressionType> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_commandBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterCommandBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitCommandBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitCommandBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandBlockContext commandBlock(java.util.Map<String, ExpressionType> variables) throws RecognitionException {
		CommandBlockContext _localctx = new CommandBlockContext(_ctx, getState(), variables);
		enterRule(_localctx, 20, RULE_commandBlock);

		        ((CommandBlockContext)_localctx).innerVariables =  new java.util.HashMap<String, ExpressionType>();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(LBRACKET);
			setState(104);
			commands(_localctx.innerVariables);
			setState(105);
			match(RBRACKET);

			        _localctx.variables.putAll(_localctx.innerVariables);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comp_opContext extends ParserRuleContext {
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitComp_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8064L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MegaLanguageParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MegaLanguageParser.RPAREN, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> PLUS() { return getTokens(MegaLanguageParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(MegaLanguageParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(MegaLanguageParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(MegaLanguageParser.MINUS, i);
		}
		public TerminalNode TIMES() { return getToken(MegaLanguageParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(MegaLanguageParser.DIV, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MegaLanguageListener ) ((MegaLanguageListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MegaLanguageVisitor ) return ((MegaLanguageVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(111);
				match(LPAREN);
				setState(112);
				expression(0);
				setState(113);
				match(RPAREN);
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
			case VARIABLE:
				{
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(115);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(126);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(127);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(128);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return typeExpression_sempred((TypeExpressionContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean typeExpression_sempred(TypeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000$\b"+
		"\u0000\n\u0000\f\u0000\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u00034\b\u0003\u0001\u0004\u0003\u00047\b\u0004"+
		"\u0001\u0004\u0003\u0004:\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		">\b\u0004\n\u0004\f\u0004A\t\u0004\u0001\u0004\u0003\u0004D\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005P\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007Y\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b`\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\fu\b\f\n\f\f\fx\t\f\u0001\f\u0003\f{"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0083\b\f"+
		"\n\f\f\f\u0086\t\f\u0001\f\u0000\u0002\u0000\u0018\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0003\u0001\u0000"+
		"\u0007\f\u0001\u0000\u0014\u0015\u0001\u0000\u0016\u0017\u008a\u0000\u001a"+
		"\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004-\u0001\u0000"+
		"\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000"+
		"\nO\u0001\u0000\u0000\u0000\fQ\u0001\u0000\u0000\u0000\u000eX\u0001\u0000"+
		"\u0000\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012c\u0001\u0000\u0000\u0000"+
		"\u0014g\u0001\u0000\u0000\u0000\u0016l\u0001\u0000\u0000\u0000\u0018z"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0006\u0000\uffff\uffff\u0000\u001b"+
		"\u001c\u0003\u0018\f\u0000\u001c\u001d\u0006\u0000\uffff\uffff\u0000\u001d"+
		"%\u0001\u0000\u0000\u0000\u001e\u001f\n\u0002\u0000\u0000\u001f \u0003"+
		"\u0016\u000b\u0000 !\u0003\u0000\u0000\u0003!\"\u0006\u0000\uffff\uffff"+
		"\u0000\"$\u0001\u0000\u0000\u0000#\u001e\u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\u0001\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(,\u0005\u0018"+
		"\u0000\u0000)*\u0005\u0019\u0000\u0000*,\u0006\u0001\uffff\uffff\u0000"+
		"+(\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,\u0003\u0001\u0000"+
		"\u0000\u0000-.\u0003\b\u0004\u0000.\u0005\u0001\u0000\u0000\u0000/4\u0003"+
		"\n\u0005\u000004\u0003\f\u0006\u000014\u0003\u0010\b\u000024\u0003\u0012"+
		"\t\u00003/\u0001\u0000\u0000\u000030\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000032\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000\u0000"+
		"57\u0005\u001c\u0000\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000079\u0001\u0000\u0000\u00008:\u0003\u0006\u0003\u000098\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:?\u0001\u0000\u0000\u0000;<\u0005"+
		"\u001c\u0000\u0000<>\u0003\u0006\u0003\u0000=;\u0001\u0000\u0000\u0000"+
		">A\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000"+
		"\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BD\u0005\u001c"+
		"\u0000\u0000CB\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\t\u0001"+
		"\u0000\u0000\u0000EF\u0005\u0019\u0000\u0000FG\u0005\u0010\u0000\u0000"+
		"GH\u0003\u0000\u0000\u0000HI\u0006\u0005\uffff\uffff\u0000IP\u0001\u0000"+
		"\u0000\u0000JK\u0005\u0019\u0000\u0000KL\u0005\u0010\u0000\u0000LM\u0003"+
		"\u000e\u0007\u0000MN\u0006\u0005\uffff\uffff\u0000NP\u0001\u0000\u0000"+
		"\u0000OE\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000P\u000b\u0001"+
		"\u0000\u0000\u0000QR\u0005\u0001\u0000\u0000RS\u0003\u0000\u0000\u0000"+
		"S\r\u0001\u0000\u0000\u0000TU\u0005\u0002\u0000\u0000UY\u0006\u0007\uffff"+
		"\uffff\u0000VW\u0005\u0003\u0000\u0000WY\u0006\u0007\uffff\uffff\u0000"+
		"XT\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000Y\u000f\u0001\u0000"+
		"\u0000\u0000Z[\u0005\u0004\u0000\u0000[\\\u0003\u0000\u0000\u0000\\_\u0003"+
		"\u0014\n\u0000]^\u0005\u0005\u0000\u0000^`\u0003\u0014\n\u0000_]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0006\b\uffff\uffff\u0000b\u0011\u0001\u0000\u0000\u0000cd\u0005\u0006"+
		"\u0000\u0000de\u0003\u0000\u0000\u0000ef\u0003\u0014\n\u0000f\u0013\u0001"+
		"\u0000\u0000\u0000gh\u0005\u000e\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005"+
		"\u000f\u0000\u0000jk\u0006\n\uffff\uffff\u0000k\u0015\u0001\u0000\u0000"+
		"\u0000lm\u0007\u0000\u0000\u0000m\u0017\u0001\u0000\u0000\u0000no\u0006"+
		"\f\uffff\uffff\u0000op\u0005\u0012\u0000\u0000pq\u0003\u0018\f\u0000q"+
		"r\u0005\u0013\u0000\u0000r{\u0001\u0000\u0000\u0000su\u0007\u0001\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001"+
		"\u0000\u0000\u0000y{\u0003\u0002\u0001\u0000zn\u0001\u0000\u0000\u0000"+
		"zv\u0001\u0000\u0000\u0000{\u0084\u0001\u0000\u0000\u0000|}\n\u0004\u0000"+
		"\u0000}~\u0007\u0002\u0000\u0000~\u0083\u0003\u0018\f\u0005\u007f\u0080"+
		"\n\u0003\u0000\u0000\u0080\u0081\u0007\u0001\u0000\u0000\u0081\u0083\u0003"+
		"\u0018\f\u0004\u0082|\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0019\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u000e%+369?COX_vz\u0082"+
		"\u0084";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}