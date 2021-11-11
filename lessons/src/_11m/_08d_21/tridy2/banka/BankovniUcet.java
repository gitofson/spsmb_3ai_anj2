package _11m._08d_21.tridy2.banka;

public class BankovniUcet {
    //standartní inicializace na 0 v Javě u proměnných instance
    private static int pocitadloCiselUctu = 1000000;
    private int zustatek;
    private String vlastnikUctu;
    private int cisloUctu;
    public BankovniUcet(int zustatek, String vlastnikUctu){
        this.cisloUctu = BankovniUcet.pocitadloCiselUctu;
        this.vlastnikUctu = vlastnikUctu;
        this.zustatek = zustatek;
        //this.BankovniUcet by fungovalo take, ale neni to systemeticky dobře
        BankovniUcet.pocitadloCiselUctu++;
    }
    public int getZustatek() {
        return this.zustatek;
    }

    public String getVlastnikUctu() {
        return this.vlastnikUctu;
    }

    public int getCisloUctu() {
        return this.cisloUctu;
    }

    public boolean vyber(int castka){
        if(castka > 0 && this.zustatek>=castka){
            this.zustatek -= castka;
            return true;
        }
        return false;
    }

    public boolean vklad(int castka){
        if(castka > 0 ){
            this.zustatek += castka;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "BankovniUcet{" +
                "zustatek=" + zustatek +
                ", vlastnikUctu='" + vlastnikUctu + '\'' +
                ", cisloUctu=" + cisloUctu +
                '}';
    }
}
