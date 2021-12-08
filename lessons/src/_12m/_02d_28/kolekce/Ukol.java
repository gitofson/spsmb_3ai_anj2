package _12m._02d_28.kolekce;

import java.util.ArrayList;

//ArrayList lze vytvořit i s předem vytvořeným počtem prvků. Takto:
//ar = new ArrayList<Integer>(N). Proveďte rychlostní test a srovnejte
//s ar = new ArrayList<Integer>() pro milión prvků;
public class Ukol {
    public static void main(String[] args) {
        long casPred = System.currentTimeMillis();
        long casPo;

        int N = 1000000;

        ArrayList<Integer> array1 = new ArrayList<Integer>(N);
        for (int i = 0; i < N ; i++) {
            array1.add(i);
        }
        casPo = System.currentTimeMillis();
        System.out.println(casPo-casPred + " ms");

        long casPred2 = System.currentTimeMillis();
        long caspo2;
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int j = 0; j < N ; j++) {
            array2.add(j);
        }
        caspo2 = System.currentTimeMillis();
        System.out.println(caspo2-casPred2 + " ms");

    }


}
