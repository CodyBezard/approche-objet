package fr.diginamic.maison;

public abstract class Piece {
    double superficie;
    int etage;
    public Piece(double surface, int etage){
        this.superficie=surface;
        this.etage=etage;
    }
}
