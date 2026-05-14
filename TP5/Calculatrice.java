package TP5;

import java.util.InputMismatchException;
import java.util.Scanner;

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
public double lancementCalcul() {
    double nombre1 = saisieNombre();
    try {
        String operation = saisieOperation();
        double nombre2 = saisieNombre();
        
        switch (operation) {
            case "+" : return nombre1 + nombre2;
            case "-" : return nombre1 - nombre2;
            case "*" : return nombre1 * nombre2;
            case "/" : return nombre1 / nombre2;
        }
    } catch (OperationException e) {
        System.out.println(e.getMessage());
    }
    return 0;
}}

