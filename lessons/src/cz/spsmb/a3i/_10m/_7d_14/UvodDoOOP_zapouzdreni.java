package cz.spsmb.a3i._10m._7d_14;
/***
 Objektově orientované programování (OOP)
TŘíDY A OBJEKTY - zapouzdření
-vhodné, aby si programátor mohl definovat vlastní datové typy pro použití
 popisu stavu daného problému => objektové typy, resp. třídy
 - příklad grafický editor, kde uživatel bude moci kreslit obrázky složené
 ze základních tvarů (bodů, úseček a pod.).
 -bod - určen souřadnicemi (x,y) plus barva - 3 čísla (datová reprezentace)
      - dále potřebujeme popis operací, co se s bodem dá dělat. Např. Vytvořit,
        zrušit, zobrazit, přemístit, ... Tyto operace nazýváme v OOP metody
 -datová reprezentace objektu = datové složky = atributy = členské proměnné =
 stav objektu
 - datová reprezentace stavu plus operace s datovým typem => zapouzdření
 - není žádoucí každý bod vytvářet s celým popisem zvlášť => instance třídy, resp.
   objekty
 -Objekt - datový prvek, který je vytvořen dle vzoru třídy = instance třídy
 ***/
public class UvodDoOOP_zapouzdreni {
    public static void main(String[] args) {
        //pomocí operátoru new vyrobíme instanci třídy bod
        Bod b = new Bod();
        Bod b1 = new Bod();
        b.setBarva(200);
        b1.setBarva(100);
        System.out.format("b1.barva=%d, b.barva=%d%n",b1.getBarva(),
                b.getBarva());
        //pomocí new vytvoříme instanci třídy Obdelník:
        //Obdelnik obd = new Obdelnik(3,5);
        Obdelnik obd = new Obdelnik();

        //obd.sirka = 3;
        //obd.vyska = 5;
        System.out.format("sirka obdelniku:%d, vyska obdelniku:%d,"+
                "obvod obdelniku:%d, obsah obdelniku %d%n",
                obd.sirka, obd.vyska, obd.obvod(), obd.obsah());
    }

}
