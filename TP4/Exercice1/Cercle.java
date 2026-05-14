package TP4.Exercice1;

public class Cercle extends FormeGeometrique implements Translatable {
    protected double rayon ;
    protected Point centre ;
    public Cercle (double rayon , double x , double y){
        super("Cercle");
        this.centre = new Point(x, y);
    }
    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
    
    @Override
    public String toString() {
        return "Forme : " + nom 
            + " | Centre : " + centre 
            + " | Rayon : " + rayon 
            + " | Perimetre : " + perimetre();
    }
    @Override
    public void translation(double vx, double vy) {
        // TODO Auto-generated method stub
        centre.translation(vx, vy);
    }
}

