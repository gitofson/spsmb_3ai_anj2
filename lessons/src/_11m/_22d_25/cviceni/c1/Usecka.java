package _11m._22d_25.cviceni.c1;

public class Usecka implements Zobrazitelny {

    private int delka;

    public Usecka(int delka) {
        this.delka = delka;

        //toto odsazuje usecku od horniho textu
        System.out.println();
        //vykresleni usecky
        for (int i = 0; i < this.delka; i++) {
            System.out.print("*");
        }
        // toto odsazuje spodní text od usecky
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {

        Usecka u = new Usecka(5);

        System.out.println(u);

    }

    public void zobraz() {
    }
}
