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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, Inteiro=65, Decimal=66, 
		String=67, Nome=68, WS=69, COMMENT=70, LINE_COMMENT=71;
	public static final int
		RULE_inicio = 0, RULE_bloco = 1, RULE_trecho = 2, RULE_comando = 3, RULE_comandobloco = 4, 
		RULE_comandoexpressao = 5, RULE_comandounico = 6, RULE_ultimocomando = 7, 
		RULE_listaatri = 8, RULE_nomedafuncao = 9, RULE_tipovar = 10, RULE_tiporet = 11, 
		RULE_listavar = 12, RULE_var = 13, RULE_listadenomes = 14, RULE_listaexp = 15, 
		RULE_exp = 16, RULE_valores = 17, RULE_expprefixo = 18, RULE_chamadadefuncao = 19, 
		RULE_corpodafuncao = 20, RULE_listapar = 21, RULE_opbin = 22, RULE_opunaria = 23;
	public static final String[] ruleNames = {
		"inicio", "bloco", "trecho", "comando", "comandobloco", "comandoexpressao", 
		"comandounico", "ultimocomando", "listaatri", "nomedafuncao", "tipovar", 
		"tiporet", "listavar", "var", "listadenomes", "listaexp", "exp", "valores", 
		"expprefixo", "chamadadefuncao", "corpodafuncao", "listapar", "opbin", 
		"opunaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'struct'", "'{'", "'array'", "'['", "']'", "','", "'}'", "';'", 
		"'define'", "'do'", "'end'", "'while'", "'repeat'", "'until'", "'if'", 
		"'then'", "'elseif'", "'else'", "'for'", "'auto'", "'='", "':'", "'in'", 
		"'goto'", "'return'", "'break'", "'inline'", "'boolean'", "'int'", "'double'", 
		"'float'", "'string'", "'void'", "'.'", "'('", "')'", "'null'", "'false'", 
		"'true'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'..'", "'<'", "'<='", 
		"'>'", "'>='", "'=='", "'!='", "'and'", "'or'", "'+='", "'-='", "'*='", 
		"'/='", "'^='", "'%='", "'not'", "'#'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Inteiro", "Decimal", "String", "Nome", 
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				bloco();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__8) | (1L << T__19) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0) || _la==Nome );
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				comandoexpressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__0);
				setState(55);
				match(Nome);
				setState(56);
				match(T__1);
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__27:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case Nome:
					{
					setState(57);
					tipovar();
					setState(58);
					match(Nome);
					}
					break;
				case T__2:
					{
					setState(60);
					match(T__2);
					setState(61);
					tipovar();
					setState(62);
					match(Nome);
					setState(66); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(63);
						match(T__3);
						setState(64);
						match(Inteiro);
						setState(65);
						match(T__4);
						}
						}
						setState(68); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__3 );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(72);
					match(T__5);
					setState(86);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case Nome:
						{
						setState(73);
						tipovar();
						setState(74);
						match(Nome);
						}
						break;
					case T__2:
						{
						setState(76);
						match(T__2);
						setState(77);
						tipovar();
						setState(78);
						match(Nome);
						setState(82); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(79);
							match(T__3);
							setState(80);
							match(Inteiro);
							setState(81);
							match(T__4);
							}
							}
							setState(84); 
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
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(93);
				match(T__6);
				setState(94);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				nomedafuncao();
				setState(97);
				corpodafuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(T__8);
				setState(100);
				match(Nome);
				setState(101);
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
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					comando();
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0) );
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24 || _la==T__25) {
					{
					setState(109);
					ultimocomando();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					{
					setState(112);
					comando();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				comandobloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				comandounico();
				setState(123);
				match(T__7);
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
	}

	public final ComandoblocoContext comandobloco() throws RecognitionException {
		ComandoblocoContext _localctx = new ComandoblocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandobloco);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__9);
				setState(128);
				trecho();
				setState(129);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(T__11);
				setState(132);
				exp(0);
				setState(133);
				match(T__9);
				setState(134);
				trecho();
				setState(135);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__12);
				setState(138);
				trecho();
				setState(139);
				match(T__13);
				setState(140);
				exp(0);
				setState(141);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(T__14);
				setState(144);
				exp(0);
				setState(145);
				match(T__15);
				setState(146);
				trecho();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(147);
					match(T__16);
					setState(148);
					exp(0);
					setState(149);
					match(T__15);
					setState(150);
					trecho();
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(157);
					match(T__17);
					setState(158);
					trecho();
					}
				}

				setState(161);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(T__18);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__27 - 20)) | (1L << (T__28 - 20)) | (1L << (T__29 - 20)) | (1L << (T__30 - 20)) | (1L << (T__31 - 20)) | (1L << (Nome - 20)))) != 0)) {
					{
					setState(166);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case Nome:
						{
						setState(164);
						tipovar();
						}
						break;
					case T__19:
						{
						setState(165);
						match(T__19);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(168);
					match(Nome);
					setState(169);
					match(T__20);
					setState(170);
					exp(0);
					}
				}

				setState(173);
				match(T__21);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(174);
					exp(0);
					}
				}

				setState(177);
				match(T__21);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__19) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(178);
					comandounico();
					}
				}

				setState(181);
				match(T__9);
				setState(182);
				trecho();
				setState(183);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(185);
				match(T__18);
				setState(186);
				listadenomes();
				setState(187);
				match(T__22);
				setState(188);
				listaexp();
				setState(189);
				match(T__9);
				setState(190);
				trecho();
				setState(191);
				match(T__10);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				match(T__23);
				setState(194);
				match(Nome);
				setState(195);
				match(T__7);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(196);
				match(Nome);
				setState(197);
				match(T__21);
				setState(198);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListaatriContext listaatri() {
			return getRuleContext(ListaatriContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public List<TerminalNode> Inteiro() { return getTokens(CaronteParser.Inteiro); }
		public TerminalNode Inteiro(int i) {
			return getToken(CaronteParser.Inteiro, i);
		}
		public ComandoexpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoexpressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterComandoexpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitComandoexpressao(this);
		}
	}

	public final ComandoexpressaoContext comandoexpressao() throws RecognitionException {
		ComandoexpressaoContext _localctx = new ComandoexpressaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comandoexpressao);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				var();
				setState(202);
				listaatri();
				setState(203);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__2);
				setState(206);
				tipovar();
				setState(207);
				var();
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(208);
					match(T__3);
					setState(209);
					match(Inteiro);
					setState(210);
					match(T__4);
					}
					}
					setState(213); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(215);
					match(T__20);
					setState(216);
					exp(0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				tipovar();
				setState(220);
				var();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(221);
					match(T__20);
					setState(222);
					exp(0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(T__19);
				setState(226);
				var();
				setState(227);
				match(T__20);
				setState(228);
				exp(0);
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
		enterRule(_localctx, 12, RULE_comandounico);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				comandoexpressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
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
		enterRule(_localctx, 14, RULE_ultimocomando);
		int _la;
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(T__24);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(237);
					listaexp();
					}
				}

				setState(240);
				match(T__7);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(T__25);
				setState(242);
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
		enterRule(_localctx, 16, RULE_listaatri);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__5);
				setState(246);
				var();
				setState(247);
				listaatri();
				setState(248);
				exp(0);
				setState(249);
				match(T__5);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
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
		enterRule(_localctx, 18, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(254);
				match(T__26);
				}
			}

			setState(257);
			tiporet();
			setState(258);
			match(Nome);
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
		enterRule(_localctx, 20, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (T__29 - 28)) | (1L << (T__30 - 28)) | (1L << (T__31 - 28)) | (1L << (Nome - 28)))) != 0)) ) {
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
	}

	public final TiporetContext tiporet() throws RecognitionException {
		TiporetContext _localctx = new TiporetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tiporet);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				tipovar();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(T__32);
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
		enterRule(_localctx, 24, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			var();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(267);
				match(T__5);
				setState(268);
				var();
				}
				}
				setState(273);
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
		enterRule(_localctx, 26, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(Nome);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(275);
					match(T__33);
					setState(276);
					match(Nome);
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(282);
					match(T__3);
					setState(283);
					match(Inteiro);
					setState(284);
					match(T__4);
					setState(289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(285);
							match(T__33);
							setState(286);
							match(Nome);
							}
							} 
						}
						setState(291);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
					}
					}
					} 
				}
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 28, RULE_listadenomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(Nome);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(298);
				match(T__5);
				setState(299);
				match(Nome);
				}
				}
				setState(304);
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
		enterRule(_localctx, 30, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(305);
					exp(0);
					setState(306);
					match(T__5);
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(313);
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
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
			case T__38:
			case Inteiro:
			case Decimal:
			case String:
				{
				setState(316);
				valores();
				}
				break;
			case Nome:
				{
				setState(317);
				expprefixo();
				}
				break;
			case T__1:
				{
				setState(318);
				match(T__1);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(319);
					listaexp();
					}
				}

				setState(322);
				match(T__6);
				}
				break;
			case T__40:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
				{
				setState(323);
				opunaria();
				setState(324);
				exp(2);
				}
				break;
			case T__34:
				{
				setState(326);
				match(T__34);
				setState(327);
				exp(0);
				setState(328);
				match(T__35);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(332);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(333);
					opbin();
					setState(334);
					exp(4);
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 34, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (T__36 - 37)) | (1L << (T__37 - 37)) | (1L << (T__38 - 37)) | (1L << (Inteiro - 37)) | (1L << (Decimal - 37)) | (1L << (String - 37)))) != 0)) ) {
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
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expprefixo);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
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
		enterRule(_localctx, 38, RULE_chamadadefuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(Nome);
			setState(348);
			match(T__34);
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__40) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
				{
				setState(349);
				listaexp();
				}
			}

			setState(352);
			match(T__35);
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
		enterRule(_localctx, 40, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__34);
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (T__29 - 28)) | (1L << (T__30 - 28)) | (1L << (T__31 - 28)) | (1L << (Nome - 28)))) != 0)) {
				{
				setState(355);
				listapar();
				}
			}

			setState(358);
			match(T__35);
			setState(359);
			match(T__21);
			setState(360);
			trecho();
			setState(361);
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
		enterRule(_localctx, 42, RULE_listapar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(363);
					tipovar();
					setState(364);
					match(Nome);
					setState(365);
					match(T__5);
					}
					} 
				}
				setState(371);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(372);
			tipovar();
			setState(373);
			match(Nome);
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
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59))) != 0)) ) {
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
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (T__40 - 41)) | (1L << (T__60 - 41)) | (1L << (T__61 - 41)) | (1L << (T__62 - 41)) | (1L << (T__63 - 41)))) != 0)) ) {
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u017e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\6\3E\n\3\r\3\16\3F\5\3I\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\6\3U\n\3\r\3\16\3V\5\3Y\n\3\7\3[\n\3\f\3\16\3^\13\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3i\n\3\3\4\6\4l\n\4\r\4\16\4m\3\4\5\4q\n"+
		"\4\3\4\7\4t\n\4\f\4\16\4w\13\4\3\4\5\4z\n\4\3\5\3\5\3\5\3\5\5\5\u0080"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3"+
		"\6\3\6\5\6\u00a2\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a9\n\6\3\6\3\6\3\6\5\6"+
		"\u00ae\n\6\3\6\3\6\5\6\u00b2\n\6\3\6\3\6\5\6\u00b6\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ca\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00d6\n\7\r\7\16\7\u00d7"+
		"\3\7\3\7\5\7\u00dc\n\7\3\7\3\7\3\7\3\7\5\7\u00e2\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00e9\n\7\3\b\3\b\5\b\u00ed\n\b\3\t\3\t\5\t\u00f1\n\t\3\t\3\t\3"+
		"\t\5\t\u00f6\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ff\n\n\3\13\5\13\u0102"+
		"\n\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\5\r\u010b\n\r\3\16\3\16\3\16\7\16"+
		"\u0110\n\16\f\16\16\16\u0113\13\16\3\17\3\17\3\17\7\17\u0118\n\17\f\17"+
		"\16\17\u011b\13\17\3\17\3\17\3\17\3\17\3\17\7\17\u0122\n\17\f\17\16\17"+
		"\u0125\13\17\7\17\u0127\n\17\f\17\16\17\u012a\13\17\3\20\3\20\3\20\7\20"+
		"\u012f\n\20\f\20\16\20\u0132\13\20\3\21\3\21\3\21\7\21\u0137\n\21\f\21"+
		"\16\21\u013a\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0143\n\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014d\n\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0153\n\22\f\22\16\22\u0156\13\22\3\23\3\23\3\24\3\24\5\24"+
		"\u015c\n\24\3\25\3\25\3\25\5\25\u0161\n\25\3\25\3\25\3\26\3\26\5\26\u0167"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0172\n\27\f\27"+
		"\16\27\u0175\13\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\3\"\32\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\4\2\36\"FF\4\2\'"+
		")CE\3\2*>\4\2++?B\2\u019c\2\63\3\2\2\2\4h\3\2\2\2\6y\3\2\2\2\b\177\3\2"+
		"\2\2\n\u00c9\3\2\2\2\f\u00e8\3\2\2\2\16\u00ec\3\2\2\2\20\u00f5\3\2\2\2"+
		"\22\u00fe\3\2\2\2\24\u0101\3\2\2\2\26\u0106\3\2\2\2\30\u010a\3\2\2\2\32"+
		"\u010c\3\2\2\2\34\u0114\3\2\2\2\36\u012b\3\2\2\2 \u0138\3\2\2\2\"\u014c"+
		"\3\2\2\2$\u0157\3\2\2\2&\u015b\3\2\2\2(\u015d\3\2\2\2*\u0164\3\2\2\2,"+
		"\u0173\3\2\2\2.\u0179\3\2\2\2\60\u017b\3\2\2\2\62\64\5\4\3\2\63\62\3\2"+
		"\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\67i\5\f\7"+
		"\289\7\3\2\29:\7F\2\2:H\7\4\2\2;<\5\26\f\2<=\7F\2\2=I\3\2\2\2>?\7\5\2"+
		"\2?@\5\26\f\2@D\7F\2\2AB\7\6\2\2BC\7C\2\2CE\7\7\2\2DA\3\2\2\2EF\3\2\2"+
		"\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2H;\3\2\2\2H>\3\2\2\2I\\\3\2\2\2JX\7\b"+
		"\2\2KL\5\26\f\2LM\7F\2\2MY\3\2\2\2NO\7\5\2\2OP\5\26\f\2PT\7F\2\2QR\7\6"+
		"\2\2RS\7C\2\2SU\7\7\2\2TQ\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2"+
		"\2\2XK\3\2\2\2XN\3\2\2\2Y[\3\2\2\2ZJ\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3"+
		"\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\t\2\2`a\7\n\2\2ai\3\2\2\2bc\5\24\13\2"+
		"cd\5*\26\2di\3\2\2\2ef\7\13\2\2fg\7F\2\2gi\5$\23\2h\67\3\2\2\2h8\3\2\2"+
		"\2hb\3\2\2\2he\3\2\2\2i\5\3\2\2\2jl\5\b\5\2kj\3\2\2\2lm\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2oq\5\20\t\2po\3\2\2\2pq\3\2\2\2qz\3\2\2\2rt\5"+
		"\b\5\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xz\5"+
		"\20\t\2yk\3\2\2\2yu\3\2\2\2z\7\3\2\2\2{\u0080\5\n\6\2|}\5\16\b\2}~\7\n"+
		"\2\2~\u0080\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2\u0080\t\3\2\2\2\u0081\u0082"+
		"\7\f\2\2\u0082\u0083\5\6\4\2\u0083\u0084\7\r\2\2\u0084\u00ca\3\2\2\2\u0085"+
		"\u0086\7\16\2\2\u0086\u0087\5\"\22\2\u0087\u0088\7\f\2\2\u0088\u0089\5"+
		"\6\4\2\u0089\u008a\7\r\2\2\u008a\u00ca\3\2\2\2\u008b\u008c\7\17\2\2\u008c"+
		"\u008d\5\6\4\2\u008d\u008e\7\20\2\2\u008e\u008f\5\"\22\2\u008f\u0090\7"+
		"\n\2\2\u0090\u00ca\3\2\2\2\u0091\u0092\7\21\2\2\u0092\u0093\5\"\22\2\u0093"+
		"\u0094\7\22\2\2\u0094\u009c\5\6\4\2\u0095\u0096\7\23\2\2\u0096\u0097\5"+
		"\"\22\2\u0097\u0098\7\22\2\2\u0098\u0099\5\6\4\2\u0099\u009b\3\2\2\2\u009a"+
		"\u0095\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\u00a1\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\24\2\2\u00a0"+
		"\u00a2\5\6\4\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a4\7\r\2\2\u00a4\u00ca\3\2\2\2\u00a5\u00ad\7\25\2\2\u00a6"+
		"\u00a9\5\26\f\2\u00a7\u00a9\7\26\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7F\2\2\u00ab\u00ac\7\27\2\2\u00ac"+
		"\u00ae\5\"\22\2\u00ad\u00a8\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3"+
		"\2\2\2\u00af\u00b1\7\30\2\2\u00b0\u00b2\5\"\22\2\u00b1\u00b0\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\7\30\2\2\u00b4\u00b6\5"+
		"\16\b\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\7\f\2\2\u00b8\u00b9\5\6\4\2\u00b9\u00ba\7\r\2\2\u00ba\u00ca\3\2"+
		"\2\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd\5\36\20\2\u00bd\u00be\7\31\2\2\u00be"+
		"\u00bf\5 \21\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\5\6\4\2\u00c1\u00c2\7\r"+
		"\2\2\u00c2\u00ca\3\2\2\2\u00c3\u00c4\7\32\2\2\u00c4\u00c5\7F\2\2\u00c5"+
		"\u00ca\7\n\2\2\u00c6\u00c7\7F\2\2\u00c7\u00c8\7\30\2\2\u00c8\u00ca\5\b"+
		"\5\2\u00c9\u0081\3\2\2\2\u00c9\u0085\3\2\2\2\u00c9\u008b\3\2\2\2\u00c9"+
		"\u0091\3\2\2\2\u00c9\u00a5\3\2\2\2\u00c9\u00bb\3\2\2\2\u00c9\u00c3\3\2"+
		"\2\2\u00c9\u00c6\3\2\2\2\u00ca\13\3\2\2\2\u00cb\u00cc\5\34\17\2\u00cc"+
		"\u00cd\5\22\n\2\u00cd\u00ce\5\"\22\2\u00ce\u00e9\3\2\2\2\u00cf\u00d0\7"+
		"\5\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d5\5\34\17\2\u00d2\u00d3\7\6\2\2"+
		"\u00d3\u00d4\7C\2\2\u00d4\u00d6\7\7\2\2\u00d5\u00d2\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00da\7\27\2\2\u00da\u00dc\5\"\22\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3"+
		"\2\2\2\u00dc\u00e9\3\2\2\2\u00dd\u00de\5\26\f\2\u00de\u00e1\5\34\17\2"+
		"\u00df\u00e0\7\27\2\2\u00e0\u00e2\5\"\22\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e9\3\2\2\2\u00e3\u00e4\7\26\2\2\u00e4\u00e5\5\34\17"+
		"\2\u00e5\u00e6\7\27\2\2\u00e6\u00e7\5\"\22\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00cb\3\2\2\2\u00e8\u00cf\3\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00e3\3\2"+
		"\2\2\u00e9\r\3\2\2\2\u00ea\u00ed\5\f\7\2\u00eb\u00ed\5 \21\2\u00ec\u00ea"+
		"\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\17\3\2\2\2\u00ee\u00f0\7\33\2\2\u00ef"+
		"\u00f1\5 \21\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f6\7\n\2\2\u00f3\u00f4\7\34\2\2\u00f4\u00f6\7\n\2\2\u00f5"+
		"\u00ee\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\21\3\2\2\2\u00f7\u00f8\7\b\2"+
		"\2\u00f8\u00f9\5\34\17\2\u00f9\u00fa\5\22\n\2\u00fa\u00fb\5\"\22\2\u00fb"+
		"\u00fc\7\b\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00ff\7\27\2\2\u00fe\u00f7\3"+
		"\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\23\3\2\2\2\u0100\u0102\7\35\2\2\u0101"+
		"\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5\30"+
		"\r\2\u0104\u0105\7F\2\2\u0105\25\3\2\2\2\u0106\u0107\t\2\2\2\u0107\27"+
		"\3\2\2\2\u0108\u010b\5\26\f\2\u0109\u010b\7#\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u0109\3\2\2\2\u010b\31\3\2\2\2\u010c\u0111\5\34\17\2\u010d\u010e\7\b"+
		"\2\2\u010e\u0110\5\34\17\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\33\3\2\2\2\u0113\u0111\3\2\2"+
		"\2\u0114\u0119\7F\2\2\u0115\u0116\7$\2\2\u0116\u0118\7F\2\2\u0117\u0115"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0128\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\6\2\2\u011d\u011e\7C"+
		"\2\2\u011e\u0123\7\7\2\2\u011f\u0120\7$\2\2\u0120\u0122\7F\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u011c\3\2\2\2\u0127\u012a\3\2"+
		"\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\35\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012b\u0130\7F\2\2\u012c\u012d\7\b\2\2\u012d\u012f\7F\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\37\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\5\"\22\2\u0134\u0135"+
		"\7\b\2\2\u0135\u0137\3\2\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013b\u013c\5\"\22\2\u013c!\3\2\2\2\u013d\u013e\b\22\1\2\u013e\u014d"+
		"\5$\23\2\u013f\u014d\5&\24\2\u0140\u0142\7\4\2\2\u0141\u0143\5 \21\2\u0142"+
		"\u0141\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u014d\7\t"+
		"\2\2\u0145\u0146\5\60\31\2\u0146\u0147\5\"\22\4\u0147\u014d\3\2\2\2\u0148"+
		"\u0149\7%\2\2\u0149\u014a\5\"\22\2\u014a\u014b\7&\2\2\u014b\u014d\3\2"+
		"\2\2\u014c\u013d\3\2\2\2\u014c\u013f\3\2\2\2\u014c\u0140\3\2\2\2\u014c"+
		"\u0145\3\2\2\2\u014c\u0148\3\2\2\2\u014d\u0154\3\2\2\2\u014e\u014f\f\5"+
		"\2\2\u014f\u0150\5.\30\2\u0150\u0151\5\"\22\6\u0151\u0153\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155#\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\t\3\2\2\u0158%\3\2"+
		"\2\2\u0159\u015c\5\34\17\2\u015a\u015c\5(\25\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015a\3\2\2\2\u015c\'\3\2\2\2\u015d\u015e\7F\2\2\u015e\u0160\7%\2\2\u015f"+
		"\u0161\5 \21\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\3\2"+
		"\2\2\u0162\u0163\7&\2\2\u0163)\3\2\2\2\u0164\u0166\7%\2\2\u0165\u0167"+
		"\5,\27\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\7&\2\2\u0169\u016a\7\30\2\2\u016a\u016b\5\6\4\2\u016b\u016c\7\r"+
		"\2\2\u016c+\3\2\2\2\u016d\u016e\5\26\f\2\u016e\u016f\7F\2\2\u016f\u0170"+
		"\7\b\2\2\u0170\u0172\3\2\2\2\u0171\u016d\3\2\2\2\u0172\u0175\3\2\2\2\u0173"+
		"\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0176\u0177\5\26\f\2\u0177\u0178\7F\2\2\u0178-\3\2\2\2\u0179\u017a"+
		"\t\4\2\2\u017a/\3\2\2\2\u017b\u017c\t\5\2\2\u017c\61\3\2\2\2,\65FHVX\\"+
		"hmpuy\177\u009c\u00a1\u00a8\u00ad\u00b1\u00b5\u00c9\u00d7\u00db\u00e1"+
		"\u00e8\u00ec\u00f0\u00f5\u00fe\u0101\u010a\u0111\u0119\u0123\u0128\u0130"+
		"\u0138\u0142\u014c\u0154\u015b\u0160\u0166\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}