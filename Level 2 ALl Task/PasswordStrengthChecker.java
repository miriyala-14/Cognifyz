import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter your desired password: ");
        String userPassword = inputScanner.nextLine();
        inputScanner.close();

        String passwordStrengthFeedback = evaluatePasswordStrength(userPassword);
        System.out.println(passwordStrengthFeedback);
    }

    public static String evaluatePasswordStrength(String password) {

        int minimumLength = 8;
        boolean containsUppercase = false;
        boolean containsLowercase = false;
        boolean containsDigit = false;
        boolean containsSpecialCharacter = false;
        String specialCharacters = "!@#$%^&*()_+[]{}|;:,.<>?~";

        if (password.length() >= minimumLength) {
            for (char character : password.toCharArray()) {
                if (Character.isUpperCase(character)) {
                    containsUppercase = true;
                } else if (Character.isLowerCase(character)) {
                    containsLowercase = true;
                } else if (Character.isDigit(character)) {
                    containsDigit = true;
                } else if (specialCharacters.contains(String.valueOf(character))) {
                    containsSpecialCharacter = true;
                }
            }

            if (containsUppercase && containsLowercase && containsDigit && containsSpecialCharacter) {
                return "It is a Strong Password!!!\nThank you for using the Password Strength Checker!!!";
            } else {
                return "It is a Weak Password. Please include Uppercase Letters, Lowercase Letters, Numbers & Special Characters!!!";
            }
        } else {
            return "Password length must be at least " + minimumLength + " characters!!!";
        }
    }
}
