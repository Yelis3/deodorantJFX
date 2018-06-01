// Generated from /Users/juanpabloovallesanchez/Documents/esteSiFueLenguajes/grammar/python.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pythonParser}.
 */
public interface pythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void enterSingle_input(pythonParser.Single_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#single_input}.
	 * @param ctx the parse tree
	 */
	void exitSingle_input(pythonParser.Single_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void enterFile_input(pythonParser.File_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#file_input}.
	 * @param ctx the parse tree
	 */
	void exitFile_input(pythonParser.File_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void enterEval_input(pythonParser.Eval_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#eval_input}.
	 * @param ctx the parse tree
	 */
	void exitEval_input(pythonParser.Eval_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(pythonParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(pythonParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(pythonParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void enterDecorated(pythonParser.DecoratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#decorated}.
	 * @param ctx the parse tree
	 */
	void exitDecorated(pythonParser.DecoratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void enterAsync_funcdef(pythonParser.Async_funcdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#async_funcdef}.
	 * @param ctx the parse tree
	 */
	void exitAsync_funcdef(pythonParser.Async_funcdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(pythonParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(pythonParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(pythonParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(pythonParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void enterTypedargslist(pythonParser.TypedargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#typedargslist}.
	 * @param ctx the parse tree
	 */
	void exitTypedargslist(pythonParser.TypedargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void enterTfpdef(pythonParser.TfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#tfpdef}.
	 * @param ctx the parse tree
	 */
	void exitTfpdef(pythonParser.TfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void enterVarargslist(pythonParser.VarargslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#varargslist}.
	 * @param ctx the parse tree
	 */
	void exitVarargslist(pythonParser.VarargslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void enterVfpdef(pythonParser.VfpdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#vfpdef}.
	 * @param ctx the parse tree
	 */
	void exitVfpdef(pythonParser.VfpdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(pythonParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(pythonParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(pythonParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(pythonParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(pythonParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(pythonParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(pythonParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#annassign}.
	 * @param ctx the parse tree
	 */
	void enterAnnassign(pythonParser.AnnassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#annassign}.
	 * @param ctx the parse tree
	 */
	void exitAnnassign(pythonParser.AnnassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_star_expr(pythonParser.Testlist_star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#testlist_star_expr}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_star_expr(pythonParser.Testlist_star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void enterAugassign(pythonParser.AugassignContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#augassign}.
	 * @param ctx the parse tree
	 */
	void exitAugassign(pythonParser.AugassignContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDel_stmt(pythonParser.Del_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#del_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDel_stmt(pythonParser.Del_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPass_stmt(pythonParser.Pass_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#pass_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPass_stmt(pythonParser.Pass_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFlow_stmt(pythonParser.Flow_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#flow_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFlow_stmt(pythonParser.Flow_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(pythonParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(pythonParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(pythonParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(pythonParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(pythonParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(pythonParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void enterYield_stmt(pythonParser.Yield_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#yield_stmt}.
	 * @param ctx the parse tree
	 */
	void exitYield_stmt(pythonParser.Yield_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRaise_stmt(pythonParser.Raise_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#raise_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRaise_stmt(pythonParser.Raise_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(pythonParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#import_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_name(pythonParser.Import_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#import_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_name(pythonParser.Import_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#import_from}.
	 * @param ctx the parse tree
	 */
	void enterImport_from(pythonParser.Import_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#import_from}.
	 * @param ctx the parse tree
	 */
	void exitImport_from(pythonParser.Import_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_name(pythonParser.Import_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#import_as_name}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_name(pythonParser.Import_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_name(pythonParser.Dotted_as_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dotted_as_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_name(pythonParser.Dotted_as_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void enterImport_as_names(pythonParser.Import_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#import_as_names}.
	 * @param ctx the parse tree
	 */
	void exitImport_as_names(pythonParser.Import_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void enterDotted_as_names(pythonParser.Dotted_as_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dotted_as_names}.
	 * @param ctx the parse tree
	 */
	void exitDotted_as_names(pythonParser.Dotted_as_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void enterDotted_name(pythonParser.Dotted_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dotted_name}.
	 * @param ctx the parse tree
	 */
	void exitDotted_name(pythonParser.Dotted_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_stmt(pythonParser.Global_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#global_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_stmt(pythonParser.Global_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_stmt(pythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#nonlocal_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_stmt(pythonParser.Nonlocal_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssert_stmt(pythonParser.Assert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#assert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssert_stmt(pythonParser.Assert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_stmt(pythonParser.Compound_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_stmt(pythonParser.Compound_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAsync_stmt(pythonParser.Async_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#async_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAsync_stmt(pythonParser.Async_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(pythonParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(pythonParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#for_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_stmt(pythonParser.For_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTry_stmt(pythonParser.Try_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#try_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTry_stmt(pythonParser.Try_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWith_stmt(pythonParser.With_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#with_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWith_stmt(pythonParser.With_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void enterWith_item(pythonParser.With_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#with_item}.
	 * @param ctx the parse tree
	 */
	void exitWith_item(pythonParser.With_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void enterExcept_clause(pythonParser.Except_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#except_clause}.
	 * @param ctx the parse tree
	 */
	void exitExcept_clause(pythonParser.Except_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(pythonParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(pythonParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(pythonParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(pythonParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void enterTest_nocond(pythonParser.Test_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#test_nocond}.
	 * @param ctx the parse tree
	 */
	void exitTest_nocond(pythonParser.Test_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void enterLambdef(pythonParser.LambdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#lambdef}.
	 * @param ctx the parse tree
	 */
	void exitLambdef(pythonParser.LambdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void enterLambdef_nocond(pythonParser.Lambdef_nocondContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#lambdef_nocond}.
	 * @param ctx the parse tree
	 */
	void exitLambdef_nocond(pythonParser.Lambdef_nocondContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void enterOr_test(pythonParser.Or_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#or_test}.
	 * @param ctx the parse tree
	 */
	void exitOr_test(pythonParser.Or_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void enterAnd_test(pythonParser.And_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#and_test}.
	 * @param ctx the parse tree
	 */
	void exitAnd_test(pythonParser.And_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void enterNot_test(pythonParser.Not_testContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#not_test}.
	 * @param ctx the parse tree
	 */
	void exitNot_test(pythonParser.Not_testContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(pythonParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(pythonParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(pythonParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void enterStar_expr(pythonParser.Star_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#star_expr}.
	 * @param ctx the parse tree
	 */
	void exitStar_expr(pythonParser.Star_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(pythonParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(pythonParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void enterXor_expr(pythonParser.Xor_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#xor_expr}.
	 * @param ctx the parse tree
	 */
	void exitXor_expr(pythonParser.Xor_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(pythonParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(pythonParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_expr(pythonParser.Shift_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_expr(pythonParser.Shift_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(pythonParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(pythonParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pythonParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pythonParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(pythonParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(pythonParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#power}.
	 * @param ctx the parse tree
	 */
	void enterPower(pythonParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#power}.
	 * @param ctx the parse tree
	 */
	void exitPower(pythonParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void enterAtom_expr(pythonParser.Atom_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#atom_expr}.
	 * @param ctx the parse tree
	 */
	void exitAtom_expr(pythonParser.Atom_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(pythonParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(pythonParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void enterTestlist_comp(pythonParser.Testlist_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#testlist_comp}.
	 * @param ctx the parse tree
	 */
	void exitTestlist_comp(pythonParser.Testlist_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void enterTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#trailer}.
	 * @param ctx the parse tree
	 */
	void exitTrailer(pythonParser.TrailerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptlist(pythonParser.SubscriptlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#subscriptlist}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptlist(pythonParser.SubscriptlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(pythonParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(pythonParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void enterSliceop(pythonParser.SliceopContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#sliceop}.
	 * @param ctx the parse tree
	 */
	void exitSliceop(pythonParser.SliceopContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(pythonParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(pythonParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void enterTestlist(pythonParser.TestlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#testlist}.
	 * @param ctx the parse tree
	 */
	void exitTestlist(pythonParser.TestlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void enterDictorsetmaker(pythonParser.DictorsetmakerContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#dictorsetmaker}.
	 * @param ctx the parse tree
	 */
	void exitDictorsetmaker(pythonParser.DictorsetmakerContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void enterClassdef(pythonParser.ClassdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#classdef}.
	 * @param ctx the parse tree
	 */
	void exitClassdef(pythonParser.ClassdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(pythonParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(pythonParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(pythonParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void enterComp_iter(pythonParser.Comp_iterContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comp_iter}.
	 * @param ctx the parse tree
	 */
	void exitComp_iter(pythonParser.Comp_iterContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void enterComp_for(pythonParser.Comp_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comp_for}.
	 * @param ctx the parse tree
	 */
	void exitComp_for(pythonParser.Comp_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void enterComp_if(pythonParser.Comp_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#comp_if}.
	 * @param ctx the parse tree
	 */
	void exitComp_if(pythonParser.Comp_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void enterEncoding_decl(pythonParser.Encoding_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#encoding_decl}.
	 * @param ctx the parse tree
	 */
	void exitEncoding_decl(pythonParser.Encoding_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void enterYield_expr(pythonParser.Yield_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#yield_expr}.
	 * @param ctx the parse tree
	 */
	void exitYield_expr(pythonParser.Yield_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void enterYield_arg(pythonParser.Yield_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link pythonParser#yield_arg}.
	 * @param ctx the parse tree
	 */
	void exitYield_arg(pythonParser.Yield_argContext ctx);
}