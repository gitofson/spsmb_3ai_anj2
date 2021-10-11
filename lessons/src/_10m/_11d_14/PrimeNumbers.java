package _10m._11d_14;
<<<<<<< HEAD

/**
 * Vytvoření statického inicializačního bloku,
 * který po spuštění programu napošítá prvních MAX prvočísel
 */
public class PrimeNumbers {
    public static final int MAX = 1000;
    public static final int numbers[] = new int[MAX];
    // Staticky inicializační blok - obdoba konstruktoru, ale ve světě proměnných třídy (statických)

    static {
        int count = 2;
        numbers[0] = 1;
        numbers[1] = 2;
        next:
        for (int i = 3; count < numbers.length; i += 2) {
            // Zjištění, zda je číslo prvočíslo (dělitelné jen samo sebou a jedničkou)
            for (int j = 2; j < count; j++) {
                if (i % numbers[j] == 0) {
                    // Tohle není prvočíslo
                    continue next;
                }
            }
            numbers[count] = i;
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.format("Prvních %d prvočísel: %n", MAX);
        for (int number : numbers) {
            System.out.printf("%4d%n", number);
=======
//Vytvořerní statického inicializačního bloku, který po spuštění programu napočítá prvních  MAX
//prvočísel
public class PrimeNumbers {
    public static final int MAX = 1000;
    public static final int cisla[] = new int[MAX];
    //staticky inicializační blok - obdoba konstruktoru,
    // ale ve světě proměnných třídy (statických)
    static {
        int pocet = 2;
        cisla[0] = 1;
        cisla[1] = 2;

        dalsi:
        for (int i = 3; pocet < cisla.length; i+=2) {
            //zjištění, zda je číslo prvočíslo (dělitelné jen samo sebou a jedničkou)
            for (int j = 2; j < pocet; j++) {
                if(i % cisla[j] == 0) {
                    // tohle není prvočíslo
                    continue dalsi;
                }
            }
            cisla[pocet] = i;
            pocet ++;
        }
    }
    // konec staticky inicializovaného bloku

    public static void main(String[] args) {
        System.out.format("Prvnich %d prvocisel:%n", MAX);
        for(int prime: cisla){
            System.out.format("%d ", prime);
>>>>>>> b840612adda681e1125e8bbb0a74896d77c39e1f
        }
    }
}
