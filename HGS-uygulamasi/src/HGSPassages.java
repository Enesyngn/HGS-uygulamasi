public abstract class HGSPassages {
    protected String passageDate;
    protected String entryToll;
    protected String exitToll;
    protected double fee;

    public HGSPassages(String passageDate, String entryToll, String exitToll, double fee) {
        this.passageDate = passageDate;
        this.entryToll = entryToll;
        this.exitToll = exitToll;
        this.fee = fee;
    }

    public abstract void recordPassage();
}

