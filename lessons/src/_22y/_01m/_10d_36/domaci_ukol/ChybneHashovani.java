package _22y._01m._10d_36.domaci_ukol;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

class Ovoce {
    private int cena;
    private String typ;

    public Ovoce(int cena) {
        this.cena = cena;
        this.typ = "Jablko";
    }

    public int getCena() {
        return cena;
    }

    public String getTyp() {
        return typ;
    }


    @Override
    public String toString() {
        return  "{cena=" + cena +
                "Kč, typ='" + typ + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ovoce ovoce = (Ovoce) o;
        return cena == ovoce.cena ;
    }

    @Override
    public int hashCode() {
        return this.cena;
    }
}

public class ChybneHashovani {
    public static void main(String[] args) {
        System.out.println("Toto hashovani funguje:");
        HashSet<Integer> intSet = new HashSet<>();
        for (int i = 6; i <= 8; i++) {
            intSet.add(Integer.valueOf(i));
        }
        System.out.println("intSet: " + intSet);
        System.out.println("obsahuje 7:" + intSet.contains(Integer.valueOf(7)));

        System.out.println("Toto hashovani nefunguje, opravte:");
        HashMap<Integer, String> ovoceSet = new HashMap<>();
        for (int i = 6; i <= 8; i++) {
            Ovoce ovc = new Ovoce(i);
            ovoceSet.put(ovc.getCena(), ovc.getTyp());
        }
        System.out.println("ovoceSet: " + ovoceSet);
        System.out.println("obsahuje 7:" + ovoceSet.containsKey(7));
    }
}
