package _22y._02m._17d_46.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class GReverseClient {
    public static void main(String[] args) throws IOException {
        var hostname = "localhost";
        int port = 8081;
        try (var socket = new Socket(hostname, port)) {
            try (var writer = new PrintWriter(socket.getOutputStream(), true)) {
                try (var scanner = new Scanner(System.in)) {
                    try (var reader = new BufferedReader(new InputStreamReader(
                            socket.getInputStream()))) {
                        String command;
                        do {
                            System.out.print("Enter command: ");
                            command = scanner.nextLine();
                            writer.println(command);
                            var data = reader.readLine();
                            System.out.println(data);
                        } while (!command.equals("bye"));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
