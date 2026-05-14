package TP4.Exercice2;
import java.util.Comparator;
public class ComparateurDensite implements Comparator<Region> {
    public ComparateurDensite(){}
public int compare(Region arg0, Region arg1) {
    double densite0 = (double) arg0.getNbHabitants() / arg0.getSuperficie();
    double densite1 = (double) arg1.getNbHabitants() / arg1.getSuperficie();
    return Double.compare(densite0, densite1);
}
}
