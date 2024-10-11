package fr.diginamic.maison;

public class Maison {
    Piece[] maison = new Piece[]{};
    public Maison(int size){
        this.maison= new Piece[size];
    }

    public void ajouterPiece(Piece piece){
        if(piece.getEtage()<0 || piece.getSuperficie()<=0){
            System.out.println("La pièce "+ piece.getName() +" ne peut pas exister");
            System.out.println("La superficie doit être positive et l'étage doit être au moins de 0");
        }else{
            if(maison.length==0){
                Piece[] maisonTampon = new Piece[1];
                maisonTampon[0]= piece;
                maison=maisonTampon;
            }else {
                Piece[] maisonTampon = new Piece[maison.length + 1];
                for (int i = 0; i < maison.length; i++) {
                    maisonTampon[i]=maison[i];
                }
                maisonTampon[maison.length]= piece;
                maison=maisonTampon;
            }
        }

    }
    public double superficieTotal(){
        double surfaceTotal=0;
        for (Piece piece : maison){
            surfaceTotal+=piece.getSuperficie();
        }
        return surfaceTotal;
    }

    public double superficieEtage(int etage){
        double superficieEtage=0;
        for (Piece piece :maison){
            if(piece.getEtage()==etage){
                superficieEtage+=piece.getSuperficie();
            }
        }
        return superficieEtage;
    }

    public String superficieType (String typePiece){
        double superficieType=0;
        for(Piece piece : maison){
            if(piece.getName()==typePiece){
                superficieType+=piece.getSuperficie();
            }
        }
        return ("La superficie totale des " + typePiece + " est de " + superficieType);
    }
    public String nombreDePieceDunType (String typePiece){
        int nombreDeType=0;
        for(Piece piece : maison){
            if(piece.getName()==typePiece){
                nombreDeType++;
            }
        }
        return ("Le nombre total des " + typePiece + " est de " + nombreDeType);
    }

}
