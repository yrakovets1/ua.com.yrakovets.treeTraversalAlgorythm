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

    @Test
    public void wrongTest(){
        //throw new IllegalArgumentException();
    }

}
