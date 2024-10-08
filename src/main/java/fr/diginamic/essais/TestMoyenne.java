package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        Double[] array = new Double[]{1.1,2.2,3.3};
        CalculMoyenne calc = new CalculMoyenne(array);
        calc.add(4.4);
        calc.printNumbers();
        System.out.println(calc.calcul());

        Double[] array2 = new Double[]{1.25,6.3,78.1};
        CalculMoyenne calc2 = new CalculMoyenne(array2);
        calc2.add(4.4);
        calc2.printNumbers();
        System.out.println(calc2.calcul());
    }
}
