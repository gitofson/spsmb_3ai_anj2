package _22y._02m._10d_44;
// 1,Napište program, který zapíše do souboru pole.txt
// deset řádků celých čísel takto:
// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
// 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
// ...
// 91, 92, 93, 94, 95, 96, 97, 98, 99, 100


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// 2, Napište program, který přečte soubor pole.txt a jednotlivé hodnoty uloží
// do dvourozměrného pole, které kontrolně vypíše na obrazovku. Celé pole pak
// uloží do souboru poleint.bin jako binární čísla (použijte writeInt() ze třídy
// DataOutputStream). Porovnejte velikosti souborů pole.txt a poleint.bin
public class DomaciUkol {

    public static void main(String[] args) throws IOException {
        int k = 10;
        FileWriter write = new FileWriter("pole.txt");
        PrintWriter print = new PrintWriter(write);

            for (int j = 0; j < 100; j++) {

                print.print(j+ 1 + " ");
                System.out.print(j+1 + " ");


                if (j == k-1){

                    print.println("");
                    System.out.println("");
                    k += 10;

                }
            }
            //System.out.println(" ");
            print.close();
    }
}
