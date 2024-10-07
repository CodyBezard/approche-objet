package banque;

import banque.entites.Compte;
import banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] tableauCompte = {(new Compte(123456,10000)),(new CompteTaux(16577,30,2.2))};
        for(int i=0;i<tableauCompte.length;i++){
            System.out.println(tableauCompte[i]);
        }
//        System.out.println(cpt);
//        System.out.println(cpt.getNumeroCompte());
    }

}
