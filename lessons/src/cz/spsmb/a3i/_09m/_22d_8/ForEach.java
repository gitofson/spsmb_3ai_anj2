package cz.spsmb.a3i._09m._22d_8;

public class ForEach {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 5, 7};
        int sum = 0;
        for (int number: arrInt) {
            System.out.println(number);
            sum += number;
        }
        System.out.println(sum);
    }
}
