package _11m._22d_25.cviceni.c2;

import _11m._22d_25.cviceni.c1.Ctverec;
import _11m._22d_25.cviceni.c1.Zobrazitelny;

public class DutyCtverec extends Ctverec implements Zobrazitelny {
    public DutyCtverec(int strana) {
        super(strana);
    }


    public void zobraz() {
        for (int i = 0; i <= super.strana; i++)
        {
            for ( int j = 0; j <= super.strana; j++)
            {
                if (i == 0 || i == super.strana || j == 0 || j == super.strana)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
    }
}
}