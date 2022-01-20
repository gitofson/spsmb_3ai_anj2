package _21y._12m._06d_29;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMetodyZCollection {
    public static void tiskni(String jmeno, ArrayList<String> al) {
        int vel = al.size();
        System.out.println(jmeno + " (" + vel + ") : ");
        for (int i = 0; i < vel; i++) {
            System.out.println("[" + i + "]="+al.get(i) + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("\nVytvoreni seznamu");
        ArrayList<String> ar1 = new ArrayList<String>();
        System.out.println("ar1 je prazdny: "+ ar1.isEmpty());
        ar1.add("prvni");
        ar1.add("druhy");
        ar1.add("prvni");
        System.out.println("ar1 je prazdny: "+ ar1.isEmpty());
        tiskni("ar1:", ar1);
        System.out.println("Pridavani/ubirani prvku");
        ArrayList<String> ar2 = new ArrayList<String>(ar1);
        ar2.add("treti");
        tiskni("ar2:", ar2);
        ar2.remove("prvni");
        tiskni("ar2:", ar2);
        ar2.removeAll(ar1);
        tiskni("ar2:", ar2);
        ar2.addAll(ar1);
        tiskni("ar2:", ar2);
        ar2.retainAll(ar1);
        tiskni("ar2:", ar2);

        System.out.println("Hledani prvku");
        ArrayList<String> ar3 = new ArrayList<String>(ar1);
        ar3.add("ctvrty");
        System.out.println("ar3 obsahuje 'paty': "+ar3.contains("paty"));
        System.out.println("ar3 obsahuje ar1: "+ar3.containsAll(ar1));

        System.out.println("Prevod na pole");
        Object[] s = ar1.toArray();
        for (int i = 0; i < s.length; i++) {
            System.out.println("[" + i +"]=" + (String) s[i]+ ", ");
        }
        System.out.println();

        System.out.println("Prevod na pole typovaně");
        String[] s1 = ar1.toArray(new String[0]);
        System.out.println(Arrays.toString(s1));

        String[] s2 = ar1.toArray(new String[2]);
        System.out.println(Arrays.toString(s2));

        String[] s3 = ar1.toArray(new String[ar2.size()]);
        System.out.println(Arrays.toString(s3));

        String[] s4 = ar1.toArray(new String[ar2.size()+2]);
        System.out.println(Arrays.toString(s4));

    }
}
