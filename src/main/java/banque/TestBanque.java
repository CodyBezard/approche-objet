package banque;

import banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte cpt = new Compte(123456,10000);
        System.out.println(cpt);
        System.out.println(cpt.getNumeroCompte());
        System.out.println(cpt.getSoldeCompte());
    }
}
