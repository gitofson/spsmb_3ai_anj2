package _22y._01m._10d_36.polymorfismus;

import java.util.Random;

// Polymorfismus - vyjádřitelné českým slovem vícetvarost, či mnohotvárnost.
// Jedná se o možnost využívat v programovémtextu stejnou syntaktickou podobu pro
// metody s různou vnitřní reprezentací (voláme stejjnou metodu, ale ta dle třídy objektu
// dělá něco jiného)
// Základní trik - potomek může vždy nahradit předka. Tj. do referenční proměnné
// původně deklarované s typem předka, můžeme přiřadit referenci na instanci potomka.
public class PolymorfismusUvod {
    //pokud máme k dispozici třídy Zivocich, Ptak, Slon a Had, můžeme vytvořit pole
    //živočichů a postupně mu náhodně přiřadit objekty tříd Ptak, Slon a Had.
    // Vždy je možné vypsat správnou verzi metody vypisDelku
    public static void main(String[] args) {
        Random r = new Random();
        Zivocich[] z = new Zivocich[6];
        for (int i = 0; i < z.length; i++) {
            switch (r.nextInt(3)) {
                case 0: z[i] = new Ptak("ptak", i); break;
                case 1: z[i] = new Slon("slon", i); break;
                case 2: z[i] = new Had("had", i); break;
            }
        }
        Zivocich tmp;
        for (int i = 0; i < z.length; i++) {
            tmp = z[i];
            tmp.vypisInfo();
            tmp.vypisDelku();
        }
    }
}
