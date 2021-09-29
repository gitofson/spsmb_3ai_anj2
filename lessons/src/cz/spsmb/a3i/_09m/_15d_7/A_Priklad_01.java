package cz.spsmb.a3i._09m._15d_7;

import java.util.Scanner;

public class A_Priklad_01 {

    public static void main(String[] args) {
        // Napište program, který přečte znak a vypíše jeho Unicode hodnotu v desítkové a hexadecimální soustavě
        Scanner sc = new Scanner(System.in);
        char oldChar = sc.nextLine().charAt(0);
        int charValue = (int) oldChar;
        System.out.format("decimal: %1$d hex: %1$x", charValue);
    }
}
