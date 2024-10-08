package fr.diginamic.operations;

public class CalculMoyenne {
    private Double[] tableau;

    //Constructeur//
    public CalculMoyenne(Double[] tableau){
        this.tableau=tableau;
    }

    //Methode//
    public void add(Double a){
           if (tableau[tableau.length-1] != 0.0){
               Double[]tableauCopy = new Double[tableau.length+1];
               int i=0;
                for(Double number: tableau){
                    tableauCopy[i]=number;
                    i++;
                }
                tableauCopy[tableauCopy.length-1]=a;
                this.tableau = tableauCopy;
           }else{
                tableau[tableau.length-1]=a;
           }
    }
    public void printNumbers(){
        for(Double number:tableau){
            System.out.println(number);
        }
    }
    public Double calcul(){
        Double buffer=0.0;
        int compteur=0;
        for(Double number:tableau){
            buffer+=number;
            compteur++;
        }
        return (buffer/compteur);
    }
}
