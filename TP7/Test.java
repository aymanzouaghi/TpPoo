package TP7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Test {
    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Ma fenetre");
        fenetre.setSize(1024, 1024);
        fenetre.setLayout(new FlowLayout());
        JLabel label = new JLabel("What's your name : ");
        JButton button = new JButton("OK");
        JTextField champ = new JTextField(20);
        fenetre.add(label);
        fenetre.add(champ);
        fenetre.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(champ.getText());
            }
        });

        fenetre.add(label);
        fenetre.add(champ);
        fenetre.add(button);

        fenetre.setVisible(true);
    }}