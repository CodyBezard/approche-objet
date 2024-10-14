package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date dateDay = new Date();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
//        String date = formateur.format(dateDay);
        System.out.println(formateur.format(dateDay));
        Date dateTP = new Date(116,4,19,23,59,30);
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        date = formateur2.format(dateTP);
        System.out.println(formateur2.format(dateTP));
//        date = formateur2.format(dateDay);
        System.out.println(formateur2.format(dateDay));
    }
}
