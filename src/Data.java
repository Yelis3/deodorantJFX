public class Data {
    private LongParameterListData lp;
    private UnusedParameterData up;
    private DuplicateConditionalFragmentsData dcf;
    public Data(){
        this.lp = new LongParameterListData();
        this.up = new UnusedParameterData();
        this.dcf = new DuplicateConditionalFragmentsData();
    }

    public LongParameterListData getLongParameterListData() {
        return this.lp;
    }

    public void setLongParameterListData(LongParameterListData lp) {
        this.lp = lp;
    }

    public UnusedParameterData getUnusedParameterData() {
        return this.up;
    }

    public void setUnusedParameterData(UnusedParameterData up) {
        this.up = up;
    }

    public DuplicateConditionalFragmentsData getDuplicateConditionalFragmentsData() {
        return this.dcf;
    }

    public void setDuplicateConditionalFragmentsData(DuplicateConditionalFragmentsData dcf) {
        this.dcf = dcf;
    }
}
