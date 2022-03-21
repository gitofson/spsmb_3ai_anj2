package _22y._03m._17d_48.vlakna;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class gen_do_milionu {

        public static void main(String[] args) throws IOException {
            int k = 10;
            FileWriter write = new FileWriter("gen.txt");
            PrintWriter print = new PrintWriter(write);

            for (int j = 0; j < 1000000; j++) {
                print.println(j);
                System.out.print(j+1 + " ");
            }
            print.close();
        }
}
