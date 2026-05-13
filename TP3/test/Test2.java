package TP3.test;
import TP3.program.*;
public class Test2 {
    public static void main(String[] args) {
        Client c1 = new Client("ZOUAGHI");
        Client c2 = new Client("ZOUAGHI");
        Annuaire annuaire = new Annuaire();	
        annuaire.ajouterClient(c1);
        System.out.println(annuaire.contient(c2));
    }

}
//reponse au debut false car c pas le meme objet mais apres avoir changer la logique de la methode equals c est devenu true psq on compare que les noms 