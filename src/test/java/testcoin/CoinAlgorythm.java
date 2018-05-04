package testcoin;

import core.TraversalAlgorythm;
import core.SolutionStep;

import java.util.Arrays;
import java.util.stream.Collectors;


public class CoinAlgorythm extends TraversalAlgorythm {

    class CoinStep<Integer> extends SolutionStep {

        public CoinStep(Object checked) {
            super(checked);
        }

        protected void fillVariant() {
            variants = Arrays.stream(possibleCoins).collect(Collectors.toList());
        }

        protected void fulfil() {
            currentSum += (java.lang.Integer) checked;
        }

        protected void rollback() {
            currentSum -= (java.lang.Integer) checked;
        }

        protected SolutionStep generateNext() {
            return new CoinStep(selectCurrentVariant());
        }
    }


    private Integer sum;
    private Integer currentSum = 0;
    private Integer[] possibleCoins = new Integer[]{50,25,10,5,2,1};

    protected void init() {
        solutionQueue = new CoinStep(0);
        currentStep = solutionQueue;
    }

    protected boolean isCorrect() {
        return currentSum <= sum;
    }

    protected boolean isResolved() {
        return currentSum.equals(sum);
    }

    protected String print() {
        SolutionStep step = solutionQueue;
        StringBuilder resolve = new StringBuilder();
        while (true){
            step = step.getNext();
            if (step == null) break;
            resolve.append(" ").append(step.getChecked().toString());
        }
        return resolve.toString();
    }

    public CoinAlgorythm(Integer sum){
        this.sum = sum;
    }
}
