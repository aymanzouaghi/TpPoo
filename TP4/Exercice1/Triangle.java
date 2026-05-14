package TP4.Exercice1;

public class Triangle extends Polygone {
    
    public Triangle(Point p1, Point p2, Point p3) {
        super("Triangle");
        points.add(p1);
        points.add(p2);
        points.add(p3);
    }
    
    @Override
    public String toString() {
        return "Forme : " + nom 
            + " | Points : " + points 
            + " | Perimetre : " + perimetre();
    }
}