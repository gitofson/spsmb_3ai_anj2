package _11m._22d_25.cviceni.c2;

import _11m._22d_25.cviceni.c1.Ctverec;
import _11m._22d_25.cviceni.c1.Zobrazitelny;

public class DutyCtverec extends Ctverec implements Zobrazitelny {
    protected int sirka;
    public DutyCtverec(int sirka) {
        super(sirka);
        this.sirka = sirka;
    }

    @Override
    public void zobraz() {
        for (int i = 0; i < this.sirka; i++) {
            for (int j = 0; j < this.sirka; j++) {
                if (i == 0 || i == this.sirka - 1 || j == 0 || j == this.sirka - 1){
                    System.out.print("  *");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }


}