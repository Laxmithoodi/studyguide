package flower.power;

import org.junit.Assert;
import org.junit.Test;

public class PlantTest {

    @Test
    public void plantTest1(){
        Plant cactus = (Plant)(Object)new Cactus();
        Assert.assertTrue(cactus instanceof Plant);
    }

    @Test
    public void plantTest2(){
        Plant pearTree = (Plant)(Object) new PearTree();
        Assert.assertTrue(pearTree instanceof Plant);
    }

    @Test
    public void plantTest3(){
        Plant fern = (Plant)(Object) new Fern();
        Assert.assertTrue(fern instanceof Plant);
    }

    @Test
    public void plantTest4(){
        Plant honeysuckle = (Plant)(Object) new HoneySuckle();
        Assert.assertTrue(honeysuckle instanceof Plant);
    }

    @Test
    public void plantTest5(){
        Plant ivy = (Plant)(Object)new Ivy();
        Assert.assertTrue(ivy instanceof Plant);
    }
    @Test
    public void plantTest6(){
        Plant hibiscus = (Plant)(Object)new Hibiscus();
        Assert.assertTrue(hibiscus instanceof Plant);
    }
}
