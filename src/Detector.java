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
    private static LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> >> > Datos1;
    private static LinkedList<Integer[]>[] Datos2;
    private static LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> Datos3;
    private static LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> Datos4;
    private static LinkedList<couple<couple<String, Integer>, LinkedList<String> > > Datos5;

    public static LinkedList<String >detect(String [] args, String smell,
                                            LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > > > datos1,
                                            LinkedList<Integer[]>[] datos2,
                                            LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos3,
                                            LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos4,
                                            LinkedList<couple<couple<String, Integer>, LinkedList<String> > > datos5) throws Exception{

        System.out.println(datos2);
        Datos1 = new LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> >> >();
        Datos3 = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
        Datos4 = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
        Datos5 = new LinkedList<couple<couple<String, Integer>, LinkedList<String> > >();
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

                walker = new ParseTreeWalker();
                walker.walk(new unusedParameterDetector1(datos1), tree);
                Datos2 = new LinkedList[datos1.size()];
                for(int i=0; i< datos1.size(); i++)
                    Datos2[i] = new LinkedList<Integer[]>();
                unusedParameterDetector2<Object> loader = new unusedParameterDetector2<Object>(datos1, Datos2);


                for(int i=0; i<datos1.size(); i++){
                    String str = ("In the function \'"+datos1.get(i).t1.t1+"\' at de line "+datos1.get(i).t1.t2+" there "+(datos1.get(i).t2.size()>=2?"are":"is")+" the next unused parameters list [");
                    str += datos1.get(i).t2.get(0).t1;
                    for(int j=1; j<datos1.get(i).t2.size(); j++)
                        str += ", "+datos1.get(i).t2.get(j).t1;
                    str += ']';
                    result.add(str);
                }

//                new unusedParameterRefactor(datos1, Datos2);
//                unusedParameterRefactor.generateOutputCode("input.txt", "output.txt");
                break;
            case "duplicatedConditionalFragments":

                //  Duplicate Conditional Fragments Smell
                //LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> Datos3; = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
                //LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> Datos4; = new LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>>();
                walker = new ParseTreeWalker();
                walker.walk(new duplicateConditionalFragmentsDetector("input.txt" , Datos3, Datos4), tree);
                duplicateConditionalFragmentsDetector.calculate();
                duplicateConditionalFragmentsDetector.print();

                for (int i = 0; i <Datos3.size(); i++) {
                    result.add("The if statement at the line "+Datos3.get(i).t1+" has the same "+Datos3.get(i).t2.t1+" lines at the blocks top");
                }


                for (int i = 0; i <Datos4.size(); i++) {
                    result.add("The if statement at the line "+Datos4.get(i).t1+" has the same "+Datos4.get(i).t2.t1+" lines at the blocks bottom");
                }


                break;
            case "longParameterList":

                //  Long Parameter List Smell
                //LinkedList<couple<couple<String, Integer>, LinkedList<String> > > Datos5 = new LinkedList<couple<couple<String, Integer>, LinkedList<String> > >();
                int limit = 5;

                longParameterListDetector<Object> loader2 = new longParameterListDetector<Object>(Datos5, limit);
                loader2.visit(tree);

                result = new LinkedList<String>();
                for (couple<couple<String, Integer>, LinkedList<String>> x : Datos5)
                    result.add("Demasiados parametros en la función "+x.t1.t1+" de la linea "+x.t1.t2+" estos son: "+x.t2);
                break;
            default:
                result.add("Smell no reconocible");
                break;
        }
//        datos1 = Datos1;
        System.out.println(datos1);
        datos2 = Datos2;
        System.out.println(datos2);
        datos3 = Datos3;
        datos4 = Datos4;
        datos5 = Datos5;
        return result;
    }
}