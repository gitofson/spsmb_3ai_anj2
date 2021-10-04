package cz.spsmb.a3i._09m._30d_12;

import java.util.Arrays;
import java.util.Scanner;

public class PoleCviceni {
    //Napište program, který metodou Eratosthenova síta vypíše všecha prvočísla od 1 do N,
    // kdy N zadáme z klávesnice
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int n = Integer.MAX_VALUE/2;
        boolean[] eSito = new boolean[n];//inicializace, všude je false
        Arrays.fill(eSito, 2, n-1, true);//inicializace síta, false nechám jen u prvků 0 a 1
        for (int i = 0; i < eSito.length; i++) {
            if(eSito[i]){//prvočíslo nalezeno
                System.out.format("%d ", i);
                for(int j=i*i; j<eSito.length; j+=i){ //odstraníme jeho násobky v sítu (nastavíme na false)
                    eSito[j]=false;
                }
            }
        }

    }
}
