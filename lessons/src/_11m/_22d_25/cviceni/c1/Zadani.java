package _11m._22d_25.cviceni.c1;

import _11m._22d_25.cviceni.c2.DutyCtverec;

//Vytvořte třídy Ctverec a Usecka s vhodně zvolenými metodami a proměnnými.
//Vytvořte rozhraní Zobrazitelný s metodou void zobraz(). Zajistěte, aby třídy
//Ctverec a Usecka implementovaly toto rozhraní tak, že se vykreslí na obrazovku např.:
//      ***
//      ***             *************
//      ***
public class Zadani{
    public static void main(String[] args) {
        usecka u = new usecka(5);
        Ctverec c = new Ctverec(3);
        //u.zobraz();
        System.out.println();
        //c.zobraz();
        DutyCtverec d = new DutyCtverec(4);
        d.zobraz();
    }
}
