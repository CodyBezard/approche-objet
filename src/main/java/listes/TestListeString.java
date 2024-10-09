package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        Collections.addAll(liste,"Nice","Carcassonne","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes");
        String villeNomLePlusGrand="";
        for(String ville:liste){
            if(ville.length()>villeNomLePlusGrand.length()){
                villeNomLePlusGrand=ville;
            }
        }
        System.out.println(villeNomLePlusGrand);

        for(int i=0; i<liste.size(); i++){
            liste.set(i, (liste.get(i)).toUpperCase());
        }

        System.out.println(liste);
        Iterator<String> iter = liste.iterator();
        while (iter.hasNext()){
            String ville=iter.next();
            if(ville.charAt(0)=='N'){
                iter.remove();
            }
        }
        System.out.println(liste);
    }

}
