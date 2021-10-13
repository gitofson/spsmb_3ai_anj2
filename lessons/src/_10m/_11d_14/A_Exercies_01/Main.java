package _10m._11d_14.A_Exercies_01;

public class Main {
    /*
    Modifikujte třídu Triangle tak, aby konstruktor ošetřil případy,
    kdy zadávané strany netvoří trojúhelník (tj. součet dvou stran je menší,
    než třetí strana). V tomto případě konstruktor nastaví všechny strany na nulu
     */
    public static void main(String[] args) {
        Triangle abc = new Triangle(3, 4, 10);
        System.out.println(abc.circumference());
        System.out.println(abc.isRightAngle());
        System.out.println(abc.isTriangle());
    }
}
