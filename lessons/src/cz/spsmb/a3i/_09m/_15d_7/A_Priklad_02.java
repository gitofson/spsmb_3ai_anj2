package cz.spsmb.a3i._09m._15d_7;

import java.util.Scanner;

public class A_Priklad_02 {

    public static void main(String[] args) {
        // Napište program, který připočítává 21% daň
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        double numberTax = number * 1.21;
        System.out.format("S daní: %.2f", numberTax);
    }
}
