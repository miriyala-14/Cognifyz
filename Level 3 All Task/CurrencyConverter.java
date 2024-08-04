import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {
   public static void main(String[] args) {
      double inputAmount;
      double inr, usd, gbp, eur, jpy, myr;
      int userChoice;

      DecimalFormat formatter = new DecimalFormat("##.##");

      Scanner scanner = new Scanner(System.in);

      System.out.println("Select a currency to convert from:");
      System.out.println("1: INR (Rupee)");
      System.out.println("2: USD (Dollar)");
      System.out.println("3: GBP (Pound)");
      System.out.println("4: EUR (Euro)");
      System.out.println("5: JPY (Yen)");
      System.out.println("6: MYR (Ringgit)");

      System.out.print("Enter your choice: ");
      userChoice = scanner.nextInt();

      System.out.print("Enter the amount to convert: ");
      inputAmount = scanner.nextFloat();

      switch (userChoice) {
         case 1:
            usd = inputAmount / 70;
            System.out.println(inputAmount + " INR = " + formatter.format(usd) + " USD");

            gbp = inputAmount / 88;
            System.out.println(inputAmount + " INR = " + formatter.format(gbp) + " GBP");

            eur = inputAmount / 80;
            System.out.println(inputAmount + " INR = " + formatter.format(eur) + " EUR");

            jpy = inputAmount / 0.63;
            System.out.println(inputAmount + " INR = " + formatter.format(jpy) + " JPY");

            myr = inputAmount / 16;
            System.out.println(inputAmount + " INR = " + formatter.format(myr) + " MYR");
            break;

         case 2:
            inr = inputAmount * 70;
            System.out.println(inputAmount + " USD = " + formatter.format(inr) + " INR");

            gbp = inputAmount * 0.78;
            System.out.println(inputAmount + " USD = " + formatter.format(gbp) + " GBP");

            eur = inputAmount * 0.87;
            System.out.println(inputAmount + " USD = " + formatter.format(eur) + " EUR");

            jpy = inputAmount * 111.087;
            System.out.println(inputAmount + " USD = " + formatter.format(jpy) + " JPY");

            myr = inputAmount * 4.17;
            System.out.println(inputAmount + " USD = " + formatter.format(myr) + " MYR");
            break;

         case 3:
            inr = inputAmount * 88;
            System.out.println(inputAmount + " GBP = " + formatter.format(inr) + " INR");

            usd = inputAmount * 1.26;
            System.out.println(inputAmount + " GBP = " + formatter.format(usd) + " USD");

            eur = inputAmount * 1.10;
            System.out.println(inputAmount + " GBP = " + formatter.format(eur) + " EUR");

            jpy = inputAmount * 140.93;
            System.out.println(inputAmount + " GBP = " + formatter.format(jpy) + " JPY");

            myr = inputAmount * 5.29;
            System.out.println(inputAmount + " GBP = " + formatter.format(myr) + " MYR");
            break;

         case 4:
            inr = inputAmount * 80;
            System.out.println(inputAmount + " EUR = " + formatter.format(inr) + " INR");

            usd = inputAmount * 1.14;
            System.out.println(inputAmount + " EUR = " + formatter.format(usd) + " USD");

            gbp = inputAmount * 0.90;
            System.out.println(inputAmount + " EUR = " + formatter.format(gbp) + " GBP");

            jpy = inputAmount * 127.32;
            System.out.println(inputAmount + " EUR = " + formatter.format(jpy) + " JPY");

            myr = inputAmount * 4.78;
            System.out.println(inputAmount + " EUR = " + formatter.format(myr) + " MYR");
            break;

         case 5:
            inr = inputAmount * 0.63;
            System.out.println(inputAmount + " JPY = " + formatter.format(inr) + " INR");

            usd = inputAmount * 0.008;
            System.out.println(inputAmount + " JPY = " + formatter.format(usd) + " USD");

            gbp = inputAmount * 0.007;
            System.out.println(inputAmount + " JPY = " + formatter.format(gbp) + " GBP");

            eur = inputAmount * 0.007;
            System.out.println(inputAmount + " JPY = " + formatter.format(eur) + " EUR");

            myr = inputAmount * 0.037;
            System.out.println(inputAmount + " JPY = " + formatter.format(myr) + " MYR");
            break;

         case 6:
            inr = inputAmount * 16.8;
            System.out.println(inputAmount + " MYR = " + formatter.format(inr) + " INR");

            usd = inputAmount * 0.239;
            System.out.println(inputAmount + " MYR = " + formatter.format(usd) + " USD");

            gbp = inputAmount * 0.188;
            System.out.println(inputAmount + " MYR = " + formatter.format(gbp) + " GBP");

            eur = inputAmount * 0.209;
            System.out.println(inputAmount + " MYR = " + formatter.format(eur) + " EUR");

            jpy = inputAmount * 26.63;
            System.out.println(inputAmount + " MYR = " + formatter.format(jpy) + " JPY");
            break;

         default:
            System.out.println("Invalid choice");
      }
      scanner.close();
   }
   
}
