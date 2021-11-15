package _11m._15d_23.dedicnost;

public class Kvadr extends Obdelnik {
    private int hloubka;

    public int getHloubka() {
        return hloubka;
    }
    public Kvadr(int sirka, int vyska, int hloubka) {
        super(sirka, vyska);
        this.hloubka = hloubka;
    }
    public double delkaUhlopricky(){
        return Math.sqrt(
                super.delkaUhlopricky()*super.delkaUhlopricky()
                        +
                this.hloubka*this.hloubka);
    }

    public static void main(String[] args) {
        Kvadr kva = new Kvadr(6,8,10);
        System.out.println("uhlopricka = " + kva.delkaUhlopricky());
        System.out.println("sirka = " + kva.getSirka());
        System.out.println("vyska = " + kva.getVyska());
        System.out.println("hloubka = " + kva.getHloubka());
    }
}
