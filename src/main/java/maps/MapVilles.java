package maps;

import listes.Ville;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class MapVilles {
    public static void main(String[] args) {
        HashMap<String, Ville> map = new HashMap<>();
        ArrayList<Ville> liste = new ArrayList<>();
        Collections.addAll(liste, new Ville("Nice",343000), new Ville("Carcassonne",47800),
                new Ville("Narbonne",53400), new Ville("Lyon",484000), new Ville("Foix",
                        9700), new Ville("Pau",77200), new Ville("Marseille",850700),
                new Ville("Tarbes",40600));
        int plusPetit = Integer.MAX_VALUE;
        for (Ville ville:liste) {
            String nom = ville.getNom();
            map.put(nom, ville);
            if(ville.getNbHabitant()<plusPetit){
                plusPetit=ville.getNbHabitant();
            }
        }
        for(String clef:map.keySet()){
            System.out.println(clef + " " +map.get(clef));
        }
        System.out.println(plusPetit);
//        for(String clef:map.keySet()){
//            if(map.values())
//        }

    }
}
