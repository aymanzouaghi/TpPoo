package TP3.program;

public class Client {
    private int numeroClient ;
    public String nom;
    private double sold;
    static int Cptclient = 0 ;
    public Client (String nom){
        this.nom=nom;
        this.sold=0;
        this.numeroClient = Cptclient++ ;
    }
    public void setSold(double sold) {
        this.sold = sold;
    }
    public double getSold() {
        return sold;
    }
    public int getNumeroClient() {
        return numeroClient;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Numero client : "+numeroClient+" nom : "+nom+" sold : "+sold ;
    }
    public void crediterClient(double credit){
        this.sold+=credit;
    } 
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Client autre = (Client)obj;
        return this.nom.equals(autre.nom);
    }
}
