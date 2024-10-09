package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        Collections.addAll(liste, -1, 5, 7, 3, -2, 4, 8, 5);
        int plusGrand = Integer.MIN_VALUE;
        int plusPetit = Integer.MAX_VALUE;
        for (int nombre : liste) {
            System.out.println(nombre);
            if (nombre > plusGrand) {
                plusGrand = nombre;
            }
            if (nombre < plusPetit) {
                plusPetit = nombre;
            }
        }
        System.out.println("Taille de la liste " + liste.size());
        System.out.println("Nombre le plus grand " + plusGrand);
        System.out.println("Nombre le plus petit " + plusPetit);


        Iterator<Integer> iter = liste.iterator();
        while (iter.hasNext()) {
            int nombre = iter.next();
            if (nombre == plusPetit) {
                iter.remove();
            }
        }
        for (int i=0;i<liste.size(); i++) {
            if(liste.get(i)<0){
                liste.set(i,Math.abs(liste.get(i)));
            }
            System.out.println(liste.get(i));
        }
        System.out.println(liste);
    }
}
