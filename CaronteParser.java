// Generated from Caronte.g4 by ANTLR 4.5.3
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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

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
		RULE_opbin3 = 27, RULE_opbin4 = 28, RULE_opbin5 = 29, RULE_opunaria = 30;
	public static final String[] ruleNames = {
		"inicio", "bloco", "trecho", "comando", "erro_ponto_virgula", "comandobloco", 
		"comandoexpressao", "erro_var_declaracao", "comandounico", "ultimocomando", 
		"listaatri", "nomedafuncao", "erro_inline_fastcall", "tipovar", "tiporet", 
		"listavar", "var", "listadenomes", "listaexp", "exp", "valores", "expprefixo", 
		"chamadadefuncao", "corpodafuncao", "listapar", "opbin", "opbin2", "opbin3", 
		"opbin4", "opbin5", "opunaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'struct'", "'{'", "'array'", "'['", "']'", "','", "'}'", "';'", 
		"'define'", "'do'", "'end'", "'while'", "'repeat'", "'until'", "'if'", 
		"'then'", "'elseif'", "'else'", "'for'", "'auto'", "'='", "':'", "'in'", 
		"'goto'", "'return'", "'break'", "'inline'", "'fastcall'", "'boolean'", 
		"'int'", "'double'", "'float'", "'string'", "'void'", "'.'", "'('", "')'", 
		"'null'", "'false'", "'true'", "'^'", "'..'", "'and'", "'*'", "'/'", "'%'", 
		"'or'", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'+='", 
		"'-='", "'*='", "'/='", "'^='", "'%='", "'not'", "'#'", "'++'", "'--'"
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
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				bloco();
				}
				}
				setState(65); 
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				comandoexpressao();
				}
				break;
			case 2:
				_localctx = new StructOrArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__0);
				setState(69);
				match(Nome);
				setState(70);
				match(T__1);
				setState(84);
				switch (_input.LA(1)) {
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case Nome:
					{
					setState(71);
					tipovar();
					setState(72);
					match(Nome);
					}
					break;
				case T__2:
					{
					setState(74);
					match(T__2);
					setState(75);
					tipovar();
					setState(76);
					match(Nome);
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(77);
						match(T__3);
						setState(78);
						match(Inteiro);
						setState(79);
						match(T__4);
						}
						}
						setState(82); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__3 );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(86);
					match(T__5);
					setState(100);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(87);
						tipovar();
						setState(88);
						match(Nome);
						}
						break;
					case T__2:
						{
						setState(90);
						match(T__2);
						setState(91);
						tipovar();
						setState(92);
						match(Nome);
						setState(96); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(93);
							match(T__3);
							setState(94);
							match(Inteiro);
							setState(95);
							match(T__4);
							}
							}
							setState(98); 
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
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(T__6);
				setState(108);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new FunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				nomedafuncao();
				setState(111);
				corpodafuncao();
				}
				break;
			case 4:
				_localctx = new DefineDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(T__8);
				setState(114);
				match(Nome);
				setState(115);
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
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_trecho);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118);
					comando();
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__48) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0) );
				setState(124);
				_la = _input.LA(1);
				if (_la==T__24 || _la==T__25) {
					{
					setState(123);
					ultimocomando();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__48) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					{
					setState(126);
					comando();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
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
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				comandobloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				comandounico();
				setState(137);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
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
	}

	public final Erro_ponto_virgulaContext erro_ponto_virgula() throws RecognitionException {
		Erro_ponto_virgulaContext _localctx = new Erro_ponto_virgulaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_erro_ponto_virgula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
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
	}

	public final ComandoblocoContext comandobloco() throws RecognitionException {
		ComandoblocoContext _localctx = new ComandoblocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandobloco);
		int _la;
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new DoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(T__9);
				setState(146);
				trecho();
				setState(147);
				match(T__10);
				}
				break;
			case 2:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__11);
				setState(150);
				exp(0);
				setState(151);
				match(T__9);
				setState(152);
				trecho();
				setState(153);
				match(T__10);
				}
				break;
			case 3:
				_localctx = new RepeatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
				match(T__12);
				setState(156);
				trecho();
				setState(157);
				match(T__13);
				setState(158);
				exp(0);
				setState(159);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(T__14);
				setState(162);
				exp(0);
				setState(163);
				match(T__15);
				setState(164);
				trecho();
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(165);
					match(T__16);
					setState(166);
					exp(0);
					setState(167);
					match(T__15);
					setState(168);
					trecho();
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(175);
					match(T__17);
					setState(176);
					trecho();
					}
				}

				setState(179);
				match(T__10);
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				match(T__18);
				setState(189);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__28 - 20)) | (1L << (T__29 - 20)) | (1L << (T__30 - 20)) | (1L << (T__31 - 20)) | (1L << (T__32 - 20)) | (1L << (Nome - 20)))) != 0)) {
					{
					setState(184);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(182);
						tipovar();
						}
						break;
					case T__19:
						{
						setState(183);
						match(T__19);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(186);
					match(Nome);
					setState(187);
					match(T__20);
					setState(188);
					exp(0);
					}
				}

				setState(191);
				match(T__21);
				setState(193);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__48) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(192);
					exp(0);
					}
				}

				setState(195);
				match(T__21);
				setState(197);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__19) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__48) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(196);
					comandounico();
					}
				}

				setState(199);
				match(T__9);
				setState(200);
				trecho();
				setState(201);
				match(T__10);
				}
				break;
			case 6:
				_localctx = new ForInutilContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				match(T__18);
				setState(204);
				listadenomes();
				setState(205);
				match(T__22);
				setState(206);
				listaexp();
				setState(207);
				match(T__9);
				setState(208);
				trecho();
				setState(209);
				match(T__10);
				}
				break;
			case 7:
				_localctx = new GotoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(211);
				match(T__23);
				setState(212);
				match(Nome);
				setState(213);
				match(T__7);
				}
				break;
			case 8:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(214);
				match(Nome);
				setState(215);
				match(T__21);
				setState(216);
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
	}

	public final ComandoexpressaoContext comandoexpressao() throws RecognitionException {
		ComandoexpressaoContext _localctx = new ComandoexpressaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandoexpressao);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new AtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				var();
				setState(220);
				listaatri();
				setState(221);
				exp(0);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				match(T__2);
				setState(224);
				tipovar();
				setState(225);
				var();
				setState(229); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(226);
					match(T__3);
					setState(227);
					match(Inteiro);
					setState(228);
					match(T__4);
					}
					}
					setState(231); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(235);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(233);
					match(T__20);
					setState(234);
					exp(0);
					}
				}

				}
				break;
			case 3:
				_localctx = new TypedDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				tipovar();
				setState(238);
				var();
				setState(241);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(239);
					match(T__20);
					setState(240);
					exp(0);
					}
				}

				}
				break;
			case 4:
				_localctx = new AutoDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(243);
				match(T__19);
				setState(244);
				var();
				setState(245);
				match(T__20);
				setState(246);
				exp(0);
				}
				break;
			case 5:
				_localctx = new ErrorDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
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
	}

	public final Erro_var_declaracaoContext erro_var_declaracao() throws RecognitionException {
		Erro_var_declaracaoContext _localctx = new Erro_var_declaracaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_erro_var_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__19);
			setState(252);
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
	}

	public final ComandounicoContext comandounico() throws RecognitionException {
		ComandounicoContext _localctx = new ComandounicoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandounico);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				comandoexpressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
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
	}

	public final UltimocomandoContext ultimocomando() throws RecognitionException {
		UltimocomandoContext _localctx = new UltimocomandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ultimocomando);
		int _la;
		try {
			setState(266);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(T__24);
				setState(261);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__48) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(260);
					listaexp();
					}
				}

				setState(263);
				match(T__7);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(T__25);
				setState(265);
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
	}

	public final ListaatriContext listaatri() throws RecognitionException {
		ListaatriContext _localctx = new ListaatriContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listaatri);
		try {
			setState(275);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(T__5);
				setState(269);
				var();
				setState(270);
				listaatri();
				setState(271);
				exp(0);
				setState(272);
				match(T__5);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
	}

	public final NomedafuncaoContext nomedafuncao() throws RecognitionException {
		NomedafuncaoContext _localctx = new NomedafuncaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nomedafuncao);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				_la = _input.LA(1);
				if (_la==T__26 || _la==T__27) {
					{
					setState(277);
					_la = _input.LA(1);
					if ( !(_la==T__26 || _la==T__27) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(280);
				tiporet();
				setState(281);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
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
	}

	public final Erro_inline_fastcallContext erro_inline_fastcall() throws RecognitionException {
		Erro_inline_fastcallContext _localctx = new Erro_inline_fastcallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_erro_inline_fastcall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__26);
			setState(287);
			match(T__27);
			setState(288);
			tiporet();
			setState(289);
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
	}

	public final TipovarContext tipovar() throws RecognitionException {
		TipovarContext _localctx = new TipovarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (T__28 - 29)) | (1L << (T__29 - 29)) | (1L << (T__30 - 29)) | (1L << (T__31 - 29)) | (1L << (T__32 - 29)) | (1L << (Nome - 29)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
	}

	public final TiporetContext tiporet() throws RecognitionException {
		TiporetContext _localctx = new TiporetContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tiporet);
		try {
			setState(296);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				tipovar();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
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
	}

	public final ListavarContext listavar() throws RecognitionException {
		ListavarContext _localctx = new ListavarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			var();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(299);
				match(T__5);
				setState(300);
				var();
				}
				}
				setState(305);
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
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(Nome);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(T__34);
					setState(308);
					match(Nome);
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(326);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(314);
					match(T__3);
					setState(315);
					match(Inteiro);
					setState(316);
					match(T__4);
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(317);
							match(T__34);
							setState(318);
							match(Nome);
							}
							} 
						}
						setState(323);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					}
					}
					} 
				}
				setState(328);
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
	}

	public final ListadenomesContext listadenomes() throws RecognitionException {
		ListadenomesContext _localctx = new ListadenomesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_listadenomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(Nome);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(330);
				match(T__5);
				setState(331);
				match(Nome);
				}
				}
				setState(336);
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
	}

	public final ListaexpContext listaexp() throws RecognitionException {
		ListaexpContext _localctx = new ListaexpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(337);
					exp(0);
					setState(338);
					match(T__5);
					}
					} 
				}
				setState(344);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(345);
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
			setState(362);
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

				setState(348);
				valores();
				}
				break;
			case Nome:
				{
				_localctx = new ExpPrefixContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349);
				expprefixo();
				}
				break;
			case T__1:
				{
				_localctx = new ExpListExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				match(T__1);
				setState(352);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__48) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(351);
					listaexp();
					}
				}

				setState(354);
				match(T__6);
				}
				break;
			case T__48:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
				{
				_localctx = new UnariaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(355);
				opunaria();
				setState(356);
				exp(2);
				}
				break;
			case T__35:
				{
				_localctx = new ParaExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(358);
				match(T__35);
				setState(359);
				exp(0);
				setState(360);
				match(T__36);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
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
					setState(364);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(365);
					opbin();
					setState(366);
					exp(4);
					}
					} 
				}
				setState(372);
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
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (T__37 - 38)) | (1L << (T__38 - 38)) | (1L << (T__39 - 38)) | (1L << (Inteiro - 38)) | (1L << (Decimal - 38)) | (1L << (String - 38)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expprefixo);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
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
	}

	public final ChamadadefuncaoContext chamadadefuncao() throws RecognitionException {
		ChamadadefuncaoContext _localctx = new ChamadadefuncaoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_chamadadefuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(Nome);
			setState(380);
			match(T__35);
			setState(382);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__48) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
				{
				setState(381);
				listaexp();
				}
			}

			setState(384);
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
	}

	public final CorpodafuncaoContext corpodafuncao() throws RecognitionException {
		CorpodafuncaoContext _localctx = new CorpodafuncaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__35);
			setState(388);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0) || _la==Nome) {
				{
				setState(387);
				listapar();
				}
			}

			setState(390);
			match(T__36);
			setState(391);
			match(T__21);
			setState(392);
			trecho();
			setState(393);
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
	}

	public final ListaparContext listapar() throws RecognitionException {
		ListaparContext _localctx = new ListaparContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_listapar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(408);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(395);
						tipovar();
						setState(396);
						match(Nome);
						}
						break;
					case T__2:
						{
						setState(398);
						match(T__2);
						setState(399);
						tipovar();
						setState(400);
						match(Nome);
						setState(404); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(401);
							match(T__3);
							setState(402);
							match(Inteiro);
							setState(403);
							match(T__4);
							}
							}
							setState(406); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__3 );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(410);
					match(T__5);
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(430);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case Nome:
				{
				setState(417);
				tipovar();
				setState(418);
				match(Nome);
				}
				break;
			case T__2:
				{
				setState(420);
				match(T__2);
				setState(421);
				tipovar();
				setState(422);
				match(Nome);
				setState(426); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(423);
					match(T__3);
					setState(424);
					match(Inteiro);
					setState(425);
					match(T__4);
					}
					}
					setState(428); 
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
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_opbin);
		try {
			setState(436);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(432);
				match(T__40);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(T__41);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(434);
				match(T__42);
				}
				break;
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
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
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
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
	}

	public final Opbin2Context opbin2() throws RecognitionException {
		Opbin2Context _localctx = new Opbin2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_opbin2);
		try {
			setState(443);
			switch (_input.LA(1)) {
			case T__43:
				enterOuterAlt(_localctx, 1);
				{
				setState(438);
				match(T__43);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				match(T__45);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 4);
				{
				setState(441);
				match(T__46);
				}
				break;
			case T__47:
			case T__48:
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
				enterOuterAlt(_localctx, 5);
				{
				setState(442);
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
	}

	public final Opbin3Context opbin3() throws RecognitionException {
		Opbin3Context _localctx = new Opbin3Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_opbin3);
		try {
			setState(448);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(T__47);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
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
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
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
		public Opbin5Context opbin5() {
			return getRuleContext(Opbin5Context.class,0);
		}
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
	}

	public final Opbin4Context opbin4() throws RecognitionException {
		Opbin4Context _localctx = new Opbin4Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_opbin4);
		try {
			setState(457);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(T__49);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(T__50);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(T__51);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				match(T__52);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				match(T__53);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 6);
				{
				setState(455);
				match(T__54);
				}
				break;
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 7);
				{
				setState(456);
				opbin5();
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

	public static class Opbin5Context extends ParserRuleContext {
		public Opbin5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opbin5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterOpbin5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitOpbin5(this);
		}
	}

	public final Opbin5Context opbin5() throws RecognitionException {
		Opbin5Context _localctx = new Opbin5Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_opbin5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !(((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & ((1L << (T__48 - 49)) | (1L << (T__61 - 49)) | (1L << (T__62 - 49)) | (1L << (T__63 - 49)) | (1L << (T__64 - 49)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3J\u01d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\6\2B\n\2\r\2\16\2C\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\6\3S\n\3\r\3\16\3T\5\3W\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\6\3c\n\3\r\3\16\3d\5\3g\n\3\7\3i\n\3\f\3\16\3l\13\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3w\n\3\3\4\6\4z\n\4\r\4\16\4{\3\4\5\4\177\n\4\3\4"+
		"\7\4\u0082\n\4\f\4\16\4\u0085\13\4\3\4\5\4\u0088\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u008f\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ad\n"+
		"\7\f\7\16\7\u00b0\13\7\3\7\3\7\5\7\u00b4\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00bb"+
		"\n\7\3\7\3\7\3\7\5\7\u00c0\n\7\3\7\3\7\5\7\u00c4\n\7\3\7\3\7\5\7\u00c8"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00dc\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00e8"+
		"\n\b\r\b\16\b\u00e9\3\b\3\b\5\b\u00ee\n\b\3\b\3\b\3\b\3\b\5\b\u00f4\n"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00fc\n\b\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0104"+
		"\n\n\3\13\3\13\5\13\u0108\n\13\3\13\3\13\3\13\5\13\u010d\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u0116\n\f\3\r\5\r\u0119\n\r\3\r\3\r\3\r\3\r\5"+
		"\r\u011f\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u012b"+
		"\n\20\3\21\3\21\3\21\7\21\u0130\n\21\f\21\16\21\u0133\13\21\3\22\3\22"+
		"\3\22\7\22\u0138\n\22\f\22\16\22\u013b\13\22\3\22\3\22\3\22\3\22\3\22"+
		"\7\22\u0142\n\22\f\22\16\22\u0145\13\22\7\22\u0147\n\22\f\22\16\22\u014a"+
		"\13\22\3\23\3\23\3\23\7\23\u014f\n\23\f\23\16\23\u0152\13\23\3\24\3\24"+
		"\3\24\7\24\u0157\n\24\f\24\16\24\u015a\13\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0163\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u016d\n\25\3\25\3\25\3\25\3\25\7\25\u0173\n\25\f\25\16\25\u0176\13\25"+
		"\3\26\3\26\3\27\3\27\5\27\u017c\n\27\3\30\3\30\3\30\5\30\u0181\n\30\3"+
		"\30\3\30\3\31\3\31\5\31\u0187\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u0197\n\32\r\32\16\32\u0198\5"+
		"\32\u019b\n\32\3\32\3\32\7\32\u019f\n\32\f\32\16\32\u01a2\13\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u01ad\n\32\r\32\16\32\u01ae"+
		"\5\32\u01b1\n\32\3\33\3\33\3\33\3\33\5\33\u01b7\n\33\3\34\3\34\3\34\3"+
		"\34\3\34\5\34\u01be\n\34\3\35\3\35\3\35\5\35\u01c3\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u01cc\n\36\3\37\3\37\3 \3 \3 \2\3(!\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\7\3\2\35\36"+
		"\4\2\37#GG\4\2(*DF\3\2:?\4\2\63\63@C\u01ff\2A\3\2\2\2\4v\3\2\2\2\6\u0087"+
		"\3\2\2\2\b\u008e\3\2\2\2\n\u0090\3\2\2\2\f\u00db\3\2\2\2\16\u00fb\3\2"+
		"\2\2\20\u00fd\3\2\2\2\22\u0103\3\2\2\2\24\u010c\3\2\2\2\26\u0115\3\2\2"+
		"\2\30\u011e\3\2\2\2\32\u0120\3\2\2\2\34\u0126\3\2\2\2\36\u012a\3\2\2\2"+
		" \u012c\3\2\2\2\"\u0134\3\2\2\2$\u014b\3\2\2\2&\u0158\3\2\2\2(\u016c\3"+
		"\2\2\2*\u0177\3\2\2\2,\u017b\3\2\2\2.\u017d\3\2\2\2\60\u0184\3\2\2\2\62"+
		"\u01a0\3\2\2\2\64\u01b6\3\2\2\2\66\u01bd\3\2\2\28\u01c2\3\2\2\2:\u01cb"+
		"\3\2\2\2<\u01cd\3\2\2\2>\u01cf\3\2\2\2@B\5\4\3\2A@\3\2\2\2BC\3\2\2\2C"+
		"A\3\2\2\2CD\3\2\2\2D\3\3\2\2\2Ew\5\16\b\2FG\7\3\2\2GH\7G\2\2HV\7\4\2\2"+
		"IJ\5\34\17\2JK\7G\2\2KW\3\2\2\2LM\7\5\2\2MN\5\34\17\2NR\7G\2\2OP\7\6\2"+
		"\2PQ\7D\2\2QS\7\7\2\2RO\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2"+
		"\2VI\3\2\2\2VL\3\2\2\2Wj\3\2\2\2Xf\7\b\2\2YZ\5\34\17\2Z[\7G\2\2[g\3\2"+
		"\2\2\\]\7\5\2\2]^\5\34\17\2^b\7G\2\2_`\7\6\2\2`a\7D\2\2ac\7\7\2\2b_\3"+
		"\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fY\3\2\2\2f\\\3\2\2\2gi"+
		"\3\2\2\2hX\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2m"+
		"n\7\t\2\2no\7\n\2\2ow\3\2\2\2pq\5\30\r\2qr\5\60\31\2rw\3\2\2\2st\7\13"+
		"\2\2tu\7G\2\2uw\5*\26\2vE\3\2\2\2vF\3\2\2\2vp\3\2\2\2vs\3\2\2\2w\5\3\2"+
		"\2\2xz\5\b\5\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}\177"+
		"\5\24\13\2~}\3\2\2\2~\177\3\2\2\2\177\u0088\3\2\2\2\u0080\u0082\5\b\5"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0088\5\24\13\2"+
		"\u0087y\3\2\2\2\u0087\u0083\3\2\2\2\u0088\7\3\2\2\2\u0089\u008f\5\f\7"+
		"\2\u008a\u008b\5\22\n\2\u008b\u008c\7\n\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008f\5\n\6\2\u008e\u0089\3\2\2\2\u008e\u008a\3\2\2\2\u008e\u008d\3\2"+
		"\2\2\u008f\t\3\2\2\2\u0090\u0091\5\22\n\2\u0091\u0092\b\6\1\2\u0092\13"+
		"\3\2\2\2\u0093\u0094\7\f\2\2\u0094\u0095\5\6\4\2\u0095\u0096\7\r\2\2\u0096"+
		"\u00dc\3\2\2\2\u0097\u0098\7\16\2\2\u0098\u0099\5(\25\2\u0099\u009a\7"+
		"\f\2\2\u009a\u009b\5\6\4\2\u009b\u009c\7\r\2\2\u009c\u00dc\3\2\2\2\u009d"+
		"\u009e\7\17\2\2\u009e\u009f\5\6\4\2\u009f\u00a0\7\20\2\2\u00a0\u00a1\5"+
		"(\25\2\u00a1\u00a2\7\n\2\2\u00a2\u00dc\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4"+
		"\u00a5\5(\25\2\u00a5\u00a6\7\22\2\2\u00a6\u00ae\5\6\4\2\u00a7\u00a8\7"+
		"\23\2\2\u00a8\u00a9\5(\25\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5\6\4\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b3\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b2\7\24\2\2\u00b2\u00b4\5\6\4\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\r\2\2\u00b6\u00dc\3\2\2\2\u00b7"+
		"\u00bf\7\25\2\2\u00b8\u00bb\5\34\17\2\u00b9\u00bb\7\26\2\2\u00ba\u00b8"+
		"\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7G\2\2\u00bd"+
		"\u00be\7\27\2\2\u00be\u00c0\5(\25\2\u00bf\u00ba\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\7\30\2\2\u00c2\u00c4\5(\25\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\7\30"+
		"\2\2\u00c6\u00c8\5\22\n\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\5\6\4\2\u00cb\u00cc\7\r"+
		"\2\2\u00cc\u00dc\3\2\2\2\u00cd\u00ce\7\25\2\2\u00ce\u00cf\5$\23\2\u00cf"+
		"\u00d0\7\31\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2\7\f\2\2\u00d2\u00d3\5"+
		"\6\4\2\u00d3\u00d4\7\r\2\2\u00d4\u00dc\3\2\2\2\u00d5\u00d6\7\32\2\2\u00d6"+
		"\u00d7\7G\2\2\u00d7\u00dc\7\n\2\2\u00d8\u00d9\7G\2\2\u00d9\u00da\7\30"+
		"\2\2\u00da\u00dc\5\b\5\2\u00db\u0093\3\2\2\2\u00db\u0097\3\2\2\2\u00db"+
		"\u009d\3\2\2\2\u00db\u00a3\3\2\2\2\u00db\u00b7\3\2\2\2\u00db\u00cd\3\2"+
		"\2\2\u00db\u00d5\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\r\3\2\2\2\u00dd\u00de"+
		"\5\"\22\2\u00de\u00df\5\26\f\2\u00df\u00e0\5(\25\2\u00e0\u00fc\3\2\2\2"+
		"\u00e1\u00e2\7\5\2\2\u00e2\u00e3\5\34\17\2\u00e3\u00e7\5\"\22\2\u00e4"+
		"\u00e5\7\6\2\2\u00e5\u00e6\7D\2\2\u00e6\u00e8\7\7\2\2\u00e7\u00e4\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00ec\7\27\2\2\u00ec\u00ee\5(\25\2\u00ed\u00eb\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00fc\3\2\2\2\u00ef\u00f0\5\34\17\2\u00f0"+
		"\u00f3\5\"\22\2\u00f1\u00f2\7\27\2\2\u00f2\u00f4\5(\25\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fc\3\2\2\2\u00f5\u00f6\7\26\2\2\u00f6"+
		"\u00f7\5\"\22\2\u00f7\u00f8\7\27\2\2\u00f8\u00f9\5(\25\2\u00f9\u00fc\3"+
		"\2\2\2\u00fa\u00fc\5\20\t\2\u00fb\u00dd\3\2\2\2\u00fb\u00e1\3\2\2\2\u00fb"+
		"\u00ef\3\2\2\2\u00fb\u00f5\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\17\3\2\2"+
		"\2\u00fd\u00fe\7\26\2\2\u00fe\u00ff\5\"\22\2\u00ff\u0100\b\t\1\2\u0100"+
		"\21\3\2\2\2\u0101\u0104\5\16\b\2\u0102\u0104\5&\24\2\u0103\u0101\3\2\2"+
		"\2\u0103\u0102\3\2\2\2\u0104\23\3\2\2\2\u0105\u0107\7\33\2\2\u0106\u0108"+
		"\5&\24\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010d\7\n\2\2\u010a\u010b\7\34\2\2\u010b\u010d\7\n\2\2\u010c\u0105\3"+
		"\2\2\2\u010c\u010a\3\2\2\2\u010d\25\3\2\2\2\u010e\u010f\7\b\2\2\u010f"+
		"\u0110\5\"\22\2\u0110\u0111\5\26\f\2\u0111\u0112\5(\25\2\u0112\u0113\7"+
		"\b\2\2\u0113\u0116\3\2\2\2\u0114\u0116\7\27\2\2\u0115\u010e\3\2\2\2\u0115"+
		"\u0114\3\2\2\2\u0116\27\3\2\2\2\u0117\u0119\t\2\2\2\u0118\u0117\3\2\2"+
		"\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\5\36\20\2\u011b"+
		"\u011c\7G\2\2\u011c\u011f\3\2\2\2\u011d\u011f\5\32\16\2\u011e\u0118\3"+
		"\2\2\2\u011e\u011d\3\2\2\2\u011f\31\3\2\2\2\u0120\u0121\7\35\2\2\u0121"+
		"\u0122\7\36\2\2\u0122\u0123\5\36\20\2\u0123\u0124\7G\2\2\u0124\u0125\b"+
		"\16\1\2\u0125\33\3\2\2\2\u0126\u0127\t\3\2\2\u0127\35\3\2\2\2\u0128\u012b"+
		"\5\34\17\2\u0129\u012b\7$\2\2\u012a\u0128\3\2\2\2\u012a\u0129\3\2\2\2"+
		"\u012b\37\3\2\2\2\u012c\u0131\5\"\22\2\u012d\u012e\7\b\2\2\u012e\u0130"+
		"\5\"\22\2\u012f\u012d\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2"+
		"\u0131\u0132\3\2\2\2\u0132!\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0139\7"+
		"G\2\2\u0135\u0136\7%\2\2\u0136\u0138\7G\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0148\3\2"+
		"\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\6\2\2\u013d\u013e\7D\2\2\u013e"+
		"\u0143\7\7\2\2\u013f\u0140\7%\2\2\u0140\u0142\7G\2\2\u0141\u013f\3\2\2"+
		"\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u013c\3\2\2\2\u0147\u014a\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149#\3\2\2\2\u014a\u0148\3\2\2\2"+
		"\u014b\u0150\7G\2\2\u014c\u014d\7\b\2\2\u014d\u014f\7G\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"%\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0154\5(\25\2\u0154\u0155\7\b\2\2"+
		"\u0155\u0157\3\2\2\2\u0156\u0153\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156"+
		"\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"\u015c\5(\25\2\u015c\'\3\2\2\2\u015d\u015e\b\25\1\2\u015e\u016d\5*\26"+
		"\2\u015f\u016d\5,\27\2\u0160\u0162\7\4\2\2\u0161\u0163\5&\24\2\u0162\u0161"+
		"\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u016d\7\t\2\2\u0165"+
		"\u0166\5> \2\u0166\u0167\5(\25\4\u0167\u016d\3\2\2\2\u0168\u0169\7&\2"+
		"\2\u0169\u016a\5(\25\2\u016a\u016b\7\'\2\2\u016b\u016d\3\2\2\2\u016c\u015d"+
		"\3\2\2\2\u016c\u015f\3\2\2\2\u016c\u0160\3\2\2\2\u016c\u0165\3\2\2\2\u016c"+
		"\u0168\3\2\2\2\u016d\u0174\3\2\2\2\u016e\u016f\f\5\2\2\u016f\u0170\5\64"+
		"\33\2\u0170\u0171\5(\25\6\u0171\u0173\3\2\2\2\u0172\u016e\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175)\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0177\u0178\t\4\2\2\u0178+\3\2\2\2\u0179\u017c\5"+
		"\"\22\2\u017a\u017c\5.\30\2\u017b\u0179\3\2\2\2\u017b\u017a\3\2\2\2\u017c"+
		"-\3\2\2\2\u017d\u017e\7G\2\2\u017e\u0180\7&\2\2\u017f\u0181\5&\24\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\7\'"+
		"\2\2\u0183/\3\2\2\2\u0184\u0186\7&\2\2\u0185\u0187\5\62\32\2\u0186\u0185"+
		"\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\7\'\2\2\u0189"+
		"\u018a\7\30\2\2\u018a\u018b\5\6\4\2\u018b\u018c\7\r\2\2\u018c\61\3\2\2"+
		"\2\u018d\u018e\5\34\17\2\u018e\u018f\7G\2\2\u018f\u019b\3\2\2\2\u0190"+
		"\u0191\7\5\2\2\u0191\u0192\5\34\17\2\u0192\u0196\7G\2\2\u0193\u0194\7"+
		"\6\2\2\u0194\u0195\7D\2\2\u0195\u0197\7\7\2\2\u0196\u0193\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019b\3\2"+
		"\2\2\u019a\u018d\3\2\2\2\u019a\u0190\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\7\b\2\2\u019d\u019f\3\2\2\2\u019e\u019a\3\2\2\2\u019f\u01a2\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01b0\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a4\5\34\17\2\u01a4\u01a5\7G\2\2\u01a5\u01b1\3"+
		"\2\2\2\u01a6\u01a7\7\5\2\2\u01a7\u01a8\5\34\17\2\u01a8\u01ac\7G\2\2\u01a9"+
		"\u01aa\7\6\2\2\u01aa\u01ab\7D\2\2\u01ab\u01ad\7\7\2\2\u01ac\u01a9\3\2"+
		"\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01a3\3\2\2\2\u01b0\u01a6\3\2\2\2\u01b1\63\3\2\2"+
		"\2\u01b2\u01b7\7+\2\2\u01b3\u01b7\7,\2\2\u01b4\u01b7\7-\2\2\u01b5\u01b7"+
		"\5\66\34\2\u01b6\u01b2\3\2\2\2\u01b6\u01b3\3\2\2\2\u01b6\u01b4\3\2\2\2"+
		"\u01b6\u01b5\3\2\2\2\u01b7\65\3\2\2\2\u01b8\u01be\7.\2\2\u01b9\u01be\7"+
		"/\2\2\u01ba\u01be\7\60\2\2\u01bb\u01be\7\61\2\2\u01bc\u01be\58\35\2\u01bd"+
		"\u01b8\3\2\2\2\u01bd\u01b9\3\2\2\2\u01bd\u01ba\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01bc\3\2\2\2\u01be\67\3\2\2\2\u01bf\u01c3\7\62\2\2\u01c0\u01c3"+
		"\7\63\2\2\u01c1\u01c3\5:\36\2\u01c2\u01bf\3\2\2\2\u01c2\u01c0\3\2\2\2"+
		"\u01c2\u01c1\3\2\2\2\u01c39\3\2\2\2\u01c4\u01cc\7\64\2\2\u01c5\u01cc\7"+
		"\65\2\2\u01c6\u01cc\7\66\2\2\u01c7\u01cc\7\67\2\2\u01c8\u01cc\78\2\2\u01c9"+
		"\u01cc\79\2\2\u01ca\u01cc\5<\37\2\u01cb\u01c4\3\2\2\2\u01cb\u01c5\3\2"+
		"\2\2\u01cb\u01c6\3\2\2\2\u01cb\u01c7\3\2\2\2\u01cb\u01c8\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01ca\3\2\2\2\u01cc;\3\2\2\2\u01cd\u01ce\t\5\2\2"+
		"\u01ce=\3\2\2\2\u01cf\u01d0\t\6\2\2\u01d0?\3\2\2\2\65CTVdfjv{~\u0083\u0087"+
		"\u008e\u00ae\u00b3\u00ba\u00bf\u00c3\u00c7\u00db\u00e9\u00ed\u00f3\u00fb"+
		"\u0103\u0107\u010c\u0115\u0118\u011e\u012a\u0131\u0139\u0143\u0148\u0150"+
		"\u0158\u0162\u016c\u0174\u017b\u0180\u0186\u0198\u019a\u01a0\u01ae\u01b0"+
		"\u01b6\u01bd\u01c2\u01cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}