package everybody.clap.your.hands;

public abstract class Clap {

    private Integer numberOfClaps;

    public Clap() {
        numberOfClaps = 0;
    }

    public Clap(Integer numberOfClaps){
        this.numberOfClaps = numberOfClaps;
    }

    public Integer getNumberOfClaps() {
        return numberOfClaps;
    }

    public void setNumberOfClaps(Integer numberOfClaps) {
        this.numberOfClaps = numberOfClaps;
    }

    public abstract String clap();
}
