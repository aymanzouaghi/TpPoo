package TP4;
import java.util.Collections;
import java.util.ArrayList;

public class TestRegion {
    public static void main(String[] args) {
        
        ArrayList<Region> regions = new ArrayList<>();
        
        regions.add(new Region("Centre-Val de Loire", 2566759, 70, 39151));
        regions.add(new Region("Bretagne", 3329395, 92, 27208));
        regions.add(new Region("Ile-de-France", 12213364, 669, 12011));
        regions.add(new Region("Auvergne-Rhône-Alpes", 8026685, 250, 69711));
        
        // Q5 - afficher toutes les régions
        for (Region r : regions) {
            System.out.println(r);
        }
        Collections.sort(regions);

for (Region r : regions) {
    System.out.println(r);
}
// Trier par PIB
Collections.sort(regions, new ComparateurPIB());
System.out.println("=== Tri par PIB ===");
for (Region r : regions) {
    System.out.println(r);
}

// Trier par densité
Collections.sort(regions, new ComparateurDensite());
System.out.println("=== Tri par densité ===");
for (Region r : regions) {
    System.out.println(r);
}
}
    }

