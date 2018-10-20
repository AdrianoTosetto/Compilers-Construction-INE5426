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
		RULE_corpodafuncao = 23, RULE_listapar = 24, RULE_opbin = 25, RULE_opunaria = 26;
	public static final String[] ruleNames = {
		"inicio", "bloco", "trecho", "comando", "erro_ponto_virgula", "comandobloco", 
		"comandoexpressao", "erro_var_declaracao", "comandounico", "ultimocomando", 
		"listaatri", "nomedafuncao", "erro_inline_fastcall", "tipovar", "tiporet", 
		"listavar", "var", "listadenomes", "listaexp", "exp", "valores", "expprefixo", 
		"chamadadefuncao", "corpodafuncao", "listapar", "opbin", "opunaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'struct'", "'{'", "'array'", "'['", "']'", "','", "'}'", "';'", 
		"'define'", "'do'", "'end'", "'while'", "'repeat'", "'until'", "'if'", 
		"'then'", "'elseif'", "'else'", "'for'", "'auto'", "'='", "':'", "'in'", 
		"'goto'", "'return'", "'break'", "'inline'", "'fastcall'", "'boolean'", 
		"'int'", "'double'", "'float'", "'string'", "'void'", "'.'", "'('", "')'", 
		"'null'", "'false'", "'true'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", 
		"'..'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'", 
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				bloco();
				}
				}
				setState(57); 
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
		public ComandoexpressaoContext comandoexpressao() {
			return getRuleContext(ComandoexpressaoContext.class,0);
		}
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
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				comandoexpressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(T__0);
				setState(61);
				match(Nome);
				setState(62);
				match(T__1);
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case Nome:
					{
					setState(63);
					tipovar();
					setState(64);
					match(Nome);
					}
					break;
				case T__2:
					{
					setState(66);
					match(T__2);
					setState(67);
					tipovar();
					setState(68);
					match(Nome);
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(69);
						match(T__3);
						setState(70);
						match(Inteiro);
						setState(71);
						match(T__4);
						}
						}
						setState(74); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__3 );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(78);
					match(T__5);
					setState(92);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(79);
						tipovar();
						setState(80);
						match(Nome);
						}
						break;
					case T__2:
						{
						setState(82);
						match(T__2);
						setState(83);
						tipovar();
						setState(84);
						match(Nome);
						setState(88); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(85);
							match(T__3);
							setState(86);
							match(Inteiro);
							setState(87);
							match(T__4);
							}
							}
							setState(90); 
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
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(T__6);
				setState(100);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				nomedafuncao();
				setState(103);
				corpodafuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(T__8);
				setState(106);
				match(Nome);
				setState(107);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					comando();
					}
					}
					setState(113); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0) );
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24 || _la==T__25) {
					{
					setState(115);
					ultimocomando();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					{
					setState(118);
					comando();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				comandobloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				comandounico();
				setState(129);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
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
			setState(134);
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
		public List<TrechoContext> trecho() {
			return getRuleContexts(TrechoContext.class);
		}
		public TrechoContext trecho(int i) {
			return getRuleContext(TrechoContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public ComandounicoContext comandounico() {
			return getRuleContext(ComandounicoContext.class,0);
		}
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoblocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandobloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterComandobloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitComandobloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitComandobloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoblocoContext comandobloco() throws RecognitionException {
		ComandoblocoContext _localctx = new ComandoblocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandobloco);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__9);
				setState(138);
				trecho();
				setState(139);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__11);
				setState(142);
				exp(0);
				setState(143);
				match(T__9);
				setState(144);
				trecho();
				setState(145);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(T__12);
				setState(148);
				trecho();
				setState(149);
				match(T__13);
				setState(150);
				exp(0);
				setState(151);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(153);
				match(T__14);
				setState(154);
				exp(0);
				setState(155);
				match(T__15);
				setState(156);
				trecho();
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(157);
					match(T__16);
					setState(158);
					exp(0);
					setState(159);
					match(T__15);
					setState(160);
					trecho();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(167);
					match(T__17);
					setState(168);
					trecho();
					}
				}

				setState(171);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(173);
				match(T__18);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__28 - 20)) | (1L << (T__29 - 20)) | (1L << (T__30 - 20)) | (1L << (T__31 - 20)) | (1L << (T__32 - 20)) | (1L << (Nome - 20)))) != 0)) {
					{
					setState(176);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(174);
						tipovar();
						}
						break;
					case T__19:
						{
						setState(175);
						match(T__19);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(178);
					match(Nome);
					setState(179);
					match(T__20);
					setState(180);
					exp(0);
					}
				}

				setState(183);
				match(T__21);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(184);
					exp(0);
					}
				}

				setState(187);
				match(T__21);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__19) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(188);
					comandounico();
					}
				}

				setState(191);
				match(T__9);
				setState(192);
				trecho();
				setState(193);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(195);
				match(T__18);
				setState(196);
				listadenomes();
				setState(197);
				match(T__22);
				setState(198);
				listaexp();
				setState(199);
				match(T__9);
				setState(200);
				trecho();
				setState(201);
				match(T__10);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(203);
				match(T__23);
				setState(204);
				match(Nome);
				setState(205);
				match(T__7);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(206);
				match(Nome);
				setState(207);
				match(T__21);
				setState(208);
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
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new AtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				var();
				setState(212);
				listaatri();
				setState(213);
				exp(0);
				}
				break;
			case 2:
				_localctx = new ArrayDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__2);
				setState(216);
				tipovar();
				setState(217);
				var();
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(218);
					match(T__3);
					setState(219);
					match(Inteiro);
					setState(220);
					match(T__4);
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(225);
					match(T__20);
					setState(226);
					exp(0);
					}
				}

				}
				break;
			case 3:
				_localctx = new TypedDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				tipovar();
				setState(230);
				var();
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
			case 4:
				_localctx = new AutoDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(T__19);
				setState(236);
				var();
				setState(237);
				match(T__20);
				setState(238);
				exp(0);
				}
				break;
			case 5:
				_localctx = new ErrorDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
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
			setState(243);
			match(T__19);
			setState(244);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				comandoexpressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
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
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(T__24);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(252);
					listaexp();
					}
				}

				setState(255);
				match(T__7);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__25);
				setState(257);
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
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__5);
				setState(261);
				var();
				setState(262);
				listaatri();
				setState(263);
				exp(0);
				setState(264);
				match(T__5);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
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
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==T__27) {
					{
					setState(269);
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

				setState(272);
				tiporet();
				setState(273);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
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
			setState(278);
			match(T__26);
			setState(279);
			match(T__27);
			setState(280);
			tiporet();
			setState(281);
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
			setState(284);
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
			setState(288);
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
				setState(286);
				tipovar();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
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
			setState(290);
			var();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(291);
				match(T__5);
				setState(292);
				var();
				}
				}
				setState(297);
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
			setState(298);
			match(Nome);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(299);
					match(T__34);
					setState(300);
					match(Nome);
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					match(T__3);
					setState(307);
					match(Inteiro);
					setState(308);
					match(T__4);
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(309);
							match(T__34);
							setState(310);
							match(Nome);
							}
							} 
						}
						setState(315);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					}
					}
					} 
				}
				setState(320);
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
			setState(321);
			match(Nome);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(322);
				match(T__5);
				setState(323);
				match(Nome);
				}
				}
				setState(328);
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
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					exp(0);
					setState(330);
					match(T__5);
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(337);
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
		public OpunariaContext opunaria;
		public OpbinContext opbin;
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public ExpprefixoContext expprefixo() {
			return getRuleContext(ExpprefixoContext.class,0);
		}
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public OpunariaContext opunaria() {
			return getRuleContext(OpunariaContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OpbinContext opbin() {
			return getRuleContext(OpbinContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CaronteVisitor ) return ((CaronteVisitor<? extends T>)visitor).visitExp(this);
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
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(340);
				valores();
				}
				break;
			case 2:
				{
				setState(341);
				expprefixo();
				}
				break;
			case 3:
				{
				setState(342);
				match(T__1);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(343);
					listaexp();
					}
				}

				setState(346);
				match(T__6);
				}
				break;
			case 4:
				{
				setState(347);
				((ExpContext)_localctx).opunaria = opunaria();
				setState(348);
				exp(7);
				}
				break;
			case 5:
				{
				setState(350);
				match(T__35);
				setState(351);
				exp(0);
				setState(352);
				match(T__36);
				}
				break;
			case 6:
				{
				setState(354);
				match(T__35);
				setState(355);
				exp(5);
				notifyErrorListeners(" existem parênteses não fechados! ");
				}
				break;
			case 7:
				{
				setState(358);
				((ExpContext)_localctx).opbin = opbin();
				setState(359);
				exp(2);
				notifyErrorListeners("um operando era esperado no lado esquerdo de " + (((ExpContext)_localctx).opbin!=null?_input.getText(((ExpContext)_localctx).opbin.start,((ExpContext)_localctx).opbin.stop):null));
				}
				break;
			case 8:
				{
				setState(362);
				((ExpContext)_localctx).opunaria = opunaria();
				notifyErrorListeners("Era esperado um operando para " + (((ExpContext)_localctx).opunaria!=null?_input.getText(((ExpContext)_localctx).opunaria.start,((ExpContext)_localctx).opunaria.stop):null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(380);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(378);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(367);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(368);
						((ExpContext)_localctx).opbin = opbin();
						setState(369);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(371);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(372);
						match(T__36);
						notifyErrorListeners(" existem parênteses fechados a mais! ");
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(374);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(375);
						((ExpContext)_localctx).opbin = opbin();
						notifyErrorListeners("um operando era esperado no lado direito de " + (((ExpContext)_localctx).opbin!=null?_input.getText(((ExpContext)_localctx).opbin.start,((ExpContext)_localctx).opbin.stop):null));
						}
						break;
					}
					} 
				}
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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
			setState(383);
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
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
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
			setState(389);
			match(Nome);
			setState(390);
			match(T__35);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
				{
				setState(391);
				listaexp();
				}
			}

			setState(394);
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
			setState(396);
			match(T__35);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0) || _la==Nome) {
				{
				setState(397);
				listapar();
				}
			}

			setState(400);
			match(T__36);
			setState(401);
			match(T__21);
			setState(402);
			trecho();
			setState(403);
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
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(418);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(405);
						tipovar();
						setState(406);
						match(Nome);
						}
						break;
					case T__2:
						{
						setState(408);
						match(T__2);
						setState(409);
						tipovar();
						setState(410);
						match(Nome);
						setState(414); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(411);
							match(T__3);
							setState(412);
							match(Inteiro);
							setState(413);
							match(T__4);
							}
							}
							setState(416); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__3 );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(420);
					match(T__5);
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case Nome:
				{
				setState(427);
				tipovar();
				setState(428);
				match(Nome);
				}
				break;
			case T__2:
				{
				setState(430);
				match(T__2);
				setState(431);
				tipovar();
				setState(432);
				match(Nome);
				setState(436); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(433);
					match(T__3);
					setState(434);
					match(Inteiro);
					setState(435);
					match(T__4);
					}
					}
					setState(438); 
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__61 - 42)) | (1L << (T__62 - 42)) | (1L << (T__63 - 42)) | (1L << (T__64 - 42)))) != 0)) ) {
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
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u01c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3K\n\3\r\3\16\3L\5\3O\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3[\n\3\r\3\16\3\\\5\3_\n\3\7\3a\n"+
		"\3\f\3\16\3d\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\6\4"+
		"r\n\4\r\4\16\4s\3\4\5\4w\n\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\5\4\u0080"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\5\5\u0087\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\7\3\7\5\7\u00ac\n\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7\u00b3\n\7\3\7\3\7\3\7\5\7\u00b8\n\7\3\7\3\7\5\7\u00bc"+
		"\n\7\3\7\3\7\5\7\u00c0\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d4\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\6\b\u00e0\n\b\r\b\16\b\u00e1\3\b\3\b\5\b\u00e6\n\b\3\b\3"+
		"\b\3\b\3\b\5\b\u00ec\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00f4\n\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\5\n\u00fc\n\n\3\13\3\13\5\13\u0100\n\13\3\13\3\13\3\13"+
		"\5\13\u0105\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010e\n\f\3\r\5\r\u0111"+
		"\n\r\3\r\3\r\3\r\3\r\5\r\u0117\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\5\20\u0123\n\20\3\21\3\21\3\21\7\21\u0128\n\21\f\21\16"+
		"\21\u012b\13\21\3\22\3\22\3\22\7\22\u0130\n\22\f\22\16\22\u0133\13\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u013a\n\22\f\22\16\22\u013d\13\22\7\22"+
		"\u013f\n\22\f\22\16\22\u0142\13\22\3\23\3\23\3\23\7\23\u0147\n\23\f\23"+
		"\16\23\u014a\13\23\3\24\3\24\3\24\7\24\u014f\n\24\f\24\16\24\u0152\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u015b\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0170\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\7\25\u017d\n\25\f\25\16\25\u0180\13\25\3\26\3\26\3\27\3\27"+
		"\5\27\u0186\n\27\3\30\3\30\3\30\5\30\u018b\n\30\3\30\3\30\3\31\3\31\5"+
		"\31\u0191\n\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\6\32\u01a1\n\32\r\32\16\32\u01a2\5\32\u01a5\n\32\3\32"+
		"\3\32\7\32\u01a9\n\32\f\32\16\32\u01ac\13\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\6\32\u01b7\n\32\r\32\16\32\u01b8\5\32\u01bb\n\32"+
		"\3\33\3\33\3\34\3\34\3\34\2\3(\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\66\2\7\3\2\35\36\4\2\37#GG\4\2(*DF\3\2+?\4\2,,@"+
		"C\2\u01e8\29\3\2\2\2\4n\3\2\2\2\6\177\3\2\2\2\b\u0086\3\2\2\2\n\u0088"+
		"\3\2\2\2\f\u00d3\3\2\2\2\16\u00f3\3\2\2\2\20\u00f5\3\2\2\2\22\u00fb\3"+
		"\2\2\2\24\u0104\3\2\2\2\26\u010d\3\2\2\2\30\u0116\3\2\2\2\32\u0118\3\2"+
		"\2\2\34\u011e\3\2\2\2\36\u0122\3\2\2\2 \u0124\3\2\2\2\"\u012c\3\2\2\2"+
		"$\u0143\3\2\2\2&\u0150\3\2\2\2(\u016f\3\2\2\2*\u0181\3\2\2\2,\u0185\3"+
		"\2\2\2.\u0187\3\2\2\2\60\u018e\3\2\2\2\62\u01aa\3\2\2\2\64\u01bc\3\2\2"+
		"\2\66\u01be\3\2\2\28:\5\4\3\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2"+
		"<\3\3\2\2\2=o\5\16\b\2>?\7\3\2\2?@\7G\2\2@N\7\4\2\2AB\5\34\17\2BC\7G\2"+
		"\2CO\3\2\2\2DE\7\5\2\2EF\5\34\17\2FJ\7G\2\2GH\7\6\2\2HI\7D\2\2IK\7\7\2"+
		"\2JG\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NA\3\2\2\2ND\3\2\2"+
		"\2Ob\3\2\2\2P^\7\b\2\2QR\5\34\17\2RS\7G\2\2S_\3\2\2\2TU\7\5\2\2UV\5\34"+
		"\17\2VZ\7G\2\2WX\7\6\2\2XY\7D\2\2Y[\7\7\2\2ZW\3\2\2\2[\\\3\2\2\2\\Z\3"+
		"\2\2\2\\]\3\2\2\2]_\3\2\2\2^Q\3\2\2\2^T\3\2\2\2_a\3\2\2\2`P\3\2\2\2ad"+
		"\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\t\2\2fg\7\n\2\2g"+
		"o\3\2\2\2hi\5\30\r\2ij\5\60\31\2jo\3\2\2\2kl\7\13\2\2lm\7G\2\2mo\5*\26"+
		"\2n=\3\2\2\2n>\3\2\2\2nh\3\2\2\2nk\3\2\2\2o\5\3\2\2\2pr\5\b\5\2qp\3\2"+
		"\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\5\24\13\2vu\3\2\2\2vw\3"+
		"\2\2\2w\u0080\3\2\2\2xz\5\b\5\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|~\3\2\2\2}{\3\2\2\2~\u0080\5\24\13\2\177q\3\2\2\2\177{\3\2\2\2\u0080"+
		"\7\3\2\2\2\u0081\u0087\5\f\7\2\u0082\u0083\5\22\n\2\u0083\u0084\7\n\2"+
		"\2\u0084\u0087\3\2\2\2\u0085\u0087\5\n\6\2\u0086\u0081\3\2\2\2\u0086\u0082"+
		"\3\2\2\2\u0086\u0085\3\2\2\2\u0087\t\3\2\2\2\u0088\u0089\5\22\n\2\u0089"+
		"\u008a\b\6\1\2\u008a\13\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u008d\5\6\4"+
		"\2\u008d\u008e\7\r\2\2\u008e\u00d4\3\2\2\2\u008f\u0090\7\16\2\2\u0090"+
		"\u0091\5(\25\2\u0091\u0092\7\f\2\2\u0092\u0093\5\6\4\2\u0093\u0094\7\r"+
		"\2\2\u0094\u00d4\3\2\2\2\u0095\u0096\7\17\2\2\u0096\u0097\5\6\4\2\u0097"+
		"\u0098\7\20\2\2\u0098\u0099\5(\25\2\u0099\u009a\7\n\2\2\u009a\u00d4\3"+
		"\2\2\2\u009b\u009c\7\21\2\2\u009c\u009d\5(\25\2\u009d\u009e\7\22\2\2\u009e"+
		"\u00a6\5\6\4\2\u009f\u00a0\7\23\2\2\u00a0\u00a1\5(\25\2\u00a1\u00a2\7"+
		"\22\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a5\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ab\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7\24\2\2\u00aa\u00ac\5\6\4\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\r"+
		"\2\2\u00ae\u00d4\3\2\2\2\u00af\u00b7\7\25\2\2\u00b0\u00b3\5\34\17\2\u00b1"+
		"\u00b3\7\26\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\7G\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b8\5(\25\2\u00b7"+
		"\u00b2\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\7\30"+
		"\2\2\u00ba\u00bc\5(\25\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\7\30\2\2\u00be\u00c0\5\22\n\2\u00bf\u00be\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\f\2\2\u00c2"+
		"\u00c3\5\6\4\2\u00c3\u00c4\7\r\2\2\u00c4\u00d4\3\2\2\2\u00c5\u00c6\7\25"+
		"\2\2\u00c6\u00c7\5$\23\2\u00c7\u00c8\7\31\2\2\u00c8\u00c9\5&\24\2\u00c9"+
		"\u00ca\7\f\2\2\u00ca\u00cb\5\6\4\2\u00cb\u00cc\7\r\2\2\u00cc\u00d4\3\2"+
		"\2\2\u00cd\u00ce\7\32\2\2\u00ce\u00cf\7G\2\2\u00cf\u00d4\7\n\2\2\u00d0"+
		"\u00d1\7G\2\2\u00d1\u00d2\7\30\2\2\u00d2\u00d4\5\b\5\2\u00d3\u008b\3\2"+
		"\2\2\u00d3\u008f\3\2\2\2\u00d3\u0095\3\2\2\2\u00d3\u009b\3\2\2\2\u00d3"+
		"\u00af\3\2\2\2\u00d3\u00c5\3\2\2\2\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2"+
		"\2\2\u00d4\r\3\2\2\2\u00d5\u00d6\5\"\22\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8"+
		"\5(\25\2\u00d8\u00f4\3\2\2\2\u00d9\u00da\7\5\2\2\u00da\u00db\5\34\17\2"+
		"\u00db\u00df\5\"\22\2\u00dc\u00dd\7\6\2\2\u00dd\u00de\7D\2\2\u00de\u00e0"+
		"\7\7\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e4\7\27\2\2\u00e4\u00e6\5"+
		"(\25\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00f4\3\2\2\2\u00e7"+
		"\u00e8\5\34\17\2\u00e8\u00eb\5\"\22\2\u00e9\u00ea\7\27\2\2\u00ea\u00ec"+
		"\5(\25\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f4\3\2\2\2\u00ed"+
		"\u00ee\7\26\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1"+
		"\5(\25\2\u00f1\u00f4\3\2\2\2\u00f2\u00f4\5\20\t\2\u00f3\u00d5\3\2\2\2"+
		"\u00f3\u00d9\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\17\3\2\2\2\u00f5\u00f6\7\26\2\2\u00f6\u00f7\5\"\22\2\u00f7"+
		"\u00f8\b\t\1\2\u00f8\21\3\2\2\2\u00f9\u00fc\5\16\b\2\u00fa\u00fc\5&\24"+
		"\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\23\3\2\2\2\u00fd\u00ff"+
		"\7\33\2\2\u00fe\u0100\5&\24\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101\u0105\7\n\2\2\u0102\u0103\7\34\2\2\u0103\u0105"+
		"\7\n\2\2\u0104\u00fd\3\2\2\2\u0104\u0102\3\2\2\2\u0105\25\3\2\2\2\u0106"+
		"\u0107\7\b\2\2\u0107\u0108\5\"\22\2\u0108\u0109\5\26\f\2\u0109\u010a\5"+
		"(\25\2\u010a\u010b\7\b\2\2\u010b\u010e\3\2\2\2\u010c\u010e\7\27\2\2\u010d"+
		"\u0106\3\2\2\2\u010d\u010c\3\2\2\2\u010e\27\3\2\2\2\u010f\u0111\t\2\2"+
		"\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\5\36\20\2\u0113\u0114\7G\2\2\u0114\u0117\3\2\2\2\u0115\u0117\5\32\16"+
		"\2\u0116\u0110\3\2\2\2\u0116\u0115\3\2\2\2\u0117\31\3\2\2\2\u0118\u0119"+
		"\7\35\2\2\u0119\u011a\7\36\2\2\u011a\u011b\5\36\20\2\u011b\u011c\7G\2"+
		"\2\u011c\u011d\b\16\1\2\u011d\33\3\2\2\2\u011e\u011f\t\3\2\2\u011f\35"+
		"\3\2\2\2\u0120\u0123\5\34\17\2\u0121\u0123\7$\2\2\u0122\u0120\3\2\2\2"+
		"\u0122\u0121\3\2\2\2\u0123\37\3\2\2\2\u0124\u0129\5\"\22\2\u0125\u0126"+
		"\7\b\2\2\u0126\u0128\5\"\22\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2"+
		"\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a!\3\2\2\2\u012b\u0129\3"+
		"\2\2\2\u012c\u0131\7G\2\2\u012d\u012e\7%\2\2\u012e\u0130\7G\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0140\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\7\6\2\2\u0135"+
		"\u0136\7D\2\2\u0136\u013b\7\7\2\2\u0137\u0138\7%\2\2\u0138\u013a\7G\2"+
		"\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0134\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141#\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0143\u0148\7G\2\2\u0144\u0145\7\b\2\2\u0145\u0147"+
		"\7G\2\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149%\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\5(\25\2"+
		"\u014c\u014d\7\b\2\2\u014d\u014f\3\2\2\2\u014e\u014b\3\2\2\2\u014f\u0152"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0154\5(\25\2\u0154\'\3\2\2\2\u0155\u0156\b\25\1"+
		"\2\u0156\u0170\5*\26\2\u0157\u0170\5,\27\2\u0158\u015a\7\4\2\2\u0159\u015b"+
		"\5&\24\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u0170\7\t\2\2\u015d\u015e\5\66\34\2\u015e\u015f\5(\25\t\u015f\u0170\3"+
		"\2\2\2\u0160\u0161\7&\2\2\u0161\u0162\5(\25\2\u0162\u0163\7\'\2\2\u0163"+
		"\u0170\3\2\2\2\u0164\u0165\7&\2\2\u0165\u0166\5(\25\7\u0166\u0167\b\25"+
		"\1\2\u0167\u0170\3\2\2\2\u0168\u0169\5\64\33\2\u0169\u016a\5(\25\4\u016a"+
		"\u016b\b\25\1\2\u016b\u0170\3\2\2\2\u016c\u016d\5\66\34\2\u016d\u016e"+
		"\b\25\1\2\u016e\u0170\3\2\2\2\u016f\u0155\3\2\2\2\u016f\u0157\3\2\2\2"+
		"\u016f\u0158\3\2\2\2\u016f\u015d\3\2\2\2\u016f\u0160\3\2\2\2\u016f\u0164"+
		"\3\2\2\2\u016f\u0168\3\2\2\2\u016f\u016c\3\2\2\2\u0170\u017e\3\2\2\2\u0171"+
		"\u0172\f\n\2\2\u0172\u0173\5\64\33\2\u0173\u0174\5(\25\13\u0174\u017d"+
		"\3\2\2\2\u0175\u0176\f\6\2\2\u0176\u0177\7\'\2\2\u0177\u017d\b\25\1\2"+
		"\u0178\u0179\f\5\2\2\u0179\u017a\5\64\33\2\u017a\u017b\b\25\1\2\u017b"+
		"\u017d\3\2\2\2\u017c\u0171\3\2\2\2\u017c\u0175\3\2\2\2\u017c\u0178\3\2"+
		"\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		")\3\2\2\2\u0180\u017e\3\2\2\2\u0181\u0182\t\4\2\2\u0182+\3\2\2\2\u0183"+
		"\u0186\5\"\22\2\u0184\u0186\5.\30\2\u0185\u0183\3\2\2\2\u0185\u0184\3"+
		"\2\2\2\u0186-\3\2\2\2\u0187\u0188\7G\2\2\u0188\u018a\7&\2\2\u0189\u018b"+
		"\5&\24\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\7\'\2\2\u018d/\3\2\2\2\u018e\u0190\7&\2\2\u018f\u0191\5\62\32\2"+
		"\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193"+
		"\7\'\2\2\u0193\u0194\7\30\2\2\u0194\u0195\5\6\4\2\u0195\u0196\7\r\2\2"+
		"\u0196\61\3\2\2\2\u0197\u0198\5\34\17\2\u0198\u0199\7G\2\2\u0199\u01a5"+
		"\3\2\2\2\u019a\u019b\7\5\2\2\u019b\u019c\5\34\17\2\u019c\u01a0\7G\2\2"+
		"\u019d\u019e\7\6\2\2\u019e\u019f\7D\2\2\u019f\u01a1\7\7\2\2\u01a0\u019d"+
		"\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a5\3\2\2\2\u01a4\u0197\3\2\2\2\u01a4\u019a\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\7\b\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ba\3\2"+
		"\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\5\34\17\2\u01ae\u01af\7G\2\2\u01af"+
		"\u01bb\3\2\2\2\u01b0\u01b1\7\5\2\2\u01b1\u01b2\5\34\17\2\u01b2\u01b6\7"+
		"G\2\2\u01b3\u01b4\7\6\2\2\u01b4\u01b5\7D\2\2\u01b5\u01b7\7\7\2\2\u01b6"+
		"\u01b3\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01ad\3\2\2\2\u01ba\u01b0\3\2\2\2\u01bb"+
		"\63\3\2\2\2\u01bc\u01bd\t\5\2\2\u01bd\65\3\2\2\2\u01be\u01bf\t\6\2\2\u01bf"+
		"\67\3\2\2\2\62;LN\\^bnsv{\177\u0086\u00a6\u00ab\u00b2\u00b7\u00bb\u00bf"+
		"\u00d3\u00e1\u00e5\u00eb\u00f3\u00fb\u00ff\u0104\u010d\u0110\u0116\u0122"+
		"\u0129\u0131\u013b\u0140\u0148\u0150\u015a\u016f\u017c\u017e\u0185\u018a"+
		"\u0190\u01a2\u01a4\u01aa\u01b8\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}