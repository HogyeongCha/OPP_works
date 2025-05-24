package week10.LA1;

public class TokenCounter {
    public int countTokens(String sentence) {
        // count tokens and return as int
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }

        String[] tokens = sentence.trim().split("\\s+");

        return tokens.length;

    }
}
