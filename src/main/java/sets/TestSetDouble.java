package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        set.add(1.5);
        set.add(8.25);
        set.add(-7.32);
        set.add(13.3);
        set.add(-12.45);
        set.add(48.5);
        set.add(0.01);
        Iterator<Double> iterator = set.iterator();
//        while(iterator.hasNext()){
//            Double nombre=iterator.next();
//            System.out.println(nombre);
//        }
        double lePlusGrand = Integer.MIN_VALUE;
        double lePlusPetit = Integer.MAX_VALUE;
        for(Double nombre:set){
            if(nombre>lePlusGrand){
                lePlusGrand=nombre;
            }
            if(nombre<lePlusPetit){
                lePlusPetit=nombre;
            }
        }
        System.out.println(lePlusGrand);
        System.out.println(lePlusPetit);
        System.out.println("\n-----------");
        while (iterator.hasNext()){
            double numero = iterator.next();
            if (numero == lePlusPetit){
                iterator.remove();
            }
            System.out.println(numero);
        }
    }

}
