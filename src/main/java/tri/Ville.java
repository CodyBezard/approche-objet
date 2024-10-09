package tri;

public class Ville implements Comparable<Ville>{
    String nom;
    int nbHabitant;
    public Ville(String nom, int habitant){
        this.nom=nom;
        this.nbHabitant=habitant;
    }

    // Methode compare selon l'ordre alphabetique des String nom
//    @Override
//    public int compareTo(Ville autre) {
//        return this.nom.compareTo(autre.nom);
//    }
    //Methode compare selon l'ordre numérique du nombre d'habitant
    @Override
    public int compareTo(Ville autre){
        if(this.nbHabitant < autre.nbHabitant){
            return -1;
        } else if (this.nbHabitant > autre.nbHabitant) {
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                ", nbHabitant=" + nbHabitant +
                '}';
    }
}
