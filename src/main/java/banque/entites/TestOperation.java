package banque.entites;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] tabOperation = new Operation[4];
        tabOperation[0]= new Credit("Hier",100,'+');
        tabOperation[1]= new Debit("Avant-hier",100,'-');
        tabOperation[2]= new Credit("Il y a une heure", 150,'+');
        tabOperation[3]= new Debit("Il y a 10min",30,'-');
        double montantGlobal =0d;
        for (int i=0; i<tabOperation.length;i++) {
            System.out.println(tabOperation[i].toString()+ " " +tabOperation[i].getType() );
            if(tabOperation[i].getType() == "CREDIT" ){
                montantGlobal = montantGlobal + tabOperation[i].montantOperation;
            } else if (tabOperation[i].getType() == "DEBIT" ) {
                montantGlobal = montantGlobal - tabOperation[i].montantOperation;
            }
        }
        System.out.println("Le montant total des opérations est de "+ montantGlobal);
    }
}
