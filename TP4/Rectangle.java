package TP4;
public class Rectangle extends Polygone {
    
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super("Rectangle");
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
    }
    
    @Override
    public String toString() {
        return "Forme : " + nom 
            + " | Points : " + points 
            + " | Perimetre : " + perimetre();
    }
}