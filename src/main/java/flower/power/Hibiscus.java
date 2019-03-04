package flower.power;

public class Hibiscus extends Plant implements Bloom{

    public Hibiscus(){
       this(7,  SunExposure.FULLSUN);
    }

    public Hibiscus(Integer integer, SunExposure sunExposure){
    super(integer, sunExposure);
    }

    public Integer bloom() {
        return 2;
    }
}
