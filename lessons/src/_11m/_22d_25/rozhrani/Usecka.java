package _11m._22d_25.rozhrani;

public class Usecka implements Info{
    private int delka;

    public Usecka(int delka) {
        this.delka = delka;
    }

    @Override
    public void kdoJsem() {
        System.out.println("Usecka");
    }
}
