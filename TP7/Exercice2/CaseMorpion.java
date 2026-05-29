package TP7.Exercice2;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaseMorpion {
    Game game = new Game();
    JButton button;
    int x, y ;
    IA ia;
    public CaseMorpion (int x, int y , Game game, IA ia){
        this.x=x;
        this.y=y;
        this.ia=ia;
        this.game=game;
        this.button= new JButton("");
        button.addActionListener(new ActionListener (){
            public void actionPerformed(ActionEvent e){
                String symbole = (game.joueurCourant == 1) ? "X" : "O";
                game.jouer(x, y);
                button.setText(symbole);
                button.setEnabled(false);
                if (!game.fini) {
                    ia.jouerAleatoire();
                }
            }
            
        });
    }
}
