package _11m._18d_24.cviceniKolo;
// Vytvořte třídu Kolo s proměnnými vyrobce, cena a boolean maPrehazovacku.
// Doplňte do této třídy příslušné metody a konstruktory. Děděním vytvořte
// třídu HorskéKolo, kterému doplňte členské proměnné int prevodyVzadu,
// prevodyVpredu. Zajistěte, aby konstruktor správně vytvářel objekty této
// třídy (např. proměnná maPrehazovacku musí být vždy true).
public class Kolo {
    public String vyrobce;
    public int cena;
    public boolean maPrezahovacku;
    public Kolo(String vyrobce, int cena, boolean maPrezahovacku) {
        this.vyrobce = vyrobce;
        this.cena = cena;
        this.maPrezahovacku = maPrezahovacku;
    }
    public boolean getMaPrehazovacku(){
        return maPrezahovacku;
    }
    public String getVyrobce(){
        return vyrobce;
    }
    public int getCena(){
        return cena;
    }
}
