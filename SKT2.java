import java.io.*;
import java.net.*;

public class SKT2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);
            System.out.println("Connected to server");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader userInput = new BufferedReader(
                    new InputStreamReader(System.in));
            while (true) {
                System.out.print("You: ");
                String msg = userInput.readLine();
                out.write(msg);
                out.newLine();
                out.flush();
                if (msg.equalsIgnoreCase("exit")) {
                    break;
                }
                String data = in.readLine();
                System.out.println("Server: " + data);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}