package flower.power;

public class Fern extends Plant{

    public Fern(){
    this(10, SunExposure.PARTSHADE);
    }

    public Fern(Integer integer, SunExposure sunExposure){
    super(integer, sunExposure);
    }
}
