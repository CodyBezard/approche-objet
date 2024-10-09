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
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitant=" + nbHabitant +
                '}';
    }
}
