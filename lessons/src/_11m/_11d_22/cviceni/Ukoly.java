package _11m._11d_22.cviceni;
//Napište statickou metodu void serad(int[] x, int[] y),
// která seřadí pole x do pole y vzestupně

import java.util.Arrays;
import java.util.Random;

//Napište statickou metodu int sude(int[] x, int[] y),
// která zkopíruje z pole x do pole y jen prvky se sudou hodnotou
// a vrátí počet těchto prvků
public class Ukoly {
    public static void serad(int[] x, int[] y) {
        System.arraycopy(x, 0, y, 0, x.length);
        Arrays.sort(y);
    }

    public static int sude(int[] x, int[] y) {
        Arrays.fill(y, 0);
        int out = 0;
        for (int j : x) {
            if (j % 2 == 0) {
                y[out++] = j;
            }
        }

        return out;
    }

    public static void main(String[] args) {
        final int N = 10;
        //inicializace polí
        Random rnd = new Random();
        int[] x = new int[N];
        for (int i = 0; i < x.length; i++) {
            x[i] = rnd.nextInt(1000);
        }
        //inicializace výstupního pole
        int[] y = new int[N];
        //volání metod
//        System.out.println(sude(x, y));
        serad(x, y);
        //kontrola
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

    }
}
