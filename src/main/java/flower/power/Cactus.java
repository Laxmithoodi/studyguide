package flower.power;

public class Cactus extends Plant implements Bloom{
   private Integer NumberOfNeedles;

    public Cactus(){

        this(5, SunExposure.PARTSUN);
    }

    public Cactus(Integer integer, SunExposure sunExposure){
        super(integer, sunExposure);

    }

    public Integer getNumberOfNeedles() {

        return NumberOfNeedles;
    }

    public void setNumberOfNeedles(Integer numberOfNeedles) {
        this.NumberOfNeedles = numberOfNeedles;

    }


    public Integer bloom() {
        return 1;
    }
}
