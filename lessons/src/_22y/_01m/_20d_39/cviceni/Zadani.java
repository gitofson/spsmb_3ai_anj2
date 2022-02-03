package _22y._01m._20d_39.cviceni;
/***
 * 1, Vytvořte třídu SpojovýSeznam, která umí uchovávat prvky
 * typu Object. Připravte metody void vloz(Object obj),
 * Object vyjmiPrvniho() a vypisSeznam().
 *
 * 2.Vytvořte třídu výjimek  SeznamException, které budou vyvolávány
 * metodou vyjmiPrvniho() ze třídy SpojovýSeznam v případě,
 * že bude seznam prázdný.
 *
 * 3.Napište program, který bude využívat instance třídy
 * SpojovýSeznam a vyzkoušejte propagaci výjimek i jejich
 * ošetření v blocích try-catch.

 */
import java.io.IOException;

class SeznamExeption extends Exception {
    public SeznamExeption() { super("Zprava"); }
}

class Seznam extends RuntimeException {

    private int cislo = 0;
    Seznam (int jake) { this.cislo = jake; }
    public int najdiCislo(int jake) throws SeznamExeption {
        System.out.println("Cislo je " + jake);
        return jake;
    }
}

public class Zadani {



    public static void main(String[] args) {
        /*try{
            SpojovySeznam ss = new SpojovySeznam();
            SeznamExeption se = new SeznamExeption();
            ss.vloz("ahoj");
            ss.vloz(Integer.valueOf(5));
            ss.vypisSeznam();
            System.out.println();
            System.out.println(ss.vyjmiPrvniho());
            System.out.println(ss.vyjmiPrvniho());
            System.out.println(ss.vyjmiPrvniho());



        }
        catch(SeznamExeption e) {

        }*/

    }
}
