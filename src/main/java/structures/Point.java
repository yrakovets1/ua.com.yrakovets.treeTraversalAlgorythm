package structures;

import static java.lang.Math.abs;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean equals(Object obj) {
        return obj.getClass().equals(this.getClass())
                && doubleEquals(this.x, ((Point)obj).x)
                && doubleEquals(this.y, ((Point)obj).y) ;
    }

    private static boolean doubleEquals(double a, double b){
        return abs(a-b) < Configuration.PRECISION;
    }

    public boolean isCorrect(){
        return x >= 0 - Configuration.PRECISION
                && x <= 1 + Configuration.PRECISION
                && y >= 0 - Configuration.PRECISION
                && y <= 1 + Configuration.PRECISION;
    }

    public int margin(){
        int margin = 0;
        if(abs(x) < Configuration.PRECISION || abs(x - 1) < Configuration.PRECISION) margin++;
        if(abs(y) < Configuration.PRECISION || abs(y - 1) < Configuration.PRECISION) margin++;
        return margin;
    }

}
