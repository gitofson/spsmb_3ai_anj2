package _12m._09d_30.linked_list.ukol_fronta;

import _12m._09d_30.linked_list.Zasobnik;

import java.sql.SQLOutput;

public class PouzitiFronta {
    public static void main(String[] args) {
        Fronta<String> zs = new Fronta<>();
        zs.add("prvni");
        zs.add("druhy");
        zs.add("treti");
        System.out.println(zs.get());
        while(zs.isEmpty() == false){
            System.out.println(zs.remove());
        }

    }
}
