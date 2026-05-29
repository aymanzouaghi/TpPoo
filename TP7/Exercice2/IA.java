package TP7.Exercice2;

import java.util.Random;

public class IA {
    Game game;
    CaseMorpion[][] cases;
    Random random = new Random();

    public IA(Game game, CaseMorpion[][] cases) {
        this.game = game;
        this.cases = cases;
    }

    public void jouerAleatoire() {
        if (game.fini) return;

        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (game.grille[x][y] != 0);

        game.jouer(x, y);

        // Met à jour visuellement le bouton de la case jouée
        cases[x][y].button.setText("O");
        cases[x][y].button.setEnabled(false);
    }
}