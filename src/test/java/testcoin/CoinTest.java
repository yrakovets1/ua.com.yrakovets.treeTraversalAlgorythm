package testcoin;

public class CoinTest {
    public static void main(String[] args){
        CoinAlgorythm alg = new CoinAlgorythm(168);
        alg.run();
        System.out.println(alg.print());
    }


}
