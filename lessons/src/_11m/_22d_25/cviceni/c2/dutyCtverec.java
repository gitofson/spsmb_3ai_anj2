package _11m._22d_25.cviceni.c2;

import _11m._22d_25.cviceni.c1.Ctverec;
import _11m._22d_25.cviceni.c1.Zobrazitelny;

public class dutyCtverec extends Ctverec implements Zobrazitelny {
    public dutyCtverec(int hrana) {
        super(hrana);

        for (int i = 0; i < hrana; i++) {
            for (int j = 0; j < hrana; j++) {
                if (j > 1 && j < hrana - 1 && i > 1 && i < hrana - 1) {
                    System.out.print("");
                } else {
                    System.out.print("*" + i + " " + j);
                }
            }

        }
    }



    public void zobraz(){}
}
