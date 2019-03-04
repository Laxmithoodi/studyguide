package flower.power;

import org.junit.Assert;
import org.junit.Test;

public class CactusTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        Plant cactus = (Plant) (Object) new Cactus();
        SunExposure expected = SunExposure.PARTSUN;
        //when
        SunExposure actual = cactus.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nullaryConstructorTest2(){
        //given
        Plant cactus = (Plant) (Object) new Cactus();
        Integer expected = 5;
        //when
        Integer actual = cactus.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTestWithInput(){
        //given
        Plant cactus = (Plant)(Object) new Cactus(1,SunExposure.FULLSHADE);
        Integer expected = 1;
        //when
        Integer actual = cactus.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setWaterCOnsumptionTest2(){
        //given
        Plant cactus = (Plant)(Object) new Cactus();
        Integer expected = 1;
        //when
        cactus.setWaterConsumption(expected);
        Integer actual = cactus.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSunExpossureTest2(){
        //given
        Plant cactus = (Plant)(Object) new Cactus();
        SunExposure expected = SunExposure.FULLSUN;
        //when
        cactus.setSunExposure(expected);
        SunExposure actual = cactus.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNumberOfNeedles(){
        //given
        Cactus cactus = new Cactus();
        Integer expected = 333;
        //when
        cactus.setNumberOfNeedles(expected);
        Integer actual = cactus.getNumberOfNeedles();
        //then
        Assert.assertEquals(expected, actual);
    }


}
