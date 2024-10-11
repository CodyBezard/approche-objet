package fr.diginamic.maison;

public class SalleDeBain extends Piece{
    public SalleDeBain(double surface, int etage) {
        super(surface, etage);
    }
    public String getName(){
        return "SalleDeBain";
    }
}
