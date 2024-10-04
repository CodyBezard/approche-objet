package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String args[]) {

        AdressePostale adr1 = new AdressePostale();
        adr1.numeroRue = 5;
        adr1.libelleRue = "Rue de la liberté";
        adr1.codePostal = 69000;
        adr1.ville = "Lyon";

        Personne pers1 = new Personne();
        pers1.nom = "Dupont";
        pers1.prenom = "Michel";
        pers1.adresse = adr1;

        AdressePostale adr2 = new AdressePostale();
        adr2.numeroRue = 8;
        adr2.libelleRue = "Rue de la démocratie";
        adr2.codePostal = 31000;
        adr2.ville = "Toulouse";

        Personne pers2 = new Personne();
        pers2.nom = "Dupont";
        pers2.prenom = "Michel";
        pers2.adresse = adr2;
    }
}
