import java.util.*;  
import java.io.*;

public class FileEncryptionDecryption {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("Choose operation (1 for encryption, 2 for decryption): ");
        int userChoice = userInputScanner.nextInt();

        System.out.print("Enter the input file name or path: ");
        String inputFilePath = userInputScanner.next();

        System.out.print("Enter the output file name: ");
        String outputFilePath = userInputScanner.next();

        try {
            if (userChoice == 1) {
                encryptFile(inputFilePath, outputFilePath);
                System.out.println("Encryption successful. Result saved to " + outputFilePath);
            } else if (userChoice == 2) {
                decryptFile(inputFilePath, outputFilePath);
                System.out.println("Decryption successful. Result saved to " + outputFilePath);
            } else {
                System.out.println("Invalid choice. Please choose 1 for encryption or 2 for decryption.");
            }
        } catch (IOException ioException) {
            System.out.println("An error occurred: " + ioException.getMessage());
        } finally {
            userInputScanner.close();
        }
    }

    private static void encryptFile(String inputFilePath, String outputFilePath) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFilePath))) {

            String currentLine;
            while ((currentLine = fileReader.readLine()) != null) {
                String encryptedLine = encryptText(currentLine);
                fileWriter.write(encryptedLine);
                fileWriter.newLine();
            }
        }
    }

    private static void decryptFile(String inputFilePath, String outputFilePath) throws IOException {
        try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outputFilePath))) {

            String currentLine;
            while ((currentLine = fileReader.readLine()) != null) {
                String decryptedLine = decryptText(currentLine);
                fileWriter.write(decryptedLine);
                fileWriter.newLine();
            }
        }
    }

    private static String encryptText(String plainText) {
        // Simple encryption algorithm (for demonstration purposes)
        StringBuilder encryptedTextBuilder = new StringBuilder();
        for (char character : plainText.toCharArray()) {
            encryptedTextBuilder.append((char) (character + 1));
        }
        return encryptedTextBuilder.toString();
    }

    private static String decryptText(String encryptedText) {
        // Simple decryption algorithm (for demonstration purposes)
        StringBuilder decryptedTextBuilder = new StringBuilder();
        for (char character : encryptedText.toCharArray()) {
            decryptedTextBuilder.append((char) (character - 1));
        }
        return decryptedTextBuilder.toString();
    }
}
