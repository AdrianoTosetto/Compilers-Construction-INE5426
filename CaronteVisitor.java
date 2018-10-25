// Generated from Caronte.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CaronteParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CaronteVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CaronteParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(CaronteParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code a}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitA(CaronteParser.AContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structOrArrayDeclaration}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrArrayDeclaration(CaronteParser.StructOrArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclaration}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(CaronteParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defineDeclaration}
	 * labeled alternative in {@link CaronteParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineDeclaration(CaronteParser.DefineDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#trecho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrecho(CaronteParser.TrechoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(CaronteParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#erro_ponto_virgula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErro_ponto_virgula(CaronteParser.Erro_ponto_virgulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#comandobloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandobloco(CaronteParser.ComandoblocoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atrib}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtrib(CaronteParser.AtribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(CaronteParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedDeclaration(CaronteParser.TypedDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code autoDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoDeclaration(CaronteParser.AutoDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorDeclaration}
	 * labeled alternative in {@link CaronteParser#comandoexpressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorDeclaration(CaronteParser.ErrorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#erro_var_declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErro_var_declaracao(CaronteParser.Erro_var_declaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#comandounico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandounico(CaronteParser.ComandounicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#ultimocomando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUltimocomando(CaronteParser.UltimocomandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#listaatri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaatri(CaronteParser.ListaatriContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#nomedafuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomedafuncao(CaronteParser.NomedafuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#erro_inline_fastcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErro_inline_fastcall(CaronteParser.Erro_inline_fastcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#tipovar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipovar(CaronteParser.TipovarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#tiporet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiporet(CaronteParser.TiporetContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#listavar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListavar(CaronteParser.ListavarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(CaronteParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#listadenomes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListadenomes(CaronteParser.ListadenomesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#listaexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaexp(CaronteParser.ListaexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CaronteParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores(CaronteParser.ValoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#expprefixo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpprefixo(CaronteParser.ExpprefixoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#chamadadefuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChamadadefuncao(CaronteParser.ChamadadefuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#corpodafuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpodafuncao(CaronteParser.CorpodafuncaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#listapar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListapar(CaronteParser.ListaparContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#opbin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpbin(CaronteParser.OpbinContext ctx);
	/**
	 * Visit a parse tree produced by {@link CaronteParser#opunaria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpunaria(CaronteParser.OpunariaContext ctx);
}