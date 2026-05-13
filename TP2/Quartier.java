package TP2;

import java.util.ArrayList;

public class Quartier {
    ArrayList<Batiment> Batiments ;
    public Quartier (){
        Batiments = new ArrayList<>();
    }
    public void ajoutBatiment(Batiment b){
        Batiments.add(b);
    }
    public void afficheBatiments(int cat){
        for(Batiment b : Batiments){
            if (b.categorie()>=cat) System.out.println(b);
        }
    }
    public Batiment plusGrandBatiment() {
    Batiment plusGrand = Batiments.get(0);
    for (Batiment b : Batiments) {
        plusGrand = plusGrand.comparer(b);
    }
    return plusGrand;
}
}
