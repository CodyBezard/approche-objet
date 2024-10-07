package banque.entites;

public class Compte {
    protected int numeroCompte;
    protected int soldeCompte;

    public Compte (int numero, int solde){
        this.numeroCompte=numero;
        this.soldeCompte = solde;
    }

    @Override
    public String toString(){
        return numeroCompte+" "+soldeCompte;
    }

    public int getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(int numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public int getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(int soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

}
