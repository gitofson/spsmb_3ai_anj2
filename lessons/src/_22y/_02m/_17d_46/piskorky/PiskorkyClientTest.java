package _22y._02m._17d_46.piskorky;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;

public class PiskorkyClientTest {
    public static void main(String[] args) throws IOException {

        var hostname = "localhost";
        int port = 8081;
        int state = 0;
        while(state < 100) {
            try (var socket = new Socket(hostname, port)) {
                switch (state) {
                    case 0:
                        try (var writer = socket.getOutputStream()) {
                            writer.write(20);
                            //writer.flush();
                            state = 20;
                        }
                        break;
                    case 10:
                        try (var reader = new InputStreamReader(socket.getInputStream())) {
                            int character;
                            var output = new StringBuilder();
                            while ((character = reader.read()) != -1) {
                                output.append((char) character);
                            }
                            System.out.println(output);
                            state = 100;
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 20:
                        try (var reader = new ObjectInputStream(socket.getInputStream())){
                            PiskorkyStatus ps = (PiskorkyStatus) reader.readObject();
                            System.out.println(ps.aktivniHrac);
                            System.out.println(ps.hraci.toString());
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                }
            }
        }
    }
}
