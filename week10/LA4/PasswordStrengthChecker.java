package week10.LA4;

public class PasswordStrengthChecker {
    public String checkPasswordStrength(String password) {
        // check how strong the password is.
        int conditionsMet = 0;

        if (password.length() >= 8) conditionsMet++;
        if (password.matches(".*[A-Z].*")) conditionsMet++;
        if (password.matches(".*[a-z].*")) conditionsMet++;
        if (password.matches(".*\\d.*")) conditionsMet++;
        if (password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*"))conditionsMet++;
        // update conditionsMet var as 1~

        if (conditionsMet == 1) {
            return "Very Weak";
        } else if (conditionsMet == 2) {
            return "Weak";
        } else if (conditionsMet == 3) {
            return "Moderate";
        } else if (conditionsMet == 4) {
            return "Strong";
        } else {
            return "Very Strong";
        }
    }
}
