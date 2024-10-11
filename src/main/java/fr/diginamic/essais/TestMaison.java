package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maisonPrincipale = new Maison(0);
        Cuisine cuisine = new Cuisine(20,0);
        Salon salonPrincipale = new Salon (35,0);
        WC wcEnBas = new WC(5,0);
        SalleDeBain sDB = new SalleDeBain(10,0);
        Chambre chambreEnBas = new Chambre(15,0);
        Chambre chambreDuHaut = new Chambre (50,1);
        SalleDeBain sDBDuHaut = new SalleDeBain(10,1);
        Chambre chambreTestVide = new Chambre(0,0);
        maisonPrincipale.ajouterPiece(cuisine);
        maisonPrincipale.ajouterPiece(salonPrincipale);
        maisonPrincipale.ajouterPiece(wcEnBas);
        maisonPrincipale.ajouterPiece(sDB);
        maisonPrincipale.ajouterPiece(chambreEnBas);
        maisonPrincipale.ajouterPiece(chambreDuHaut);
        maisonPrincipale.ajouterPiece(sDBDuHaut);
        maisonPrincipale.ajouterPiece(chambreTestVide);
        System.out.println(maisonPrincipale.superficieTotal());
        System.out.println(maisonPrincipale.superficieEtage(1));
        System.out.println(maisonPrincipale.superficieType("Chambre"));
        System.out.println(maisonPrincipale.superficieType("SalleDeBain"));
        System.out.println(maisonPrincipale.nombreDePieceDunType("Chambre"));


    }
}
