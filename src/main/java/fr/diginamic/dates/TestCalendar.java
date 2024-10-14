package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2016,4,19,23,59,30);
        Date date = cal.getTime();
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        String dateTP = formateur.format(date);
        System.out.println(dateTP);

        Calendar calJour = Calendar.getInstance();
        date = calJour.getTime();
        SimpleDateFormat formateur2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dateTP = formateur2.format(date);
        System.out.println(dateTP);

        SimpleDateFormat formateurFR = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
        System.out.println(formateurFR.format(date));

        SimpleDateFormat formateurCH = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.CHINA);
        System.out.println(formateurCH.format(date));

        Locale russe = new Locale("ru", "RU");
        SimpleDateFormat formateurRU = new SimpleDateFormat("EEEE dd MMMM yyyy", russe);
        System.out.println(formateurRU.format(date));

        SimpleDateFormat formateurDE = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.GERMAN);
        System.out.println(formateurDE.format(date));

    }
}
