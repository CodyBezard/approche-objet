package banque.entites;

public class CompteTaux extends Compte{
    double tauxRemuneration;

    public CompteTaux(int numero, int solde, double taux){
        super(numero,solde);
        this.tauxRemuneration = taux;
    }
    public String toString(){
        return super.toString()+ " avec un taux de "+tauxRemuneration;
    }
}
