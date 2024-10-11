package listes;

public class Ville {
    String nom;
    int nbHabitant;
    public Ville(String nom,int habitant){
        this.nom=nom;
        this.nbHabitant=habitant;
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
