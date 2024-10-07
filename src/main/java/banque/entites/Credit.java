package banque.entites;

public class Credit extends Operation{
    char credit;
    public Credit(String date, double montant, char credit){
        super(date,montant);
        this.credit=credit;

    }
    public String getType(){
        return "CREDIT";
    }
}
