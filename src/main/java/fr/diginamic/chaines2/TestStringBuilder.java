package fr.diginamic.chaines2;

import java.sql.SQLOutput;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        long debut = System.currentTimeMillis();
        for (int i = 1; i < 100001; i++) {
            builder.append(i);
        }
        long fin = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes :" + (fin - debut));

        String allNumber = null;
        long debutPlus = System.currentTimeMillis();
        for (int i = 1; i < 100001 ; i++) {
            allNumber = (allNumber +" " + i);

        }
        long finPlus = System.currentTimeMillis();
        System.out.println("Temps écoulé en millisecondes avec methode Plus :" + (finPlus - debutPlus));
    }


}
