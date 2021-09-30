package cz.spsmb.a3i._09m._30d_12;

import java.util.Scanner;
import java.util.Arrays;

/*máte-li ve škole studenty, kteří mají v úmyslu řešit Matematickou olympiádu kategorie P (programování), pak jim můžete nabídnout následující online přednášku:
        (tlumočím nabídku organizátorů)
        -----------------------
        3.10. (neděle) od 16:00 pořádáme on-line seminář pro nové řešitele kategorie P.
        Seminář proběhne na Zoomu https://cesnet.zoom.us/j/95971003595, bez hesla.
        Registrace na https://forms.gle/FDuEm1q4dHvmNuAS6
        -----------------------
        Z přednášky budou mít užitek zejména noví či loňští řešitelé, pro zkušené řešitele této kategorie už moc smysl nemá.
*/
public class Arrays {
    //Pole - refereční datový typ narozdíl od primitivních datových typů
    //referenční datový typ si lze představit jako ukazatel do paměti.
    //referenční datové typy vznikají v Javě dynamicky pomocí speciálního
    //příkazu a zanikají, jakmile na ně přestane existovat odkaz
    // Hodnota neplatného odkazu je hodnota konstanty null
    public static void main(String[] args){
        //deklarace pole - v Javě je zaručeno, že všechny nové prvky pole mají
        // hodnotu 0, resp. false
        int[] poleInt = new int[20];//lze i ve dvou krocích
        //délka pole
        Scanner sc=new Scanner(System.in);
        System.out.format("délka pole poleInt:%d%n",poleInt.length);
        //přiřazení hodnoty do pole
        poleInt[1]=8;
        poleInt[sc.nextInt()]=30;
        //výpis pole - od JDK 1.5 lze použít toto:
        //Arrays.toString(poleInt);
        //jinak cyklem:
        for(int i=0; i<poleInt.length; i++){
            System.out.println(poleInt[i]);
        }
        //Seřazení pole
        Arrays.sort(poleInt);
        //porovnání dvou polí
        Arrays.equals();


    }
}
