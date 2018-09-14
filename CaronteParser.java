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
		RULE_inicio = 0, RULE_bloco = 1, RULE_trecho = 2, RULE_comando = 3, RULE_comandobloco = 4, 
		RULE_comandoexpressao = 5, RULE_erro_var_declaracao = 6, RULE_comandounico = 7, 
		RULE_ultimocomando = 8, RULE_listaatri = 9, RULE_nomedafuncao = 10, RULE_tipovar = 11, 
		RULE_tiporet = 12, RULE_listavar = 13, RULE_var = 14, RULE_listadenomes = 15, 
		RULE_listaexp = 16, RULE_exp = 17, RULE_valores = 18, RULE_expprefixo = 19, 
		RULE_chamadadefuncao = 20, RULE_corpodafuncao = 21, RULE_listapar = 22, 
		RULE_opbin = 23, RULE_opunaria = 24;
	public static final String[] ruleNames = {
		"inicio", "bloco", "trecho", "comando", "comandobloco", "comandoexpressao", 
		"erro_var_declaracao", "comandounico", "ultimocomando", "listaatri", "nomedafuncao", 
		"tipovar", "tiporet", "listavar", "var", "listadenomes", "listaexp", "exp", 
		"valores", "expprefixo", "chamadadefuncao", "corpodafuncao", "listapar", 
		"opbin", "opunaria"
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
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				bloco();
				}
				}
				setState(53); 
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bloco);
		int _la;
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				comandoexpressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(T__0);
				setState(57);
				match(Nome);
				setState(58);
				match(T__1);
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case Nome:
					{
					setState(59);
					tipovar();
					setState(60);
					match(Nome);
					}
					break;
				case T__2:
					{
					setState(62);
					match(T__2);
					setState(63);
					tipovar();
					setState(64);
					match(Nome);
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(65);
						match(T__3);
						setState(66);
						match(Inteiro);
						setState(67);
						match(T__4);
						}
						}
						setState(70); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__3 );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(74);
					match(T__5);
					setState(88);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(75);
						tipovar();
						setState(76);
						match(Nome);
						}
						break;
					case T__2:
						{
						setState(78);
						match(T__2);
						setState(79);
						tipovar();
						setState(80);
						match(Nome);
						setState(84); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(81);
							match(T__3);
							setState(82);
							match(Inteiro);
							setState(83);
							match(T__4);
							}
							}
							setState(86); 
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
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(T__6);
				setState(96);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				nomedafuncao();
				setState(99);
				corpodafuncao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(T__8);
				setState(102);
				match(Nome);
				setState(103);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					comando();
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0) );
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__24 || _la==T__25) {
					{
					setState(111);
					ultimocomando();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__18) | (1L << T__19) | (1L << T__23) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					{
					setState(114);
					comando();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				comandobloco();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				comandounico();
				setState(125);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				comandounico();
				notifyErrorListeners("';' é necessário");
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
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__9);
				setState(133);
				trecho();
				setState(134);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(T__11);
				setState(137);
				exp(0);
				setState(138);
				match(T__9);
				setState(139);
				trecho();
				setState(140);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(T__12);
				setState(143);
				trecho();
				setState(144);
				match(T__13);
				setState(145);
				exp(0);
				setState(146);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(T__14);
				setState(149);
				exp(0);
				setState(150);
				match(T__15);
				setState(151);
				trecho();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(152);
					match(T__16);
					setState(153);
					exp(0);
					setState(154);
					match(T__15);
					setState(155);
					trecho();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(162);
					match(T__17);
					setState(163);
					trecho();
					}
				}

				setState(166);
				match(T__10);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				match(T__18);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__28 - 20)) | (1L << (T__29 - 20)) | (1L << (T__30 - 20)) | (1L << (T__31 - 20)) | (1L << (T__32 - 20)) | (1L << (Nome - 20)))) != 0)) {
					{
					setState(171);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(169);
						tipovar();
						}
						break;
					case T__19:
						{
						setState(170);
						match(T__19);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(173);
					match(Nome);
					setState(174);
					match(T__20);
					setState(175);
					exp(0);
					}
				}

				setState(178);
				match(T__21);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(179);
					exp(0);
					}
				}

				setState(182);
				match(T__21);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__19) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(183);
					comandounico();
					}
				}

				setState(186);
				match(T__9);
				setState(187);
				trecho();
				setState(188);
				match(T__10);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				match(T__18);
				setState(191);
				listadenomes();
				setState(192);
				match(T__22);
				setState(193);
				listaexp();
				setState(194);
				match(T__9);
				setState(195);
				trecho();
				setState(196);
				match(T__10);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(198);
				match(T__23);
				setState(199);
				match(Nome);
				setState(200);
				match(T__7);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(201);
				match(Nome);
				setState(202);
				match(T__21);
				setState(203);
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
		public Erro_var_declaracaoContext erro_var_declaracao() {
			return getRuleContext(Erro_var_declaracaoContext.class,0);
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
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				var();
				setState(207);
				listaatri();
				setState(208);
				exp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(T__2);
				setState(211);
				tipovar();
				setState(212);
				var();
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(213);
					match(T__3);
					setState(214);
					match(Inteiro);
					setState(215);
					match(T__4);
					}
					}
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__3 );
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(220);
					match(T__20);
					setState(221);
					exp(0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				tipovar();
				setState(225);
				var();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(226);
					match(T__20);
					setState(227);
					exp(0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(T__19);
				setState(231);
				var();
				setState(232);
				match(T__20);
				setState(233);
				exp(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
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
		enterRule(_localctx, 12, RULE_erro_var_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__19);
			setState(239);
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
		enterRule(_localctx, 14, RULE_comandounico);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				comandoexpressao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
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
		enterRule(_localctx, 16, RULE_ultimocomando);
		int _la;
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__24);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(247);
					listaexp();
					}
				}

				setState(250);
				match(T__7);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__25);
				setState(252);
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
		enterRule(_localctx, 18, RULE_listaatri);
		try {
			setState(262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(T__5);
				setState(256);
				var();
				setState(257);
				listaatri();
				setState(258);
				exp(0);
				setState(259);
				match(T__5);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
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
		enterRule(_localctx, 20, RULE_nomedafuncao);
		int _la;
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==T__27) {
					{
					setState(264);
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

				setState(267);
				tiporet();
				setState(268);
				match(Nome);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(T__26);
				setState(271);
				match(T__27);
				setState(272);
				tiporet();
				setState(273);
				match(Nome);
				notifyErrorListeners("fastcall e inline não podem ser usados para uma mesma função");
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
		enterRule(_localctx, 22, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
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
	}

	public final TiporetContext tiporet() throws RecognitionException {
		TiporetContext _localctx = new TiporetContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tiporet);
		try {
			setState(282);
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
				setState(280);
				tipovar();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
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
		enterRule(_localctx, 26, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			var();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(285);
				match(T__5);
				setState(286);
				var();
				}
				}
				setState(291);
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
		enterRule(_localctx, 28, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(Nome);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293);
					match(T__34);
					setState(294);
					match(Nome);
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(300);
					match(T__3);
					setState(301);
					match(Inteiro);
					setState(302);
					match(T__4);
					setState(307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(303);
							match(T__34);
							setState(304);
							match(Nome);
							}
							} 
						}
						setState(309);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					}
					}
					} 
				}
				setState(314);
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
		enterRule(_localctx, 30, RULE_listadenomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(Nome);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(316);
				match(T__5);
				setState(317);
				match(Nome);
				}
				}
				setState(322);
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
		enterRule(_localctx, 32, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(323);
					exp(0);
					setState(324);
					match(T__5);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			setState(331);
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
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(334);
				valores();
				}
				break;
			case 2:
				{
				setState(335);
				expprefixo();
				}
				break;
			case 3:
				{
				setState(336);
				match(T__1);
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
					{
					setState(337);
					listaexp();
					}
				}

				setState(340);
				match(T__6);
				}
				break;
			case 4:
				{
				setState(341);
				((ExpContext)_localctx).opunaria = opunaria();
				setState(342);
				exp(7);
				}
				break;
			case 5:
				{
				setState(344);
				match(T__35);
				setState(345);
				exp(0);
				setState(346);
				match(T__36);
				}
				break;
			case 6:
				{
				setState(348);
				match(T__35);
				setState(349);
				exp(5);
				notifyErrorListeners(" existem parênteses não fechados! ");
				}
				break;
			case 7:
				{
				setState(352);
				((ExpContext)_localctx).opbin = opbin();
				setState(353);
				exp(2);
				notifyErrorListeners("um operando era esperado no lado esquerdo de " + (((ExpContext)_localctx).opbin!=null?_input.getText(((ExpContext)_localctx).opbin.start,((ExpContext)_localctx).opbin.stop):null));
				}
				break;
			case 8:
				{
				setState(356);
				((ExpContext)_localctx).opunaria = opunaria();
				notifyErrorListeners("Era esperado um operando para " + (((ExpContext)_localctx).opunaria!=null?_input.getText(((ExpContext)_localctx).opunaria.start,((ExpContext)_localctx).opunaria.stop):null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(361);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(362);
						((ExpContext)_localctx).opbin = opbin();
						setState(363);
						exp(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(365);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(366);
						match(T__36);
						notifyErrorListeners(" existem parênteses fechados a mais! ");
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(368);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(369);
						((ExpContext)_localctx).opbin = opbin();
						notifyErrorListeners("um operando era esperado no lado direito de " + (((ExpContext)_localctx).opbin!=null?_input.getText(((ExpContext)_localctx).opbin.start,((ExpContext)_localctx).opbin.stop):null));
						}
						break;
					}
					} 
				}
				setState(376);
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
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
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
	}

	public final ExpprefixoContext expprefixo() throws RecognitionException {
		ExpprefixoContext _localctx = new ExpprefixoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expprefixo);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
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
		enterRule(_localctx, 40, RULE_chamadadefuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(Nome);
			setState(384);
			match(T__35);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (Inteiro - 64)) | (1L << (Decimal - 64)) | (1L << (String - 64)) | (1L << (Nome - 64)))) != 0)) {
				{
				setState(385);
				listaexp();
				}
			}

			setState(388);
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
		enterRule(_localctx, 42, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__35);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0) || _la==Nome) {
				{
				setState(391);
				listapar();
				}
			}

			setState(394);
			match(T__36);
			setState(395);
			match(T__21);
			setState(396);
			trecho();
			setState(397);
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
		enterRule(_localctx, 44, RULE_listapar);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case T__32:
					case Nome:
						{
						setState(399);
						tipovar();
						setState(400);
						match(Nome);
						}
						break;
					case T__2:
						{
						setState(402);
						match(T__2);
						setState(403);
						tipovar();
						setState(404);
						match(Nome);
						setState(408); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(405);
							match(T__3);
							setState(406);
							match(Inteiro);
							setState(407);
							match(T__4);
							}
							}
							setState(410); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==T__3 );
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(414);
					match(T__5);
					}
					} 
				}
				setState(420);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case Nome:
				{
				setState(421);
				tipovar();
				setState(422);
				match(Nome);
				}
				break;
			case T__2:
				{
				setState(424);
				match(T__2);
				setState(425);
				tipovar();
				setState(426);
				match(Nome);
				setState(430); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(427);
					match(T__3);
					setState(428);
					match(Inteiro);
					setState(429);
					match(T__4);
					}
					}
					setState(432); 
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
	}

	public final OpbinContext opbin() throws RecognitionException {
		OpbinContext _localctx = new OpbinContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
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
	}

	public final OpunariaContext opunaria() throws RecognitionException {
		OpunariaContext _localctx = new OpunariaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
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
		case 17:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3J\u01bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\6\3G\n\3\r\3\16\3H\5\3K\n\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\6\3W\n\3\r\3\16\3X\5\3[\n\3\7\3]\n\3\f\3\16\3`\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3k\n\3\3\4\6\4n\n\4\r\4\16\4o\3"+
		"\4\5\4s\n\4\3\4\7\4v\n\4\f\4\16\4y\13\4\3\4\5\4|\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u0085\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a0\n\6\f"+
		"\6\16\6\u00a3\13\6\3\6\3\6\5\6\u00a7\n\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ae"+
		"\n\6\3\6\3\6\3\6\5\6\u00b3\n\6\3\6\3\6\5\6\u00b7\n\6\3\6\3\6\5\6\u00bb"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6\u00cf\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00db"+
		"\n\7\r\7\16\7\u00dc\3\7\3\7\5\7\u00e1\n\7\3\7\3\7\3\7\3\7\5\7\u00e7\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ef\n\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00f7"+
		"\n\t\3\n\3\n\5\n\u00fb\n\n\3\n\3\n\3\n\5\n\u0100\n\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0109\n\13\3\f\5\f\u010c\n\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0117\n\f\3\r\3\r\3\16\3\16\5\16\u011d\n\16\3\17"+
		"\3\17\3\17\7\17\u0122\n\17\f\17\16\17\u0125\13\17\3\20\3\20\3\20\7\20"+
		"\u012a\n\20\f\20\16\20\u012d\13\20\3\20\3\20\3\20\3\20\3\20\7\20\u0134"+
		"\n\20\f\20\16\20\u0137\13\20\7\20\u0139\n\20\f\20\16\20\u013c\13\20\3"+
		"\21\3\21\3\21\7\21\u0141\n\21\f\21\16\21\u0144\13\21\3\22\3\22\3\22\7"+
		"\22\u0149\n\22\f\22\16\22\u014c\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\5\23\u0155\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016a\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0177\n\23\f\23\16"+
		"\23\u017a\13\23\3\24\3\24\3\25\3\25\5\25\u0180\n\25\3\26\3\26\3\26\5\26"+
		"\u0185\n\26\3\26\3\26\3\27\3\27\5\27\u018b\n\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u019b\n\30\r\30"+
		"\16\30\u019c\5\30\u019f\n\30\3\30\3\30\7\30\u01a3\n\30\f\30\16\30\u01a6"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u01b1\n\30\r"+
		"\30\16\30\u01b2\5\30\u01b5\n\30\3\31\3\31\3\32\3\32\3\32\2\3$\33\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\7\3\2\35\36\4\2\37"+
		"#GG\4\2(*DF\3\2+?\4\2,,@C\2\u01e4\2\65\3\2\2\2\4j\3\2\2\2\6{\3\2\2\2\b"+
		"\u0084\3\2\2\2\n\u00ce\3\2\2\2\f\u00ee\3\2\2\2\16\u00f0\3\2\2\2\20\u00f6"+
		"\3\2\2\2\22\u00ff\3\2\2\2\24\u0108\3\2\2\2\26\u0116\3\2\2\2\30\u0118\3"+
		"\2\2\2\32\u011c\3\2\2\2\34\u011e\3\2\2\2\36\u0126\3\2\2\2 \u013d\3\2\2"+
		"\2\"\u014a\3\2\2\2$\u0169\3\2\2\2&\u017b\3\2\2\2(\u017f\3\2\2\2*\u0181"+
		"\3\2\2\2,\u0188\3\2\2\2.\u01a4\3\2\2\2\60\u01b6\3\2\2\2\62\u01b8\3\2\2"+
		"\2\64\66\5\4\3\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8\3\3\2\2\29k\5\f\7\2:;\7\3\2\2;<\7G\2\2<J\7\4\2\2=>\5\30\r\2>?\7G\2\2"+
		"?K\3\2\2\2@A\7\5\2\2AB\5\30\r\2BF\7G\2\2CD\7\6\2\2DE\7D\2\2EG\7\7\2\2"+
		"FC\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2J=\3\2\2\2J@\3\2\2\2"+
		"K^\3\2\2\2LZ\7\b\2\2MN\5\30\r\2NO\7G\2\2O[\3\2\2\2PQ\7\5\2\2QR\5\30\r"+
		"\2RV\7G\2\2ST\7\6\2\2TU\7D\2\2UW\7\7\2\2VS\3\2\2\2WX\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y[\3\2\2\2ZM\3\2\2\2ZP\3\2\2\2[]\3\2\2\2\\L\3\2\2\2]`\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7\t\2\2bc\7\n\2\2ck\3\2"+
		"\2\2de\5\26\f\2ef\5,\27\2fk\3\2\2\2gh\7\13\2\2hi\7G\2\2ik\5&\24\2j9\3"+
		"\2\2\2j:\3\2\2\2jd\3\2\2\2jg\3\2\2\2k\5\3\2\2\2ln\5\b\5\2ml\3\2\2\2no"+
		"\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qs\5\22\n\2rq\3\2\2\2rs\3\2\2\2"+
		"s|\3\2\2\2tv\5\b\5\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2"+
		"yw\3\2\2\2z|\5\22\n\2{m\3\2\2\2{w\3\2\2\2|\7\3\2\2\2}\u0085\5\n\6\2~\177"+
		"\5\20\t\2\177\u0080\7\n\2\2\u0080\u0085\3\2\2\2\u0081\u0082\5\20\t\2\u0082"+
		"\u0083\b\5\1\2\u0083\u0085\3\2\2\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084"+
		"\u0081\3\2\2\2\u0085\t\3\2\2\2\u0086\u0087\7\f\2\2\u0087\u0088\5\6\4\2"+
		"\u0088\u0089\7\r\2\2\u0089\u00cf\3\2\2\2\u008a\u008b\7\16\2\2\u008b\u008c"+
		"\5$\23\2\u008c\u008d\7\f\2\2\u008d\u008e\5\6\4\2\u008e\u008f\7\r\2\2\u008f"+
		"\u00cf\3\2\2\2\u0090\u0091\7\17\2\2\u0091\u0092\5\6\4\2\u0092\u0093\7"+
		"\20\2\2\u0093\u0094\5$\23\2\u0094\u0095\7\n\2\2\u0095\u00cf\3\2\2\2\u0096"+
		"\u0097\7\21\2\2\u0097\u0098\5$\23\2\u0098\u0099\7\22\2\2\u0099\u00a1\5"+
		"\6\4\2\u009a\u009b\7\23\2\2\u009b\u009c\5$\23\2\u009c\u009d\7\22\2\2\u009d"+
		"\u009e\5\6\4\2\u009e\u00a0\3\2\2\2\u009f\u009a\3\2\2\2\u00a0\u00a3\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a6\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\24\2\2\u00a5\u00a7\5\6\4\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\r\2\2\u00a9"+
		"\u00cf\3\2\2\2\u00aa\u00b2\7\25\2\2\u00ab\u00ae\5\30\r\2\u00ac\u00ae\7"+
		"\26\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\7G\2\2\u00b0\u00b1\7\27\2\2\u00b1\u00b3\5$\23\2\u00b2\u00ad\3\2"+
		"\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\7\30\2\2\u00b5"+
		"\u00b7\5$\23\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\7\30\2\2\u00b9\u00bb\5\20\t\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\7\f\2\2\u00bd\u00be\5\6"+
		"\4\2\u00be\u00bf\7\r\2\2\u00bf\u00cf\3\2\2\2\u00c0\u00c1\7\25\2\2\u00c1"+
		"\u00c2\5 \21\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\5\"\22\2\u00c4\u00c5\7"+
		"\f\2\2\u00c5\u00c6\5\6\4\2\u00c6\u00c7\7\r\2\2\u00c7\u00cf\3\2\2\2\u00c8"+
		"\u00c9\7\32\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cf\7\n\2\2\u00cb\u00cc\7G"+
		"\2\2\u00cc\u00cd\7\30\2\2\u00cd\u00cf\5\b\5\2\u00ce\u0086\3\2\2\2\u00ce"+
		"\u008a\3\2\2\2\u00ce\u0090\3\2\2\2\u00ce\u0096\3\2\2\2\u00ce\u00aa\3\2"+
		"\2\2\u00ce\u00c0\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf"+
		"\13\3\2\2\2\u00d0\u00d1\5\36\20\2\u00d1\u00d2\5\24\13\2\u00d2\u00d3\5"+
		"$\23\2\u00d3\u00ef\3\2\2\2\u00d4\u00d5\7\5\2\2\u00d5\u00d6\5\30\r\2\u00d6"+
		"\u00da\5\36\20\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9\7D\2\2\u00d9\u00db\7"+
		"\7\2\2\u00da\u00d7\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00df\7\27\2\2\u00df\u00e1\5"+
		"$\23\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00ef\3\2\2\2\u00e2"+
		"\u00e3\5\30\r\2\u00e3\u00e6\5\36\20\2\u00e4\u00e5\7\27\2\2\u00e5\u00e7"+
		"\5$\23\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00ef\3\2\2\2\u00e8"+
		"\u00e9\7\26\2\2\u00e9\u00ea\5\36\20\2\u00ea\u00eb\7\27\2\2\u00eb\u00ec"+
		"\5$\23\2\u00ec\u00ef\3\2\2\2\u00ed\u00ef\5\16\b\2\u00ee\u00d0\3\2\2\2"+
		"\u00ee\u00d4\3\2\2\2\u00ee\u00e2\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\r\3\2\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\5\36\20\2\u00f2"+
		"\u00f3\b\b\1\2\u00f3\17\3\2\2\2\u00f4\u00f7\5\f\7\2\u00f5\u00f7\5\"\22"+
		"\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\21\3\2\2\2\u00f8\u00fa"+
		"\7\33\2\2\u00f9\u00fb\5\"\22\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u0100\7\n\2\2\u00fd\u00fe\7\34\2\2\u00fe\u0100"+
		"\7\n\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\23\3\2\2\2\u0101"+
		"\u0102\7\b\2\2\u0102\u0103\5\36\20\2\u0103\u0104\5\24\13\2\u0104\u0105"+
		"\5$\23\2\u0105\u0106\7\b\2\2\u0106\u0109\3\2\2\2\u0107\u0109\7\27\2\2"+
		"\u0108\u0101\3\2\2\2\u0108\u0107\3\2\2\2\u0109\25\3\2\2\2\u010a\u010c"+
		"\t\2\2\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\5\32\16\2\u010e\u010f\7G\2\2\u010f\u0117\3\2\2\2\u0110\u0111\7"+
		"\35\2\2\u0111\u0112\7\36\2\2\u0112\u0113\5\32\16\2\u0113\u0114\7G\2\2"+
		"\u0114\u0115\b\f\1\2\u0115\u0117\3\2\2\2\u0116\u010b\3\2\2\2\u0116\u0110"+
		"\3\2\2\2\u0117\27\3\2\2\2\u0118\u0119\t\3\2\2\u0119\31\3\2\2\2\u011a\u011d"+
		"\5\30\r\2\u011b\u011d\7$\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\33\3\2\2\2\u011e\u0123\5\36\20\2\u011f\u0120\7\b\2\2\u0120\u0122\5\36"+
		"\20\2\u0121\u011f\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123"+
		"\u0124\3\2\2\2\u0124\35\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u012b\7G\2\2"+
		"\u0127\u0128\7%\2\2\u0128\u012a\7G\2\2\u0129\u0127\3\2\2\2\u012a\u012d"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u013a\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\7\6\2\2\u012f\u0130\7D\2\2\u0130\u0135\7\7"+
		"\2\2\u0131\u0132\7%\2\2\u0132\u0134\7G\2\2\u0133\u0131\3\2\2\2\u0134\u0137"+
		"\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0138\u012e\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2"+
		"\2\2\u013a\u013b\3\2\2\2\u013b\37\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0142"+
		"\7G\2\2\u013e\u013f\7\b\2\2\u013f\u0141\7G\2\2\u0140\u013e\3\2\2\2\u0141"+
		"\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143!\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0145\u0146\5$\23\2\u0146\u0147\7\b\2\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0145\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014d\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\5$"+
		"\23\2\u014e#\3\2\2\2\u014f\u0150\b\23\1\2\u0150\u016a\5&\24\2\u0151\u016a"+
		"\5(\25\2\u0152\u0154\7\4\2\2\u0153\u0155\5\"\22\2\u0154\u0153\3\2\2\2"+
		"\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u016a\7\t\2\2\u0157\u0158"+
		"\5\62\32\2\u0158\u0159\5$\23\t\u0159\u016a\3\2\2\2\u015a\u015b\7&\2\2"+
		"\u015b\u015c\5$\23\2\u015c\u015d\7\'\2\2\u015d\u016a\3\2\2\2\u015e\u015f"+
		"\7&\2\2\u015f\u0160\5$\23\7\u0160\u0161\b\23\1\2\u0161\u016a\3\2\2\2\u0162"+
		"\u0163\5\60\31\2\u0163\u0164\5$\23\4\u0164\u0165\b\23\1\2\u0165\u016a"+
		"\3\2\2\2\u0166\u0167\5\62\32\2\u0167\u0168\b\23\1\2\u0168\u016a\3\2\2"+
		"\2\u0169\u014f\3\2\2\2\u0169\u0151\3\2\2\2\u0169\u0152\3\2\2\2\u0169\u0157"+
		"\3\2\2\2\u0169\u015a\3\2\2\2\u0169\u015e\3\2\2\2\u0169\u0162\3\2\2\2\u0169"+
		"\u0166\3\2\2\2\u016a\u0178\3\2\2\2\u016b\u016c\f\n\2\2\u016c\u016d\5\60"+
		"\31\2\u016d\u016e\5$\23\13\u016e\u0177\3\2\2\2\u016f\u0170\f\6\2\2\u0170"+
		"\u0171\7\'\2\2\u0171\u0177\b\23\1\2\u0172\u0173\f\5\2\2\u0173\u0174\5"+
		"\60\31\2\u0174\u0175\b\23\1\2\u0175\u0177\3\2\2\2\u0176\u016b\3\2\2\2"+
		"\u0176\u016f\3\2\2\2\u0176\u0172\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0178\u0179\3\2\2\2\u0179%\3\2\2\2\u017a\u0178\3\2\2\2\u017b"+
		"\u017c\t\4\2\2\u017c\'\3\2\2\2\u017d\u0180\5\36\20\2\u017e\u0180\5*\26"+
		"\2\u017f\u017d\3\2\2\2\u017f\u017e\3\2\2\2\u0180)\3\2\2\2\u0181\u0182"+
		"\7G\2\2\u0182\u0184\7&\2\2\u0183\u0185\5\"\22\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7\'\2\2\u0187+\3\2\2\2"+
		"\u0188\u018a\7&\2\2\u0189\u018b\5.\30\2\u018a\u0189\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\7\'\2\2\u018d\u018e\7\30\2\2"+
		"\u018e\u018f\5\6\4\2\u018f\u0190\7\r\2\2\u0190-\3\2\2\2\u0191\u0192\5"+
		"\30\r\2\u0192\u0193\7G\2\2\u0193\u019f\3\2\2\2\u0194\u0195\7\5\2\2\u0195"+
		"\u0196\5\30\r\2\u0196\u019a\7G\2\2\u0197\u0198\7\6\2\2\u0198\u0199\7D"+
		"\2\2\u0199\u019b\7\7\2\2\u019a\u0197\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019f\3\2\2\2\u019e\u0191\3\2"+
		"\2\2\u019e\u0194\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\7\b\2\2\u01a1"+
		"\u01a3\3\2\2\2\u01a2\u019e\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01b4\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01a8\5\30\r\2\u01a8\u01a9\7G\2\2\u01a9\u01b5\3\2\2\2\u01aa\u01ab\7\5"+
		"\2\2\u01ab\u01ac\5\30\r\2\u01ac\u01b0\7G\2\2\u01ad\u01ae\7\6\2\2\u01ae"+
		"\u01af\7D\2\2\u01af\u01b1\7\7\2\2\u01b0\u01ad\3\2\2\2\u01b1\u01b2\3\2"+
		"\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4"+
		"\u01a7\3\2\2\2\u01b4\u01aa\3\2\2\2\u01b5/\3\2\2\2\u01b6\u01b7\t\5\2\2"+
		"\u01b7\61\3\2\2\2\u01b8\u01b9\t\6\2\2\u01b9\63\3\2\2\2\62\67HJXZ^jorw"+
		"{\u0084\u00a1\u00a6\u00ad\u00b2\u00b6\u00ba\u00ce\u00dc\u00e0\u00e6\u00ee"+
		"\u00f6\u00fa\u00ff\u0108\u010b\u0116\u011c\u0123\u012b\u0135\u013a\u0142"+
		"\u014a\u0154\u0169\u0176\u0178\u017f\u0184\u018a\u019c\u019e\u01a4\u01b2"+
		"\u01b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}