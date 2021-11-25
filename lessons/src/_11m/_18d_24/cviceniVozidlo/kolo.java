package _11m._18d_24.cviceniVozidlo;

public class kolo extends JednostopeVozidlo{
    private int cena;
    private String vyrobce;

    public kolo(String druh, String vyrobce, int cena) {
        super(druh);
        this.vyrobce = vyrobce;
        this.cena = cena;
    }

    @Override
    public void vypisCoJsiZac() {
        System.out.println();
    }
}
