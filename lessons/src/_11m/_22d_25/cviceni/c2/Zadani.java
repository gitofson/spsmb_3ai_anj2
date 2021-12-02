package _11m._22d_25.cviceni.c2;

import _11m._22d_25.cviceni.c1.Ctverec;

//Od třídy Ctverec odvoďte třídu DutyCtverec a zajistěte správnou implementaci
//metody void zobraz(), např:
//      ***
//      * *
//      ***
public class Zadani {
    public static void main(String[] args) {
        Ctverec c = new Ctverec(3);
        c.zobraz();
        DutyCtverec d = new DutyCtverec(5);
        d.zobraz();
    }
}
