package _11m._18d_24.cviceniKolo;

import _11m._18d_24.cviceniVozidlo.JednostopeVozidlo;

// Vytvořte třídu Kolo s proměnnými vyrobce, cena a boolean maPrehazovacku.
// Doplňte do této třídy příslušné metody a konstruktory. Děděním vytvořte
// třídu HorskéKolo, kterému doplňte členské proměnné int prevodyVzadu,
// prevodyVpredu. Zajistěte, aby konstruktor správně vytvářel objekty této
// třídy (např. proměnná maPrehazovacku musí být vždy true).

public class Kolo extends JednostopeVozidlo {
    private String vyrobce;
    private int cena;
    private Boolean maPrehazovacku;

    public Kolo(String vyrobce, int cena, Boolean maPrehazovacku){
        this.vyrobce = vyrobce;
        this.cena = cena;
        this.maPrehazovacku = maPrehazovacku;
    }

    @Override
    public void vypisCoJsiZac(String druh) {
        System.out.println("druh "+druh+ "\ncena: " + cena + "\nvyrobce: " + vyrobce + "\nMa prehazovacku ? " + maPrehazovacku);
    }
}
