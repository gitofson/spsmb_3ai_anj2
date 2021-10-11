package _10m._11d_14.A_Exercies_01;

public class Main {
    /*
    Napište třídu Triangle, který bude poskytovat metody
    double circumference() a boolean isRightAngle() - Členské proměnné budou čísla
    sideA, sideB a sideC
     */

    public static void main(String[] args) {
        Triangle abc = new Triangle(3, 4, 5);
        System.out.println(abc.circumference());
        System.out.println(abc.isRightAngle());
    }
}
