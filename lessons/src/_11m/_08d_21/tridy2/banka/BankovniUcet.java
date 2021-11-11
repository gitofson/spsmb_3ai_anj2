package _11m._08d_21.tridy2.banka;

import java.util.GregorianCalendar;
import java.util.Random;

public class BankovniUcet {
    //standartní inicializace na 0 v Javě u proměnných instance
    private static int pocitadloCiselUctu = 1000000;
    private static Random rnd = new Random();
    private int zustatek;
    //private String vlastnikUctu;
    private Klient klient;
    private int cisloUctu;
    public BankovniUcet(int zustatek, String prijmeni){

        this.cisloUctu = BankovniUcet.pocitadloCiselUctu;
        this.klient = new Klient(rnd.nextBoolean()?"Pepik":"Franta",
                prijmeni, "Havlickova " + rnd.nextInt(250),
                new GregorianCalendar(rnd.nextInt(43)+1960,rnd.nextInt(12), rnd.nextInt(28)+1));
        this.zustatek = zustatek;
        //this.BankovniUcet by fungovalo take, ale neni to systemeticky dobře
        BankovniUcet.pocitadloCiselUctu++;
    }
    public int getZustatek() {
        return this.zustatek;
    }

    public Klient getKlient() {
        return this.klient;
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
        return "\nBankovniUcet{" +
                "zustatek=" + zustatek +
                ", klient=" + klient +
                ", cisloUctu=" + cisloUctu +
                '}';
    }
}