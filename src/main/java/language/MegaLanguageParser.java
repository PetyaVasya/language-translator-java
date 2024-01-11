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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, COMMENT=6, LBRACKET=7, RBRACKET=8, 
		EQ=9, WS=10, LPAREN=11, RPAREN=12, PLUS=13, MINUS=14, TIMES=15, DIV=16, 
		NUMBER=17, VARIABLE=18, DIGIT=19, LETTER=20, LINE_END=21, SPACE=22;
	public static final int
		RULE_atom = 0, RULE_program = 1, RULE_command = 2, RULE_commands = 3, 
		RULE_varDeclaration = 4, RULE_print = 5, RULE_read = 6, RULE_condition = 7, 
		RULE_while = 8, RULE_commandBlock = 9, RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"atom", "program", "command", "commands", "varDeclaration", "print", 
			"read", "condition", "while", "commandBlock", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u043F\\u0435\\u0447\\u0430\\u0442\\u044C'", "'\\u0441\\u0447\\u0438\\u0442\\u0430\\u0442\\u044C\\u0427\\u0438\\u0441\\u043B\\u043E'", 
			"'\\u0435\\u0441\\u043B\\u0438'", "'\\u0438\\u043D\\u0430\\u0447\\u0435'", 
			"'\\u043F\\u043E\\u043A\\u0430'", null, "'{'", "'}'", "'='", null, "'('", 
			"')'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "COMMENT", "LBRACKET", "RBRACKET", 
			"EQ", "WS", "LPAREN", "RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "NUMBER", 
			"VARIABLE", "DIGIT", "LETTER", "LINE_END", "SPACE"
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
		enterRule(_localctx, 0, RULE_atom);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(NUMBER);
				}
				break;
			case VARIABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				((AtomContext)_localctx).VARIABLE = match(VARIABLE);

				   	if ( !((CommandsContext)getInvokingContext(3)).variables.contains((((AtomContext)_localctx).VARIABLE!=null?((AtomContext)_localctx).VARIABLE.getText():null)) ) {
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
		enterRule(_localctx, 2, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			commands(new java.util.HashSet<>());
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
		public java.util.Set<String> variables;
		public CommandContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CommandContext(ParserRuleContext parent, int invokingState, java.util.Set<String> variables) {
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

	public final CommandContext command(java.util.Set<String> variables) throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState(), variables);
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				_localctx = new BaseCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				varDeclaration(variables);
				}
				break;
			case T__0:
				_localctx = new BaseCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				print();
				}
				break;
			case T__2:
				_localctx = new StatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				condition(variables);
				}
				break;
			case T__4:
				_localctx = new StatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
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
		public java.util.Set<String> variables;
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
		public CommandsContext(ParserRuleContext parent, int invokingState, java.util.Set<String> variables) {
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

	public final CommandsContext commands(java.util.Set<String> variables) throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState(), variables);
		enterRule(_localctx, 6, RULE_commands);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(35);
				match(LINE_END);
				}
				break;
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 262186L) != 0)) {
				{
				setState(38);
				command(variables);
				}
			}

			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					match(LINE_END);
					setState(42);
					command(variables);
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LINE_END) {
				{
				setState(48);
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
		public java.util.Set<String> variables;
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState, java.util.Set<String> variables) {
			super(parent, invokingState);
			this.variables = variables;
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
			this.variables = ctx.variables;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarEvaluatedContext extends VarDeclarationContext {
		public Token VARIABLE;
		public TerminalNode VARIABLE() { return getToken(MegaLanguageParser.VARIABLE, 0); }
		public TerminalNode EQ() { return getToken(MegaLanguageParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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

	public final VarDeclarationContext varDeclaration(java.util.Set<String> variables) throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState(), variables);
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new VarEvaluatedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				((VarEvaluatedContext)_localctx).VARIABLE = match(VARIABLE);
				setState(52);
				match(EQ);
				setState(53);
				expression(0);
				_localctx.variables.add((((VarEvaluatedContext)_localctx).VARIABLE!=null?((VarEvaluatedContext)_localctx).VARIABLE.getText():null));
				}
				break;
			case 2:
				_localctx = new VarReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				((VarReadContext)_localctx).VARIABLE = match(VARIABLE);
				setState(57);
				match(EQ);
				setState(58);
				read((((VarReadContext)_localctx).VARIABLE!=null?((VarReadContext)_localctx).VARIABLE.getText():null));
				_localctx.variables.add((((VarReadContext)_localctx).VARIABLE!=null?((VarReadContext)_localctx).VARIABLE.getText():null));
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__0);
			setState(64);
			expression(0);
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
		enterRule(_localctx, 12, RULE_read);
		try {
			_localctx = new ReadIntContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__1);
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
		public java.util.Set<String> variables;
		public Token else_;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommandBlockContext> commandBlock() {
			return getRuleContexts(CommandBlockContext.class);
		}
		public CommandBlockContext commandBlock(int i) {
			return getRuleContext(CommandBlockContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConditionContext(ParserRuleContext parent, int invokingState, java.util.Set<String> variables) {
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

	public final ConditionContext condition(java.util.Set<String> variables) throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState(), variables);
		enterRule(_localctx, 14, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__2);
			setState(69);
			expression(0);
			setState(70);
			commandBlock(variables);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(71);
				((ConditionContext)_localctx).else_ = match(T__3);
				setState(72);
				commandBlock(variables);
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
	public static class WhileContext extends ParserRuleContext {
		public java.util.Set<String> variables;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandBlockContext commandBlock() {
			return getRuleContext(CommandBlockContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public WhileContext(ParserRuleContext parent, int invokingState, java.util.Set<String> variables) {
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

	public final WhileContext while_(java.util.Set<String> variables) throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState(), variables);
		enterRule(_localctx, 16, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__4);
			setState(76);
			expression(0);
			setState(77);
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
		public java.util.Set<String> variables;
		public TerminalNode LBRACKET() { return getToken(MegaLanguageParser.LBRACKET, 0); }
		public CommandsContext commands() {
			return getRuleContext(CommandsContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(MegaLanguageParser.RBRACKET, 0); }
		public CommandBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CommandBlockContext(ParserRuleContext parent, int invokingState, java.util.Set<String> variables) {
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

	public final CommandBlockContext commandBlock(java.util.Set<String> variables) throws RecognitionException {
		CommandBlockContext _localctx = new CommandBlockContext(_ctx, getState(), variables);
		enterRule(_localctx, 18, RULE_commandBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRACKET);
			setState(80);
			commands(_localctx.variables);
			setState(81);
			match(RBRACKET);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(84);
				match(LPAREN);
				setState(85);
				expression(0);
				setState(86);
				match(RPAREN);
				}
				break;
			case PLUS:
			case MINUS:
			case NUMBER:
			case VARIABLE:
				{
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS || _la==MINUS) {
					{
					{
					setState(88);
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
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(97);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(98);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(100);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(101);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						expression(4);
						}
						break;
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0016m\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\u001a\b\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\"\b\u0002\u0001\u0003\u0003"+
		"\u0003%\b\u0003\u0001\u0003\u0003\u0003(\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003,\b\u0003\n\u0003\f\u0003/\t\u0003\u0001\u0003\u0003\u0003"+
		"2\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		">\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"J\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nZ\b\n\n\n\f"+
		"\n]\t\n\u0001\n\u0003\n`\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\nh\b\n\n\n\f\nk\t\n\u0001\n\u0000\u0001\u0014\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0002\u0001\u0000\r\u000e"+
		"\u0001\u0000\u000f\u0010o\u0000\u0019\u0001\u0000\u0000\u0000\u0002\u001b"+
		"\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006$\u0001\u0000"+
		"\u0000\u0000\b=\u0001\u0000\u0000\u0000\n?\u0001\u0000\u0000\u0000\fB"+
		"\u0001\u0000\u0000\u0000\u000eD\u0001\u0000\u0000\u0000\u0010K\u0001\u0000"+
		"\u0000\u0000\u0012O\u0001\u0000\u0000\u0000\u0014_\u0001\u0000\u0000\u0000"+
		"\u0016\u001a\u0005\u0011\u0000\u0000\u0017\u0018\u0005\u0012\u0000\u0000"+
		"\u0018\u001a\u0006\u0000\uffff\uffff\u0000\u0019\u0016\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000"+
		"\u0000\u001b\u001c\u0003\u0006\u0003\u0000\u001c\u0003\u0001\u0000\u0000"+
		"\u0000\u001d\"\u0003\b\u0004\u0000\u001e\"\u0003\n\u0005\u0000\u001f\""+
		"\u0003\u000e\u0007\u0000 \"\u0003\u0010\b\u0000!\u001d\u0001\u0000\u0000"+
		"\u0000!\u001e\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!"+
		" \u0001\u0000\u0000\u0000\"\u0005\u0001\u0000\u0000\u0000#%\u0005\u0015"+
		"\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0001"+
		"\u0000\u0000\u0000&(\u0003\u0004\u0002\u0000\'&\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(-\u0001\u0000\u0000\u0000)*\u0005\u0015\u0000"+
		"\u0000*,\u0003\u0004\u0002\u0000+)\u0001\u0000\u0000\u0000,/\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u000002\u0005\u0015\u0000\u0000"+
		"10\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u00002\u0007\u0001\u0000"+
		"\u0000\u000034\u0005\u0012\u0000\u000045\u0005\t\u0000\u000056\u0003\u0014"+
		"\n\u000067\u0006\u0004\uffff\uffff\u00007>\u0001\u0000\u0000\u000089\u0005"+
		"\u0012\u0000\u00009:\u0005\t\u0000\u0000:;\u0003\f\u0006\u0000;<\u0006"+
		"\u0004\uffff\uffff\u0000<>\u0001\u0000\u0000\u0000=3\u0001\u0000\u0000"+
		"\u0000=8\u0001\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000?@\u0005\u0001"+
		"\u0000\u0000@A\u0003\u0014\n\u0000A\u000b\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0002\u0000\u0000C\r\u0001\u0000\u0000\u0000DE\u0005\u0003\u0000\u0000"+
		"EF\u0003\u0014\n\u0000FI\u0003\u0012\t\u0000GH\u0005\u0004\u0000\u0000"+
		"HJ\u0003\u0012\t\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"J\u000f\u0001\u0000\u0000\u0000KL\u0005\u0005\u0000\u0000LM\u0003\u0014"+
		"\n\u0000MN\u0003\u0012\t\u0000N\u0011\u0001\u0000\u0000\u0000OP\u0005"+
		"\u0007\u0000\u0000PQ\u0003\u0006\u0003\u0000QR\u0005\b\u0000\u0000R\u0013"+
		"\u0001\u0000\u0000\u0000ST\u0006\n\uffff\uffff\u0000TU\u0005\u000b\u0000"+
		"\u0000UV\u0003\u0014\n\u0000VW\u0005\f\u0000\u0000W`\u0001\u0000\u0000"+
		"\u0000XZ\u0007\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000"+
		"\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^`\u0003\u0000\u0000\u0000"+
		"_S\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000`i\u0001\u0000\u0000"+
		"\u0000ab\n\u0004\u0000\u0000bc\u0007\u0001\u0000\u0000ch\u0003\u0014\n"+
		"\u0005de\n\u0003\u0000\u0000ef\u0007\u0000\u0000\u0000fh\u0003\u0014\n"+
		"\u0004ga\u0001\u0000\u0000\u0000gd\u0001\u0000\u0000\u0000hk\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0015"+
		"\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000\f\u0019!$\'-1=I[_g"+
		"i";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}