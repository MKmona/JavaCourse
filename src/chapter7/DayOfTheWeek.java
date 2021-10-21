package chapter7;
/*
Make an array that holds its actual values of the days of the week,
 and then have the user input a number corresponding to some day of the week.
 And assume that the week starts on Monday.
Your program should output the String that represents the day of the week
 that corresponds to the number that the user input.
 */

import java.util.Scanner;

public class DayOfTheWeek {


    public static void main(String args[]){
        String[] week = {"Monday" , "Tuesday" , "Wednesday" , "Thrusday" , "Friday" , "Saturday" , "Sunday"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week");
        int index = scanner.nextInt();

        scanner.close();
        System.out.println("Corresponding day is: "+week[index-1]);




    }
}
