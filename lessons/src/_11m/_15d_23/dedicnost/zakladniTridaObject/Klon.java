package _11m._15d_23.dedicnost.zakladniTridaObject;

public class Klon implements  Cloneable {
    int i;
    Klon(int i ) {this.i = i;}
    //překrytí metody clone()
    protected Object clone() {
        Klon k = null;
        try {
            k = (Klon) super.clone();
            k.i = this.i;
        }
        catch(CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
    }
}
