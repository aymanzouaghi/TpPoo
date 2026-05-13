package TP2;

public class Maison extends Batiment{
    protected int nbPieces ; 
    protected int surfaceJardin ; 
    public Maison (String adresse , int surfaceHabitable , int nbPieces , int surfaceJardin){
        super(adresse, surfaceHabitable);
        this.nbPieces=nbPieces;
        this.surfaceJardin=surfaceJardin;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"nombre des pieces : "+nbPieces+"surface jardin : "+surfaceJardin;
    }
    public int getSurfaceJardin() {
    return surfaceJardin;
}
}