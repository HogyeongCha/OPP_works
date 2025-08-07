package week13.LA4;

import java.io.*;
import java.net.*;

public class RSPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 7777);
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        System.out.print("Enter your choice (rock, paper, scissors): ");
        try {
            String choice = userInput.readLine();
            out.println(choice.trim());
            String response = in.readLine();
            System.out.println(response);
            String additionalLine;
            while ((additionalLine = in.readLine()) != null) {
                System.out.println(additionalLine);
            }
        } catch (IOException e) {
            System.err.println("Error during game: " + e.getMessage());
        } finally {
            socket.close();
        }
    }
}