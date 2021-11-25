package _11m._18d_24.dedicnost2;

public class Hash {
    public static void main(String[] args) {
        Pomocna p1 = new Pomocna(3.14);
        Pomocna p2 = new Pomocna(3.14);
        System.out.format("p1:%d%np2:%d%n", p1.hashCode(), p2.hashCode());
        Integer i1 = Integer.valueOf(5);
        Integer i2 = Integer.valueOf(5);
        Byte b = Byte.valueOf((byte) 5);
        System.out.println("i1 " + i1.hashCode());
        System.out.println("i2 " + i2.hashCode());
        System.out.println("b " + b.hashCode());
    }
}
