package _11m._01d_19;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class GregorianCalendar_ {
    public static void main(String[] args) {
     //aktuální datum a čas
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(new SimpleDateFormat("dd.MM.YYYY hh:mm:ss").format(gc.getTime()));
    }

}
