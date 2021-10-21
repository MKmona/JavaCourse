package chapter7;

import java.util.Random;

public class LotteryTicket {
    //Define Magic numbers as constants
    private static final int LENGHT = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String args[]){
        int[] ticket = generateNumber();
        printTicket(ticket);


    }
    //How to set elements of an array
    public static int[] generateNumber(){

        int[] ticket = new int [LENGHT];

        Random random = new Random();

        for(int i=0; i<LENGHT; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1; //because it will start from 0, so we add 1
        }
        return ticket;
    }

    //How to read elements of an array
    public static void printTicket(int[] ticket){
        for(int i=0; i<LENGHT; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
