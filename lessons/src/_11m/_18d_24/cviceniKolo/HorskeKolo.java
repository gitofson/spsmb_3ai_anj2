package _11m._18d_24.cviceniKolo;

public class HorskeKolo extends Kolo{
    private int prevodyVpredu;
    private int prevodyVzadu;

    public HorskeKolo(String vyrobce, int cena, int prevodyVpredu, int prevodyVzadu) {
        super(vyrobce, cena, true);
        this.prevodyVpredu = prevodyVpredu;
        this.prevodyVzadu = prevodyVzadu;
    }

    @Override
    public void vypisCoJsiZac(String druh) {
        super.vypisCoJsiZac(druh);
        System.out.println("prevody v predu "+prevodyVpredu+ "\nprevody vzadu "+prevodyVzadu);
    }
}
