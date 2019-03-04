package flower.power;

import org.junit.Assert;
import org.junit.Test;

public class HoneySuckleTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        Plant honeysuckle = (Plant)(Object) new HoneySuckle();
        SunExposure expected = SunExposure.PARTSHADE;
        //when
        SunExposure actual = honeysuckle.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nullaryConstructorTest2(){
        //given
        Plant honeysuckle = (Plant)(Object) new HoneySuckle();
        Integer expected = 100;
        //when
        Integer actual = honeysuckle.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTestWithInput(){
        //given
        Plant honeysuckle = (Plant)(Object) new HoneySuckle(15,SunExposure.PARTSUN);
        Integer expected = 15;
        //when
        Integer actual = honeysuckle.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setWaterCOnsumptionTest2(){
        //given
        Plant honeysuckle = (Plant)(Object) new HoneySuckle();
        Integer expected = 25;
        //when
        honeysuckle.setWaterConsumption(expected);
        Integer actual = honeysuckle.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSunExpossureTest2(){
        //given
        Plant honeysuckle = (Plant)(Object) new HoneySuckle();
        SunExposure expected = SunExposure.PARTSUN;
        //when
        honeysuckle.setSunExposure(expected);
        SunExposure actual = honeysuckle.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

}
