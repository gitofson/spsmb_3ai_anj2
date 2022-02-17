package _22y._02m._17d_46.piskorky;

import javafx.collections.ObservableMap;
import javafx.scene.control.Button;

import java.io.Serializable;
import java.util.ArrayList;

public class PiskorkyStatus implements Serializable {
    int rozmerHraciPlochy;
    int nTah = 1;
    //int[][] herniPlochaHracu;
    ArrayList<String> hraci;
    Button[][] herniTlacitka;
    //aktivni Hráč se zde automaticky inicializuje na 0 (LOJZA), netřeba inicializovat
    int aktivniHrac;

    public PiskorkyStatus(int rozmerHraciPlochy) {
        this.rozmerHraciPlochy = rozmerHraciPlochy;
        //this.herniPlochaHracu = new int[this.rozmerHraciPlochy + 1][this.rozmerHraciPlochy + 1];
        //for (int i = 0; i < this.herniPlochaHracu.length; i++) {
        //    Arrays.fill(this.herniPlochaHracu[i], (byte) -1);
        // }
        this.herniTlacitka = new Button[this.rozmerHraciPlochy + 1][this.rozmerHraciPlochy + 1];
        this.hraci = new ArrayList<>();
        this.hraci.add("Lojza");
        this.hraci.add("Franta");
        //this.hraci.add("Pepa");
        this.inicializaceTlacitek();
    }
    public void inicializaceTlacitek(){
        for (int i = 0; i < this.rozmerHraciPlochy + 1; i++) {
            for (int j = 0; j < this.rozmerHraciPlochy + 1; j++) {
                Button b = new Button();
                b.setPrefSize(28,28);
                this.herniTlacitka[i][j] = b;
                ObservableMap<Object, Object> om = b.getProperties();
                om.put("i", Integer.valueOf(i));
                om.put("j", Integer.valueOf(j));
                om.put("player", Integer.valueOf(-1));
            }
        }
    }
}
