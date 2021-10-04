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
     /*   boolean binNums[] = new boolean[32];
        int in = sc.nextInt();
        int tmp;
        for (int i=binNums.length-2; i>=0; i--){
            tmp=in/(1<<i);
            in%=(1<<i);
            if(tmp > 0){
                binNums[binNums.length-i-1]=true;
            }
        }

        //System.out.format("%s%n", Arrays.toString(binNums));
        for( boolean val:binNums){
            System.out.format("%s",val?"1":"0");
        }*/
        //Napište program, který  přečte celé číslo typu long složené jen z nul a jedniček,
        //které bude chápáno jako binární číslo. Vypište dekadickou hodnotu tohoto čísla
        long lBinary = sc.nextLong();
        final int N_LONG_MAX_ORDER=20;
        boolean binNums[] = new boolean[N_LONG_MAX_ORDER];
        long tmp;
        int out=0;
        for (int i=binNums.length-2; i>=0; i--){
            tmp = lBinary / (long)Math.pow(10,i);
            lBinary%=(long)Math.pow(10,i);
            if(tmp > 0){
                binNums[binNums.length-i-1]=true;
                out+=1<<i;
            }
        }
        for( boolean val:binNums){
            System.out.format("%s",val?"1":"0");
        }
        System.out.format("out: %d%n", out);
    }
}
