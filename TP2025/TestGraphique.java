package TP2025;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestGraphique {
    public static void main(String[] args) {

        // 1. Créer l'université
        Universite universite = new Universite();

        // 2. Créer la fenêtre
        JFrame window = new JFrame("Inscription Université");
        window.setSize(400, 250);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. On utilise BorderLayout pour la fenêtre principale
        // → le formulaire va au CENTER, les boutons au SOUTH
        window.setLayout(new BorderLayout());

        // ── FORMULAIRE (CENTER) ──
        // GridLayout(3,2) → 3 lignes, 2 colonnes : label | champ
        JPanel formulaire = new JPanel(new GridLayout(3, 2));

        JLabel labelId = new JLabel("Identifiant :");
        JTextField champId = new JTextField();

        JLabel labelMoyenne = new JLabel("Moyenne :");
        JTextField champMoyenne = new JTextField();

        JLabel labelCursus = new JLabel("Cursus (Informatique / Mathematiques / PhysiqueChimie) :");
        JTextField champCursus = new JTextField();

        // On ajoute dans l'ordre : label puis champ, label puis champ...
        formulaire.add(labelId);
        formulaire.add(champId);
        formulaire.add(labelMoyenne);
        formulaire.add(champMoyenne);
        formulaire.add(labelCursus);
        formulaire.add(champCursus);

        // ── BOUTONS (SOUTH) ──
        JPanel panneauBoutons = new JPanel(new FlowLayout());
        JButton boutonInscrire = new JButton("Inscrire");
        JButton boutonAfficher = new JButton("Afficher effectifs");

        panneauBoutons.add(boutonInscrire);
        panneauBoutons.add(boutonAfficher);

        // ── BOUTON INSCRIRE ──
        boutonInscrire.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // On récupère les valeurs des champs
                    int id = Integer.parseInt(champId.getText());
                    double moyenne = Double.parseDouble(champMoyenne.getText());
                    String cursus = champCursus.getText();

                    // On crée l'étudiant et on l'ajoute
                    Etudiant etudiant = new Etudiant(id, moyenne, cursus);
                    universite.ajoutEtudiant(etudiant);

                    JOptionPane.showMessageDialog(window, "Etudiant traité !");

                    // On vide les champs après inscription
                    champId.setText("");
                    champMoyenne.setText("");
                    champCursus.setText("");

                } catch (NumberFormatException ex) {
                    // Si l'utilisateur tape une lettre dans identifiant ou moyenne
                    JOptionPane.showMessageDialog(window, "Erreur : identifiant et moyenne doivent être des nombres !");
                }
            }
        });

        // ── BOUTON AFFICHER ──
        boutonAfficher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                universite.afficherEffectifParCursus(); // affiche dans la console
            }
        });

        // 4. Ajouter les panneaux à la fenêtre
        window.add(formulaire, BorderLayout.CENTER);
        window.add(panneauBoutons, BorderLayout.SOUTH);

        // 5. Afficher
        window.setVisible(true);
    }
}