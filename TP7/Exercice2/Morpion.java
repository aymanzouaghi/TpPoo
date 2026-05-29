package TP7.Exercice2;

import javax.swing.JFrame;
import java.awt.GridLayout;

public class Morpion {
    public static void main(String[] args) {
        Game game = new Game();

        JFrame window = new JFrame("Morpion");
        window.setSize(300, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new GridLayout(3, 3));

        // On crée d'abord le tableau de cases
        CaseMorpion[][] cases = new CaseMorpion[3][3];

        // On crée l'IA avec le tableau (encore vide mais la référence est passée)
        IA ia = new IA(game, cases);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cases[i][j] = new CaseMorpion(i, j, game, ia);
                window.add(cases[i][j].button);
            }
        }

        window.setVisible(true);
    }
}