package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<100; i++){
            list.add(i+1);
        }
        System.out.println(list.size());
    }
}
