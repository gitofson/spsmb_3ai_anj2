package _22y._03m._17d_48.vlakna;
// Vypočítejte konstantu pi pomocí modelu hodu šipkami do čtverce 2x2 o obsahu 4.
// Zjistěte, zda je hod šipkou uvnitř vepsané jednotkové kružnice tohoto čtverce. Hod šipkou je reprezentován náhodnými
// čísly typu double od -1 do 1. Pokud je bod uvnitř vepsané kružnice, platí x^2+Y^2<=1.
// Konstantu pi spočítáte jako pi = 4*No/N, kde N je celkový počet hodů a No je pošet hodů do vepsaného kruhu.
// Můžete se inspirovat z resources/examples/c
// Použijte co největší počet hodů a vlákna pro urychlení výpočtu.
// Změřte dobu běhu pro verzi s vlákny a verzi bez vláken.
public class Ukol {
            double randomWithRange(int min, int max){
                double range = (max - min);
                return (Math.random() * range) + min;
            }

            public static void main( String args[] ) {
                Ukol du = new Ukol();
                double n0 = 0;
                double n = 100000;

                for(int i = 0; i < n; i++){

                    double x= du.randomWithRange(-1,1);
                    double y= du.randomWithRange(-1,1);
                    if(x*x+y*y<=1){
                        n0= n0 + 1;
                    }

                }
                double pi = 4*n0/n;
                System.out.println(pi);


            }

}
