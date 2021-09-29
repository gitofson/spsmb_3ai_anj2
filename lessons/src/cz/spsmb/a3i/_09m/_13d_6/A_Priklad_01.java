package cz.spsmb.a3i._09m._13d_6;

import java.util.Scanner;

public class A_Priklad_01 {

    public static void main(String[] args) {
        //  Napište program, který přečte znak a vypíše znak s hodnout o jednu větší. Použijte explicitní konverzi
        Scanner sc = new Scanner(System.in);

        System.out.print("Napiš znak: ");
        char c = sc.nextLine().charAt(0);
        int cInt = (int) c;
        char newC = (char) (cInt++);
        System.out.println(newC);

    }
}
