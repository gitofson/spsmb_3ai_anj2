package _22y._02m._17d_46.piskorky;

import javafx.collections.ObservableMap;
import javafx.scene.control.Button;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PiskorkyStatus implements Serializable {
    int rozmerHraciPlochy;
    int nTah = 1;
    //int[][] herniPlochaHracu;
    ArrayList<String> hraci;
    Map[][] herniTlacitka;
    //aktivni Hráč se zde automaticky inicializuje na 0 (LOJZA), netřeba inicializovat
    int aktivniHrac;

    public PiskorkyStatus(int rozmerHraciPlochy) {
        this.rozmerHraciPlochy = rozmerHraciPlochy;
        //this.herniPlochaHracu = new int[this.rozmerHraciPlochy + 1][this.rozmerHraciPlochy + 1];
        //for (int i = 0; i < this.herniPlochaHracu.length; i++) {
        //    Arrays.fill(this.herniPlochaHracu[i], (byte) -1);
        // }
        this.herniTlacitka = new HashMap[this.rozmerHraciPlochy + 1][this.rozmerHraciPlochy + 1];
        this.hraci = new ArrayList<>();
        //this.hraci.add("Pepa");
        this.inicializaceTlacitek();
    }

    public void inicializaceTlacitek() {
        for (int i = 0; i < this.rozmerHraciPlochy + 1; i++) {
            for (int j = 0; j < this.rozmerHraciPlochy + 1; j++) {
                HashMap om = new HashMap();
                this.herniTlacitka[i][j] = om;
                om.put("i", Integer.valueOf(i));
                om.put("j", Integer.valueOf(j));
                om.put("player", Integer.valueOf(-1));

            }
        }
    }
    public void pridatHrace(String jmeno){
        this.hraci.add(jmeno);
    }
}
