// Generated from /Users/juanpabloovallesanchez/Documents/esteSiFueLenguajes/grammar/python.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pythonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pythonParser#single_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_input(pythonParser.Single_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#file_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_input(pythonParser.File_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#eval_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEval_input(pythonParser.Eval_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(pythonParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#decorated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorated(pythonParser.DecoratedContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#async_funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_funcdef(pythonParser.Async_funcdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(pythonParser.FuncdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(pythonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#typedargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedargslist(pythonParser.TypedargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#tfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTfpdef(pythonParser.TfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#varargslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarargslist(pythonParser.VarargslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#vfpdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVfpdef(pythonParser.VfpdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(pythonParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(pythonParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(pythonParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#annassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnassign(pythonParser.AnnassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_star_expr(pythonParser.Testlist_star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#augassign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAugassign(pythonParser.AugassignContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#del_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDel_stmt(pythonParser.Del_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPass_stmt(pythonParser.Pass_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlow_stmt(pythonParser.Flow_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(pythonParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(pythonParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(pythonParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_stmt(pythonParser.Yield_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_stmt(pythonParser.Raise_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#import_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_name(pythonParser.Import_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#import_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_from(pythonParser.Import_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#import_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_name(pythonParser.Import_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_name(pythonParser.Dotted_as_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#import_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_as_names(pythonParser.Import_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_as_names(pythonParser.Dotted_as_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dotted_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotted_name(pythonParser.Dotted_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#global_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_stmt(pythonParser.Global_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_stmt(pythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssert_stmt(pythonParser.Assert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_stmt(pythonParser.Compound_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#async_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsync_stmt(pythonParser.Async_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#while_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#for_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#try_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_stmt(pythonParser.Try_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#with_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_stmt(pythonParser.With_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#with_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_item(pythonParser.With_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#except_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExcept_clause(pythonParser.Except_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest(pythonParser.TestContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#test_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTest_nocond(pythonParser.Test_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#lambdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef(pythonParser.LambdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdef_nocond(pythonParser.Lambdef_nocondContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#or_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_test(pythonParser.Or_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#and_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_test(pythonParser.And_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#not_test}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_test(pythonParser.Not_testContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(pythonParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#star_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar_expr(pythonParser.Star_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(pythonParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#xor_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor_expr(pythonParser.Xor_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#and_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_expr(pythonParser.And_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#shift_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShift_expr(pythonParser.Shift_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#arith_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_expr(pythonParser.Arith_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(pythonParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(pythonParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#power}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(pythonParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#atom_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_expr(pythonParser.Atom_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(pythonParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist_comp(pythonParser.Testlist_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscriptlist(pythonParser.SubscriptlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#subscript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(pythonParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#sliceop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSliceop(pythonParser.SliceopContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#exprlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprlist(pythonParser.ExprlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#testlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestlist(pythonParser.TestlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictorsetmaker(pythonParser.DictorsetmakerContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#classdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassdef(pythonParser.ClassdefContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#arglist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArglist(pythonParser.ArglistContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comp_iter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_iter(pythonParser.Comp_iterContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comp_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_for(pythonParser.Comp_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#comp_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_if(pythonParser.Comp_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#encoding_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncoding_decl(pythonParser.Encoding_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#yield_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_expr(pythonParser.Yield_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pythonParser#yield_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYield_arg(pythonParser.Yield_argContext ctx);
}