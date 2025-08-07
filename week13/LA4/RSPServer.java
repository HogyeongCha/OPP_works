package week13.LA4;

import java.io.*;
import java.net.*;
import java.util.Random;

public class RSPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(7777);
        Socket clientSocket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        try {
            String clientChoice = in.readLine();
            if (clientChoice == null || !isValidChoice(clientChoice)) {
                out.println("Invalid input, please enter one of rock, paper, scissors");
                return;
            }
            String serverChoice = getServerChoice();
            System.out.println("Server choice: " + serverChoice);
            String result = determineWinner(clientChoice, serverChoice);
            String response = String.format("Server chose: %s\n%s", serverChoice, result);
            out.println(response);
        } catch (IOException e) {
            System.err.println("Error during game: " + e.getMessage());
        } finally {
            clientSocket.close();
            serverSocket.close();
            System.out.println("Server closed");
        }
    }

    private static String getServerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        return choices[random.nextInt(3)];
    }

    private static boolean isValidChoice(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    private static String determineWinner(String clientChoice, String serverChoice) {
        if (clientChoice.equals(serverChoice)) {
            return "It's a draw!";
        }

        boolean clientWins = false;

        switch (clientChoice) {
            case "rock":
                clientWins = serverChoice.equals("scissors");
                break;
            case "paper":
                clientWins = serverChoice.equals("rock");
                break;
            case "scissors":
                clientWins = serverChoice.equals("paper");
                break;
        }

        return clientWins ? "You win!" : "You lose!";
    }
}