package TP3.test;
import TP3.program.*;
import TP3.util.*;
public class Test {

	public static void main(String[] args) {
	
		Annuaire annuaire = new Annuaire();	
		
		
		int rep =0; 
		while(rep!=-1){              
			System.out.println("1 ===>  Ajouter un nouveau client"); 
			System.out.println("2 ===>  Afficher la taille de l'annuaire"); 
			System.out.println("3 ===>  Afficher l'annuaire complet"); 
			System.out.println("4 ===>  Rechercher un client par son identifiant"); 
			System.out.println("5 ===>  Supprimer un client par son identifiant"); 
			System.out.println("6 ===>  Crediter le solde d'un client"); 
			System.out.println("7 ===>  Afficher le total des soldes des clients de l'annuaire"); 
			System.out.println("-1 ===>  Quitter"); 
			rep = Saisie.lireEntier("Votre choix ?"); 
			
			if(rep == 1){              

				String rep1 = Saisie.lireString("Quelle est votre nom : "); 
				Client c = new Client(rep1) ; 
				annuaire.ajouterClient(c);
				
				
			} else if (rep ==2){ 
				System.out.println(annuaire.tailleAnnuaire());
				
		
	
			} else if (rep ==3){ 
				annuaire.afficheClients();
				
				
			} else if (rep ==4){ 
				int id = Saisie.lireEntier("Indiquez l'identifiant s'il vous plait : ");
				System.out.println(annuaire.idClient(id));
				
			} else if (rep ==5){ 
				int id = Saisie.lireEntier("Indiquez l'identifiant du Client a supprimer s'il vous plait : ");
				annuaire.ListeClients.remove(annuaire.idClient((id)));
				//A completer
				
			} else if (rep ==6){ 
				int id = Saisie.lireEntier("Indiquez l'identifiant du Client a crediter s'il vous plait : ");
				double credit = Saisie.lireReel("Indiquez le montant a crediter pour le client "+annuaire.idClient(id).nom);
				annuaire.idClient(id).crediterClient(credit);
				//A completer
				
			} else if (rep ==7){ 
				annuaire.afficheSoldClients();
				//A completer
				
			}
		}
		
		
	}
}
