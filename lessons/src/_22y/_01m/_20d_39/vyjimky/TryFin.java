package _22y._01m._20d_39.vyjimky;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Zajímavá konstrukce, která představuje užitečné řešení, pokud potřebujeme,
//aby byl nějaký úsek kódu vždy proveden.
public class TryFin {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        int c;

        try {
            while ((c = fr.read()) != -1) {
                if (c != 'K') {
                    System.out.print((char) c);
                } else {
                    return;
                }
            }
        }
        //finally se zavolá vždy - i v případě, že v bloku try je return.
        finally {
            System.out.println("Soubor uzavřen.");
            fr.close();
        }
    }
}
