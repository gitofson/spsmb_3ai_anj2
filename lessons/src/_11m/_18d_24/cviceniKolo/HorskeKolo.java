package _11m._18d_24.cviceniKolo;

import _11m._18d_24.cviceniVozidlo.JednostopeVozidlo;

public class HorskeKolo extends Kolo {
    public int prevodyVzadu;
    public int prevodyVpredu;
    public HorskeKolo(int cena, String vyrobce, int prevodyVpredu, int prevodyVzadu) {
        super(cena, vyrobce, true);
        this.prevodyVzadu = prevodyVzadu;
        this.prevodyVpredu = prevodyVpredu;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
