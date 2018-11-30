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
	 * Enter a parse tree produced by the {@code a}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterA(CaronteParser.AContext ctx);
	/**
	 * Exit a parse tree produced by the {@code a}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitA(CaronteParser.AContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structOrArrayDeclaration}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterStructOrArrayDeclaration(CaronteParser.StructOrArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structOrArrayDeclaration}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitStructOrArrayDeclaration(CaronteParser.StructOrArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(CaronteParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(CaronteParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defineDeclaration}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterDefineDeclaration(CaronteParser.DefineDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defineDeclaration}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitDefineDeclaration(CaronteParser.DefineDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link CaronteParser#erro_ponto_virgula}.
	 * @param ctx the parse tree
	 */
	void enterErro_ponto_virgula(CaronteParser.Erro_ponto_virgulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#erro_ponto_virgula}.
	 * @param ctx the parse tree
	 */
	void exitErro_ponto_virgula(CaronteParser.Erro_ponto_virgulaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code do}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void enterDo(CaronteParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code do}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void exitDo(CaronteParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void enterWhile(CaronteParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void exitWhile(CaronteParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(CaronteParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repeat}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(CaronteParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void enterIf(CaronteParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void exitIf(CaronteParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void enterFor(CaronteParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void exitFor(CaronteParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forInutil}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void enterForInutil(CaronteParser.ForInutilContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forInutil}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void exitForInutil(CaronteParser.ForInutilContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goto}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void enterGoto(CaronteParser.GotoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goto}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void exitGoto(CaronteParser.GotoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code label}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void enterLabel(CaronteParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code label}
	 * labeled alternative in {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 */
	void exitLabel(CaronteParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atrib}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(CaronteParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atrib}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(CaronteParser.AtribContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclaration(CaronteParser.ArrayDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclaration(CaronteParser.ArrayDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void enterTypedDeclaration(CaronteParser.TypedDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void exitTypedDeclaration(CaronteParser.TypedDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code autoDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void enterAutoDeclaration(CaronteParser.AutoDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code autoDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void exitAutoDeclaration(CaronteParser.AutoDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void enterErrorDeclaration(CaronteParser.ErrorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 */
	void exitErrorDeclaration(CaronteParser.ErrorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#erro_var_declaracao}.
	 * @param ctx the parse tree
	 */
	void enterErro_var_declaracao(CaronteParser.Erro_var_declaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#erro_var_declaracao}.
	 * @param ctx the parse tree
	 */
	void exitErro_var_declaracao(CaronteParser.Erro_var_declaracaoContext ctx);
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
	 * Enter a parse tree produced by {@link CaronteParser#erro_inline_fastcall}.
	 * @param ctx the parse tree
	 */
	void enterErro_inline_fastcall(CaronteParser.Erro_inline_fastcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#erro_inline_fastcall}.
	 * @param ctx the parse tree
	 */
	void exitErro_inline_fastcall(CaronteParser.Erro_inline_fastcallContext ctx);
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
	 * Enter a parse tree produced by the {@code expListExp}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpListExp(CaronteParser.ExpListExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expListExp}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpListExp(CaronteParser.ExpListExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBinExp(CaronteParser.BinExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binExp}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBinExp(CaronteParser.BinExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unariaExp}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterUnariaExp(CaronteParser.UnariaExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unariaExp}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitUnariaExp(CaronteParser.UnariaExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expValues}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpValues(CaronteParser.ExpValuesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expValues}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpValues(CaronteParser.ExpValuesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paraExp}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParaExp(CaronteParser.ParaExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraExp}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParaExp(CaronteParser.ParaExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expPrefix}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExpPrefix(CaronteParser.ExpPrefixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expPrefix}
	 * labeled alternative in {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExpPrefix(CaronteParser.ExpPrefixContext ctx);
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
	 * Enter a parse tree produced by {@link CaronteParser#opbin2}.
	 * @param ctx the parse tree
	 */
	void enterOpbin2(CaronteParser.Opbin2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#opbin2}.
	 * @param ctx the parse tree
	 */
	void exitOpbin2(CaronteParser.Opbin2Context ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#opbin3}.
	 * @param ctx the parse tree
	 */
	void enterOpbin3(CaronteParser.Opbin3Context ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#opbin3}.
	 * @param ctx the parse tree
	 */
	void exitOpbin3(CaronteParser.Opbin3Context ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#opbin4}.
	 * @param ctx the parse tree
	 */
	void enterOpbin4(CaronteParser.Opbin4Context ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#opbin4}.
	 * @param ctx the parse tree
	 */
	void exitOpbin4(CaronteParser.Opbin4Context ctx);
	/**
	 * Enter a parse tree produced by {@link CaronteParser#opbin5}.
	 * @param ctx the parse tree
	 */
	void enterOpbin5(CaronteParser.Opbin5Context ctx);
	/**
	 * Exit a parse tree produced by {@link CaronteParser#opbin5}.
	 * @param ctx the parse tree
	 */
	void exitOpbin5(CaronteParser.Opbin5Context ctx);
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