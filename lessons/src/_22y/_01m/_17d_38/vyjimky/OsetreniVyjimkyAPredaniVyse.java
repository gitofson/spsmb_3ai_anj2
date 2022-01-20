package _22y._01m._17d_38.vyjimky;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// Můžeme potřebovat, že vzniklá výjimka bude v metodě, ve které se vyskytla, částečně nebo úplně
// ošetřena, ale přesto bude o vzniklé situaci informovat volající metodu.
//
public class OsetreniVyjimkyAPredaniVyse {
    public static int[] vytvorANactiPole() throws IOException {
        int[] pole = null;
        try {
            Scanner sc = new Scanner(new File("data.txt"));
            int n = sc.nextInt();
            pole = new int[n];
            for (int i = 0; i < n; i++) {
                pole[i] = sc.nextInt();
            }
            return pole;
        }
        catch (IOException e){
            System.out.println("Soubor nenalezen");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            int[] abc = vytvorANactiPole();
            System.out.println(Arrays.toString(abc));
        }
        catch (Exception e) {
            System.out.println("Program neproběhl správně");
        }
    }

}
