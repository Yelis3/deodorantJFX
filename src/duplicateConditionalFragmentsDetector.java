import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class duplicateConditionalFragmentsDetector extends pythonBaseListener{
    Boolean isInIf;
    Boolean isInSuite;
    Path path;
    List<String> lines;
    LinkedList<couple<String, Integer>> aux1;
    LinkedList<LinkedList<couple<String, Integer>> > aux2;
    static LinkedList<couple<Integer, LinkedList<LinkedList<couple<String, Integer>> > > > datos1;

    static LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos2;
    static LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos3;
    public duplicateConditionalFragmentsDetector(String input,
                                                 LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos2,
                                                 LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos3) throws IOException {
        this.path = Paths.get(input);
        this.lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        this.isInIf = false;
        this.aux1 = null;
        this.aux2 = null;
        this.datos1 = new LinkedList<couple<Integer, LinkedList<LinkedList<couple<String, Integer>> > > >();;
        this.datos2 = datos2;
        this.datos3 = datos3;
    }

    @Override
    public void enterIf_stmt(pythonParser.If_stmtContext ctx) {
        List<TerminalNode> terminalNodes = new LinkedList<TerminalNode>();
        isInIf = true;
        aux2 = new LinkedList<LinkedList<couple<String, Integer>>>();
    }

    @Override
    public void exitIf_stmt(pythonParser.If_stmtContext ctx) {
        for(LinkedList<couple<String, Integer>> x : aux2) {
            for (couple<String, Integer> y : x)
                System.out.println(y);
            System.out.println();
        }
        System.out.println();
        datos1.add(new couple<Integer, LinkedList<LinkedList<couple<String,Integer>>>>(ctx.getStart().getLine(),aux2));
        isInIf = false;
        //super.exitIf_stmt(ctx);
    }

    @Override
    public void enterSuite(pythonParser.SuiteContext ctx) {
        isInSuite = true;
        if(isInIf){
            aux1 = new LinkedList<couple<String, Integer>>();
        }
//        super.enterSuite(ctx);

    }

    @Override
    public void exitSuite(pythonParser.SuiteContext ctx) {
        if(isInIf) {
            aux1.removeLast();
            aux2.add(aux1);
        }
        isInSuite = false;
//        super.exitSuite(ctx);
    }


    @Override
    public void visitTerminal(TerminalNode node) {
        if(isInIf && isInSuite && node.getSymbol().getType() == pythonParser.NEWLINE){
            int line = node.getSymbol().getLine();
            aux1.add(new couple<String, Integer>(lines.get(line-1),line));
        }
        super.visitTerminal(node);
    }

    public static void print(){
        System.out.println("To top");
        for(couple<Integer, couple<Integer, LinkedList<Integer>>> x : datos2)
            System.out.println(x.t1+" "+x.t2.t1+" "+x.t2.t2);
        System.out.println("To down");
        for(couple<Integer, couple<Integer, LinkedList<Integer>>> x : datos3)
            System.out.println(x.t1+" "+x.t2.t1+" "+x.t2.t2);
    }


    public static void calculate(){
        System.out.println("calculare");
        int minInst = Integer.MAX_VALUE;
        //  to up
        for(couple<Integer, LinkedList<LinkedList<couple<String, Integer>> > > x : datos1){
            for(LinkedList<couple<String, Integer>> y: x.t2)
                if(y.size() < minInst)
                    minInst = y.size();

            int equalLines = 0;
            Boolean toBrake = false;
            for(equalLines=0; equalLines<minInst; equalLines++){
                for(int j=0; !toBrake && j<x.t2.size()-1; j++) {
                    if (!x.t2.get(j).get(equalLines).t1.equals(
                         x.t2.get(j + 1).get(equalLines).t1))
                        toBrake = true;
                }
                if(toBrake)
                    break;
            }

            if(equalLines!=0) {
                LinkedList<Integer> arrayll = new LinkedList<Integer>();
                for (LinkedList<couple<String, Integer>> y : x.t2)
                    arrayll.add(y.get(0).t2);
                datos2.add(new couple<Integer, couple<Integer, LinkedList<Integer>>>(x.t1, new couple<Integer, LinkedList<Integer>>(equalLines, arrayll)));
            }
        }
        //  to down

        for(couple<Integer, LinkedList<LinkedList<couple<String, Integer>> > > x : datos1){

            int equalLines = 0;
            Boolean toBrake = false;
            for(equalLines=0; !toBrake && equalLines<minInst; equalLines++) {
                for (int j = 0; !toBrake && j < x.t2.size() - 1; j++)
                    if (!x.t2.get(j).get(x.t2.get(j).size() - equalLines - 1).t1.equals(
                            x.t2.get(j + 1).get(x.t2.get(j + 1).size() - equalLines - 1).t1))
                        toBrake = true;
                if(toBrake)
                    break;
            }



            if(equalLines!=0) {
                System.out.println("equalLines"+equalLines);
                LinkedList<Integer> arrayll = new LinkedList<Integer>();
                for (LinkedList<couple<String, Integer>> y : x.t2) {
                    if(equalLines != y.size())
                        arrayll.add(y.get(y.size() - equalLines - 1).t2+1);
                }
                datos3.add(new couple<Integer, couple<Integer, LinkedList<Integer>>>(x.t1, new couple<Integer, LinkedList<Integer>>(equalLines, arrayll)));
//                System.out.println((new couple<Integer, couple<Integer, LinkedList<Integer>>>(x.t1, new couple<Integer, LinkedList<Integer>>(equalLines, arrayll))));
            }
        }
    }


}
