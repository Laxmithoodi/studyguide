package flower.power;

import flower.power.Interfaces.Bloom;
import org.junit.Assert;
import org.junit.Test;

public class BloomTest {

    @Test
    public void bloomPlantsTests() {
        //given
        Bloom[] bloomingPlants = new Bloom[4];
        //when
        bloomingPlants[0] = (Bloom) new PearTree();
        bloomingPlants[1] = (Bloom) new Hibiscus();
        bloomingPlants[2] = (Bloom) new Cactus();
        bloomingPlants[3] = (Bloom) new HoneySuckle();
        //then
        Assert.assertTrue(bloomingPlants[0] instanceof Bloom);
        Assert.assertTrue(bloomingPlants[1] instanceof Bloom);
        Assert.assertTrue(bloomingPlants[2] instanceof Bloom);
        Assert.assertTrue(bloomingPlants[3] instanceof Bloom);
    }

    @Test
    public void bloomPlantsTests2() {
        //given
        Integer expected = 2;
        Bloom hibiscus = (Bloom)new Hibiscus();
        //when
        Integer actual = hibiscus.bloom();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void bloomPlantsTests3() {
        //given
        Integer expected = 75;
        Bloom pearTree = (Bloom)new PearTree();
        //when
        Integer actual = pearTree.bloom();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void bloomPlantsTests4() {
        //given
        Integer expected = 1;
        Bloom cactus = (Bloom)new Cactus();
        //when
        Integer actual = cactus.bloom();
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void bloomPlantsTests5() {
        //given
        Integer expected = 150;
        Bloom honeySuckle = (Bloom)new HoneySuckle();
        //when
        Integer actual = honeySuckle.bloom();
        //then
        Assert.assertEquals(expected,actual);
    }
}
