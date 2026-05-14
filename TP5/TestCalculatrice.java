package TP5;
import java.io.IOException;
public class TestCalculatrice {
    public static void main(String[] args) throws IOException {
                Calculatrice calc = new Calculatrice();
        double resultat = calc.lancementCalcul();
        System.out.println("Le résultat est " + resultat);
    }
}