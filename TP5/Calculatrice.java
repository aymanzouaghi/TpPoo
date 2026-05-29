package TP5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Calculatrice {
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
    
    try {
        String operation = saisieOperation();
        double nombre1 = saisieNombre();
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

