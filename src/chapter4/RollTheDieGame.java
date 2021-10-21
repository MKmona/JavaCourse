package chapter4;

import java.util.Random;

/*
The objective of this game is to travel the entire game board
 of 20 spaces within 5 die rolls.
 */
public class RollTheDieGame {
    public static void main(String args[]){

        //Initialize what we know
        int boardSpaces = 20;
        int dieRolls = 5;

        //Get the unknown

        Random random = new Random();
        int die = random.nextInt(6) + 1;

        //The loop
        int currentSpace = 0;
        int spacesToWin = 0;

        for(int i=0; i<dieRolls;i++){
             currentSpace = currentSpace + die;
            spacesToWin = boardSpaces - currentSpace;
             System.out.println("Roll #" +(i+1)+ ": You have rolled a " + die + " You are now on space " +
                        currentSpace + " and have "+ spacesToWin +" to go.");

            if(currentSpace==dieRolls){
                System.out.println("You are on space 20. Congrats! You win!");
                break;
            }
            die = random.nextInt(6) + 1;
        }
        if(currentSpace > boardSpaces || currentSpace < boardSpaces)
            System.out.println("Sorry!! You lose" + spacesToWin);
        }

    }
