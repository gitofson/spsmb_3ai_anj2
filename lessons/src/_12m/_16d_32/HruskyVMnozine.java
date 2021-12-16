package _12m._16d_32;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Hruska implements Comparable<Hruska>{
    private int cena;
    public Hruska(int cena) {
        this.cena = cena;
    }

    @Override
    public int compareTo(Hruska o) {
        if(this.cena > o.cena) { return +1; }
        else if (cena == o.cena ) {return 0; }
        else return -1;
    }

    @Override
    public String toString() {
        return String.format("%d", this.cena);
    }
}
public class HruskyVMnozine {
    static void praceSHruskami (String typ, Set<Hruska> st){
        for (int i = 20; i < 30; i++) {
            st.add(new Hruska(i));
        }
        //pokus o duplikaci Hrusky v mnozine
        st.add(new Hruska(25));
        System.out.print(typ + "-pocet: "+st.size()+" [");
        for (Hruska h: st) {
            System.out.print(h+", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        praceSHruskami("HashSet", new HashSet<Hruska>());
        praceSHruskami("HashSet", new TreeSet<Hruska>());
    }
}
