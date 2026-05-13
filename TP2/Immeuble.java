package TP2;

public class Immeuble extends Batiment{
    protected int nbAppart ; 
    public Immeuble (String adresse , int surfaceHabitable , int nbAppart){
        super(adresse, surfaceHabitable);
        this.nbAppart=nbAppart;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "nombre appartement : "+nbAppart;
    }
}
