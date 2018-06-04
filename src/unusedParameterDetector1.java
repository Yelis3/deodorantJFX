import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class unusedParameterDetector1<T> extends pythonBaseListener{
    //pythonParser.FuncdefContext func;
    HashMap<String, couple<Integer, Boolean>> myMap = new HashMap<String, couple<Integer, Boolean>> ();

    LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> >>> couples;
    public unusedParameterDetector1(LinkedList<couple<couple<String, Integer>, ArrayList<couple<String, Integer> > >> couples){
        this.couples = couples;
    }

    @Override
    public void enterFuncdef(pythonParser.FuncdefContext ctx) {
        //func = ctx;
        int idx = 0;
        for (pythonParser.TfpdefContext x : ctx.parameters().typedargslist().tfpdef()) {
            myMap.put(x.NAME().toString(), new couple<Integer, Boolean>(idx, false));
            idx++;
        }
    }

    @Override
    public void exitFuncdef(pythonParser.FuncdefContext ctx) {
        ArrayList<couple<String, Integer>> arrayl = new ArrayList<couple<String, Integer>>();
        myMap.forEach((k,v) -> {if(!v.t2)arrayl.add(new couple<String, Integer>(k, v.t1) );});

        if(arrayl.size()>0) {
            couple<couple<String, Integer>, ArrayList<couple<String, Integer> > > myCouple =
                    new couple<couple<String, Integer>, ArrayList<couple<String, Integer> > >(
                            new couple<String, Integer>(ctx.NAME().toString(), ctx.NAME().getSymbol().getLine()), arrayl);
            couples.add(myCouple);
        }
        myMap = new HashMap<String, couple<Integer, Boolean>>();
    }

    @Override
    public void enterAtom(pythonParser.AtomContext ctx) {
        if(ctx.NAME() != null) {
            couple<Integer, Boolean> aux = myMap.get(ctx.NAME().toString());
            if(aux != null)
                myMap.put(ctx.NAME().toString(), new couple<Integer, Boolean>(aux.t1, true));
        }
    }
}
