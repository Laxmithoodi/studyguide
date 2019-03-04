package flower.power;

public class Cactus extends Plant implements Bloom{

    private Integer numberOfNeedles;

    public Cactus(){
        this(5,SunExposure.PARTSUN);
    }

    public Cactus(Integer integer, SunExposure sunExposure){
        super(integer,sunExposure);
    }

    public Integer getNumberOfNeedles() {
        return numberOfNeedles;
    }

    public void setNumberOfNeedles(Integer numberOfNeedles) {
        this.numberOfNeedles = numberOfNeedles;
    }

    public Integer bloom() {
        return 1;
    }

}
