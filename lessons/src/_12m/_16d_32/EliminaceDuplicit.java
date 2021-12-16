package _12m._16d_32;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EliminaceDuplicit {
    public static void main(String[] args) {
        Collection<String> d = new ArrayList<>();
        d.add("prvni");
        d.add("druhy");
        d.add("prvni");
        System.out.println("Duplicitni: "+d);
    }
}
