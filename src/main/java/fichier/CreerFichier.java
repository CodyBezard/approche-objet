package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path pathFile = Paths.get("C:/Users/codyb/Documents/recensement.csv");
        List<String> lines = Files.readAllLines(pathFile);
        Path pathCible = Paths.get("C:/Users/codyb/Documents/recensement_100.csv");
        List<String> line100 = new ArrayList<>();
        int i =0;
        for (String line:lines){
            if(i<100) {
                line100.add(line);
                i++;
            }
        }
        Files.write(pathCible, line100);
    }
}
