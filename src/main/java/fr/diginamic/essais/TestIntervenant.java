package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie personne1 = new Salarie("Durant", "Michel", 1700.0);
        Pigiste personne2 = new Pigiste("Dumoulin", "Etienne", 10, 250.0);
        System.out.println(personne1.getSalaire());
        System.out.println(personne1.afficherDonnees());
        System.out.println(personne2.getSalaire());
        System.out.println(personne2.afficherDonnees());
    }
}
