package TP4;

public class Point implements Translatable {
    protected double x , y ;
    public Point (double x , double y){
        this.x=x;
        this.y=y;
    }
    public double distance(Point p){
    return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }
    @Override
    public void translation(double vx, double vy) {
        // TODO Auto-generated method stub
        this.x += vx;
        this.y += vy;
    }
}