import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class unusedParameterRefactor {
    static LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > >> datos1;
    static LinkedList<LinkedList<Integer[]>> datos2;

    public unusedParameterRefactor(
            LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > >> datos1,
            LinkedList<LinkedList<Integer[]>> datos2){
        this.datos1 = datos1;
        this.datos2 = datos2;
    }

    public static String generateOutputCode(String input) throws IOException {
        HashMap<Integer, Integer> deletedChars = new HashMap<>();
        Path path = Paths.get(input);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        //  Refactor functions definitions
        for(int i=0; i<datos1.size(); i++){
            int numLine = datos1.get(i).t1.t2-1;
            String line = lines.get(numLine);
            StringBuilder sb = new StringBuilder();
            int idx = line.indexOf('(');
            sb.append(line.substring(0,idx+1));
            line = line.substring(idx+1);
            System.out.println(line);
            idx = line.indexOf(')');
            String next = line.substring(idx);
            line = line.substring(0, idx);
            String[] params = line.split(",");
            int[] positions = new int[datos1.get(i).t2.size()];
            for(int j=0; j<positions.length; j++)
                positions[j] = datos1.get(i).t2.get(j).t2;
            Arrays.sort(positions);

            int count = 0;
            for(int j=0, k=0; j<params.length; j++){
                if(k<positions.length && j == positions[k]) {
                    count += params[j].length();
                    if(j != params.length-1)
                        count++;
                    k++;
                    continue;
                }
                sb.append(params[j]);
                sb.append(",");
            }
            String data = sb.toString();
            if(data.charAt(data.length()-1) == ',')
                sb.delete(data.length()-1, data.length());
            sb.append(next);
            lines.set(numLine, sb.toString());
            deletedChars.put(numLine, count);
        }

        //  Refactor function calls
        for(int i=0; i<datos2.size(); i++){
            for(int j=0; j<datos2.get(i).size(); j++){
                int numLine = datos2.get(i).get(j)[0]-1;
                String line = lines.get(numLine);

                StringBuilder sb = new StringBuilder();

                int idx = datos2.get(i).get(j)[1] - (deletedChars.get(numLine) == null? 0 : deletedChars.get(numLine));

                sb.append(line.substring(0,idx));
                line = line.substring(idx);

                idx = line.indexOf('(');
                sb.append(line.substring(0,idx+1));
                line = line.substring(idx+1);

                idx = line.indexOf(')');
                String next = line.substring(idx);
                line = line.substring(0, idx);

                String[] params = line.split(",");
                int[] positions = new int[datos1.get(i).t2.size()];
                for(int k=0; k<positions.length; k++)
                    positions[k] = datos1.get(i).t2.get(k).t2;
                Arrays.sort(positions);

                int count = 0;
                for(int k=0, l=0; k<params.length; k++){
                    if(l<positions.length && k == positions[l]) {
                        count += params[j].length();
                        if(j != params.length-1)
                            count++;
                        l++;
                        continue;
                    }
                    sb.append(params[k]);
                    sb.append(",");
                }
                String data = sb.toString();
                if(data.charAt(data.length()-1) == ',')
                    sb.delete(data.length()-1, data.length());

                sb.append(next);
                lines.set(numLine,sb.toString());
                deletedChars.put(numLine, (deletedChars.get(numLine) == null? 0 : deletedChars.get(numLine)) + count);
            }
        }

        //lines.set(lineNumber - 1, data);
        StringBuilder sb = new StringBuilder();
        for(String x : lines) {
            sb.append(x);
            sb.append('\n');
        }

        return sb.toString();

                idx = line.indexOf('(');
                sb.append(line.substring(0,idx+1));
                line = line.substring(idx+1);

                idx = line.indexOf(')');
                String next = line.substring(idx);
                line = line.substring(0, idx);

                String[] params = line.split(",");
                int[] positions = new int[datos1.get(i).t2.size()];
                for(int k=0; k<positions.length; k++) {
                    positions[k] = datos1.get(i).t2.get(k).t2.intValue();
                }
                Arrays.sort(positions);

                for(int k=0, l=0; k<params.length; k++){
                    if(k >= positions[l]) {
                        if(k > positions[l])
                            k--;
                        l++;
                        continue;
                    }
                    sb.append(params[k]);
                    sb.append(",");
                }
                String data = sb.toString();
                if(data.charAt(data.length()-1) == ',')
                    sb.delete(data.length()-1, data.length());

                sb.append(next);
                lines.set(datos2[i].get(j)[0]-1,sb.toString());
            }


        }

        //lines.set(lineNumber - 1, data);
            path = Paths.get(output);
        Files.write(path, lines, StandardCharsets.UTF_8);
    }

}
