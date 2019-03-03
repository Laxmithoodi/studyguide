package flower.power;

import org.junit.Assert;
import org.junit.Test;

public class HibiscusTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        Plant hibiscus = (Plant) (Object) new Hibiscus();
        SunExposure expected = SunExposure.FULLSUN;
        //when
        SunExposure actual = hibiscus.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nullaryConstructorTest2(){
        //given
        Plant hibiscus = (Plant) (Object) new Hibiscus();
        Integer expected = 7;
        //when
        Integer actual = hibiscus.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTestWithInput(){
        //given
        Plant hibiscus = (Plant)(Object) new Hibiscus(15,SunExposure.PARTSUN);
        Integer expected = 15;
        //when
        Integer actual = hibiscus.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setWaterCOnsumptionTest2(){
        //given
        Plant hibiscus = (Plant)(Object) new Hibiscus();
        Integer expected = 25;
        //when
        hibiscus.setWaterConsumption(expected);
        Integer actual = hibiscus.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSunExpossureTest2(){
        //given
        Plant hibiscus = (Plant)(Object) new Hibiscus();
        SunExposure expected = SunExposure.PARTSUN;
        //when
        hibiscus.setSunExposure(expected);
        SunExposure actual = hibiscus.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

}
