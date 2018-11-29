// Generated from Caronte.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CaronteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, Inteiro=66, 
		Decimal=67, String=68, Nome=69, WS=70, COMMENT=71, LINE_COMMENT=72;
	public static final int
		RULE_inicio = 0, RULE_bloco = 1, RULE_trecho = 2, RULE_comando = 3, RULE_erro_ponto_virgula = 4, 
		RULE_comandobloco = 5, RULE_comandoexpressao = 6, RULE_erro_var_declaracao = 7, 
		RULE_comandounico = 8, RULE_ultimocomando = 9, RULE_listaatri = 10, RULE_nomedafuncao = 11, 
		RULE_erro_inline_fastcall = 12, RULE_tipovar = 13, RULE_tiporet = 14, 
		RULE_listavar = 15, RULE_var = 16, RULE_listadenomes = 17, RULE_listaexp = 18, 
		RULE_exp = 19, RULE_valores = 20, RULE_expprefixo = 21, RULE_chamadadefuncao = 22, 
		RULE_corpodafuncao = 23, RULE_listapar = 24, RULE_opbin = 25, RULE_opbin2 = 26, 
		RULE_opbin3 = 27, RULE_opbin4 = 28, RULE_opunaria = 29;
	public static final String[] ruleNames = {
		"inicio", "bloco", "trecho", "comando", "erro_ponto_virgula", "comandobloco", 
		"comandoexpressao", "erro_var_declaracao", "comandounico", "ultimocomando", 
		"listaatri", "nomedafuncao", "erro_inline_fastcall", "tipovar", "tiporet", 
		"listavar", "var", "listadenomes", "listaexp", "exp", "valores", "expprefixo", 
		"chamadadefuncao", "corpodafuncao", "listapar", "opbin", "opbin2", "opbin3", 
		"opbin4", "opunaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'struct'", "'{'", "'array'", "'['", "']'", "','", "'}'", "';'", 
		"'define'", "'do'", "'end'", "'while'", "'repeat'", "'until'", "'if'", 
		"'then'", "'elseif'", "'else'", "'for'", "'auto'", "'='", "':'", "'in'", 
		"'goto'", "'return'", "'break'", "'inline'", "'fastcall'", "'boolean'", 
		"'int'", "'double'", "'float'", "'string'", "'void'", "'.'", "'('", "')'", 
		"'null'", "'false'", "'true'", "'^'", "'..'", "'and'", "'<'", "'<='", 
		"'>'", "'>='", "'=='", "'!='", "'*'", "'/'", "'or'", "'%'", "'+'", "'-'", 
		"'+='", "'-='", "'*='", "'/='", "'^='", "'%='", "'not'", "'#'", "'++'", 
		"'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "Inteiro", "Decimal", "String", "Nome", 
		"WS", "COMMENT", "LINE_COMMENT"
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

	@Override
	public String getGrammarFileName() { return "Caronte.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CaronteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(60);
				bloco();
				}
				}
				setState(63); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__19) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33))) != 0) || _la==Nome );
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

	public static class BlocoContext extends ParserRuleContext {
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	 
		public BlocoContext() { }
		public void copyFrom(BlocoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefineDeclarationContext extends BlocoContext {
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public DefineDeclarationContext(BlocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterDefineDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitDefineDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitDefineDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AContext extends BlocoContext {
		public ComandoexpressaoContext comandoexpressao() {
			return getRuleContext(ComandoexpressaoContext.class,0);
		}
		public AContext(BlocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitA(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructOrArrayDeclarationContext extends BlocoContext {
		public List<TerminalNode> Nome() { return getTokens(CaronteParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(CaronteParser.Nome, i);
		}
		public List<TipovarContext> tipovar() {
			return getRuleContexts(TipovarContext.class);
		}
		public TipovarContext tipovar(int i) {
			return getRuleContext(TipovarContext.class,i);
		}
		public List<TerminalNode> Inteiro() { return getTokens(CaronteParser.Inteiro); }
		public TerminalNode Inteiro(int i) {
			return getToken(CaronteParser.Inteiro, i);
		}
		public StructOrArrayDeclarationContext(BlocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterStructOrArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitStructOrArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitStructOrArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDeclarationContext extends BlocoContext {
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public FunctionDeclarationContext(BlocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				comandoexpressao();
				}
				break;
			case 2:
				_localctx = new StructOrArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__0);
				setState(67);
				match(Nome);
				setState(68);
				match(T__1);
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case Nome:
					{
					setState(69);
					tipovar();
					setState(70);
					match(Nome);
					}
					break;
				case T__2:
					{
					setState(72);
					match(T__2);
					setState(73);
					tipovar();
					setState(74);
					match(Nome);
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(75);
						match(T__3);
						setState(76);
						match(Inteiro);
						setState(77);
						match(T__4);
						}
						}
						setState(80); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__3 );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(84);
					match(T__5);
					setState(98);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(85);
						tipovar();
						setState(86);
						match(Nome);
						}
						break;
					case T__2:
						{
						setState(88);
						match(T__2);
						setState(89);
						tipovar();
						setState(90);
						match(Nome);
						setState(94); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(91);
							match(T__3);
							setState(92);
							match(Inteiro);
							setState(93);
							match(T__4);
							}
							}
							setState(96); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__3 );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(T__6);
				setState(106);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				nomedafuncao();
				setState(109);
				corpodafuncao();
				}
				break;
			case 4:
				_localctx = new DefineDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(T__8);
				setState(112);
				match(Nome);
				setState(113);
				valores();
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

	public static class TrechoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public UltimocomandoContext ultimocomando() {
			return getRuleContext(UltimocomandoContext.class,0);
		}
		public TrechoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trecho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterTrecho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitTrecho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitTrecho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_trecho);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(116);
					comando();
					}
					}
					setState(119); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__54) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0) );
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24 || _la==T__25) {
					{
					setState(121);
					ultimocomando();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__54) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					{
					setState(124);
					comando();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(130);
				ultimocomando();
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoblocoContext comandobloco() {
			return getRuleContext(ComandoblocoContext.class,0);
		}
		public ComandounicoContext comandounico() {
			return getRuleContext(ComandounicoContext.class,0);
		}
		public Erro_ponto_virgulaContext erro_ponto_virgula() {
			return getRuleContext(Erro_ponto_virgulaContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				comandobloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				comandounico();
				setState(135);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				erro_ponto_virgula();
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

	public static class Erro_ponto_virgulaContext extends ParserRuleContext {
		public ComandounicoContext comandounico() {
			return getRuleContext(ComandounicoContext.class,0);
		}
		public Erro_ponto_virgulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erro_ponto_virgula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterErro_ponto_virgula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitErro_ponto_virgula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitErro_ponto_virgula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Erro_ponto_virgulaContext erro_ponto_virgula() throws RecognitionException {
		Erro_ponto_virgulaContext _localctx = new Erro_ponto_virgulaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_erro_ponto_virgula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			comandounico();
			notifyErrorListeners("';' é necessário");
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

	public static class ComandoblocoContext extends ParserRuleContext {
		public ComandoblocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandobloco; }
	 
		public ComandoblocoContext() { }
		public void copyFrom(ComandoblocoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForInutilContext extends ComandoblocoContext {
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ForInutilContext(ComandoblocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterForInutil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitForInutil(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitForInutil(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GotoContext extends ComandoblocoContext {
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public GotoContext(ComandoblocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitGoto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatContext extends ComandoblocoContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatContext(ComandoblocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends ComandoblocoContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ComandounicoContext comandounico() {
			return getRuleContext(ComandounicoContext.class,0);
		}
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public ForContext(ComandoblocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoContext extends ComandoblocoContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public DoContext(ComandoblocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LabelContext extends ComandoblocoContext {
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public LabelContext(ComandoblocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ComandoblocoContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public WhileContext(ComandoblocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ComandoblocoContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TrechoContext> trecho() {
			return getRuleContexts(TrechoContext.class);
		}
		public TrechoContext trecho(int i) {
			return getRuleContext(TrechoContext.class,i);
		}
		public IfContext(ComandoblocoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoblocoContext comandobloco() throws RecognitionException {
		ComandoblocoContext _localctx = new ComandoblocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandobloco);
		int _la;
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new DoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__9);
				setState(144);
				trecho();
				setState(145);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__11);
				setState(148);
				exp(0);
				setState(149);
				match(T__9);
				setState(150);
				trecho();
				setState(151);
				match(T__10);
				}
				break;
			case 3:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__12);
				setState(154);
				trecho();
				setState(155);
				match(T__13);
				setState(156);
				exp(0);
				setState(157);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				match(T__14);
				setState(160);
				exp(0);
				setState(161);
				match(T__15);
				setState(162);
				trecho();
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(163);
					match(T__16);
					setState(164);
					exp(0);
					setState(165);
					match(T__15);
					setState(166);
					trecho();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(173);
					match(T__17);
					setState(174);
					trecho();
					}
				}

				setState(177);
				match(T__10);
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(179);
				match(T__18);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__28 - 20)) | (1L << (T__29 - 20)) | (1L << (T__30 - 20)) | (1L << (T__31 - 20)) | (1L << (T__32 - 20)) | (1L << (Nome - 20)))) != 0)) {
					{
					setState(182);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(180);
						tipovar();
						}
						break;
					case T__19:
						{
						setState(181);
						match(T__19);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(184);
					match(Nome);
					setState(185);
					match(T__20);
					setState(186);
					exp(0);
					}
				}

				setState(189);
				match(T__21);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__54) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(190);
					exp(0);
					}
				}

				setState(193);
				match(T__21);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__19) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__54) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(194);
					comandounico();
					}
				}

				setState(197);
				match(T__9);
				setState(198);
				trecho();
				setState(199);
				match(T__10);
				}
				break;
			case 6:
				_localctx = new ForInutilContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(201);
				match(T__18);
				setState(202);
				listadenomes();
				setState(203);
				match(T__22);
				setState(204);
				listaexp();
				setState(205);
				match(T__9);
				setState(206);
				trecho();
				setState(207);
				match(T__10);
				}
				break;
			case 7:
				_localctx = new GotoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(209);
				match(T__23);
				setState(210);
				match(Nome);
				setState(211);
				match(T__7);
				}
				break;
			case 8:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(212);
				match(Nome);
				setState(213);
				match(T__21);
				setState(214);
				comando();
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

	public static class ComandoexpressaoContext extends ParserRuleContext {
		public ComandoexpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoexpressao; }
	 
		public ComandoexpressaoContext() { }
		public void copyFrom(ComandoexpressaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorDeclarationContext extends ComandoexpressaoContext {
		public Erro_var_declaracaoContext erro_var_declaracao() {
			return getRuleContext(Erro_var_declaracaoContext.class,0);
		}
		public ErrorDeclarationContext(ComandoexpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterErrorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitErrorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitErrorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtribContext extends ComandoexpressaoContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListaatriContext listaatri() {
			return getRuleContext(ListaatriContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AtribContext(ComandoexpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitAtrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitAtrib(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayDeclarationContext extends ComandoexpressaoContext {
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> Inteiro() { return getTokens(CaronteParser.Inteiro); }
		public TerminalNode Inteiro(int i) {
			return getToken(CaronteParser.Inteiro, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ArrayDeclarationContext(ComandoexpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AutoDeclarationContext extends ComandoexpressaoContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AutoDeclarationContext(ComandoexpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterAutoDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitAutoDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitAutoDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypedDeclarationContext extends ComandoexpressaoContext {
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TypedDeclarationContext(ComandoexpressaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterTypedDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitTypedDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitTypedDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoexpressaoContext comandoexpressao() throws RecognitionException {
		ComandoexpressaoContext _localctx = new ComandoexpressaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandoexpressao);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new AtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				var();
				setState(218);
				listaatri();
				setState(219);
				exp(0);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__2);
				setState(222);
				tipovar();
				setState(223);
				var();
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					match(T__3);
					setState(225);
					match(Inteiro);
					setState(226);
					match(T__4);
					}
					}
					setState(229); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(231);
					match(T__20);
					setState(232);
					exp(0);
					}
				}

				}
				break;
			case 3:
				_localctx = new TypedDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				tipovar();
				setState(236);
				var();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(237);
					match(T__20);
					setState(238);
					exp(0);
					}
				}

				}
				break;
			case 4:
				_localctx = new AutoDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(T__19);
				setState(242);
				var();
				setState(243);
				match(T__20);
				setState(244);
				exp(0);
				}
				break;
			case 5:
				_localctx = new ErrorDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				erro_var_declaracao();
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

	public static class Erro_var_declaracaoContext extends ParserRuleContext {
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Erro_var_declaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erro_var_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterErro_var_declaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitErro_var_declaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitErro_var_declaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Erro_var_declaracaoContext erro_var_declaracao() throws RecognitionException {
		Erro_var_declaracaoContext _localctx = new Erro_var_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_erro_var_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(T__19);
			setState(250);
			((Erro_var_declaracaoContext)_localctx).var = var();
			notifyErrorListeners(" variável  "+ (((Erro_var_declaracaoContext)_localctx).var!=null?_input.getText(((Erro_var_declaracaoContext)_localctx).var.start,((Erro_var_declaracaoContext)_localctx).var.stop):null) + " é do tipo auto e precisa ser declarada com algum valor!");
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

	public static class ComandounicoContext extends ParserRuleContext {
		public ComandoexpressaoContext comandoexpressao() {
			return getRuleContext(ComandoexpressaoContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ComandounicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandounico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterComandounico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitComandounico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitComandounico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandounicoContext comandounico() throws RecognitionException {
		ComandounicoContext _localctx = new ComandounicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandounico);
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				comandoexpressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				listaexp();
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

	public static class UltimocomandoContext extends ParserRuleContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public UltimocomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ultimocomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterUltimocomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitUltimocomando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitUltimocomando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UltimocomandoContext ultimocomando() throws RecognitionException {
		UltimocomandoContext _localctx = new UltimocomandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ultimocomando);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(T__24);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__54) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(258);
					listaexp();
					}
				}

				setState(261);
				match(T__7);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__25);
				setState(263);
				match(T__7);
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

	public static class ListaatriContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListaatriContext listaatri() {
			return getRuleContext(ListaatriContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ListaatriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaatri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterListaatri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitListaatri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitListaatri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaatriContext listaatri() throws RecognitionException {
		ListaatriContext _localctx = new ListaatriContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaatri);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__5);
				setState(267);
				var();
				setState(268);
				listaatri();
				setState(269);
				exp(0);
				setState(270);
				match(T__5);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(T__20);
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

	public static class NomedafuncaoContext extends ParserRuleContext {
		public TiporetContext tiporet() {
			return getRuleContext(TiporetContext.class,0);
		}
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public Erro_inline_fastcallContext erro_inline_fastcall() {
			return getRuleContext(Erro_inline_fastcallContext.class,0);
		}
		public NomedafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomedafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterNomedafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitNomedafuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitNomedafuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nomedafuncao);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==T__27) {
					{
					setState(275);
					_la = _input.LA(1);
					if ( !(_la==T__26 || _la==T__27) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(278);
				tiporet();
				setState(279);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				erro_inline_fastcall();
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

	public static class Erro_inline_fastcallContext extends ParserRuleContext {
		public TiporetContext tiporet() {
			return getRuleContext(TiporetContext.class,0);
		}
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public Erro_inline_fastcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erro_inline_fastcall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterErro_inline_fastcall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitErro_inline_fastcall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitErro_inline_fastcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Erro_inline_fastcallContext erro_inline_fastcall() throws RecognitionException {
		Erro_inline_fastcallContext _localctx = new Erro_inline_fastcallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_erro_inline_fastcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(T__26);
			setState(285);
			match(T__27);
			setState(286);
			tiporet();
			setState(287);
			match(Nome);
			notifyErrorListeners("fastcall e inline não podem ser usados para uma mesma função");
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

	public static class TipovarContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public TipovarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipovar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterTipovar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitTipovar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitTipovar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipovarContext tipovar() throws RecognitionException {
		TipovarContext _localctx = new TipovarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (T__28 - 29)) | (1L << (T__29 - 29)) | (1L << (T__30 - 29)) | (1L << (T__31 - 29)) | (1L << (T__32 - 29)) | (1L << (Nome - 29)))) != 0)) ) {
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

	public static class TiporetContext extends ParserRuleContext {
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public TiporetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tiporet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterTiporet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitTiporet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitTiporet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TiporetContext tiporet() throws RecognitionException {
		TiporetContext _localctx = new TiporetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tiporet);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				tipovar();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				match(T__33);
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

	public static class ListavarContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ListavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterListavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitListavar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitListavar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			var();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(297);
				match(T__5);
				setState(298);
				var();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VarContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(CaronteParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(CaronteParser.Nome, i);
		}
		public List<TerminalNode> Inteiro() { return getTokens(CaronteParser.Inteiro); }
		public TerminalNode Inteiro(int i) {
			return getToken(CaronteParser.Inteiro, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(Nome);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					match(T__34);
					setState(306);
					match(Nome);
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(312);
					match(T__3);
					setState(313);
					match(Inteiro);
					setState(314);
					match(T__4);
					setState(319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(315);
							match(T__34);
							setState(316);
							match(Nome);
							}
							} 
						}
						setState(321);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					}
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class ListadenomesContext extends ParserRuleContext {
		public List<TerminalNode> Nome() { return getTokens(CaronteParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(CaronteParser.Nome, i);
		}
		public ListadenomesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listadenomes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterListadenomes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitListadenomes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitListadenomes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listadenomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(Nome);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(328);
				match(T__5);
				setState(329);
				match(Nome);
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ListaexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ListaexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterListaexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitListaexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitListaexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					exp(0);
					setState(336);
					match(T__5);
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(343);
			exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpListExpContext extends ExpContext {
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ExpListExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterExpListExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitExpListExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitExpListExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpbinContext opbin() {
			return getRuleContext(OpbinContext.class,0);
		}
		public BinExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterBinExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitBinExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitBinExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnariaExpContext extends ExpContext {
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public UnariaExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterUnariaExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitUnariaExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitUnariaExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpValuesContext extends ExpContext {
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public ExpValuesContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterExpValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitExpValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitExpValues(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParaExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterParaExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitParaExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitParaExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpPrefixContext extends ExpContext {
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ExpPrefixContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterExpPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitExpPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitExpPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__37:
			case T__38:
			case T__39:
			case Inteiro:
			case Decimal:
			case String:
				{
				_localctx = new ExpValuesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(346);
				valores();
				}
				break;
			case Nome:
				{
				_localctx = new ExpPrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				expprefixo();
				}
				break;
			case T__1:
				{
				_localctx = new ExpListExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				match(T__1);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__54) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(349);
					listaexp();
					}
				}

				setState(352);
				match(T__6);
				}
				break;
			case T__54:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
				{
				_localctx = new UnariaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				opunaria();
				setState(354);
				exp(2);
				}
				break;
			case T__35:
				{
				_localctx = new ParaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356);
				match(T__35);
				setState(357);
				exp(0);
				setState(358);
				match(T__36);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinExpContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(362);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(363);
					opbin();
					setState(364);
					exp(4);
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class ValoresContext extends ParserRuleContext {
		public TerminalNode Decimal() { return getToken(CaronteParser.Decimal, 0); }
		public TerminalNode String() { return getToken(CaronteParser.String, 0); }
		public TerminalNode Inteiro() { return getToken(CaronteParser.Inteiro, 0); }
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitValores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitValores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (T__37 - 38)) | (1L << (T__38 - 38)) | (1L << (T__39 - 38)) | (1L << (Inteiro - 38)) | (1L << (Decimal - 38)) | (1L << (String - 38)))) != 0)) ) {
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

	public static class ExpprefixoContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public ExpprefixoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expprefixo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterExpprefixo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitExpprefixo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitExpprefixo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expprefixo);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				chamadadefuncao();
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

	public static class ChamadadefuncaoContext extends ParserRuleContext {
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ChamadadefuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadadefuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterChamadadefuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitChamadadefuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitChamadadefuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_chamadadefuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(Nome);
			setState(378);
			match(T__35);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__54) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
				{
				setState(379);
				listaexp();
				}
			}

			setState(382);
			match(T__36);
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

	public static class CorpodafuncaoContext extends ParserRuleContext {
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public ListaparContext listapar() {
			return getRuleContext(ListaparContext.class,0);
		}
		public CorpodafuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpodafuncao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterCorpodafuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitCorpodafuncao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitCorpodafuncao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(T__35);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0) || _la==Nome) {
				{
				setState(385);
				listapar();
				}
			}

			setState(388);
			match(T__36);
			setState(389);
			match(T__21);
			setState(390);
			trecho();
			setState(391);
			match(T__10);
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

	public static class ListaparContext extends ParserRuleContext {
		public List<TipovarContext> tipovar() {
			return getRuleContexts(TipovarContext.class);
		}
		public TipovarContext tipovar(int i) {
			return getRuleContext(TipovarContext.class,i);
		}
		public List<TerminalNode> Nome() { return getTokens(CaronteParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(CaronteParser.Nome, i);
		}
		public List<TerminalNode> Inteiro() { return getTokens(CaronteParser.Inteiro); }
		public TerminalNode Inteiro(int i) {
			return getToken(CaronteParser.Inteiro, i);
		}
		public ListaparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listapar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterListapar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitListapar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitListapar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaparContext listapar() throws RecognitionException {
		ListaparContext _localctx = new ListaparContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listapar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(406);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(393);
						tipovar();
						setState(394);
						match(Nome);
						}
						break;
					case T__2:
						{
						setState(396);
						match(T__2);
						setState(397);
						tipovar();
						setState(398);
						match(Nome);
						setState(402); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(399);
							match(T__3);
							setState(400);
							match(Inteiro);
							setState(401);
							match(T__4);
							}
							}
							setState(404); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__3 );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(408);
					match(T__5);
					}
					} 
				}
				setState(414);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case Nome:
				{
				setState(415);
				tipovar();
				setState(416);
				match(Nome);
				}
				break;
			case T__2:
				{
				setState(418);
				match(T__2);
				setState(419);
				tipovar();
				setState(420);
				match(Nome);
				setState(424); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(421);
					match(T__3);
					setState(422);
					match(Inteiro);
					setState(423);
					match(T__4);
					}
					}
					setState(426); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OpbinContext extends ParserRuleContext {
		public Opbin2Context opbin2() {
			return getRuleContext(Opbin2Context.class,0);
		}
		public OpbinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterOpbin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitOpbin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitOpbin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opbin);
		try {
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(T__42);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				match(T__46);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 9);
				{
				setState(438);
				match(T__48);
				}
				break;
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 10);
				{
				setState(439);
				opbin2();
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

	public static class Opbin2Context extends ParserRuleContext {
		public Opbin3Context opbin3() {
			return getRuleContext(Opbin3Context.class,0);
		}
		public Opbin2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterOpbin2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitOpbin2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitOpbin2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opbin2Context opbin2() throws RecognitionException {
		Opbin2Context _localctx = new Opbin2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_opbin2);
		try {
			setState(447);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				match(T__52);
				}
				break;
			case T__53:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 5);
				{
				setState(446);
				opbin3();
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

	public static class Opbin3Context extends ParserRuleContext {
		public Opbin4Context opbin4() {
			return getRuleContext(Opbin4Context.class,0);
		}
		public Opbin3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterOpbin3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitOpbin3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitOpbin3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opbin3Context opbin3() throws RecognitionException {
		Opbin3Context _localctx = new Opbin3Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_opbin3);
		try {
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__53:
				enterOuterAlt(_localctx, 1);
				{
				setState(449);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 2);
				{
				setState(450);
				match(T__54);
				}
				break;
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 3);
				{
				setState(451);
				opbin4();
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

	public static class Opbin4Context extends ParserRuleContext {
		public Opbin4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterOpbin4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitOpbin4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitOpbin4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opbin4Context opbin4() throws RecognitionException {
		Opbin4Context _localctx = new Opbin4Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_opbin4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0)) ) {
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

	public static class OpunariaContext extends ParserRuleContext {
		public OpunariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opunaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterOpunaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitOpunaria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitOpunaria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (T__54 - 55)) | (1L << (T__61 - 55)) | (1L << (T__62 - 55)) | (1L << (T__63 - 55)) | (1L << (T__64 - 55)))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u01cd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2@"+
		"\n\2\r\2\16\2A\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3"+
		"Q\n\3\r\3\16\3R\5\3U\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3a"+
		"\n\3\r\3\16\3b\5\3e\n\3\7\3g\n\3\f\3\16\3j\13\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3u\n\3\3\4\6\4x\n\4\r\4\16\4y\3\4\5\4}\n\4\3\4\7\4\u0080"+
		"\n\4\f\4\16\4\u0083\13\4\3\4\5\4\u0086\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u008d"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ab\n\7\f\7\16\7"+
		"\u00ae\13\7\3\7\3\7\5\7\u00b2\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b9\n\7\3"+
		"\7\3\7\3\7\5\7\u00be\n\7\3\7\3\7\5\7\u00c2\n\7\3\7\3\7\5\7\u00c6\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7\u00da\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00e6\n\b\r"+
		"\b\16\b\u00e7\3\b\3\b\5\b\u00ec\n\b\3\b\3\b\3\b\3\b\5\b\u00f2\n\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u00fa\n\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0102\n"+
		"\n\3\13\3\13\5\13\u0106\n\13\3\13\3\13\3\13\5\13\u010b\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0114\n\f\3\r\5\r\u0117\n\r\3\r\3\r\3\r\3\r\5\r"+
		"\u011d\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u0129"+
		"\n\20\3\21\3\21\3\21\7\21\u012e\n\21\f\21\16\21\u0131\13\21\3\22\3\22"+
		"\3\22\7\22\u0136\n\22\f\22\16\22\u0139\13\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0140\n\22\f\22\16\22\u0143\13\22\7\22\u0145\n\22\f\22\16\22\u0148"+
		"\13\22\3\23\3\23\3\23\7\23\u014d\n\23\f\23\16\23\u0150\13\23\3\24\3\24"+
		"\3\24\7\24\u0155\n\24\f\24\16\24\u0158\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0161\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u016b\n\25\3\25\3\25\3\25\3\25\7\25\u0171\n\25\f\25\16\25\u0174\13\25"+
		"\3\26\3\26\3\27\3\27\5\27\u017a\n\27\3\30\3\30\3\30\5\30\u017f\n\30\3"+
		"\30\3\30\3\31\3\31\5\31\u0185\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u0195\n\32\r\32\16\32\u0196\5"+
		"\32\u0199\n\32\3\32\3\32\7\32\u019d\n\32\f\32\16\32\u01a0\13\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u01ab\n\32\r\32\16\32\u01ac"+
		"\5\32\u01af\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u01bb\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u01c2\n\34\3\35\3\35\3\35\5"+
		"\35\u01c7\n\35\3\36\3\36\3\37\3\37\3\37\2\3( \2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\7\3\2\35\36\4\2\37#GG\4\2(*"+
		"DF\3\2:?\4\299@C\2\u01fb\2?\3\2\2\2\4t\3\2\2\2\6\u0085\3\2\2\2\b\u008c"+
		"\3\2\2\2\n\u008e\3\2\2\2\f\u00d9\3\2\2\2\16\u00f9\3\2\2\2\20\u00fb\3\2"+
		"\2\2\22\u0101\3\2\2\2\24\u010a\3\2\2\2\26\u0113\3\2\2\2\30\u011c\3\2\2"+
		"\2\32\u011e\3\2\2\2\34\u0124\3\2\2\2\36\u0128\3\2\2\2 \u012a\3\2\2\2\""+
		"\u0132\3\2\2\2$\u0149\3\2\2\2&\u0156\3\2\2\2(\u016a\3\2\2\2*\u0175\3\2"+
		"\2\2,\u0179\3\2\2\2.\u017b\3\2\2\2\60\u0182\3\2\2\2\62\u019e\3\2\2\2\64"+
		"\u01ba\3\2\2\2\66\u01c1\3\2\2\28\u01c6\3\2\2\2:\u01c8\3\2\2\2<\u01ca\3"+
		"\2\2\2>@\5\4\3\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2Cu"+
		"\5\16\b\2DE\7\3\2\2EF\7G\2\2FT\7\4\2\2GH\5\34\17\2HI\7G\2\2IU\3\2\2\2"+
		"JK\7\5\2\2KL\5\34\17\2LP\7G\2\2MN\7\6\2\2NO\7D\2\2OQ\7\7\2\2PM\3\2\2\2"+
		"QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TG\3\2\2\2TJ\3\2\2\2Uh\3\2\2\2"+
		"Vd\7\b\2\2WX\5\34\17\2XY\7G\2\2Ye\3\2\2\2Z[\7\5\2\2[\\\5\34\17\2\\`\7"+
		"G\2\2]^\7\6\2\2^_\7D\2\2_a\7\7\2\2`]\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2"+
		"\2\2ce\3\2\2\2dW\3\2\2\2dZ\3\2\2\2eg\3\2\2\2fV\3\2\2\2gj\3\2\2\2hf\3\2"+
		"\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\t\2\2lm\7\n\2\2mu\3\2\2\2no\5\30"+
		"\r\2op\5\60\31\2pu\3\2\2\2qr\7\13\2\2rs\7G\2\2su\5*\26\2tC\3\2\2\2tD\3"+
		"\2\2\2tn\3\2\2\2tq\3\2\2\2u\5\3\2\2\2vx\5\b\5\2wv\3\2\2\2xy\3\2\2\2yw"+
		"\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\5\24\13\2|{\3\2\2\2|}\3\2\2\2}\u0086\3"+
		"\2\2\2~\u0080\5\b\5\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086"+
		"\5\24\13\2\u0085w\3\2\2\2\u0085\u0081\3\2\2\2\u0086\7\3\2\2\2\u0087\u008d"+
		"\5\f\7\2\u0088\u0089\5\22\n\2\u0089\u008a\7\n\2\2\u008a\u008d\3\2\2\2"+
		"\u008b\u008d\5\n\6\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\t\3\2\2\2\u008e\u008f\5\22\n\2\u008f\u0090\b\6\1\2\u0090"+
		"\13\3\2\2\2\u0091\u0092\7\f\2\2\u0092\u0093\5\6\4\2\u0093\u0094\7\r\2"+
		"\2\u0094\u00da\3\2\2\2\u0095\u0096\7\16\2\2\u0096\u0097\5(\25\2\u0097"+
		"\u0098\7\f\2\2\u0098\u0099\5\6\4\2\u0099\u009a\7\r\2\2\u009a\u00da\3\2"+
		"\2\2\u009b\u009c\7\17\2\2\u009c\u009d\5\6\4\2\u009d\u009e\7\20\2\2\u009e"+
		"\u009f\5(\25\2\u009f\u00a0\7\n\2\2\u00a0\u00da\3\2\2\2\u00a1\u00a2\7\21"+
		"\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a4\7\22\2\2\u00a4\u00ac\5\6\4\2\u00a5"+
		"\u00a6\7\23\2\2\u00a6\u00a7\5(\25\2\u00a7\u00a8\7\22\2\2\u00a8\u00a9\5"+
		"\6\4\2\u00a9\u00ab\3\2\2\2\u00aa\u00a5\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b2\5\6\4\2\u00b1\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00da\3\2"+
		"\2\2\u00b5\u00bd\7\25\2\2\u00b6\u00b9\5\34\17\2\u00b7\u00b9\7\26\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7G"+
		"\2\2\u00bb\u00bc\7\27\2\2\u00bc\u00be\5(\25\2\u00bd\u00b8\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\7\30\2\2\u00c0\u00c2\5"+
		"(\25\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c5\7\30\2\2\u00c4\u00c6\5\22\n\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\5\6\4\2\u00c9"+
		"\u00ca\7\r\2\2\u00ca\u00da\3\2\2\2\u00cb\u00cc\7\25\2\2\u00cc\u00cd\5"+
		"$\23\2\u00cd\u00ce\7\31\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0\7\f\2\2\u00d0"+
		"\u00d1\5\6\4\2\u00d1\u00d2\7\r\2\2\u00d2\u00da\3\2\2\2\u00d3\u00d4\7\32"+
		"\2\2\u00d4\u00d5\7G\2\2\u00d5\u00da\7\n\2\2\u00d6\u00d7\7G\2\2\u00d7\u00d8"+
		"\7\30\2\2\u00d8\u00da\5\b\5\2\u00d9\u0091\3\2\2\2\u00d9\u0095\3\2\2\2"+
		"\u00d9\u009b\3\2\2\2\u00d9\u00a1\3\2\2\2\u00d9\u00b5\3\2\2\2\u00d9\u00cb"+
		"\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\r\3\2\2\2\u00db"+
		"\u00dc\5\"\22\2\u00dc\u00dd\5\26\f\2\u00dd\u00de\5(\25\2\u00de\u00fa\3"+
		"\2\2\2\u00df\u00e0\7\5\2\2\u00e0\u00e1\5\34\17\2\u00e1\u00e5\5\"\22\2"+
		"\u00e2\u00e3\7\6\2\2\u00e3\u00e4\7D\2\2\u00e4\u00e6\7\7\2\2\u00e5\u00e2"+
		"\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00eb\3\2\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00ec\5(\25\2\u00eb\u00e9\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00fa\3\2\2\2\u00ed\u00ee\5\34\17\2\u00ee"+
		"\u00f1\5\"\22\2\u00ef\u00f0\7\27\2\2\u00f0\u00f2\5(\25\2\u00f1\u00ef\3"+
		"\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00fa\3\2\2\2\u00f3\u00f4\7\26\2\2\u00f4"+
		"\u00f5\5\"\22\2\u00f5\u00f6\7\27\2\2\u00f6\u00f7\5(\25\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00fa\5\20\t\2\u00f9\u00db\3\2\2\2\u00f9\u00df\3\2\2\2\u00f9"+
		"\u00ed\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\17\3\2\2"+
		"\2\u00fb\u00fc\7\26\2\2\u00fc\u00fd\5\"\22\2\u00fd\u00fe\b\t\1\2\u00fe"+
		"\21\3\2\2\2\u00ff\u0102\5\16\b\2\u0100\u0102\5&\24\2\u0101\u00ff\3\2\2"+
		"\2\u0101\u0100\3\2\2\2\u0102\23\3\2\2\2\u0103\u0105\7\33\2\2\u0104\u0106"+
		"\5&\24\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u010b\7\n\2\2\u0108\u0109\7\34\2\2\u0109\u010b\7\n\2\2\u010a\u0103\3"+
		"\2\2\2\u010a\u0108\3\2\2\2\u010b\25\3\2\2\2\u010c\u010d\7\b\2\2\u010d"+
		"\u010e\5\"\22\2\u010e\u010f\5\26\f\2\u010f\u0110\5(\25\2\u0110\u0111\7"+
		"\b\2\2\u0111\u0114\3\2\2\2\u0112\u0114\7\27\2\2\u0113\u010c\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\27\3\2\2\2\u0115\u0117\t\2\2\2\u0116\u0115\3\2\2"+
		"\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\5\36\20\2\u0119"+
		"\u011a\7G\2\2\u011a\u011d\3\2\2\2\u011b\u011d\5\32\16\2\u011c\u0116\3"+
		"\2\2\2\u011c\u011b\3\2\2\2\u011d\31\3\2\2\2\u011e\u011f\7\35\2\2\u011f"+
		"\u0120\7\36\2\2\u0120\u0121\5\36\20\2\u0121\u0122\7G\2\2\u0122\u0123\b"+
		"\16\1\2\u0123\33\3\2\2\2\u0124\u0125\t\3\2\2\u0125\35\3\2\2\2\u0126\u0129"+
		"\5\34\17\2\u0127\u0129\7$\2\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2"+
		"\u0129\37\3\2\2\2\u012a\u012f\5\"\22\2\u012b\u012c\7\b\2\2\u012c\u012e"+
		"\5\"\22\2\u012d\u012b\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2"+
		"\u012f\u0130\3\2\2\2\u0130!\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0137\7"+
		"G\2\2\u0133\u0134\7%\2\2\u0134\u0136\7G\2\2\u0135\u0133\3\2\2\2\u0136"+
		"\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0146\3\2"+
		"\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7\6\2\2\u013b\u013c\7D\2\2\u013c"+
		"\u0141\7\7\2\2\u013d\u013e\7%\2\2\u013e\u0140\7G\2\2\u013f\u013d\3\2\2"+
		"\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u013a\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147#\3\2\2\2\u0148\u0146\3\2\2\2"+
		"\u0149\u014e\7G\2\2\u014a\u014b\7\b\2\2\u014b\u014d\7G\2\2\u014c\u014a"+
		"\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"%\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\5(\25\2\u0152\u0153\7\b\2\2"+
		"\u0153\u0155\3\2\2\2\u0154\u0151\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u015a\5(\25\2\u015a\'\3\2\2\2\u015b\u015c\b\25\1\2\u015c\u016b\5*\26"+
		"\2\u015d\u016b\5,\27\2\u015e\u0160\7\4\2\2\u015f\u0161\5&\24\2\u0160\u015f"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u016b\7\t\2\2\u0163"+
		"\u0164\5<\37\2\u0164\u0165\5(\25\4\u0165\u016b\3\2\2\2\u0166\u0167\7&"+
		"\2\2\u0167\u0168\5(\25\2\u0168\u0169\7\'\2\2\u0169\u016b\3\2\2\2\u016a"+
		"\u015b\3\2\2\2\u016a\u015d\3\2\2\2\u016a\u015e\3\2\2\2\u016a\u0163\3\2"+
		"\2\2\u016a\u0166\3\2\2\2\u016b\u0172\3\2\2\2\u016c\u016d\f\5\2\2\u016d"+
		"\u016e\5\64\33\2\u016e\u016f\5(\25\6\u016f\u0171\3\2\2\2\u0170\u016c\3"+
		"\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		")\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\t\4\2\2\u0176+\3\2\2\2\u0177"+
		"\u017a\5\"\22\2\u0178\u017a\5.\30\2\u0179\u0177\3\2\2\2\u0179\u0178\3"+
		"\2\2\2\u017a-\3\2\2\2\u017b\u017c\7G\2\2\u017c\u017e\7&\2\2\u017d\u017f"+
		"\5&\24\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\7\'\2\2\u0181/\3\2\2\2\u0182\u0184\7&\2\2\u0183\u0185\5\62\32\2"+
		"\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187"+
		"\7\'\2\2\u0187\u0188\7\30\2\2\u0188\u0189\5\6\4\2\u0189\u018a\7\r\2\2"+
		"\u018a\61\3\2\2\2\u018b\u018c\5\34\17\2\u018c\u018d\7G\2\2\u018d\u0199"+
		"\3\2\2\2\u018e\u018f\7\5\2\2\u018f\u0190\5\34\17\2\u0190\u0194\7G\2\2"+
		"\u0191\u0192\7\6\2\2\u0192\u0193\7D\2\2\u0193\u0195\7\7\2\2\u0194\u0191"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0199\3\2\2\2\u0198\u018b\3\2\2\2\u0198\u018e\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019b\7\b\2\2\u019b\u019d\3\2\2\2\u019c\u0198\3\2\2\2\u019d"+
		"\u01a0\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01ae\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a1\u01a2\5\34\17\2\u01a2\u01a3\7G\2\2\u01a3"+
		"\u01af\3\2\2\2\u01a4\u01a5\7\5\2\2\u01a5\u01a6\5\34\17\2\u01a6\u01aa\7"+
		"G\2\2\u01a7\u01a8\7\6\2\2\u01a8\u01a9\7D\2\2\u01a9\u01ab\7\7\2\2\u01aa"+
		"\u01a7\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2"+
		"\2\2\u01ad\u01af\3\2\2\2\u01ae\u01a1\3\2\2\2\u01ae\u01a4\3\2\2\2\u01af"+
		"\63\3\2\2\2\u01b0\u01bb\7+\2\2\u01b1\u01bb\7,\2\2\u01b2\u01bb\7-\2\2\u01b3"+
		"\u01bb\7.\2\2\u01b4\u01bb\7/\2\2\u01b5\u01bb\7\60\2\2\u01b6\u01bb\7\61"+
		"\2\2\u01b7\u01bb\7\62\2\2\u01b8\u01bb\7\63\2\2\u01b9\u01bb\5\66\34\2\u01ba"+
		"\u01b0\3\2\2\2\u01ba\u01b1\3\2\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01b3\3\2"+
		"\2\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b6\3\2\2\2\u01ba"+
		"\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\65\3\2\2"+
		"\2\u01bc\u01c2\7\64\2\2\u01bd\u01c2\7\65\2\2\u01be\u01c2\7\66\2\2\u01bf"+
		"\u01c2\7\67\2\2\u01c0\u01c2\58\35\2\u01c1\u01bc\3\2\2\2\u01c1\u01bd\3"+
		"\2\2\2\u01c1\u01be\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c0\3\2\2\2\u01c2"+
		"\67\3\2\2\2\u01c3\u01c7\78\2\2\u01c4\u01c7\79\2\2\u01c5\u01c7\5:\36\2"+
		"\u01c6\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c5\3\2\2\2\u01c79\3"+
		"\2\2\2\u01c8\u01c9\t\5\2\2\u01c9;\3\2\2\2\u01ca\u01cb\t\6\2\2\u01cb=\3"+
		"\2\2\2\64ARTbdhty|\u0081\u0085\u008c\u00ac\u00b1\u00b8\u00bd\u00c1\u00c5"+
		"\u00d9\u00e7\u00eb\u00f1\u00f9\u0101\u0105\u010a\u0113\u0116\u011c\u0128"+
		"\u012f\u0137\u0141\u0146\u014e\u0156\u0160\u016a\u0172\u0179\u017e\u0184"+
		"\u0196\u0198\u019e\u01ac\u01ae\u01ba\u01c1\u01c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}