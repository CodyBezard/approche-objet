package maps;

import java.util.HashMap;
import java.util.Iterator;

public class FusionMap {
    public static void main(String args[]) {
// Création map1
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
// Création map2
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");

        HashMap<Integer, String> map3 = new HashMap<>();

        Iterator<Integer> key1Ite = map1.keySet().iterator();
        while(key1Ite.hasNext()){
            Integer key = key1Ite.next();
            String value = map1.get(key);
            map3.put(key,value);
        }
        Iterator<Integer> key2Ite = map2.keySet().iterator();
        while(key2Ite.hasNext()){
            Integer key = key2Ite.next();
            String value = map2.get(key);
            map3.put(key,value);
        }

        for(Integer clef:map3.keySet()){
            System.out.println(clef + " " +map3.get(clef));
        }
    }
}
