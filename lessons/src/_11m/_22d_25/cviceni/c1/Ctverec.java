package _11m._22d_25.cviceni.c1;

public class Ctverec extends Usecka implements Zobrazitelny {
        protected int sirka;

        public Ctverec(int sirka) {
            super(sirka);
            this.sirka = sirka;
        }

        @Override
        public void zobraz() {
            for (int i = 0; i < this.sirka; i++) {
                for (int j = 0; j < this.sirka; j++) {
                    System.out.print("  *");
                }
                System.out.println();
            }
            System.out.println("\n");

        }



    }

