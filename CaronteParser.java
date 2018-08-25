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
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, Inteiro=65, Numero=66, 
		String=67, Nome=68, WS=69, COMMENT=70, LINE_COMMENT=71;
	public static final int
		RULE_inicio = 0, RULE_bloco = 1, RULE_trecho = 2, RULE_comando = 3, RULE_ultimocomando = 4, 
		RULE_listaatri = 5, RULE_nomedafuncao = 6, RULE_tipovar = 7, RULE_tiporet = 8, 
		RULE_listavar = 9, RULE_var = 10, RULE_listadenomes = 11, RULE_listaexp = 12, 
		RULE_exp = 13, RULE_valores = 14, RULE_expprefixo = 15, RULE_chamadadefuncao = 16, 
		RULE_corpodafuncao = 17, RULE_listapar = 18, RULE_opbin = 19, RULE_opunaria = 20, 
		RULE_opcomando = 21;
	public static final String[] ruleNames = {
		"inicio", "bloco", "trecho", "comando", "ultimocomando", "listaatri", 
		"nomedafuncao", "tipovar", "tiporet", "listavar", "var", "listadenomes", 
		"listaexp", "exp", "valores", "expprefixo", "chamadadefuncao", "corpodafuncao", 
		"listapar", "opbin", "opunaria", "opcomando"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'array'", "'['", "']'", "'='", "'auto'", "'struct'", "'{'", 
		"','", "'}'", "'define'", "'do'", "'end'", "'while'", "'repeat'", "'until'", 
		"'if'", "'then'", "'elseif'", "'else'", "'for'", "'in'", "'goto'", "':'", 
		"'return'", "'break'", "'inline'", "'boolean'", "'int'", "'double'", "'float'", 
		"'string'", "'void'", "'.'", "'('", "')'", "'null'", "'false'", "'true'", 
		"'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'..'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'and'", "'or'", "'+='", "'-='", "'*='", "'/='", 
		"'^='", "'%='", "'not'", "'#'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "Inteiro", "Numero", "String", "Nome", "WS", 
		"COMMENT", "LINE_COMMENT"
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				bloco();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0) || _la==Nome );
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListaatriContext listaatri() {
			return getRuleContext(ListaatriContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		public List<TerminalNode> Nome() { return getTokens(CaronteParser.Nome); }
		public TerminalNode Nome(int i) {
			return getToken(CaronteParser.Nome, i);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				var();
				setState(50);
				listaatri();
				setState(51);
				exp(0);
				setState(52);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__1);
				setState(55);
				tipovar();
				setState(56);
				var();
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(57);
					match(T__2);
					setState(58);
					match(Inteiro);
					setState(59);
					match(T__3);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(65);
					match(T__4);
					setState(66);
					exp(0);
					}
				}

				setState(69);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				tipovar();
				setState(72);
				var();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(73);
					match(T__4);
					setState(74);
					exp(0);
					}
				}

				setState(77);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(T__5);
				setState(80);
				var();
				setState(81);
				match(T__4);
				setState(82);
				exp(0);
				setState(83);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(T__6);
				setState(86);
				match(Nome);
				setState(87);
				match(T__7);
				setState(88);
				tipovar();
				setState(89);
				match(Nome);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(90);
					match(T__8);
					setState(91);
					tipovar();
					setState(92);
					match(Nome);
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
				match(T__9);
				setState(100);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				nomedafuncao();
				setState(103);
				corpodafuncao();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(105);
				match(T__10);
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
	}

	public final TrechoContext trecho() throws RecognitionException {
		TrechoContext _localctx = new TrechoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_trecho);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__20) | (1L << T__22) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__62))) != 0) || _la==T__63 || _la==Nome );
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__5) | (1L << T__7) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__16) | (1L << T__20) | (1L << T__22) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__62))) != 0) || _la==T__63 || _la==Nome) {
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ListaatriContext listaatri() {
			return getRuleContext(ListaatriContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public List<TerminalNode> Inteiro() { return getTokens(CaronteParser.Inteiro); }
		public TerminalNode Inteiro(int i) {
			return getToken(CaronteParser.Inteiro, i);
		}
		public OpcomandoContext opcomando() {
			return getRuleContext(OpcomandoContext.class,0);
		}
		public ChamadadefuncaoContext chamadadefuncao() {
			return getRuleContext(ChamadadefuncaoContext.class,0);
		}
		public List<TrechoContext> trecho() {
			return getRuleContexts(TrechoContext.class);
		}
		public TrechoContext trecho(int i) {
			return getRuleContext(TrechoContext.class,i);
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
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				var();
				setState(128);
				listaatri();
				setState(129);
				exp(0);
				setState(130);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__1);
				setState(133);
				tipovar();
				setState(134);
				match(Nome);
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					match(T__2);
					setState(136);
					match(Inteiro);
					setState(137);
					match(T__3);
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(142);
					match(T__4);
					setState(143);
					exp(0);
					}
				}

				setState(146);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				tipovar();
				setState(149);
				match(Nome);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(150);
					match(T__4);
					setState(151);
					exp(0);
					}
				}

				setState(154);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(T__5);
				setState(157);
				match(Nome);
				setState(158);
				match(T__4);
				setState(159);
				exp(0);
				setState(160);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				opcomando();
				setState(163);
				var();
				setState(164);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				var();
				setState(167);
				opcomando();
				setState(168);
				match(T__0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				chamadadefuncao();
				setState(171);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				match(T__11);
				setState(174);
				trecho();
				setState(175);
				match(T__12);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(177);
				match(T__13);
				setState(178);
				exp(0);
				setState(179);
				match(T__11);
				setState(180);
				trecho();
				setState(181);
				match(T__12);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(183);
				match(T__14);
				setState(184);
				trecho();
				setState(185);
				match(T__15);
				setState(186);
				exp(0);
				setState(187);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(189);
				match(T__16);
				setState(190);
				exp(0);
				setState(191);
				match(T__17);
				setState(192);
				trecho();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__18) {
					{
					{
					setState(193);
					match(T__18);
					setState(194);
					exp(0);
					setState(195);
					match(T__17);
					setState(196);
					trecho();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(203);
					match(T__19);
					setState(204);
					trecho();
					}
				}

				setState(207);
				match(T__12);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(209);
				match(T__20);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (T__5 - 6)) | (1L << (T__27 - 6)) | (1L << (T__28 - 6)) | (1L << (T__29 - 6)) | (1L << (T__30 - 6)) | (1L << (T__31 - 6)) | (1L << (Nome - 6)))) != 0)) {
					{
					setState(212);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__27:
					case T__28:
					case T__29:
					case T__30:
					case T__31:
					case Nome:
						{
						setState(210);
						tipovar();
						}
						break;
					case T__5:
						{
						setState(211);
						match(T__5);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(214);
					match(Nome);
					setState(215);
					match(T__4);
					setState(216);
					exp(0);
					}
				}

				setState(219);
				match(T__0);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__37 - 8)) | (1L << (T__38 - 8)) | (1L << (T__40 - 8)) | (1L << (T__60 - 8)) | (1L << (T__61 - 8)) | (1L << (Numero - 8)) | (1L << (String - 8)) | (1L << (Nome - 8)))) != 0)) {
					{
					setState(220);
					exp(0);
					}
				}

				setState(223);
				match(T__0);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__37 - 8)) | (1L << (T__38 - 8)) | (1L << (T__40 - 8)) | (1L << (T__60 - 8)) | (1L << (T__61 - 8)) | (1L << (Numero - 8)) | (1L << (String - 8)) | (1L << (Nome - 8)))) != 0)) {
					{
					setState(224);
					exp(0);
					}
				}

				setState(227);
				match(T__11);
				setState(228);
				trecho();
				setState(229);
				match(T__12);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(231);
				match(T__20);
				setState(232);
				listadenomes();
				setState(233);
				match(T__21);
				setState(234);
				listaexp();
				setState(235);
				match(T__11);
				setState(236);
				trecho();
				setState(237);
				match(T__12);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(239);
				match(T__22);
				setState(240);
				match(Nome);
				setState(241);
				match(T__0);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(242);
				match(Nome);
				setState(243);
				match(T__23);
				setState(244);
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
		enterRule(_localctx, 8, RULE_ultimocomando);
		int _la;
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__24);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__37 - 8)) | (1L << (T__38 - 8)) | (1L << (T__40 - 8)) | (1L << (T__60 - 8)) | (1L << (T__61 - 8)) | (1L << (Numero - 8)) | (1L << (String - 8)) | (1L << (Nome - 8)))) != 0)) {
					{
					setState(248);
					listaexp();
					}
				}

				setState(251);
				match(T__0);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__25);
				setState(253);
				match(T__0);
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
		enterRule(_localctx, 10, RULE_listaatri);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(T__8);
				setState(257);
				var();
				setState(258);
				listaatri();
				setState(259);
				exp(0);
				setState(260);
				match(T__8);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__4);
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
		enterRule(_localctx, 12, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(265);
				match(T__26);
				}
			}

			setState(268);
			tiporet();
			setState(269);
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
		enterRule(_localctx, 14, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
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
		enterRule(_localctx, 16, RULE_tiporet);
		try {
			setState(275);
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
				setState(273);
				tipovar();
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
		enterRule(_localctx, 18, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			var();
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(278);
				match(T__8);
				setState(279);
				var();
				}
				}
				setState(284);
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
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
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
		enterRule(_localctx, 20, RULE_var);
		try {
			int _alt;
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Nome:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(Nome);
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(286);
						match(T__33);
						setState(287);
						match(Nome);
						}
						} 
					}
					setState(292);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293);
						match(T__2);
						setState(294);
						match(Inteiro);
						setState(295);
						match(T__3);
						setState(300);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(296);
								match(T__33);
								setState(297);
								match(Nome);
								}
								} 
							}
							setState(302);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
						}
						}
						} 
					}
					setState(307);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T__7);
				setState(309);
				listavar();
				setState(310);
				match(T__9);
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
		enterRule(_localctx, 22, RULE_listadenomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(Nome);
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(315);
				match(T__8);
				setState(316);
				match(Nome);
				}
				}
				setState(321);
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
		enterRule(_localctx, 24, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(322);
					exp(0);
					setState(323);
					match(T__8);
					}
					} 
				}
				setState(329);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(330);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
			case T__37:
			case T__38:
			case Numero:
			case String:
				{
				setState(333);
				valores();
				}
				break;
			case T__7:
			case Nome:
				{
				setState(334);
				expprefixo();
				}
				break;
			case T__40:
			case T__60:
			case T__61:
				{
				setState(335);
				opunaria();
				setState(336);
				exp(2);
				}
				break;
			case T__34:
				{
				setState(338);
				match(T__34);
				setState(339);
				exp(0);
				setState(340);
				match(T__35);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(350);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(344);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(345);
					opbin();
					setState(346);
					exp(4);
					}
					} 
				}
				setState(352);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValoresContext extends ParserRuleContext {
		public TerminalNode Numero() { return getToken(CaronteParser.Numero, 0); }
		public TerminalNode String() { return getToken(CaronteParser.String, 0); }
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
		enterRule(_localctx, 28, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ( !(((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & ((1L << (T__36 - 37)) | (1L << (T__37 - 37)) | (1L << (T__38 - 37)) | (1L << (Numero - 37)) | (1L << (String - 37)))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_expprefixo);
		try {
			setState(357);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
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
		enterRule(_localctx, 32, RULE_chamadadefuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(Nome);
			setState(360);
			match(T__34);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (T__7 - 8)) | (1L << (T__34 - 8)) | (1L << (T__36 - 8)) | (1L << (T__37 - 8)) | (1L << (T__38 - 8)) | (1L << (T__40 - 8)) | (1L << (T__60 - 8)) | (1L << (T__61 - 8)) | (1L << (Numero - 8)) | (1L << (String - 8)) | (1L << (Nome - 8)))) != 0)) {
				{
				setState(361);
				listaexp();
				}
			}

			setState(364);
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
		enterRule(_localctx, 34, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__34);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__28 - 28)) | (1L << (T__29 - 28)) | (1L << (T__30 - 28)) | (1L << (T__31 - 28)) | (1L << (Nome - 28)))) != 0)) {
				{
				setState(367);
				listapar();
				}
			}

			setState(370);
			match(T__35);
			setState(371);
			match(T__23);
			setState(372);
			trecho();
			setState(373);
			match(T__12);
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
		enterRule(_localctx, 36, RULE_listapar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375);
					tipovar();
					setState(376);
					match(Nome);
					setState(377);
					match(T__8);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			setState(384);
			tipovar();
			setState(385);
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
		enterRule(_localctx, 38, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 40, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__60) | (1L << T__61))) != 0)) ) {
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

	public static class OpcomandoContext extends ParserRuleContext {
		public OpcomandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcomando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).enterOpcomando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CaronteListener ) ((CaronteListener)listener).exitOpcomando(this);
		}
	}

	public final OpcomandoContext opcomando() throws RecognitionException {
		OpcomandoContext _localctx = new OpcomandoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_opcomando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_la = _input.LA(1);
			if ( !(_la==T__62 || _la==T__63) ) {
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
		case 13:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u018c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\6\2\60\n\2\r\2"+
		"\16\2\61\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3"+
		"B\13\3\3\3\3\3\5\3F\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16"+
		"\3d\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3o\n\3\3\4\6\4r\n\4\r\4"+
		"\16\4s\3\4\5\4w\n\4\3\4\7\4z\n\4\f\4\16\4}\13\4\3\4\5\4\u0080\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u008d\n\5\r\5\16\5\u008e"+
		"\3\5\3\5\5\5\u0093\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009b\n\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00c9\n\5\f\5\16\5\u00cc\13\5\3\5\3\5\5"+
		"\5\u00d0\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u00d7\n\5\3\5\3\5\3\5\5\5\u00dc\n"+
		"\5\3\5\3\5\5\5\u00e0\n\5\3\5\3\5\5\5\u00e4\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f8\n\5\3\6\3\6"+
		"\5\6\u00fc\n\6\3\6\3\6\3\6\5\6\u0101\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u010a\n\7\3\b\5\b\u010d\n\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\5\n\u0116\n"+
		"\n\3\13\3\13\3\13\7\13\u011b\n\13\f\13\16\13\u011e\13\13\3\f\3\f\3\f\7"+
		"\f\u0123\n\f\f\f\16\f\u0126\13\f\3\f\3\f\3\f\3\f\3\f\7\f\u012d\n\f\f\f"+
		"\16\f\u0130\13\f\7\f\u0132\n\f\f\f\16\f\u0135\13\f\3\f\3\f\3\f\3\f\5\f"+
		"\u013b\n\f\3\r\3\r\3\r\7\r\u0140\n\r\f\r\16\r\u0143\13\r\3\16\3\16\3\16"+
		"\7\16\u0148\n\16\f\16\16\16\u014b\13\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0159\n\17\3\17\3\17\3\17\3\17\7\17"+
		"\u015f\n\17\f\17\16\17\u0162\13\17\3\20\3\20\3\21\3\21\5\21\u0168\n\21"+
		"\3\22\3\22\3\22\5\22\u016d\n\22\3\22\3\22\3\23\3\23\5\23\u0173\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u017e\n\24\f\24\16\24"+
		"\u0181\13\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\2\3\34"+
		"\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\4\2\36\"FF\4\2"+
		"\')DE\3\2*>\4\2++?@\3\2AB\2\u01af\2/\3\2\2\2\4n\3\2\2\2\6\177\3\2\2\2"+
		"\b\u00f7\3\2\2\2\n\u0100\3\2\2\2\f\u0109\3\2\2\2\16\u010c\3\2\2\2\20\u0111"+
		"\3\2\2\2\22\u0115\3\2\2\2\24\u0117\3\2\2\2\26\u013a\3\2\2\2\30\u013c\3"+
		"\2\2\2\32\u0149\3\2\2\2\34\u0158\3\2\2\2\36\u0163\3\2\2\2 \u0167\3\2\2"+
		"\2\"\u0169\3\2\2\2$\u0170\3\2\2\2&\u017f\3\2\2\2(\u0185\3\2\2\2*\u0187"+
		"\3\2\2\2,\u0189\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2"+
		"\2\61\62\3\2\2\2\62\3\3\2\2\2\63\64\5\26\f\2\64\65\5\f\7\2\65\66\5\34"+
		"\17\2\66\67\7\3\2\2\67o\3\2\2\289\7\4\2\29:\5\20\t\2:@\5\26\f\2;<\7\5"+
		"\2\2<=\7C\2\2=?\7\6\2\2>;\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AE\3\2"+
		"\2\2B@\3\2\2\2CD\7\7\2\2DF\5\34\17\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7"+
		"\3\2\2Ho\3\2\2\2IJ\5\20\t\2JM\5\26\f\2KL\7\7\2\2LN\5\34\17\2MK\3\2\2\2"+
		"MN\3\2\2\2NO\3\2\2\2OP\7\3\2\2Po\3\2\2\2QR\7\b\2\2RS\5\26\f\2ST\7\7\2"+
		"\2TU\5\34\17\2UV\7\3\2\2Vo\3\2\2\2WX\7\t\2\2XY\7F\2\2YZ\7\n\2\2Z[\5\20"+
		"\t\2[b\7F\2\2\\]\7\13\2\2]^\5\20\t\2^_\7F\2\2_a\3\2\2\2`\\\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\f\2\2fg\7\3\2\2go\3"+
		"\2\2\2hi\5\16\b\2ij\5$\23\2jo\3\2\2\2kl\7\r\2\2lm\7F\2\2mo\5\36\20\2n"+
		"\63\3\2\2\2n8\3\2\2\2nI\3\2\2\2nQ\3\2\2\2nW\3\2\2\2nh\3\2\2\2nk\3\2\2"+
		"\2o\5\3\2\2\2pr\5\b\5\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2"+
		"\2\2uw\5\n\6\2vu\3\2\2\2vw\3\2\2\2w\u0080\3\2\2\2xz\5\b\5\2yx\3\2\2\2"+
		"z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\u0080\5\n\6\2\177"+
		"q\3\2\2\2\177{\3\2\2\2\u0080\7\3\2\2\2\u0081\u0082\5\26\f\2\u0082\u0083"+
		"\5\f\7\2\u0083\u0084\5\34\17\2\u0084\u0085\7\3\2\2\u0085\u00f8\3\2\2\2"+
		"\u0086\u0087\7\4\2\2\u0087\u0088\5\20\t\2\u0088\u008c\7F\2\2\u0089\u008a"+
		"\7\5\2\2\u008a\u008b\7C\2\2\u008b\u008d\7\6\2\2\u008c\u0089\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u0091\7\7\2\2\u0091\u0093\5\34\17\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\3\2\2\u0095\u00f8\3\2"+
		"\2\2\u0096\u0097\5\20\t\2\u0097\u009a\7F\2\2\u0098\u0099\7\7\2\2\u0099"+
		"\u009b\5\34\17\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3"+
		"\2\2\2\u009c\u009d\7\3\2\2\u009d\u00f8\3\2\2\2\u009e\u009f\7\b\2\2\u009f"+
		"\u00a0\7F\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\5\34\17\2\u00a2\u00a3\7"+
		"\3\2\2\u00a3\u00f8\3\2\2\2\u00a4\u00a5\5,\27\2\u00a5\u00a6\5\26\f\2\u00a6"+
		"\u00a7\7\3\2\2\u00a7\u00f8\3\2\2\2\u00a8\u00a9\5\26\f\2\u00a9\u00aa\5"+
		",\27\2\u00aa\u00ab\7\3\2\2\u00ab\u00f8\3\2\2\2\u00ac\u00ad\5\"\22\2\u00ad"+
		"\u00ae\7\3\2\2\u00ae\u00f8\3\2\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\5"+
		"\6\4\2\u00b1\u00b2\7\17\2\2\u00b2\u00f8\3\2\2\2\u00b3\u00b4\7\20\2\2\u00b4"+
		"\u00b5\5\34\17\2\u00b5\u00b6\7\16\2\2\u00b6\u00b7\5\6\4\2\u00b7\u00b8"+
		"\7\17\2\2\u00b8\u00f8\3\2\2\2\u00b9\u00ba\7\21\2\2\u00ba\u00bb\5\6\4\2"+
		"\u00bb\u00bc\7\22\2\2\u00bc\u00bd\5\34\17\2\u00bd\u00be\7\3\2\2\u00be"+
		"\u00f8\3\2\2\2\u00bf\u00c0\7\23\2\2\u00c0\u00c1\5\34\17\2\u00c1\u00c2"+
		"\7\24\2\2\u00c2\u00ca\5\6\4\2\u00c3\u00c4\7\25\2\2\u00c4\u00c5\5\34\17"+
		"\2\u00c5\u00c6\7\24\2\2\u00c6\u00c7\5\6\4\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c3\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cf\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\26\2\2\u00ce"+
		"\u00d0\5\6\4\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\7\17\2\2\u00d2\u00f8\3\2\2\2\u00d3\u00db\7\27\2\2\u00d4"+
		"\u00d7\5\20\t\2\u00d5\u00d7\7\b\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7F\2\2\u00d9\u00da\7\7\2\2\u00da"+
		"\u00dc\5\34\17\2\u00db\u00d6\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3"+
		"\2\2\2\u00dd\u00df\7\3\2\2\u00de\u00e0\5\34\17\2\u00df\u00de\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7\3\2\2\u00e2\u00e4\5\34"+
		"\17\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\7\16\2\2\u00e6\u00e7\5\6\4\2\u00e7\u00e8\7\17\2\2\u00e8\u00f8\3"+
		"\2\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\5\30\r\2\u00eb\u00ec\7\30\2\2"+
		"\u00ec\u00ed\5\32\16\2\u00ed\u00ee\7\16\2\2\u00ee\u00ef\5\6\4\2\u00ef"+
		"\u00f0\7\17\2\2\u00f0\u00f8\3\2\2\2\u00f1\u00f2\7\31\2\2\u00f2\u00f3\7"+
		"F\2\2\u00f3\u00f8\7\3\2\2\u00f4\u00f5\7F\2\2\u00f5\u00f6\7\32\2\2\u00f6"+
		"\u00f8\5\b\5\2\u00f7\u0081\3\2\2\2\u00f7\u0086\3\2\2\2\u00f7\u0096\3\2"+
		"\2\2\u00f7\u009e\3\2\2\2\u00f7\u00a4\3\2\2\2\u00f7\u00a8\3\2\2\2\u00f7"+
		"\u00ac\3\2\2\2\u00f7\u00af\3\2\2\2\u00f7\u00b3\3\2\2\2\u00f7\u00b9\3\2"+
		"\2\2\u00f7\u00bf\3\2\2\2\u00f7\u00d3\3\2\2\2\u00f7\u00e9\3\2\2\2\u00f7"+
		"\u00f1\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\t\3\2\2\2\u00f9\u00fb\7\33\2"+
		"\2\u00fa\u00fc\5\32\16\2\u00fb\u00fa\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0101\7\3\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0101\7"+
		"\3\2\2\u0100\u00f9\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\13\3\2\2\2\u0102"+
		"\u0103\7\13\2\2\u0103\u0104\5\26\f\2\u0104\u0105\5\f\7\2\u0105\u0106\5"+
		"\34\17\2\u0106\u0107\7\13\2\2\u0107\u010a\3\2\2\2\u0108\u010a\7\7\2\2"+
		"\u0109\u0102\3\2\2\2\u0109\u0108\3\2\2\2\u010a\r\3\2\2\2\u010b\u010d\7"+
		"\35\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\5\22\n\2\u010f\u0110\7F\2\2\u0110\17\3\2\2\2\u0111\u0112\t\2\2"+
		"\2\u0112\21\3\2\2\2\u0113\u0116\5\20\t\2\u0114\u0116\7#\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0114\3\2\2\2\u0116\23\3\2\2\2\u0117\u011c\5\26\f\2\u0118"+
		"\u0119\7\13\2\2\u0119\u011b\5\26\f\2\u011a\u0118\3\2\2\2\u011b\u011e\3"+
		"\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\25\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0124\7F\2\2\u0120\u0121\7$\2\2\u0121\u0123\7F\2"+
		"\2\u0122\u0120\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0133\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u0128\7\5\2\2\u0128"+
		"\u0129\7C\2\2\u0129\u012e\7\6\2\2\u012a\u012b\7$\2\2\u012b\u012d\7F\2"+
		"\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0127\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u013b\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\n\2\2\u0137\u0138\5\24\13\2\u0138"+
		"\u0139\7\f\2\2\u0139\u013b\3\2\2\2\u013a\u011f\3\2\2\2\u013a\u0136\3\2"+
		"\2\2\u013b\27\3\2\2\2\u013c\u0141\7F\2\2\u013d\u013e\7\13\2\2\u013e\u0140"+
		"\7F\2\2\u013f\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\31\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\5\34\17"+
		"\2\u0145\u0146\7\13\2\2\u0146\u0148\3\2\2\2\u0147\u0144\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2"+
		"\2\2\u014b\u0149\3\2\2\2\u014c\u014d\5\34\17\2\u014d\33\3\2\2\2\u014e"+
		"\u014f\b\17\1\2\u014f\u0159\5\36\20\2\u0150\u0159\5 \21\2\u0151\u0152"+
		"\5*\26\2\u0152\u0153\5\34\17\4\u0153\u0159\3\2\2\2\u0154\u0155\7%\2\2"+
		"\u0155\u0156\5\34\17\2\u0156\u0157\7&\2\2\u0157\u0159\3\2\2\2\u0158\u014e"+
		"\3\2\2\2\u0158\u0150\3\2\2\2\u0158\u0151\3\2\2\2\u0158\u0154\3\2\2\2\u0159"+
		"\u0160\3\2\2\2\u015a\u015b\f\5\2\2\u015b\u015c\5(\25\2\u015c\u015d\5\34"+
		"\17\6\u015d\u015f\3\2\2\2\u015e\u015a\3\2\2\2\u015f\u0162\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\35\3\2\2\2\u0162\u0160\3\2\2"+
		"\2\u0163\u0164\t\3\2\2\u0164\37\3\2\2\2\u0165\u0168\5\26\f\2\u0166\u0168"+
		"\5\"\22\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168!\3\2\2\2\u0169"+
		"\u016a\7F\2\2\u016a\u016c\7%\2\2\u016b\u016d\5\32\16\2\u016c\u016b\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7&\2\2\u016f"+
		"#\3\2\2\2\u0170\u0172\7%\2\2\u0171\u0173\5&\24\2\u0172\u0171\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7&\2\2\u0175\u0176\7\32"+
		"\2\2\u0176\u0177\5\6\4\2\u0177\u0178\7\17\2\2\u0178%\3\2\2\2\u0179\u017a"+
		"\5\20\t\2\u017a\u017b\7F\2\2\u017b\u017c\7\13\2\2\u017c\u017e\3\2\2\2"+
		"\u017d\u0179\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0183\5\20\t\2"+
		"\u0183\u0184\7F\2\2\u0184\'\3\2\2\2\u0185\u0186\t\4\2\2\u0186)\3\2\2\2"+
		"\u0187\u0188\t\5\2\2\u0188+\3\2\2\2\u0189\u018a\t\6\2\2\u018a-\3\2\2\2"+
		"(\61@EMbnsv{\177\u008e\u0092\u009a\u00ca\u00cf\u00d6\u00db\u00df\u00e3"+
		"\u00f7\u00fb\u0100\u0109\u010c\u0115\u011c\u0124\u012e\u0133\u013a\u0141"+
		"\u0149\u0158\u0160\u0167\u016c\u0172\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}