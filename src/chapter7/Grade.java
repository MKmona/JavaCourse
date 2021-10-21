package chapter7;
/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */

import java.util.Scanner;

public class Grade {
    private static int grades[] ;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("How many grades would you like to enter: ");
        grades = new int [scanner.nextInt()]; //To nitialize grades with the length that the user enters

        getGrades();

        System.out.println("Average " + String.format("%.2f",calculateAverage()));

        System.out.println("Highest: " + getHighest());

        System.out.println("Lowest: " + getLowest());

    }

    public static void getGrades(){
        // we can't use the enhanced loop as we don't have values inside the loop yet
        for(int i=0; i<grades.length; i++){
            System.out.println("Enter grade #" +(i+1));
            grades[i] = scanner.nextInt();

        }
    }

    public static int calculateSum(){
        //we can use the enhanced loop here as we already know the values inside the loop
        int sum = 0;
        for(int grade : grades){
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage()
    {
        return calculateSum()/grades.length;
    }

    public static int getHighest(){
        int highest = grades[0];
        for(int grade : grades){
            if(grade > highest){
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest(){
        int lowest = grades[0];
        for(int grade : grades){
            if(grade < lowest){
                lowest = grade;
            }
        }
        return lowest;
    }
}
