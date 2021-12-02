package _11m._22d_25.cviceni.c1;

public class Ctverec implements Zobrazitelny {
    public int strana;

    public Ctverec(int strana) {
        this.strana = strana;
    }

    @Override
    public void zobraz() {
        for (int i = 0; i < this.strana; i++) {
            for (int j = 0; j < this.strana; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
