package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {
        ArrayList<Ville> liste = new ArrayList<>();
        Collections.addAll(liste, new Ville("Nice",343000), new Ville("Carcassonne",47800),
                new Ville("Narbonne",53400), new Ville("Lyon",484000), new Ville("Foix",
                        9700), new Ville("Pau",77200), new Ville("Marseille",850700),
                        new Ville("Tarbes",40600));
        int plusPeuple=Integer.MIN_VALUE;
        int moinsPeuple=Integer.MAX_VALUE;
        for (Ville ville:liste){
            if(ville.nbHabitant>plusPeuple){
                plusPeuple=ville.nbHabitant;
            }
            if (ville.nbHabitant<moinsPeuple){
                moinsPeuple=ville.nbHabitant;
            }
        }
        Iterator<Ville> iter = liste.iterator();
        while (iter.hasNext()){
            Ville ville = iter.next();
            if(ville.nbHabitant == plusPeuple){
                System.out.println(ville);
            }
            if(ville.nbHabitant == moinsPeuple){
                iter.remove();
            }
        }

        for (Ville ville:liste){
            if(ville.nbHabitant > 100000){
                ville.nom=ville.nom.toUpperCase();
            }
            System.out.println(ville);
        }
    }
}
