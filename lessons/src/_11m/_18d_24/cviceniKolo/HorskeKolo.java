package _11m._18d_24.cviceniKolo;

public class HorskeKolo extends Kolo {
    private int prevodyVpredu;
    private int prevodyVzadu;

    public HorskeKolo(String vyrobce, int cena, boolean maPrehazovacku) {
        super(vyrobce, cena, true);

    }

    @Override
    public String toString() {
        return "HorskeKolo{" +
                "prevodyVpredu=" + prevodyVpredu +
                ", prevodyVzadu=" + prevodyVzadu +
                '}';
    }

    @Override
    public void vypisCoJsiZac() {
        super.vypisCoJsiZac();
        System.out.println(this.toString());
    }
}
