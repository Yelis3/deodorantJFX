public class couple<T1, T2> {
    public T1 t1;
    public T2 t2;
    couple(T1 t1, T2 t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public String toString() {
        return t1.toString() + " " + t2.toString();
    }
}
