package flower.power;

import org.junit.Assert;
import org.junit.Test;

public class IvyTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        Plant ivy = (Plant) (Object) new Ivy();
        SunExposure expected = SunExposure.PARTSHADE;
        //when
        SunExposure actual = ivy.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nullaryConstructorTest2(){
        //given
        Plant ivy = (Plant) (Object) new Ivy();
        Integer expected = 20;
        //when
        Integer actual = ivy.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTestWithInput(){
        //given
        Plant ivy = (Plant)(Object) new Ivy(50,SunExposure.PARTSUN);
        Integer expected = 50;
        //when
        Integer actual = ivy.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setWaterCOnsumptionTest2(){
        //given
        Plant Ivy = (Plant)(Object) new Ivy();
        Integer expected = 100;
        //when
        Ivy.setWaterConsumption(expected);
        Integer actual = Ivy.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSunExpossureTest2(){
        //given
        Plant Ivy = (Plant)(Object) new Ivy();
        SunExposure expected = SunExposure.FULLSHADE;
        //when
        Ivy.setSunExposure(expected);
        SunExposure actual = Ivy.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }



}
