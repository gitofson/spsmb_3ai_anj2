package _11m._11d_22.cviceni;
//Napište statickou metodu void serad(int[] x, int[] y),
// která seřadí pole x do pole y vzestupně

import java.util.Arrays;
import java.util.Random;

//Napište statickou metodu int sude(int[] x, int[] y),
// která zkopíruje z pole x do pole y jen prvky se sudou hodnotou
// a vrátí počet těchto prvků
public class Ukoly {
    public static void serad(int[] x, int[] y){
        
        if (x.length - 1 >= 0) System.arraycopy(x, 0, y, 0, x.length - 1);
        Arrays.sort(y);
    }
    public  static int sude(int[] x, int[] y){
        int out = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0){
                y[out++] = x[i];
            }
        }
        return out;
    }
    public static void main(String[] args) {
        final int N = 100;
        //inicializace polí
        Random rnd = new Random();
        int[] x = new int[N];
        for (int i = 0; i < x.length; i++) {
            x[i]=rnd.nextInt(1000);
        }
        //inicializace výstupního pole
        int[] y = new int[N];
        //volání metod

        Ukoly.serad(x, y);

        System.out.println(Arrays.toString(y));

        Ukoly.sude(x,y);
        System.out.println( Arrays.toString(y));


        System.out.println(  Ukoly.sude(x,y) );
    }
}
