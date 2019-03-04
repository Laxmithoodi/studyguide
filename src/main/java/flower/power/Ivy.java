package flower.power;

public class Ivy extends Plant implements Climb{

    public Ivy(){
        this(20, SunExposure.PARTSHADE);

    }

    public Ivy(Integer integer, SunExposure sunExposure){
        super(integer, sunExposure);

    }

    public Integer climb() {
        return 30;
    }
}
