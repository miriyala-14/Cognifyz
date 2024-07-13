import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Enter the desired length of the password: ");
        int l = sc.nextInt();
        
        System.out.print("Include numbers? (yes/no): ");
        boolean a = sc.next().equalsIgnoreCase("yes");
        
        System.out.print("Include lowercase letters? (yes/no): ");
        boolean b = sc.next().equalsIgnoreCase("yes");
        
        System.out.print("Include uppercase letters? (yes/no): ");
        boolean c = sc.next().equalsIgnoreCase("yes");
        
        System.out.print("Include special characters? (yes/no): ");
        boolean d = sc.next().equalsIgnoreCase("yes");

        String numbers = "0123456789";
        String l1 = "abcdefghijklmnopqrstuvwxyz";
        String u = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String s = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
        
        String characterSet = "";
        
        if (a) characterSet += numbers;
        if (b) characterSet += l1;
        if (c) characterSet += u;
        if (d) characterSet += s;
        
        if (characterSet.isEmpty()) {
            System.out.println("No character types selected. Please select at least one.");
        } else {
            StringBuilder password = new StringBuilder(l);
            for (int i = 0; i < l; i++) {
                int index = r.nextInt(characterSet.length());
                password.append(characterSet.charAt(index));
            }
            System.out.println("Generated password: " + password);
        }

        sc.close();
    }
}
