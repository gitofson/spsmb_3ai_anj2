package _12m._09d_30.linked_list.ukol_fronta;

import _12m._09d_30.linked_list.ukol_fronta.Fronta;

public class PouzitiFronty {
    public static void main(String[] args) {
        Fronta<String> zs = new Fronta<>();
        zs.add("prvni");
        zs.add("druhy");
        zs.add("treti");
        System.out.println(zs.get());//treti
        while(zs.isEmpty() == false){
            System.out.println(zs.remove());
        } //treti, druhy, prvni
        System.out.println();
        Fronta<Integer> zi = new Fronta<>();
        zi.add(Integer.valueOf(8));
        zi.add(Integer.valueOf(9));
        while(zi.isEmpty() == false) {
            System.out.println(zi.remove()+" ");
        }//9,8

    }
}
