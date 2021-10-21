package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicketRedo {
    //Define Magic numbers as constants
    private static final int LENGHT = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]){
        int[] ticket = generateNumber();
        Arrays.sort(ticket); // to sort the array in an ascending order before printing it
        printTicket(ticket);


    }
    //How to set elements of an array
    public static int[] generateNumber(){

        int[] ticket = new int [LENGHT];

        Random random = new Random();

        for(int i=0; i<LENGHT; i++){
            int randomNumber;

            /*Generate random number then search to
            make sure it doesn't already exist in the Array.
            If it does, regenerate a random number and search again.
             */
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;

            }while(search(ticket, randomNumber));

            //Number is unique if we get here. Add it to the Array
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    //Search method

    /** It is called JAVADOC comment
     * Does a sequential search on the Array to find a value
     * @param array This is an Array to search through
     * @param numberToSearchFor This is the value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){
        /*
        This is called an enhanced loop.
        It iterates through 'array' and
        each time assigns the current element to 'value'
        */
        for(int value : array){
            if(value == numberToSearchFor){
                return true;
            }
        }
        /*
        If we've reached this point, then the entire array was
        searched and the value was not found
        */
        return false;

    }

    //The Binary search method
    public static boolean binarySearch(int[] array, int numberToSearchFor){
        //Array must be sorted first
        Arrays.sort(array);

       int index = Arrays.binarySearch(array,numberToSearchFor);
       if(index >= 0){
           return true;
       }
       else return false;

    }


    //How to read elements of an array
    public static void printTicket(int[] ticket){
        for(int i=0; i<LENGHT; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
