package alg;

import core.SolutionStep;
import core.TraversalAlgorythm;

public class OrigamyAlgorytm extends TraversalAlgorythm {
    class OrygamyStep extends SolutionStep<PointPair>{

        public OrygamyStep(PointPair pointPair) {
            super(pointPair);
        }

        @Override
        protected void fillVariant() {
            if (checked == null){

            }
        }

        @Override
        protected void fulfil() {

        }

        @Override
        protected void rollback() {

        }

        @Override
        protected SolutionStep generateNext() {
            return null;
        }
    }

    public Field field = new Field();


    @Override
    protected void init() {

    }

    @Override
    protected boolean isCorrect() {
        return false;
    }

    @Override
    protected boolean isResolved() {
        return field.pointPairs.stream().map(PointPair::getCrumpled).distinct().count() == field.crumpledPoints.size()
                && field.pointPairs.stream().allMatch(PointPair::isChecked);
    }

    @Override
    protected String print() {
        return null;
    }
}
