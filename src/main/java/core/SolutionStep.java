package core;

import java.util.List;

public abstract class SolutionStep<T> {
    int currentVariant = 0;
    protected T checked;
    protected List<T> variants;
    protected SolutionStep previous;
    protected SolutionStep next;

    public SolutionStep(T checked){
        this.checked = checked;
        fillVariant();
        fulfil();
    }

    protected boolean hasVariant() {
        return currentVariant < variants.size();
    }

    public T selectCurrentVariant() {
        if(!hasVariant()) throw new NoNewVariantsException();
        return variants.get(currentVariant);
    }

    public SolutionStep makeStep(){
        SolutionStep next = generateNext();

        this.next = next;
        next.previous = this;
        return next;
    }

    public SolutionStep rollStep(){
        previous.next = null;
        rollback();
        previous.currentVariant++;
        return previous;
    }

    public SolutionStep getNext(){
        return next;
    }

    public T getChecked(){
        return checked;
    }

    protected abstract void fillVariant();

    protected abstract void fulfil();

    protected abstract void rollback();

    protected abstract SolutionStep generateNext();

}
