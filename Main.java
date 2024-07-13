import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double t = sc.nextDouble();

        System.out.print("Enter unit of measurement (C/F): ");
        char unit = sc.next().charAt(0);

        if (unit == 'C' || unit == 'c') 
        {
            double f = (t * 9/5) + 32;
            System.out.println(t + " Celsius is " + f + " Fahrenheit");
        } 
        
        else if (unit == 'F' || unit == 'f') 
        {
            double c = (t - 32) * 5/9;
            System.out.println(t + " Fahrenheit is " + c + " Celsius");
        } 
        else 
        {
            System.out.println("Invalid unit of measurement");
        }

        sc.close();
    }
}
