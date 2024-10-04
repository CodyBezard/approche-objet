package entites2;

import entites.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne(String newNom, String newPrenom){
        nom = newNom;
        prenom = newPrenom;
    }
    public Personne(String nouvNom, String nouvPrenom, AdressePostale nouvAdresse){
        this.nom = nouvNom;
        this.prenom = nouvPrenom;
        this.adresse = nouvAdresse;

    }
}
