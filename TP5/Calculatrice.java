package TP5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Calculatrice {
    /*Créer une classe Calculatrice avec une méthode saisieNombre() qui demande à l’utilisateur
de saisir un nombre de type double et renvoie ce nombre. Inspirez vous pour cela de l’annexe
du tp 5. Attention, la méthode close() appelé sur un objet de type Scanner ferme le flux
d’entrée system.in, ce qui rendra impossible la saisie de nouvelles données par la suite. Il
est préférable pour ce TP de créer un seul objet Scanner qu’on fermera seulement à la fin de
l’application. Une deuxième option est de ne pas faire appel à cette méthode close(). */
Scanner sc = new Scanner(System.in);
public double saisieNombre (){
    System.out.println("Entrez un nombre reel : ");
    
    while(true){ try {
        return sc.nextDouble();
    } catch (InputMismatchException e) {
        sc.next(); // vider le buffer
        System.out.println("Erreur de saisie reessayez");
    }
}}
public String saisieOperation() throws OperationException {
    System.out.print("Entrez une opération (+, -, *, /) : ");
    String op = sc.next();
    
    String[] opsAdmissibles = {"+", "-", "*", "/"};
    for (String o : opsAdmissibles) {
        if (o.equals(op)) return op;
    }
    throw new OperationException();
}
public double lancementCalcul() throws IOException {
    double nombre1 = saisieNombre();
    try {
        String operation = saisieOperation();
        double nombre2 = saisieNombre();
        double resultat = 0;
        
        switch (operation) {
            case "+" : resultat = nombre1 + nombre2; break;
            case "-" : resultat = nombre1 - nombre2; break;
            case "*" : resultat = nombre1 * nombre2; break;
            case "/" : resultat = nombre1 / nombre2; break;
        }
        sauvegarde(nombre1, operation, nombre2, resultat);
        return resultat;
        
    } catch (OperationException e) {
        System.out.println(e.getMessage());
    }
    return 0;
}
public void sauvegarde(double nombre1, String operation, double nombre2, double resultat) throws IOException {
    FileWriter w = new FileWriter("log.txt", true);
    w.write(LocalDateTime.now() + " : " + nombre1 + " " + operation + " " + nombre2 + " = " + resultat + "\n");
    w.close();
}
}

