package fichier;

public class Commune {
    private String nom;
    private String codeDep;
    private String nomRegion;
    private int populationTotale;


    //Constructeur//
    public Commune(String nom, String code, String region, int population){
        this.nom=nom;
        this.codeDep=code;
        this.nomRegion=region;
        this.populationTotale=population;
    }

    @Override
    public String toString() {
        return nom + ";" + codeDep + ";" + nomRegion + ";" + populationTotale +";";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCodeDep() {
        return codeDep;
    }

    public void setCodeDep(String code) {
        this.codeDep = code;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }
}
