package cz.spsmb.a3i._09m._30d_12;

import java.util.Arrays;
import java.util.Scanner;

/*máte-li ve škole studenty, kteří mají v úmyslu řešit Matematickou olympiádu kategorie P (programování), pak jim můžete nabídnout následující online přednášku:
        (tlumočím nabídku organizátorů)
        -----------------------
        3.10. (neděle) od 16:00 pořádáme on-line seminář pro nové řešitele kategorie P.
        Seminář proběhne na Zoomu https://cesnet.zoom.us/j/95971003595, bez hesla.
        Registrace na https://forms.gle/FDuEm1q4dHvmNuAS6
        -----------------------
        Z přednášky budou mít užitek zejména noví či loňští řešitelé, pro zkušené řešitele této kategorie už moc smysl nemá.
*/
public class Arrays_ {
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
        //poleInt[sc.nextInt()]=30;
        //výpis pole - od JDK 1.5 lze použít toto:
        System.out.println(Arrays.toString(poleInt));
        //jinak cyklem:
        /*for(int i=0; i<poleInt.length; i++){
            System.out.println(poleInt[i]);
        }*/
        //Seřazení pole
        Arrays.sort(poleInt);
        //Naplnění pole konstantní hodnotou
        Arrays.fill(poleInt,11);
        //Naplnění pouze části pole
        Arrays.fill(poleInt,0,8,99);
        System.out.println(Arrays.toString(poleInt));
        //porovnání dvou polí
        System.out.println(Arrays.equals(poleInt,new int[20]));
        //nalezení prvku v seřazeném poli. Vrací záporné číslo, pokud prvek
        //není nalezen
        for(int i=0; i<poleInt.length; i++){
            poleInt[i]=i+1;
        }
        Arrays.sort(poleInt);
        System.out.println(Arrays.toString(poleInt));
        System.out.println(Arrays.binarySearch(poleInt,10));
        //Dvourozměrné pole
        /*int[][] a = new int [5][4];
        System.out.format("pocet radek:%d%n", a.length);
        System.out.format("pocet sloupcu:%d%n", a[0].length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                a[i][j]=i*10+j;
                System.out.format("%2d ",a[i][j]);
            }
            System.out.println();
        }*/
        //Dvourozměrné pole s proměnnou délkou řádek
        int[][] a = new int[4][];
        for(int i=0; i<a.length; i++){
            a[i]= new int[i+1];
            for(int j=0; j<a[i].length; j++){
                a[i][j]=i*10+j;
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        //inicializace dvourozměrného pole
        int [][] b={{1,2,3},{11,12,13},{21,22,23}};
        int [][] c={{1,2,3},{11,12},{21}};
        //Více rozměrů v jednorozměrném poli - potřebujeme do spojitého
        //úseku paměti přistupovat přes indexy řádků a sloupců
        final int N_RADEK = 24;
        final int N_SLOUPCU = 80;
        int[] obrazovka = new int[N_RADEK*N_SLOUPCU];
        for (int i = 0; i < N_RADEK; i++) {
            for (int j = 0; j < N_SLOUPCU; j++) {
                obrazovka[i*N_SLOUPCU+j] = 100*i+j;
                System.out.print(obrazovka[i*N_SLOUPCU+j]+" ");
            }
            System.out.println();

        }





    }
}
