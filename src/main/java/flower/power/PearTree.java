package flower.power;

public class PearTree extends Plant implements Bloom{

    public PearTree(){
        this(500, SunExposure.PARTSUN);
    }

    public PearTree(Integer integer,SunExposure sunExposure){
        super(integer,sunExposure);
    }

    public Integer bloom() {
        return 75;
    }
}
