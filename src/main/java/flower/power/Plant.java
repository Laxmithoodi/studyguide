package flower.power;

public abstract class Plant {

    private Integer waterConsumption;
    private SunExposure sunExposure;

    public Plant() {
        this.waterConsumption = 0;
        this.sunExposure = SunExposure.FULLSUN;
    }

    public Plant(Integer ozWater , SunExposure typeOfSunshine){
        this.sunExposure = typeOfSunshine;
        this.waterConsumption = ozWater;
    }

    public Integer getWaterConsumption() {

        return waterConsumption;
    }

    public void setWaterConsumption(Integer waterConsumption) {
        this.waterConsumption = waterConsumption;

    }

    public SunExposure getSunExposure() {

        return sunExposure;
    }

    public void setSunExposure(SunExposure sunExposure) {
        this.sunExposure = sunExposure;

    }

}
