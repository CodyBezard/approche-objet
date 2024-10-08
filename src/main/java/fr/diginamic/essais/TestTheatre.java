package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre petitTheatre = new Theatre("Moulin Rouge", 500);
        petitTheatre.inscrire(250,30);
        System.out.println(petitTheatre);
        petitTheatre.inscrire(250,25);
        System.out.println(petitTheatre);
        petitTheatre.inscrire(10,35);
        System.out.println(petitTheatre);

        System.out.println(petitTheatre.getTotalClient());
        System.out.println(petitTheatre.getRecetteTotal());
    }
}
