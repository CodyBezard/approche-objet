package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String args[]) {

        AdressePostale a1 = new AdressePostale(15,"Rue du quai", 51000, "Reims");

        Personne pers1 = new Personne("Dupont","Michel", new AdressePostale(5,"Rue de la liberté", 69000, "Lyon"));
        Personne pers2 = new Personne("Dumoulin","Guy", new AdressePostale(8,"Rue de la democratie", 31000, "Toulouse"));
        pers1.nomPrenom();
        pers2.nomPrenom();

        pers1.setPrenom("Pierre");
        pers1.nomPrenom();
        pers2.setAdresse(a1);
        System.out.println(pers2.getAdress());
        System.out.println(pers1);

        Personne pers3 = new Personne("Guy", "Pierre");
        pers3.setAdresse(a1);
        System.out.println(pers3);
    }
}
