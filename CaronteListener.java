// Generated from Caronte.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CaronteParser}.
 */
public interface CaronteListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CaronteParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(CaronteParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(CaronteParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(CaronteParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(CaronteParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#trecho}.
	 * @param ctx the parse tree
	 */
	void enterTrecho(CaronteParser.TrechoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#trecho}.
	 * @param ctx the parse tree
	 */
	void exitTrecho(CaronteParser.TrechoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(CaronteParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(CaronteParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void enterComandobloco(CaronteParser.ComandoblocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void exitComandobloco(CaronteParser.ComandoblocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void enterComandoexpressao(CaronteParser.ComandoexpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void exitComandoexpressao(CaronteParser.ComandoexpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#comandounico}.
	 * @param ctx the parse tree
	 */
	void enterComandounico(CaronteParser.ComandounicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#comandounico}.
	 * @param ctx the parse tree
	 */
	void exitComandounico(CaronteParser.ComandounicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#ultimocomando}.
	 * @param ctx the parse tree
	 */
	void enterUltimocomando(CaronteParser.UltimocomandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#ultimocomando}.
	 * @param ctx the parse tree
	 */
	void exitUltimocomando(CaronteParser.UltimocomandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#listaatri}.
	 * @param ctx the parse tree
	 */
	void enterListaatri(CaronteParser.ListaatriContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#listaatri}.
	 * @param ctx the parse tree
	 */
	void exitListaatri(CaronteParser.ListaatriContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void enterNomedafuncao(CaronteParser.NomedafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#nomedafuncao}.
	 * @param ctx the parse tree
	 */
	void exitNomedafuncao(CaronteParser.NomedafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#tipovar}.
	 * @param ctx the parse tree
	 */
	void enterTipovar(CaronteParser.TipovarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#tipovar}.
	 * @param ctx the parse tree
	 */
	void exitTipovar(CaronteParser.TipovarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#tiporet}.
	 * @param ctx the parse tree
	 */
	void enterTiporet(CaronteParser.TiporetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#tiporet}.
	 * @param ctx the parse tree
	 */
	void exitTiporet(CaronteParser.TiporetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#listavar}.
	 * @param ctx the parse tree
	 */
	void enterListavar(CaronteParser.ListavarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#listavar}.
	 * @param ctx the parse tree
	 */
	void exitListavar(CaronteParser.ListavarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(CaronteParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(CaronteParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void enterListadenomes(CaronteParser.ListadenomesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#listadenomes}.
	 * @param ctx the parse tree
	 */
	void exitListadenomes(CaronteParser.ListadenomesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void enterListaexp(CaronteParser.ListaexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#listaexp}.
	 * @param ctx the parse tree
	 */
	void exitListaexp(CaronteParser.ListaexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CaronteParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CaronteParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(CaronteParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(CaronteParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void enterExpprefixo(CaronteParser.ExpprefixoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#expprefixo}.
	 * @param ctx the parse tree
	 */
	void exitExpprefixo(CaronteParser.ExpprefixoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadadefuncao(CaronteParser.ChamadadefuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadadefuncao(CaronteParser.ChamadadefuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void enterCorpodafuncao(CaronteParser.CorpodafuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#corpodafuncao}.
	 * @param ctx the parse tree
	 */
	void exitCorpodafuncao(CaronteParser.CorpodafuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#listapar}.
	 * @param ctx the parse tree
	 */
	void enterListapar(CaronteParser.ListaparContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#listapar}.
	 * @param ctx the parse tree
	 */
	void exitListapar(CaronteParser.ListaparContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#opbin}.
	 * @param ctx the parse tree
	 */
	void enterOpbin(CaronteParser.OpbinContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#opbin}.
	 * @param ctx the parse tree
	 */
	void exitOpbin(CaronteParser.OpbinContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#opunaria}.
	 * @param ctx the parse tree
	 */
	void enterOpunaria(CaronteParser.OpunariaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#opunaria}.
	 * @param ctx the parse tree
	 */
	void exitOpunaria(CaronteParser.OpunariaContext ctx);
}