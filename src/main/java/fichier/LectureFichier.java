package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws IOException {
        List<Commune> listeVille = new ArrayList<>();
        Path pathFile = Paths.get("C:/Users/codyb/Documents/recensement.csv");
        List<String> lines = Files.readAllLines(pathFile);
        for (int i = 1; i < lines.size(); i++) {
            String[] tokens = lines.get(i).split(";");
            int pop = Integer.parseInt(tokens[9].trim().replaceAll(" ",""));
            Commune commune = new Commune(tokens[6],tokens[2],tokens[1],pop);
            listeVille.add(commune);
        }
        List<String> entete = new ArrayList<>();
        entete.add("Nom de la Ville;Code de département;Nom de la Region;Population totale");
        Path pathSortie = Paths.get("C:/Users/codyb/Documents/recensement_sortie.csv");
        Files.write(pathSortie, entete);
        List<String> villeMoins25000 = new ArrayList<>();
        for(Commune commune : listeVille){
            if(commune.getPopulationTotale()>25000){
                villeMoins25000.add(commune.toString());
            }
        }
        Files.write(pathSortie,villeMoins25000, StandardOpenOption.APPEND);



    }
}
