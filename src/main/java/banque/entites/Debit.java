package banque.entites;

public class Debit extends Operation {
    char debit;

    public Debit(String date, double montant, char debit) {
        super(date, montant);
        this.debit = debit;

    }

    public String getType() {
        return "DEBIT";
    }
}
