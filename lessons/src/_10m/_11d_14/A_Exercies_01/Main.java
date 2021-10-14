package _10m._11d_14.A_Exercies_01;

public class Main {
    /*
    Modifikujte třídu Triangle tak, aby konstruktor ošetřil případy,
    kdy zadávané strany netvoří trojúhelník (tj. součet dvou stran je menší,
    než třetí strana). V tomto případě konstruktor nastaví všechny strany na nulu
     */
    /*Přetěžte konstruktor Triangle (int jednaStrana),
     který bude vytvářet rovnostranné trojúhelíky

    */
    /*Přetěžte konstruktor Triangle (int jednaStrana, int druhaStrana),
     který bude vytvářet rovnramenné trojúhelíky

    * */
    /*
    Vytvořte třídu pravoúhlý trojúhelník, kdy se jako parametry konstruktoru
    budou zadávat pouze odvěsny a přepona se dopočítá. Třída bude poskytovat
    metodu double delkaPrepony.
     */
    /*
    Přetěžte konstruktor PravouhlyTrojuhelnik(), který vytvoří rovnoramenný
    pravoúhlý trojúhelník s odvěsnami délky 1. Třída bude poskytovat metodu
    doble obsah()
     */
    public static void main(String[] args) {
        Triangle abc = new Triangle(3, 4, 10);
        System.out.println(abc.circumference());
        System.out.println(abc.isRightAngle());
        System.out.println(abc.isTriangle());
    }
}
