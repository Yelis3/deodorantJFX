import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Refactor {

    public static String refactor(String smell,
                                            LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > > > datos1,
                                            LinkedList<LinkedList<Integer[]>> datos2,
                                            LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos3,
                                            LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos4,
                                            LinkedList<couple<couple<String, Integer>, LinkedList<String> > > datos5) throws Exception{
        String result = "";
        switch (smell){
            case "unusedParameters":
                new unusedParameterRefactor(datos1, datos2);
                result = unusedParameterRefactor.generateOutputCode("input.txt");

                break;
            case "duplicatedConditionalFragments":
                result = duplicateConditionalFragmentsRefactor.generate("input.txt", datos3, datos4);

                break;
            case "longParameterList":
                break;
            default:
                result = "Smell no reconocible";
                break;
        }
        return result;
    }
}