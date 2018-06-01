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

    public static LinkedList<String >detect(String [] args, String smell) throws Exception{

//        int smellId;

        System.out.println(Arrays.toString(args));
        String input = "input.txt";
        Path path = Paths.get(input);
        Files.write(path, Arrays.asList(args), StandardCharsets.UTF_8);



        pythonLexer lexer = new pythonLexer(CharStreams.fromFileName("input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        pythonParser parser = new pythonParser(tokens);
        ParseTree tree = parser.file_input();//poner el elemento root de la gramatica
        ParseTreeWalker walker;
        LinkedList<String> result = new LinkedList<String>();;

        switch (smell){
            case "unusedParameters":
                //  Unused Parameters Smell
                LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > > > datos1 = new LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > > >();
                walker = new ParseTreeWalker();
                walker.walk(new unusedParameterDetector1(datos1), tree);

                LinkedList<Integer[]>[] datos2 = new LinkedList[datos1.size()];
                for(int i=0; i< datos1.size(); i++)
                    datos2[i] = new LinkedList<Integer[]>();
                unusedParameterDetector2<Object> loader = new unusedParameterDetector2<Object>(datos1, datos2);


                for(int i=0; i<datos1.size(); i++){
                    String str = ("In the function \'"+datos1.get(i).t1.t1+"\' at de line "+datos1.get(i).t1.t2+" there "+(datos1.get(i).t2.size()>=2?"are":"is")+" the next unused parameters list [");
                    str += datos1.get(i).t2.get(0).t1;
                    for(int j=1; j<datos1.get(i).t2.size(); j++)
                        str += ", "+datos1.get(i).t2.get(j).t1;
                    str += ']';
                    result.add(str);
                }

//                new unusedParameterRefactor(datos1, datos2);
//                unusedParameterRefactor.generateOutputCode("input.txt", "output.txt");
                break;
            case "duplicatedConditionalFragments":

                //  Duplicate Conditional Fragments Smell
                LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos3 = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
                LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos4 = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
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
                LinkedList<couple<couple<String, Integer>, LinkedList<String> > > datos5 = new LinkedList<couple<couple<String, Integer>, LinkedList<String> > >();
                int limit = 5;

                longParameterListDetector<Object> loader2 = new longParameterListDetector<Object>(datos5, limit);
                loader2.visit(tree);

                result = new LinkedList<String>();
                for (couple<couple<String, Integer>, LinkedList<String>> x : datos5)
                    result.add("Demasiados parametros en la función "+x.t1.t1+" de la linea "+x.t1.t2+" estos son: "+x.t2);
                break;
            default:
                result.add("Smell no reconocible");
                break;
        }
        return result;
    }
}