package TP7.Exercice2;

public class Game {
    int[][] grille = new int[3][3] ; 
    int joueurCourant = 1; 
    boolean fini = false ;
    public void jouer(int x , int y){
        if(fini){
            System.out.println("la partie est finie");
            return ;
        }
        if (grille[x][y]==0){
            grille[x][y]= joueurCourant;
            afficheGrille();
            if (verifierGagnant()){
                System.out.println("le joueur "+joueurCourant+" a gagne la partie");
                fini =true ;
                return;
            }
            if(matchNul()){
                System.out.println("Match nul !!");
                fini = true;
                return ;  
            }
            if (joueurCourant==1){
                joueurCourant=2;
            }else{
                joueurCourant=1;
            }
        }else{
            System.out.println("case deja occupee !! ");
        }
    }
    public void afficheGrille(){
        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                System.out.print(grille[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public boolean verifierGagnant(){
        for (int i = 0 ; i < 3 ; i++){
            if (grille[i][0]!= 0 && grille[i][0]==grille[i][1] && grille[i][1]==grille[i][2]){
                return true;
            }
        }
        for (int j = 0 ; j < 3 ; j++){
            if(grille[0][j]!= 0 && grille[0][j]==grille[1][j] && grille[1][j]==grille[2][j]){
                return true;
            }
        }
        if (grille[1][1]!=0){
            if(grille[0][0]==grille[1][1] && grille[1][1]==grille[2][2]){
            return true;
            }if(grille[0][2]==grille[1][1] && grille[1][1]==grille[2][0]){
                return true ;
    }
    
}
return false ;
    }
    public boolean matchNul(){
        for(int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j< 3 ; j++){
                if (grille[i][j]==0){
                    return false ; 
                }
            }
        }
        return true ;
    }
}