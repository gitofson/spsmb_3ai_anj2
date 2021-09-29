package cz.spsmb.a3i._09m._23d_9;

import java.util.Scanner;

public class A_Priklad_06 {

    public static void main(String[] args) {
        // Napište program, který přečte trojciferné celé číslo a vytiskne jeho jodnotilé číslice oddělené dvěma mezerami
        Scanner sc = new Scanner(System.in);
        char[] numbers = sc.nextLine().toCharArray();
        String finalNumbers = "";
        for (char ch : numbers) {
            if (!Character.isDigit(ch)) {
                finalNumbers = "Invalid input";
                break;
            }
            finalNumbers += String.format("%-3s", ch);
        }
        System.out.println(finalNumbers);
    }
}
