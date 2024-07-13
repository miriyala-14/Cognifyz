import java.util.Scanner;

public class CalculatorUsingArithmetic
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of grades to be entered: ");
        int n = sc.nextInt();
        
        double[] grades = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
            sum += grades[i];
             }

        double average = sum / n;
        System.out.println("The average grade is: " + average);
        
       
    }
}
