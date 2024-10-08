package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

    static String chaine = "Durand;Marcel;2 523.5";
    char premierCaractere = chaine.charAt(0);
    int longueurChaine = chaine.length();
    int indexChaine = chaine.indexOf(';');
    String extraitChaine = chaine.substring(2,6);
    String extraitNomFamille = chaine.substring((chaine.indexOf('M')),chaine.indexOf('l')+1);
    String majFamille = extraitNomFamille.toUpperCase();
    String minFamille = extraitNomFamille.toLowerCase();
    static String[] chaineDecoupe = chaine.split(";");



    public static void main(String[] args) {
        for (String mot : chaineDecoupe) {
            System.out.println(mot);
        }
        Salarie individu1 = new Salarie(chaineDecoupe[0],chaineDecoupe[1],Double.parseDouble(chaineDecoupe[2].replace(" ","")));
        System.out.println(individu1);
    }


}
