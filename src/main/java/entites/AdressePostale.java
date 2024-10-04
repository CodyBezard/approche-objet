package entites;

public class AdressePostale {
    int numeroRue;
    String libelleRue;
    int codePostal;
    String ville;
    public AdressePostale(int newNumRue, String newLibRue, int newCodePost, String newVille){
        numeroRue = newNumRue;
        libelleRue = newLibRue;
        codePostal = newCodePost;
        ville = newVille;
    }

    @Override
    public String toString() {
        return "AdressePostale{" +
                "numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}