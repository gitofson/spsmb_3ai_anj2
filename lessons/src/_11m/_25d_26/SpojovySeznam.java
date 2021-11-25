package _11m._25d_26;

//vytvoříme spojový seznam (linked list) objektů,
//který se bude na sebe odkazovat
//pomocí členské proměnné dalsi
public class SpojovySeznam {
    private int hodnota;
    private SpojovySeznam dalsi;

    public SpojovySeznam(int hodnota) {
        this.hodnota = hodnota;
        this.dalsi = null;
    }
    public void pridejNaKonec(SpojovySeznam obj){
        this.dalsi=obj;
    }
}
