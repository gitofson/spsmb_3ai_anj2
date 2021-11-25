package _11m._18d_24.cviceniKolo;
// Vytvořte třídu Kolo s proměnnými vyrobce, cena a boolean maPrehazovacku.
// Doplňte do této třídy příslušné metody a konstruktory. Děděním vytvořte
// třídu HorskéKolo, kterému doplňte členské proměnné int prevodyVzadu,
// prevodyVpredu. Zajistěte, aby konstruktor správně vytvářel objekty této
// třídy (např. proměnná maPrehazovacku musí být vždy true).
public class Kolo {
    private String vyrobce;
    private int cena;
    private boolean maPrehazovacku;

    public Kolo(String vyrobce, int cena, boolean maPrehazovacku) {
        this.vyrobce = vyrobce;
        this.cena = cena;
        this.maPrehazovacku = maPrehazovacku;
    }
    public boolean getMaPrehazovacku(){
        return maPrehazovacku;
    }
    public String getVyrobce(){
        return vyrobce;
    }
    public int getCena(){
        return cena;
    }
}

