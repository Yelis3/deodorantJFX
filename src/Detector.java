import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import sun.awt.image.ImageWatched;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Detector {

    public static LinkedList<String >detect(String [] args, String smell,
                                            LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer>>>> datos1,
                                            LinkedList<LinkedList<Integer[]>> datos2,
                                            LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos3,
                                            LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos4,
                                            LinkedList<couple<couple<String, Integer>, LinkedList<String>>> datos5) throws Exception{

        datos1.clear();
        datos2.clear();
        datos3.clear();
        datos4.clear();
        datos5.clear();

        String input = "input.txt";
        Path path = Paths.get(input);
        LinkedList<String> l = new LinkedList<>();
        for(String x : args)
            l.add(x);
        System.out.println(Arrays.toString(args));
        System.out.println(l);
        Files.write(path, l, StandardCharsets.UTF_8);



        pythonLexer lexer = new pythonLexer(CharStreams.fromFileName(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pythonParser parser = new pythonParser(tokens);
        ParseTree tree = parser.file_input();//poner el elemento root de la gramatica
        ParseTreeWalker walker;
        LinkedList<String> result = new LinkedList<String>();;
        switch (smell){
            case "unusedParameters":
                //  Unused Parameters Smell

                walker = new ParseTreeWalker();
                walker.walk(new unusedParameterDetector1(datos1), tree);
                unusedParameterDetector2<Object> loader = new unusedParameterDetector2<Object>(datos1, datos2);
                loader.visit(tree);


                for(int i=0; i<datos1.size(); i++){
                    String str = ("In the function \'"+datos1.get(i).t1.t1+"\' at de line "+datos1.get(i).t1.t2+" there "+(datos1.get(i).t2.size()>=2?"are":"is")+" the next unused parameters list [");
                    str += datos1.get(i).t2.get(0).t1;
                    for(int j=1; j<datos1.get(i).t2.size(); j++)
                        str += ", "+datos1.get(i).t2.get(j).t1;
                    str += "], ";

                    if(datos2.get(i).size() == 0) str += "but it wasn´t called anywhere";
                    else{
                        str += "and it was called at the next coordinates ";
                        for(Integer[] x : datos2.get(i))
                            str += Arrays.toString(x);
                    }

                    result.add(str);
                }
                break;
            case "duplicatedConditionalFragments":
                walker = new ParseTreeWalker();
                walker.walk(new duplicateConditionalFragmentsDetector("input.txt" , datos3, datos4), tree);
                duplicateConditionalFragmentsDetector.calculate();
                duplicateConditionalFragmentsDetector.print();

                for (int i = 0; i <datos3.size(); i++) {
                    result.add("The if statement at the line "+datos3.get(i).t1+" has the same "+datos3.get(i).t2.t1+" lines at the blocks top");
                }


                for (int i = 0; i <datos4.size(); i++) {
                    result.add("The if statement at the line "+datos4.get(i).t1+" has the same "+datos4.get(i).t2.t1+" lines at the blocks bottom");
                }


                break;
            case "longParameterList":

                //  Long Parameter List Smell
                //LinkedList<couple<couple<String, Integer>, LinkedList<String> > > datos5 = new LinkedList<couple<couple<String, Integer>, LinkedList<String> > >();
                int limit = 5;

                longParameterListDetector<Object> loader2 = new longParameterListDetector<Object>(datos5, limit);
                loader2.visit(tree);

                result = new LinkedList<String>();
                for (couple<couple<String, Integer>, LinkedList<String>> x : datos5)
                    result.add("Too many parameters in the method '"+x.t1.t1+"' in the line "+x.t1.t2+", these are: "+x.t2);
                break;
            default:
                result.add("Smell no reconocible");
                break;
        }
        return result;
    }
}