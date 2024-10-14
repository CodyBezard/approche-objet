package listes;

public class Ville {
    String nom;
    int nbHabitant;
    public Ville(String nom,int habitant){
        this.nom=nom;
        this.nbHabitant=habitant;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Ville)){
            return false;
        }
        Ville other = (Ville) obj;
        return (nom.equals(other.getNom()))&& (nbHabitant==other.getNbHabitant());
    }


    @Override
    public String toString() {
        return nom + " " +nbHabitant;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitant() {
        return nbHabitant;
    }
}
