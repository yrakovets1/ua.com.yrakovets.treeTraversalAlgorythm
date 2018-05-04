package core;

public abstract class TraversalAlgorythm {

    protected SolutionStep solutionQueue;
    protected SolutionStep currentStep;
    
    
    public SolutionStep run(){
        init();
        
        while(true){
            try {
                currentStep = currentStep.makeStep();
            }catch (NoNewVariantsException e){
                currentStep = currentStep.rollStep();
            }

            if(isResolved()){
                return solutionQueue;
            }
            if(!isCorrect()){
                if(currentStep.equals(solutionQueue)){
                    return null;
                }
                currentStep = currentStep.rollStep();
            }

        }
    }

    //protected abstract void makeStep(SolutionStep step);

    protected abstract void init();

    protected abstract boolean isCorrect();
    
    protected abstract boolean isResolved();
    
    protected abstract String print();
}
