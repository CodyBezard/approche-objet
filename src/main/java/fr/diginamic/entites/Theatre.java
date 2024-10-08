package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capacite;
    private int totalClient;
    private double recetteTotal;

    public Theatre(String nom, int capacite){
        this.nom=nom;
        this.capacite=capacite;
    }

    public void inscrire (int nombreClient, double prixPlace){
        int nombreClientApresAjout = this.totalClient+nombreClient;
        if(nombreClientApresAjout > capacite){
            System.out.println("Action impossible, la capacité maximale du théatre est déjà atteinte.");
        }else{
            this.totalClient += nombreClient;
            this.recetteTotal += (prixPlace*nombreClient);
            System.out.println("Inscription validé");
        }
    }

    @Override
    public String toString() {
        return "Nom du Theatre: "+ nom + '\'' +
                ", capacité de " + capacite + " personnes" +
                ", Nombre de Client inscrit =" + totalClient +
                ", pour une recette total de =" + recetteTotal +
                '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getRecetteTotal() {
        return recetteTotal;
    }

    public void setRecetteTotal(double recetteTotal) {
        this.recetteTotal = recetteTotal;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public int getTotalClient() {
        return totalClient;
    }

    public void setTotalClient(int totalClient) {
        this.totalClient = totalClient;
    }
}
