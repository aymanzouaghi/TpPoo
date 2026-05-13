package TP2;
public class TestBatiment {
    public static void main(String[] args) {

    Batiment b = new Batiment("1 rue de la Paix", 25);
    Maison m = new Maison("12 allée des Roses", 90, 150, 5);
    Immeuble i = new Immeuble("7 boulevard Haussmann", 1200, 24);

    System.out.println(b);
    System.out.println(m);
    System.out.println(i);
    Batiment[] tableau = new Batiment[3];
tableau[0] = b;
tableau[1] = m;
tableau[2] = i;

for (Batiment bat : tableau) {
    System.out.println(bat);
}
Quartier q = new Quartier() ; 
q.ajoutBatiment(b);
q.ajoutBatiment(m);
q.ajoutBatiment(i);

for(Batiment bat : q.Batiments){
    System.out.println(bat);
}
System.out.println(b.comparer(m));
System.out.println(q.plusGrandBatiment());

}
    public static int surfaceHabitableTotale(Batiment[] tabBatiment ){
        int surfaceTotale = 0;
        for (Batiment b : tabBatiment){
            surfaceTotale+=b.getSurfaceHabitable() ; 
        }
        return surfaceTotale ; 
    } 
        public static int surfaceJardinTotale(Maison[] tabMaisons ){
        int surfaceTotale = 0;
        for (Maison m : tabMaisons){
            surfaceTotale+=m.getSurfaceJardin() ; 
        }
        return surfaceTotale ; 
    } 
}
