package chapter2;

import java.util.Scanner;

public class MadLips {

    public static void main(String arg[]){
            // 1. Ask for the season of the year
            System.out.println("Enter a season of the year");
            Scanner scanner = new Scanner(System.in);
            String season = scanner.next();

            // 2. Ask for a whole number of cups of coffee
            System.out.println("Enter a whole number of cups of coffee");
            int numberOfCups = scanner.nextInt();

            // 3. Ask for an adjective
            System.out.println("Enter an adjective");
            String adjective = scanner.next();
            scanner.close();

            // 4. Complete the sentence then output the result
            System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + numberOfCups + " cups of coffee.");

            // System.out.printf("On a %s %s day, I drink a minimum of %d cups of coffee",adjective,season,numberOfCups);
            // System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
        }
}
