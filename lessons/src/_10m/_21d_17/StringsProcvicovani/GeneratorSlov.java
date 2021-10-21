package _10m._21d_17.StringsProcvicovani;


import java.util.Arrays;
import java.util.Scanner;

// Existuji slova ktera se ctou z leva i zprava doleva stejne napr. radar
// Napiste program ktery bude tato slova generovat z jejich prvni poloviny zadane z klavesnice
public class GeneratorSlov {
    public static void main(String[] args) {
        System.out.println("Zadej slovo");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer word = new StringBuffer(input);
        StringBuffer word2 = new StringBuffer(word);
        word2.deleteCharAt(word.length()-1);
        word.reverse();
        System.out.println(word2 +""  +word);
    }
}
