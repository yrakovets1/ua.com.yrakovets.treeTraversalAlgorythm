package testcoin;

import org.junit.Assert;
import org.junit.Test;

public class CoinTest {
    @Test
    public void simpleTest(){
        CoinAlgorythm alg = new CoinAlgorythm(168);
        alg.run();
        Assert.assertEquals(" 50 50 50 10 5 2 1", alg.print());
    }

    //Checked
    @Test
    public void simpleTest2(){
        CoinAlgorythm alg = new CoinAlgorythm(81);
        alg.run();
        Assert.assertEquals(" 50 25 5 1", alg.print());
    }

}
