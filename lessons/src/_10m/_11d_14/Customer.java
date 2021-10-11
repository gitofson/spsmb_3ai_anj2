package _10m._11d_14;

<<<<<<< HEAD
/**
 * Ukončení práce s objekty (finalizer - opak konstruktoru
 */
=======
// Ukončení práce s objekty (finalizer - opak konstruktoru)
>>>>>>> b840612adda681e1125e8bbb0a74896d77c39e1f
public class Customer {
    public static int nCustomers = 0;   // Proměnná třídy
    public int spent;

<<<<<<< HEAD
    // Potřebná znalost dědění (klíčová slova super, protected)
    protected void finalize() throws Throwable{
        Customer.nCustomers--;
        System.out.println("Konec zákazníka");
=======
    //potřebná znalost dědění (klíčová slova super, protected)
    protected void finalize() throws Throwable{
        nCustomers--;
        System.out.println("Konec zakaznika");
>>>>>>> b840612adda681e1125e8bbb0a74896d77c39e1f
        super.finalize();
    }

    public Customer() {
<<<<<<< HEAD
        Customer.nCustomers++;
=======
        nCustomers++;
>>>>>>> b840612adda681e1125e8bbb0a74896d77c39e1f
        this.spent = 0;
    }

    public void buy(int price) {
        this.spent += price;
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        System.out.format("Počet zákazníků: %d%n", nCustomers);
        Customer a = new Customer();
        System.out.format("Počet zákazníků: %d%n", nCustomers);
        Customer b = new Customer();
        System.out.format("Počet zákazníků: %d%n", nCustomers);
=======
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);
        Customer a = new Customer();
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);
        Customer b = new Customer();
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);
>>>>>>> b840612adda681e1125e8bbb0a74896d77c39e1f

        System.out.format("A utratil: %d%n", a.spent);
        a.buy(100);
        System.out.format("A utratil: %d%n", a.spent);
        b.buy(69);
        System.out.format("B utratil: %d%n", b.spent);
        System.out.format("utratili: %d%n", a.spent + b.spent);
        a = null;
<<<<<<< HEAD
        // Nutné vynucení si zrušení objektu (instance třídy Customer)
        System.runFinalization();   // Vynucení si spuštění finalizéru
        System.gc();                // Volání Garbage Collectoru
        System.out.format("Počet zákazníků: %d%n", nCustomers);
=======
        //nutné vynucení si zrušení objektu (instance třídy Customer)
        //na takto krátkém programu nutné spustit debugování a nastavit breakpointy
        System.runFinalization();//vynucení  si spuštění finalizérů
        System.gc();//volání Garbage Collectoru
        System.out.format("Počet zákazníků: %d%n", Customer.nCustomers);
>>>>>>> b840612adda681e1125e8bbb0a74896d77c39e1f
    }
}
