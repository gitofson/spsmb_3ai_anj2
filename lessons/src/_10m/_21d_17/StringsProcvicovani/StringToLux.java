package _10m._21d_17.StringsProcvicovani;

import java.util.Locale;
import java.util.Scanner;

//Napište program, který přečte řetězec a v závislosti na jeho posledním znaku provede:
//l (L) - převod řetězce na malá písmena (lower)
//u (U) - převod řetězce na velká písmena (upper)
//x (X) - prohození malých a velkých písmen (exchange)
//Změny proveďte v řetězci, nikoliv jen na výstupu
public class StringToLux {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();
        String checkString = myString.toLowerCase();
        myString = checkString.charAt(myString.length() - 1) == 'l' ? myString.toLowerCase() : myString;
        myString = checkString.charAt(myString.length() - 1) == 'u' ? myString.toUpperCase() : myString;
        myString = checkString.charAt(myString.length() - 1) == 'x' ? swapCase(myString) : myString;
        System.out.println(myString);
    }

    public static String swapCase(String toSwap) {
        StringBuffer swapped = new StringBuffer();
        char[] stringArr = toSwap.toCharArray();
        for (char c : stringArr) {
            swapped.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return swapped.toString();
    }
}
