package _11m._18d_24.cviceniVozidlo;

public class motocykl extends JednostopeVozidlo{
    private int cena;
    private int obsahNadrze;
    private String vyrobce;

    public motocykl(String druh, String vyrobce, int cena, int obsahNadrze) {
        super(druh);
        this.cena = cena;
        this.obsahNadrze = obsahNadrze;
        this.vyrobce = vyrobce;
    }

    @Override
    public void vypisCoJsiZac() {
        System.out.println();
    }
}
