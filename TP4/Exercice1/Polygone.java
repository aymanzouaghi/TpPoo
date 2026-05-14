package TP4.Exercice1 ;
import java.util.ArrayList;

public abstract class Polygone extends FormeGeometrique implements Translatable {
    
    protected ArrayList<Point> points;
    
    public Polygone(String nom) {
        super(nom);
        points = new ArrayList<>();
    }
    
    @Override
    public double perimetre() {
        double total = 0;
        for (int i = 0; i < points.size(); i++) {
            Point p1 = points.get(i);
            Point p2 = points.get((i + 1) % points.size());
            total += p1.distance(p2);
        }
        return total;
    }
    @Override
    public void translation(double vx, double vy) {
        for (Point p : points) {
            p.translation(vx, vy); // on translate chaque point
        }
    }
}
