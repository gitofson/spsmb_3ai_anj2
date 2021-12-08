package _12m._06d_29.trida_collections;

public class Osoba implements Comparable<Osoba>{
    private int vyska;
    private double vaha;

    @Override
    public int compareTo(Osoba o) {
        if(this.vyska > o.vyska) {
            return +1;
        } else if (this.vyska == o.vyska) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "vyska=" + vyska +
                ", vaha=" + vaha +
                ", popis='" + popis + '\'' +
                '}';
    }

    public Osoba(int vyska, double vaha, String popis) {
        this.vyska = vyska;
        this.vaha = vaha;
        this.popis = popis;
    }

    private String popis;
}
