package _10m._25d_18;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        //k vytvoření instance zde není použit operátor new, namísto toho je použita statická metoda .getInstance()
        Calendar praveTed = Calendar.getInstance();
        System.out.format("praveTed: %s%n",praveTed);

        Calendar cal = Calendar.getInstance();
        //.setLenient - stanoví, jak se bude instance chovat, pokud  zadáme nesprávný údaj
        //Do instance pak lze např. uložit datum 32.1. Při použití .get() se v případě
        // lenient = true údaj znormalizuje na 1.2. V případě lenient = false dostaneme výjimku
        cal.setLenient(true);
        cal.set(2021, 10, 0);
        System.out.format("%d.%d.%d%n",cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.YEAR));
        cal.setLenient(false);
        cal.set(2021, 10, 0);
        System.out.format("%d.%d.%d%n",cal.get(Calendar.DAY_OF_MONTH),
                cal.get(Calendar.MONTH),
                cal.get(Calendar.YEAR));

    }
}
