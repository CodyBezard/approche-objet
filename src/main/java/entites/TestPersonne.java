package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String args[]) {

        Personne pers1 = new Personne();
        pers1.nom = "Dupont";
        pers1.prenom = "Michel";
        pers1.adresse.numeroRue = 5;
        pers1.adresse.libelleRue = "Rue de la liberté";
        pers1.adresse.codePostal = 69000;
        pers1.adresse.ville = "Lyon";


        Personne pers2 = new Personne();
        pers2.nom = "Dupont";
        pers2.prenom = "Michel";
        pers2.adresse.numeroRue = 8;
        pers2.adresse.libelleRue = "Rue de la democratie";
        pers2.adresse.codePostal = 31000;
        pers2.adresse.ville = "Toulouse";
    }
}
