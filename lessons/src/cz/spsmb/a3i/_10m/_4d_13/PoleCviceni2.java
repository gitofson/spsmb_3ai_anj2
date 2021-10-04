package cz.spsmb.a3i._10m._4d_13;

import java.util.Arrays;
import java.util.Scanner;

public class PoleCviceni2 {
    public static void main(String[] args){
        //Napište program, který přečte celé číslo typu long a vypíše jeho jednotlivé číslice oddělené
        //dvěma mezerami
        Scanner sc=new Scanner(System.in);
        long l = sc.nextLong();
        final int N_ORDER=10;
        int nums[] = new int[N_ORDER];
        for (int i = N_ORDER-1; i >=0; i--) {
            nums[i] = (int) (l/Math.pow(10,i));
            l%=Math.pow(10,i);
        }
        System.out.format("%s%n", Arrays.toString(nums));
        for (int i = nums.length-1; i >=0 ; i--) {
            System.out.format("%d  ",nums[i]);
        }
        System.out.format("%n");

        //Napište program, který přečte celé číslo typu int a vypíše jeho binární hodnotu
    }
}
