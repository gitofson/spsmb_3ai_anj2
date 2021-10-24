package _10m._21d_17;

import java.util.Scanner;

public class DomaciUkol {
/***
 * Každý sem napište metodu třídy dle zadání
    Fiala
    public static int obsahObdelnika(int stranaA, int stranaB)

    Hoffman
    public static int obsahPravouhlehoTrojuhelnika(int odvesnaA, int odvesnaB)

    Hojný
    public static int obvodObdelnika(int stranaA, int stranaB)

    Hudeček
 */
    public static int obvodPravouhlehoTrojuhelnika(int odvesnaA, int odvesnaB){
        int prepona = (odvesnaA *odvesnaA)+(odvesnaB * odvesnaB);
        double obvod = Math.sqrt(prepona) + odvesnaA + odvesnaB;
        int obvodInt = (int) Math.round(obvod);
        return obvodInt;

    }
/**
    Kolář
    public static double obsahKruhu(double polomer)

    Novák A.
    public static double obvodKruhu(double polomer)

    Novák Š.
    public static int povrchKrychle(int hranaA)

    Odstrčil
    public static int objemKrychle(int hranaA)

    Pelikán
    může si vybrat svou úlohu*/

/**

    Rosenbaum
    public static long faktorial(byte n)

    Škrabánek
    Výpočet fibbonaciho posloupnosti
    private static int fibonacci(int n)

    Vítek
    public static double povrchKoule(double polomer)
 ***/
public static void main(String[] args) {

}
}
