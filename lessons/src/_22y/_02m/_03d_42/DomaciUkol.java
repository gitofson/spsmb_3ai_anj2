package _22y._02m._03d_42;
// 1.
// Textovým editorem vytvořte soubor pismena.txt, ve kterém bude
// několik řádek složených z malých a velkých písmen a mezer.
// Napište program, který tento soubor přečte a opíše na obrazovku.
// Současně do souboru velky.txt zapisuje obsah čteného souboru,
// ale malá písmena převádí na velká
// 2.
// Napište program, který přečte soubor pismena.txt po řádcích. Každou
// řádku přesně opíše do souboru kolik.txt a v něm na další řádce uvede,
// kolik malých písmen na ní bylo
import java.io.*;
public class DomaciUkol {
    public static void main(String[] args) {
        String ct = "";
        try {
            FileReader fr = new FileReader("pismena.txt");
            FileWriter fw = new FileWriter("velky.txt");
            FileWriter fwk = new FileWriter("kolik.txt");

            BufferedReader in = new BufferedReader(fr);

            String r;
            int i = 0;

            while ((r = in.readLine()) != null) {
                System.out.println(++i + ". řádek: " + r);
                ct = new String(ct + r + "\n");
            }

            System.out.println(ct);
            fw.write(ct.toUpperCase());
            fr.close();
            fw.close();
            in.close();
            fwk.close();
        } catch (IOException e) {
            System.out.println("Soubor nelze otevřít");
        }
    }
}