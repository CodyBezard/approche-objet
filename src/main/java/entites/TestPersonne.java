package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String args[]) {

        Personne pers1 = new Personne("Dupont","Michel", new AdressePostale(5,"Rue de la liberté", 69000, "Lyon"));
        Personne pers2 = new Personne("Dumoulin","Guy", new AdressePostale(8,"Rue de la democratie", 31000, "Toulouse"));
    }
}
