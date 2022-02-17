package _22y._02m._17d_46.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;

//Server přijme text, pokud to není "bye", otočí ho a pošle zpět
public class FReverseServer {
    public static void main(String[] args) throws IOException {

        int port = 8081;

        try (var serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);
            while (true) {
                try (var socket = serverSocket.accept()) {
                    System.out.println("client connected");
                    try (var reader = new BufferedReader(new InputStreamReader(
                            socket.getInputStream()));
                         var writer = new PrintWriter(socket.getOutputStream(), true)) {
                        String text;
                        do {
                            text = reader.readLine();
                            if (text != null) {

                                var reversed = new StringBuilder(text).reverse().toString();
                                writer.println("Server: " + reversed);
                                System.out.println(text);
                            }
                        } while (!"bye".equals(text));
                        System.out.println("client disconnected");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
