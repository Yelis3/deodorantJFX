import java.util.LinkedList;

public class longParameterListDetector<T> extends  pythonBaseVisitor {
    LinkedList<couple<couple<String, Integer>, LinkedList<String> >> datos;
    int limit;
    public longParameterListDetector(LinkedList<couple<couple<String, Integer>, LinkedList<String> >> datos, int limit){
        this.datos = datos;
        this.limit = limit;
    }



    @Override
    public Object visitFuncdef(pythonParser.FuncdefContext ctx) {
        if(ctx.parameters().typedargslist().tfpdef().size() > this.limit) {
            LinkedList<String> ll = new LinkedList<String>();
            for( pythonParser.TfpdefContext x : ctx.parameters().typedargslist().tfpdef())
                ll.add(x.NAME().toString());
            datos.add(new couple<couple<String, Integer>, LinkedList<String>>(new couple<String, Integer>(ctx.NAME().toString(), ctx.NAME().getSymbol().getLine()), ll));
        }
        return super.visitFuncdef(ctx);
    }
}
