package banque.entites;

public class Compte {
    private int numeroCompte;
    private int soldeCompte;

    public Compte (int numero, int solde){
        this.numeroCompte=numero;
        this.soldeCompte = solde;
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
