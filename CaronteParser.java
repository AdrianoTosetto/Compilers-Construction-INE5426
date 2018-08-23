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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, Numero=59, 
		String=60, Nome=61, WS=62, COMMENT=63, LINE_COMMENT=64;
	public static final int
		RULE_inicio = 0, RULE_bloco = 1, RULE_trecho = 2, RULE_comando = 3, RULE_ultimocomando = 4, 
		RULE_nomedafuncao = 5, RULE_tipovar = 6, RULE_tiporet = 7, RULE_listavar = 8, 
		RULE_var = 9, RULE_listadenomes = 10, RULE_listaexp = 11, RULE_exp = 12, 
		RULE_valores = 13, RULE_expprefixo = 14, RULE_chamadadefuncao = 15, RULE_corpodafuncao = 16, 
		RULE_listapar = 17, RULE_opbin = 18, RULE_opunaria = 19;
	public static final String[] ruleNames = {
		"inicio", "bloco", "trecho", "comando", "ultimocomando", "nomedafuncao", 
		"tipovar", "tiporet", "listavar", "var", "listadenomes", "listaexp", "exp", 
		"valores", "expprefixo", "chamadadefuncao", "corpodafuncao", "listapar", 
		"opbin", "opunaria"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'define'", "'='", "';'", "'auto'", "'do'", "'end'", "'while'", 
		"'repeat'", "'until'", "'if'", "'then'", "'elseif'", "'else'", "'for'", 
		"'('", "')'", "'in'", "'return'", "'break'", "'goto'", "':'", "'inline'", 
		"'boolean'", "'int'", "'double'", "'float'", "'string'", "'void'", "','", 
		"'...'", "'null'", "'false'", "'true'", "'+'", "'-'", "'*'", "'/'", "'^'", 
		"'%'", "'..'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", 
		"'or'", "'+='", "'-='", "'*='", "'/='", "'^='", "'%='", "'not'", "'#'", 
		"'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "Numero", 
		"String", "Nome", "WS", "COMMENT", "LINE_COMMENT"
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
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				bloco();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << Numero) | (1L << String) | (1L << Nome))) != 0) );
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
		public TrechoContext trecho() {
			return getRuleContext(TrechoContext.class,0);
		}
		public NomedafuncaoContext nomedafuncao() {
			return getRuleContext(NomedafuncaoContext.class,0);
		}
		public CorpodafuncaoContext corpodafuncao() {
			return getRuleContext(CorpodafuncaoContext.class,0);
		}
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
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
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				trecho();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				nomedafuncao();
				setState(47);
				corpodafuncao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(T__0);
				setState(50);
				match(Nome);
				setState(51);
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
		try {
			int _alt;
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(54);
						comando();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(57); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(59);
					ultimocomando();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(62);
						comando();
						}
						} 
					}
					setState(67);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(68);
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
		public ListaexpContext listaexp() {
			return getRuleContext(ListaexpContext.class,0);
		}
		public ListavarContext listavar() {
			return getRuleContext(ListavarContext.class,0);
		}
		public TipovarContext tipovar() {
			return getRuleContext(TipovarContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public ListadenomesContext listadenomes() {
			return getRuleContext(ListadenomesContext.class,0);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(71);
					listavar();
					setState(72);
					match(T__1);
					}
					break;
				}
				setState(76);
				listaexp();
				setState(77);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				tipovar();
				setState(80);
				var();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(81);
					match(T__1);
					setState(82);
					exp(0);
					}
				}

				setState(85);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(T__3);
				setState(88);
				var();
				setState(89);
				match(T__1);
				setState(90);
				exp(0);
				setState(91);
				match(T__2);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				chamadadefuncao();
				setState(94);
				match(T__2);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				match(T__4);
				setState(97);
				trecho();
				setState(98);
				match(T__5);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				match(T__6);
				setState(101);
				exp(0);
				setState(102);
				match(T__4);
				setState(103);
				trecho();
				setState(104);
				match(T__5);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				match(T__7);
				setState(107);
				trecho();
				setState(108);
				match(T__8);
				setState(109);
				exp(0);
				setState(110);
				match(T__2);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				match(T__9);
				setState(113);
				exp(0);
				setState(114);
				match(T__10);
				setState(115);
				trecho();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11) {
					{
					{
					setState(116);
					match(T__11);
					setState(117);
					exp(0);
					setState(118);
					match(T__10);
					setState(119);
					trecho();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(126);
					match(T__12);
					setState(127);
					trecho();
					}
				}

				setState(130);
				match(T__5);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				match(T__13);
				setState(133);
				match(T__14);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
					{
					setState(136);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__22:
					case T__23:
					case T__24:
					case T__25:
					case T__26:
						{
						setState(134);
						tipovar();
						}
						break;
					case T__3:
						{
						setState(135);
						match(T__3);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(138);
					match(Nome);
					setState(139);
					match(T__1);
					setState(140);
					exp(0);
					}
				}

				setState(143);
				match(T__2);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << Numero) | (1L << String) | (1L << Nome))) != 0)) {
					{
					setState(144);
					exp(0);
					}
				}

				setState(147);
				match(T__2);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << Numero) | (1L << String) | (1L << Nome))) != 0)) {
					{
					setState(148);
					exp(0);
					}
				}

				setState(151);
				match(T__15);
				setState(152);
				match(T__4);
				setState(153);
				trecho();
				setState(154);
				match(T__5);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(156);
				match(T__13);
				setState(157);
				match(T__14);
				setState(158);
				listadenomes();
				setState(159);
				match(T__16);
				setState(160);
				listaexp();
				setState(161);
				match(T__15);
				setState(162);
				match(T__4);
				setState(163);
				trecho();
				setState(164);
				match(T__5);
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
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
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
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__17);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << Numero) | (1L << String) | (1L << Nome))) != 0)) {
					{
					setState(169);
					listaexp();
					}
				}

				setState(172);
				match(T__2);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__18);
				setState(174);
				match(T__2);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(T__19);
				setState(176);
				match(Nome);
				setState(177);
				match(T__2);
				}
				break;
			case Nome:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				match(Nome);
				setState(179);
				match(T__20);
				setState(180);
				comando();
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
		enterRule(_localctx, 10, RULE_nomedafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(183);
				match(T__21);
				}
			}

			setState(186);
			tiporet();
			setState(187);
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
		enterRule(_localctx, 12, RULE_tipovar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_tiporet);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				tipovar();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__27);
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
		enterRule(_localctx, 16, RULE_listavar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			var();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(196);
				match(T__28);
				setState(197);
				var();
				}
				}
				setState(202);
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
		public TerminalNode Nome() { return getToken(CaronteParser.Nome, 0); }
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
		enterRule(_localctx, 18, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
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
		enterRule(_localctx, 20, RULE_listadenomes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(Nome);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(206);
				match(T__28);
				setState(207);
				match(Nome);
				}
				}
				setState(212);
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
		enterRule(_localctx, 22, RULE_listaexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					exp(0);
					setState(214);
					match(T__28);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(221);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case Numero:
			case String:
				{
				setState(224);
				valores();
				}
				break;
			case T__29:
				{
				setState(225);
				match(T__29);
				}
				break;
			case Nome:
				{
				setState(226);
				expprefixo();
				}
				break;
			case T__34:
			case T__54:
			case T__55:
			case T__56:
			case T__57:
				{
				setState(227);
				opunaria();
				setState(228);
				exp(2);
				}
				break;
			case T__14:
				{
				setState(230);
				match(T__14);
				setState(231);
				exp(0);
				setState(232);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(236);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(237);
					opbin();
					setState(238);
					exp(4);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 26, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << Numero) | (1L << String))) != 0)) ) {
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
		enterRule(_localctx, 28, RULE_expprefixo);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
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
		enterRule(_localctx, 30, RULE_chamadadefuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(Nome);
			setState(252);
			match(T__14);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << Numero) | (1L << String) | (1L << Nome))) != 0)) {
				{
				setState(253);
				listaexp();
				}
			}

			setState(256);
			match(T__15);
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
		enterRule(_localctx, 32, RULE_corpodafuncao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(T__14);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(259);
				listapar();
				}
			}

			setState(262);
			match(T__15);
			setState(263);
			match(T__20);
			setState(264);
			trecho();
			setState(265);
			match(T__5);
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
		enterRule(_localctx, 34, RULE_listapar);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(267);
					tipovar();
					setState(268);
					match(Nome);
					setState(269);
					match(T__28);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(276);
			tipovar();
			setState(277);
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
		enterRule(_localctx, 36, RULE_opbin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53))) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_opunaria);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57))) != 0)) ) {
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u011e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2,\n\2\r\2\16\2-\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3\67\n\3\3\4\6\4:\n\4\r\4\16\4;\3\4\5\4?\n\4\3\4\7\4B\n"+
		"\4\f\4\16\4E\13\4\3\4\5\4H\n\4\3\5\3\5\3\5\5\5M\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5V\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5|\n\5\f\5\16\5\177\13\5\3\5\3\5\5\5\u0083"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008b\n\5\3\5\3\5\3\5\5\5\u0090\n\5\3"+
		"\5\3\5\5\5\u0094\n\5\3\5\3\5\5\5\u0098\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a9\n\5\3\6\3\6\5\6\u00ad\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00b8\n\6\3\7\5\7\u00bb\n\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\3\t\5\t\u00c4\n\t\3\n\3\n\3\n\7\n\u00c9\n\n\f\n\16"+
		"\n\u00cc\13\n\3\13\3\13\3\f\3\f\3\f\7\f\u00d3\n\f\f\f\16\f\u00d6\13\f"+
		"\3\r\3\r\3\r\7\r\u00db\n\r\f\r\16\r\u00de\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ed\n\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00f3\n\16\f\16\16\16\u00f6\13\16\3\17\3\17\3\20\3\20\5\20"+
		"\u00fc\n\20\3\21\3\21\3\21\5\21\u0101\n\21\3\21\3\21\3\22\3\22\5\22\u0107"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\7\23\u0112\n\23\f\23"+
		"\16\23\u0115\13\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\2\3\32\26\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\6\3\2\31\35\4\2!#=>\3\2"+
		"$8\4\2%%9<\2\u0133\2+\3\2\2\2\4\66\3\2\2\2\6G\3\2\2\2\b\u00a8\3\2\2\2"+
		"\n\u00b7\3\2\2\2\f\u00ba\3\2\2\2\16\u00bf\3\2\2\2\20\u00c3\3\2\2\2\22"+
		"\u00c5\3\2\2\2\24\u00cd\3\2\2\2\26\u00cf\3\2\2\2\30\u00dc\3\2\2\2\32\u00ec"+
		"\3\2\2\2\34\u00f7\3\2\2\2\36\u00fb\3\2\2\2 \u00fd\3\2\2\2\"\u0104\3\2"+
		"\2\2$\u0113\3\2\2\2&\u0119\3\2\2\2(\u011b\3\2\2\2*,\5\4\3\2+*\3\2\2\2"+
		",-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\3\3\2\2\2/\67\5\6\4\2\60\61\5\f\7\2\61"+
		"\62\5\"\22\2\62\67\3\2\2\2\63\64\7\3\2\2\64\65\7?\2\2\65\67\5\34\17\2"+
		"\66/\3\2\2\2\66\60\3\2\2\2\66\63\3\2\2\2\67\5\3\2\2\28:\5\b\5\298\3\2"+
		"\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\n\6\2>=\3\2\2\2>?\3\2"+
		"\2\2?H\3\2\2\2@B\5\b\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FH\5\n\6\2G9\3\2\2\2GC\3\2\2\2H\7\3\2\2\2IJ\5\22\n\2JK\7"+
		"\4\2\2KM\3\2\2\2LI\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\5\30\r\2OP\7\5\2\2P\u00a9"+
		"\3\2\2\2QR\5\16\b\2RU\5\24\13\2ST\7\4\2\2TV\5\32\16\2US\3\2\2\2UV\3\2"+
		"\2\2VW\3\2\2\2WX\7\5\2\2X\u00a9\3\2\2\2YZ\7\6\2\2Z[\5\24\13\2[\\\7\4\2"+
		"\2\\]\5\32\16\2]^\7\5\2\2^\u00a9\3\2\2\2_`\5 \21\2`a\7\5\2\2a\u00a9\3"+
		"\2\2\2bc\7\7\2\2cd\5\6\4\2de\7\b\2\2e\u00a9\3\2\2\2fg\7\t\2\2gh\5\32\16"+
		"\2hi\7\7\2\2ij\5\6\4\2jk\7\b\2\2k\u00a9\3\2\2\2lm\7\n\2\2mn\5\6\4\2no"+
		"\7\13\2\2op\5\32\16\2pq\7\5\2\2q\u00a9\3\2\2\2rs\7\f\2\2st\5\32\16\2t"+
		"u\7\r\2\2u}\5\6\4\2vw\7\16\2\2wx\5\32\16\2xy\7\r\2\2yz\5\6\4\2z|\3\2\2"+
		"\2{v\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0082\3\2\2\2\177}\3\2"+
		"\2\2\u0080\u0081\7\17\2\2\u0081\u0083\5\6\4\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\b\2\2\u0085\u00a9\3\2"+
		"\2\2\u0086\u0087\7\20\2\2\u0087\u008f\7\21\2\2\u0088\u008b\5\16\b\2\u0089"+
		"\u008b\7\6\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008d\7?\2\2\u008d\u008e\7\4\2\2\u008e\u0090\5\32\16\2\u008f"+
		"\u008a\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\5"+
		"\2\2\u0092\u0094\5\32\16\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0097\7\5\2\2\u0096\u0098\5\32\16\2\u0097\u0096\3"+
		"\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\22\2\2\u009a"+
		"\u009b\7\7\2\2\u009b\u009c\5\6\4\2\u009c\u009d\7\b\2\2\u009d\u00a9\3\2"+
		"\2\2\u009e\u009f\7\20\2\2\u009f\u00a0\7\21\2\2\u00a0\u00a1\5\26\f\2\u00a1"+
		"\u00a2\7\23\2\2\u00a2\u00a3\5\30\r\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5"+
		"\7\7\2\2\u00a5\u00a6\5\6\4\2\u00a6\u00a7\7\b\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"L\3\2\2\2\u00a8Q\3\2\2\2\u00a8Y\3\2\2\2\u00a8_\3\2\2\2\u00a8b\3\2\2\2"+
		"\u00a8f\3\2\2\2\u00a8l\3\2\2\2\u00a8r\3\2\2\2\u00a8\u0086\3\2\2\2\u00a8"+
		"\u009e\3\2\2\2\u00a9\t\3\2\2\2\u00aa\u00ac\7\24\2\2\u00ab\u00ad\5\30\r"+
		"\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b8"+
		"\7\5\2\2\u00af\u00b0\7\25\2\2\u00b0\u00b8\7\5\2\2\u00b1\u00b2\7\26\2\2"+
		"\u00b2\u00b3\7?\2\2\u00b3\u00b8\7\5\2\2\u00b4\u00b5\7?\2\2\u00b5\u00b6"+
		"\7\27\2\2\u00b6\u00b8\5\b\5\2\u00b7\u00aa\3\2\2\2\u00b7\u00af\3\2\2\2"+
		"\u00b7\u00b1\3\2\2\2\u00b7\u00b4\3\2\2\2\u00b8\13\3\2\2\2\u00b9\u00bb"+
		"\7\30\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00bd\5\20\t\2\u00bd\u00be\7?\2\2\u00be\r\3\2\2\2\u00bf\u00c0\t"+
		"\2\2\2\u00c0\17\3\2\2\2\u00c1\u00c4\5\16\b\2\u00c2\u00c4\7\36\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\21\3\2\2\2\u00c5\u00ca\5\24\13"+
		"\2\u00c6\u00c7\7\37\2\2\u00c7\u00c9\5\24\13\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\23\3\2\2"+
		"\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7?\2\2\u00ce\25\3\2\2\2\u00cf\u00d4"+
		"\7?\2\2\u00d0\u00d1\7\37\2\2\u00d1\u00d3\7?\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\27\3\2\2"+
		"\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\5\32\16\2\u00d8\u00d9\7\37\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\5\32\16\2\u00e0\31\3\2\2\2\u00e1\u00e2\b\16\1\2\u00e2\u00ed\5\34"+
		"\17\2\u00e3\u00ed\7 \2\2\u00e4\u00ed\5\36\20\2\u00e5\u00e6\5(\25\2\u00e6"+
		"\u00e7\5\32\16\4\u00e7\u00ed\3\2\2\2\u00e8\u00e9\7\21\2\2\u00e9\u00ea"+
		"\5\32\16\2\u00ea\u00eb\7\22\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e1\3\2\2"+
		"\2\u00ec\u00e3\3\2\2\2\u00ec\u00e4\3\2\2\2\u00ec\u00e5\3\2\2\2\u00ec\u00e8"+
		"\3\2\2\2\u00ed\u00f4\3\2\2\2\u00ee\u00ef\f\5\2\2\u00ef\u00f0\5&\24\2\u00f0"+
		"\u00f1\5\32\16\6\u00f1\u00f3\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f3\u00f6\3"+
		"\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\33\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f7\u00f8\t\3\2\2\u00f8\35\3\2\2\2\u00f9\u00fc\5\24\13"+
		"\2\u00fa\u00fc\5 \21\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\37"+
		"\3\2\2\2\u00fd\u00fe\7?\2\2\u00fe\u0100\7\21\2\2\u00ff\u0101\5\30\r\2"+
		"\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103"+
		"\7\22\2\2\u0103!\3\2\2\2\u0104\u0106\7\21\2\2\u0105\u0107\5$\23\2\u0106"+
		"\u0105\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\7\22"+
		"\2\2\u0109\u010a\7\27\2\2\u010a\u010b\5\6\4\2\u010b\u010c\7\b\2\2\u010c"+
		"#\3\2\2\2\u010d\u010e\5\16\b\2\u010e\u010f\7?\2\2\u010f\u0110\7\37\2\2"+
		"\u0110\u0112\3\2\2\2\u0111\u010d\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116"+
		"\u0117\5\16\b\2\u0117\u0118\7?\2\2\u0118%\3\2\2\2\u0119\u011a\t\4\2\2"+
		"\u011a\'\3\2\2\2\u011b\u011c\t\5\2\2\u011c)\3\2\2\2\36-\66;>CGLU}\u0082"+
		"\u008a\u008f\u0093\u0097\u00a8\u00ac\u00b7\u00ba\u00c3\u00ca\u00d4\u00dc"+
		"\u00ec\u00f4\u00fb\u0100\u0106\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}