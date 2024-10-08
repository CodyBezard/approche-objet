package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    private int jourTravail;
    private Double montantJournalier;
    private String statut;
    public Pigiste(String nom,String prenom,int jour, Double montant){
        super(nom, prenom);
        this.jourTravail=jour;
        this.montantJournalier=montant;
        this.statut="Pigiste";
    }
    @Override
    public Double getSalaire(){
        return (jourTravail*montantJournalier);
    }
    @Override
    public String getStatut(){
        return "Pigiste";
    }
}
