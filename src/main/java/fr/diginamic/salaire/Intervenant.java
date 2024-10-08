package fr.diginamic.salaire;

public abstract class Intervenant {
    private String nom;
    private String prenom;

    public Intervenant(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
    }

    public abstract Double getSalaire();

    public abstract String getStatut();

    public String afficherDonnees(){
        return ("L'intervenant.e " + nom + " "+ prenom+ " est payé.e " + getSalaire() +" par mois. Iel est sous le statut de " + getStatut());
    }
}
