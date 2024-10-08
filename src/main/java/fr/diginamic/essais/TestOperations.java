package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations ope = new Operations();
        System.out.println(ope.calcul(2.2,2.3,'+'));
        System.out.println(ope.calcul(2.2,2.3,'-'));
        System.out.println(ope.calcul(2.2,2.3,'*'));
        System.out.println(ope.calcul(2.2,2.3,'/'));
    }
}
