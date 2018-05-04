package alg;

import structures.Line;

public class LinePair {
    private Line crumpled;
    private Line leveled;
    private boolean checked = false;

    public LinePair(Line crumpled, Line leveled){
        this.crumpled = crumpled;
        this.leveled = leveled;
    }

    public Line getCrumpled(){
        return crumpled;
    }

    public Line getLeveled() {
        return leveled;
    }

    public boolean isMargin(){
        return leveled.isMargin();
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

}
