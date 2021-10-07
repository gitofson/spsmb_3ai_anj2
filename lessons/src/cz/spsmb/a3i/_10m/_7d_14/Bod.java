package cz.spsmb.a3i._10m._7d_14;
//Deklarace třídy Bod
public class Bod {
    //vlastnosti instance třídy Bod (instanční proměnné)
    private int x;
    private int y;
    private int barva;

    public int getX(){
        return this.x; //this není nutný, ale velmi doporučuji používat
    }
    public int getY() {
        return this.y;
    }
    public int getBarva() {
        return this.barva;
    }
    public void setBarva(int barva) {
        this.barva = barva;
    }
}
