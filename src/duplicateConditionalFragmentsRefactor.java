import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class duplicateConditionalFragmentsRefactor {
    public static String generate(String input,
                           LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos3,
                           LinkedList<couple<Integer, couple<Integer, LinkedList<Integer>>>> datos4) throws IOException {

        Path path = Paths.get(input);
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        int modif = 0;

        int i=datos3.size()-1, j=datos4.size()-1;

        while(i>=0 && j>=0){
            if(datos3.get(i).t1 == datos4.get(j).t1){
                for (int k = 0; k < datos4.get(j).t2.t1; k++) {
                    String line = lines.get(datos4.get(j).t2.t2.get(0)-1+k);
                    line = line.substring(1);
                    lines.add(datos4.get(j).t2.t2.get( datos4.get(j).t2.t2.size()-1 ) +1 + k,line);
                }
                String[] aux = new String[datos3.get(i).t2.t1];
	            for (int k = 0; k < datos3.get(i).t2.t1; k++)
		            aux[k] = lines.get(datos3.get(i).t2.t2.get(0) -1+ k);
                for (int k = datos3.get(i).t2.t2.size()-1; k >=0 ; k--) {
                    for (int l = datos4.get(j).t2.t1-1; l >= 0 ; l--)
                        lines.remove(datos4.get(j).t2.t2.get(k)-1+l);

                    for (int l = datos3.get(i).t2.t1-1; l >= 0 ; l--)
                        lines.remove(datos3.get(i).t2.t2.get(k)-1+l);
                }
	            for (int k = 0; k < datos3.get(i).t2.t1; k++) {
		            lines.add(datos3.get(i).t1-1+ k,aux[k].substring(1));
	            }
                i--;
                j--;
            }else if(datos3.get(i).t1 > datos4.get(j).t1){
	            String[] aux = new String[datos3.get(i).t2.t1];
	            for (int k = 0; k < datos3.get(i).t2.t1; k++)
		            aux[k] = lines.get(datos3.get(i).t2.t2.get(0) -1+ k);
	            for (int k = datos3.get(i).t2.t2.size()-1; k >=0 ; k--)
		            for (int l = datos3.get(i).t2.t1-1; l >= 0 ; l--)
			            lines.remove(datos3.get(i).t2.t2.get(k)-1+l);
	            for (int k = 0; k < datos3.get(i).t2.t1; k++) {
		            lines.add(datos3.get(i).t1-1+ k,aux[k].substring(1));
	            }
                i--;
            }else if(datos3.get(i).t1 < datos4.get(j).t1){
	            for (int k = 0; k < datos4.get(j).t2.t1; k++) {
		            String line = lines.get(datos4.get(j).t2.t2.get(0)-1+k);
		            line = line.substring(1);
		            lines.add(datos4.get(j).t2.t2.get( datos4.get(j).t2.t2.size()-1 ) +1 + k,line);
	            }
	            for (int k = datos3.get(i).t2.t2.size()-1; k >=0 ; k--)
		            for (int l = datos4.get(j).t2.t1-1; l >= 0 ; l--)
			            lines.remove(datos4.get(j).t2.t2.get(k)-1+l);
                j--;
            }
        }


        StringBuilder sb = new StringBuilder();
        for(String x : lines) {
            sb.append(x);
            sb.append('\n');
        }

        return sb.toString();
    }
}
