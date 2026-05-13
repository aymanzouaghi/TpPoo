package TP3.program;

import java.util.ArrayList;

public class Annuaire {
    public ArrayList<Client> ListeClients ; 
    public Annuaire (){
        ListeClients = new ArrayList<>() ; 
    }
    public void ajouterClient (Client c){
        ListeClients.add(c);
    }
    public int tailleAnnuaire(){
        return ListeClients.size();
    }
    public void afficheClients(){
        for (Client c : ListeClients){
            System.out.println(c);
        }
    }
    public Client idClient(int id) {
    for (Client c : ListeClients) {
        if (c.getNumeroClient() == id) {
            return c;
        }
    }
    return null;
}
    public void afficheSoldClients(){
        for (Client c : ListeClients){
            System.out.println(c.getSold());
        }
}
    public boolean contient(Client c){
        return ListeClients.contains(c);
    }

}