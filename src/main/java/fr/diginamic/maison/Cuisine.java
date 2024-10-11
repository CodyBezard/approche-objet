package fr.diginamic.maison;

public class Cuisine extends Piece{
    public Cuisine(double surface, int etage) {
        super(surface, etage);
    }
    public String getName(){
        return "Cuisine";
    }
}
