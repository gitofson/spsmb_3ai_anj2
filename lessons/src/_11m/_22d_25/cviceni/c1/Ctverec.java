package _11m._22d_25.cviceni.c1;


public class Ctverec implements Zobrazitelny {

    private int  hrana;

    public Ctverec(int hrana) {
        this.hrana = hrana;

        System.out.println();
        for (int i=0; i < this.hrana; i++)
        {
            for (int j=0; j < this.hrana; j++)
            {
                System.out.print(" * ");
            }
            System.out.format("\n");
        }
        System.out.println();
    }


    @Override
    public void zobraz() {
    }
}
