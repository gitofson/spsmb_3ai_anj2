package _10m._11d_14.A_Exercies_01;

public class Main {
    /*
    Přetěžte konstruktor Triangle (int jednaStrana),
    který bude vytvářet rovnostranné trojúhelníky
     */
    public static void main(String[] args) {
        Triangle abc = new Triangle(3, 5);
        System.out.println(abc.circumference());
        System.out.println(abc.isRightAngle());
        System.out.println(abc.isTriangle());
        System.out.println(abc);
    }
}
