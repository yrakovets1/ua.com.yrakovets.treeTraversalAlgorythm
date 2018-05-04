package structures;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public boolean equals (Line anotherLine){
        return p1.equals(anotherLine.p1)
                && p2.equals(anotherLine.p2);
    }

    public boolean revertEquals(Line anotherLine) {
        return p1.equals(anotherLine.p2)
                && p2.equals(anotherLine.p1);
    }


    public boolean isMargin() {
        return (Math.abs(p1.getX()) < Configuration.PRECISION
                && Math.abs(p2.getX()) < Configuration.PRECISION) //left side

                || (Math.abs(p1.getX() - 1) < Configuration.PRECISION
                && Math.abs(p2.getX()- 1) < Configuration.PRECISION) //right side

                || (Math.abs(p1.getY()) < Configuration.PRECISION
                && Math.abs(p2.getY()) < Configuration.PRECISION) // bottom

                || (Math.abs(p1.getY() - 1) < Configuration.PRECISION
                && Math.abs(p2.getY() - 1) < Configuration.PRECISION); //top
    }
}
