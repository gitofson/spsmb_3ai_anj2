package _11m._18d_24.cviceniVozidlo;

import org.w3c.dom.ls.LSOutput;

public class Motocykl extends JednostopeVozidlo{
    private int obsahNadrze;

    public Motocykl(int obsahNadrze, String druh) {
        this.obsahNadrze = obsahNadrze;
        this.druh = druh;
    }

    @Override
    public String toString() {
        return "Motocykl{" +
                "druh='" + druh + '\'' +
                ", obsahNadrze=" + obsahNadrze +
                '}';
    }

    @Override
    public void vypisCoJsiZac() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        Motocykl moto = new Motocykl(8, "harley");
        System.out.println(moto);
        moto.vypisCoJsiZac();
    }

}
