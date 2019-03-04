package flower.power;

public class HoneySuckle extends Plant implements Bloom, Climb{

    public HoneySuckle(){
        this(100, SunExposure.PARTSHADE);

    }

    public HoneySuckle(Integer integer,SunExposure sunExposure){
        super(integer, sunExposure);

    }

    public Integer bloom() {
        return 150;
    }

    public Integer climb() {
        return 7;
    }
}
