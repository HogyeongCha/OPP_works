package week10.LA1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        TokenCounter counter = new TokenCounter();
        int tokenCount = counter.countTokens(sentence);

        System.out.println(tokenCount);

        scanner.close();
    }
}
