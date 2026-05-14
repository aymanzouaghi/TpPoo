package TP4.Exercice2;
import java.util.Comparator;
public class ComparateurPIB implements Comparator<Region> {
    public ComparateurPIB (){}
    @Override
    public int compare(Region arg0, Region arg1) {
        return (arg0.getPib()-arg1.getPib());
    }
}
