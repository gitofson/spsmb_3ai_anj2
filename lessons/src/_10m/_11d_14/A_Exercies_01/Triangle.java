package _10m._11d_14.A_Exercies_01;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public double circumference () {
        return this.sideA + this.sideB + this.sideC;
    }

    public boolean isRightAngle() {
        return Math.pow(sideC, 2) == Math.pow(sideA, 2) + Math.pow(sideB, 2);
    }

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }
}
