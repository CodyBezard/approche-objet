package banque.entites;

public abstract class Operation {
    String dateOperation;
    double montantOperation;
    public Operation(String date, double montant){
        this.dateOperation = date;
        this.montantOperation = montant;
    }
    @Override
    public String toString(){
        return "Date Operation :" + dateOperation+ "/ Montant opération : " + montantOperation;
    }

    public abstract String getType();
}
