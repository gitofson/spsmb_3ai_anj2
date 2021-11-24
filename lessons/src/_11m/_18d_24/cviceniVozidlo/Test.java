package _11m._18d_24.cviceniVozidlo;

import _11m._18d_24.cviceniKolo.HorskeKolo;
import _11m._18d_24.cviceniKolo.Kolo;

public class Test {
    public static void main(String[] args) {

        Kolo k = new Kolo("opicak",1000,false);
        k.vypisCoJsiZac("Civilni kolo");

        System.out.println();

        HorskeKolo hk = new HorskeKolo("opice",10,5, 10);
        hk.vypisCoJsiZac("Horske Kolo");

    }
}
