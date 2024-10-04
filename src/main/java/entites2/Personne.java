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
    public void nomPrenom(){
        System.out.println(nom.toUpperCase() + " " + this.prenom);
    }

    public void setNom(String updatedNom){
        this.nom = updatedNom;
    }
    public void setPrenom(String updatedPrenom){
        this.prenom = updatedPrenom;
    }
    public void setAdresse(AdressePostale updatedAdresse){
        this.adresse = updatedAdresse;
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }
    public AdressePostale getAdress(){
        return adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
