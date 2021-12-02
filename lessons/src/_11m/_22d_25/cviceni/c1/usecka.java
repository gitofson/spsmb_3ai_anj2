package _11m._22d_25.cviceni.c1;

public class usecka implements Zobrazitelny {
    private int delka;

    public usecka(int delka) {
        this.delka = delka;
    }

    @Override
    public void zobraz() {
        for (int i = 0; i < this.delka; i++) {
            System.out.print("*");
        }
    }
}
