package cz.spsmb.a3i._10m._7d_14;
//Obdelník bez konstruktoru, použití implicitního konstruktoru

 /*
public class Obdelnik {
    //veřejné členské proměnné - nedoporučuje se, raději použít private
    public int vyska;
    public int sirka;
    public int obvod(){
        int out;
        out = 2*(this.sirka+this.vyska);
        return out;
    }
    public int obsah(){
        return this.vyska*this.sirka;
    }
}
*/

//Obdelník s konstruktorem, implicitní konstruktor se pak nevytváří.


public class Obdelnik {
    //veřejné členské proměnné - nedoporučuje se, raději použít private
    public int vyska;
    public int sirka;
    //Konstruktor  - metoda, kter se musí jmenovat stejně, jako Třída,
    // nemá návratovou hodnotu, nesmí obsahovat příkaz return
    public Obdelnik (int sirka, int vyska){
        this.sirka=sirka;
        this.vyska=vyska;
    }
    public int obvod(){
        int out;
        out = 2*(this.sirka+this.vyska);
        return out;
    }
    public int obsah(){
        return this.vyska*this.sirka;
    }
}
