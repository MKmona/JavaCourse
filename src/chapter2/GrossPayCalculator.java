package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String arg[]){
        // 1. Get the number of hours worked
        System.out.println("The number of hours the employee works.");
        Scanner scanner=new Scanner(System.in);
        int hours = scanner.nextInt();

        // 2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();
         //to free up a memory space as it was our last usage of it
        scanner.close();

        // 3. Multiply hours and pay rate
        double grossPay = hours * rate;

        // 4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
