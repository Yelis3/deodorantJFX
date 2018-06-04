import java.util.ArrayList;
import java.util.LinkedList;

public class unusedParameterDetector2<T> extends pythonBaseVisitor{
    LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > > > datos1;
    LinkedList<LinkedList<Integer[]>> datos2;

    public unusedParameterDetector2(
            LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > > > datos1,
            LinkedList<LinkedList<Integer[]>> datos2){
        this.datos1 = datos1;
        this.datos2 = datos2;
        for(int i=0; i<datos1.size(); i++)
            datos2.add(new LinkedList<Integer[]>());
    }

    @Override
    public Object visitAtom_expr(pythonParser.Atom_exprContext ctx) {
        if(ctx.atom().NAME() != null) {
            String name = ctx.atom().NAME().toString();
            for (int i = 0; i < datos1.size(); i++) {
                if (name.equals(datos1.get(i).t1.t1)) {
                    Integer[] aux = new Integer[2];
                    aux[0] = ctx.atom().NAME().getSymbol().getLine();
                    aux[1] = ctx.atom().NAME().getSymbol().getCharPositionInLine();
                    datos2.get(i).add(aux);
                    break;
                }
            }
        }
        return visitChildren(ctx);
    }
}
