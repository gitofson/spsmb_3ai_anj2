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
        Arrays.sort(x);
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
        }
    }

    public static int sude(int[] x, int[] y) {
        int out = 0;
        for (int j : x) {
            if (j % 2 == 0) {
                y[out] = j;
                out++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        final int N = 1000;
        Random rnd = new Random();
        int[] x = new int[N];
        for (int i = 0; i < x.length; i++) {
            x[i] = rnd.nextInt(1000);
        }
        int[] y = new int[N];
        serad(x, y);
        System.out.format("vzestupne%s\n", Arrays.toString(y));
        sude(x, y);
        String fixed = Arrays.toString(Arrays.copyOfRange(y, 0, sude(x, y)));
        System.out.format("suda%s\npocet sudych cisel: %s\n", fixed, sude(x, y));


    }
}