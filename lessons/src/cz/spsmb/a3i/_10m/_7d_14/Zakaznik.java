package cz.spsmb.a3i._10m._7d_14;
//Použití proměnné třídy (statické proměnné) v objektech
public class Zakaznik {
    private static int pocetZakazniku = 0;//proměnná třídy
    public int utratil;

    public static int getPocetZakazniku() {
        return pocetZakazniku;
    }

    public Zakaznik(){
        Zakaznik.pocetZakazniku ++;
        this.utratil = 0;
    }
    public void platil(int cena){
        this.utratil += cena;
    }
    public static void main(String[] args){
        System.out.format("Pocet zakazniku: %d%n", Zakaznik.getPocetZakazniku());
        Zakaznik zak1 = new Zakaznik();
        System.out.format("Pocet zakazniku: %d%n", Zakaznik.getPocetZakazniku());
        zak1.platil(15);
        Zakaznik zak2 = new Zakaznik();
        System.out.format("Pocet zakazniku: %d%n", Zakaznik.getPocetZakazniku());
        zak1.platil(30);
        zak2.platil(20);
        System.out.format("Utratili: %d + %d %n", zak1.utratil, zak2.utratil);
    }
}
