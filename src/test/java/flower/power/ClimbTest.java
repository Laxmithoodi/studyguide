package flower.power;

import org.junit.Assert;
import org.junit.Test;

public class ClimbTest {

    @Test
    public void climbTest1(){
        //given
        Climb[] climbingPlants = new Climb[2];
        //when
        climbingPlants[0] = (Climb) new Ivy();
        climbingPlants[1] = (Climb) new HoneySuckle();
        //then
        Assert.assertTrue(climbingPlants[0] instanceof Climb);
        Assert.assertTrue(climbingPlants[1] instanceof Climb);
    }

    @Test
    public void climbTest2(){
        //given
        Integer expected = 30;
        Climb ivy = (Climb) new Ivy();
        //when
        Integer actual = ivy.climb();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void climbTest3(){
        //given
        Integer expected = 7;
        Climb honeySuckle = (Climb) new HoneySuckle();
        //when
        Integer actual = honeySuckle.climb();
        //then
        Assert.assertEquals(expected,actual);
    }


}
