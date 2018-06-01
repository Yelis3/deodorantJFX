import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class unusedParameterRefactor {
    static LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > >> datos1;
    static LinkedList<Integer[]>[] datos2;

    public unusedParameterRefactor(
            LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > >> datos1,
            LinkedList<Integer[]>[] datos2){
        this.datos1 = datos1;
        this.datos2 = datos2;
    }

    public static void generateOutputCode(String input, String output) throws IOException {
        Path path = Paths.get(input);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        //  Refactor functions definitions
        for(int i=0; i<datos1.size(); i++){
            String line = lines.get(datos1.get(i).t1.t2-1);
            StringBuilder sb = new StringBuilder();
            int idx = line.indexOf('(');
            sb.append(line.substring(0,idx+1));
            line = line.substring(idx+1);

            idx = line.indexOf(')');
            String next = line.substring(idx);
            line = line.substring(0, idx);
            String[] params = line.split(",");
            int[] positions = new int[datos1.get(i).t2.size()];
            for(int j=0; j<positions.length; j++) {
                positions[j] = datos1.get(i).t2.get(j).t2.intValue();
            }
            Arrays.sort(positions);
            for(int j=0, k=0; j<params.length; j++){
                if(j >= positions[k]) {
                    if(j > positions[k])
                        j--;
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
            lines.set(datos1.get(i).t1.t2-1,sb.toString());
        }

        //  Refactor function calls
        for(int i=0; i<datos2.length; i++){
            for(int j=0; j<datos2[i].size(); j++){
                String line = lines.get(datos2[i].get(j)[0]-1);
                StringBuilder sb = new StringBuilder();

                int idx = datos2[i].get(j)[1];
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
        if(output != null)
            path = Paths.get(output);
        Files.write(path, lines, StandardCharsets.UTF_8);
    }

}
