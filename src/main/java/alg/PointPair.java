package alg;


import structures.Point;

public class PointPair {
    private Point crumpled;
    private Point leveled;
    private boolean checked = false;

    public PointPair(Point crumpled, Point leveled){
        this.crumpled = crumpled;
        this.leveled = leveled;
    }

    public Point getCrumpled(){
        return crumpled;
    }

    public Point getLeveled() {
        return leveled;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public boolean isChecked() {
        return checked;
    }

    public int leveledMargin(){
        return leveled.margin();
    }
}
