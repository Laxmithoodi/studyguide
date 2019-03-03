package flower.power;

import org.junit.Assert;
import org.junit.Test;

public class PearTreeTest {

    @Test
    public void nullaryConstructorTest(){
        //given
        Plant pearTree = (Plant) (Object) new PearTree();
        SunExposure expected = SunExposure.PARTSUN;
        //when
        SunExposure actual = pearTree.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nullaryConstructorTest2(){
        //given
        Plant pearTree = (Plant) (Object) new PearTree();
        Integer expected = 500;
        //when
        Integer actual = pearTree.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void constructorTestWithInput(){
        //given
        Plant pearTree = (Plant)(Object) new PearTree(750,SunExposure.PARTSUN);
        Integer expected = 750;
        //when
        Integer actual = pearTree.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setWaterCOnsumptionTest2(){
        //given
        Plant pearTree = (Plant)(Object) new PearTree();
        Integer expected = 600;
        //when
        pearTree.setWaterConsumption(expected);
        Integer actual = pearTree.getWaterConsumption();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setSunExpossureTest2(){
        //given
        Plant pearTree = (Plant)(Object) new PearTree();
        SunExposure expected = SunExposure.FULLSUN;
        //when
        pearTree.setSunExposure(expected);
        SunExposure actual = pearTree.getSunExposure();
        //then
        Assert.assertEquals(expected,actual);
    }
}
