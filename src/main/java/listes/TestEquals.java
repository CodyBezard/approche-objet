package listes;

public class TestEquals {
    public static void main(String[] args) {
        Ville villeTest = new Ville("Nice",343000);
        Ville villeTest2 = new Ville("Nice",343000);
        Ville villeTest3 = new Ville("Nice",344000);
        if(villeTest.equals(villeTest2)){
            System.out.println("Villes identiques");
        }else{
            System.out.println("Villes différentes");
        }

        if(villeTest.equals(villeTest3)){
            System.out.println("Villes identiques");
        }else{
            System.out.println("Villes différentes");
        }

        if(villeTest == villeTest2){
            System.out.println("Villes identiques");
        }else{
            System.out.println("Villes différentes");
        }

    }
}
