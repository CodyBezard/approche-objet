package fr.diginamic.entites;

public class Salarie {
    private String nom;
    private String prenom;
    private Double salaire;

    //constructeur
    public Salarie(String nom, String prenom, Double salaire){
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;

    }

    @Override
    public String toString() {
        return "Salarie{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
