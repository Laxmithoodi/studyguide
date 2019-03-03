package flower.power;

import org.junit.Assert;
import org.junit.Test;

public class FernTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        Plant fern = (Plant) (Object) new Fern();
        SunExposure expected = SunExposure.PARTSHADE;
        //when
        SunExposure actual = fern.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nullaryConstructorTest2(){
        //given
        Plant fern = (Plant) (Object) new Fern();
        Integer expected = 10;
        //when
        Integer actual = fern.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTestWithInput(){
        //given
        Plant fern = (Plant)(Object) new Fern(15,SunExposure.FULLSHADE);
        Integer expected = 15;
        //when
        Integer actual = fern.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setWaterCOnsumptionTest2(){
        //given
        Plant fern = (Plant)(Object) new Fern();
        Integer expected = 20;
        //when
        fern.setWaterConsumption(expected);
        Integer actual = fern.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSunExpossureTest2(){
        //given
        Plant fern = (Plant)(Object) new Fern();
        SunExposure expected = SunExposure.PARTSUN;
        //when
        fern.setSunExposure(expected);
        SunExposure actual = fern.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

}
