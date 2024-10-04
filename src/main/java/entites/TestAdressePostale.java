package entites;

public class TestAdressePostale {
    public static void main(String args[]) {
        AdressePostale adr1 = new AdressePostale();
        adr1.numeroRue = 5;
        adr1.libelleRue = "Rue de la liberté";
        adr1.codePostal = 69000;
        adr1.ville = "Lyon";
        AdressePostale adr2 = new AdressePostale();
        adr2.numeroRue = 8;
        adr2.libelleRue = "Rue de la démocratie";
        adr2.codePostal = 31000;
        adr2.ville = "Toulouse";

    }
}
