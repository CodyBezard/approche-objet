package fr.diginamic.maison;

public class Maison {
    Piece[] maison = new Piece[]{};
    public void ajouterPiece(Piece piece){
        Piece[]maisonTampon = new Piece[maison.length];
        for (Piece espace:maison){
            int i=0;
            maisonTampon[i]=espace;
            i++;
        }
        maison=maisonTampon;
    }
//    public int superficieTotal(Piece[] maison){
//
//    }

}
