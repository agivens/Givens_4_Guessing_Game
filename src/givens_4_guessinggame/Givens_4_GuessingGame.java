package givens_4_guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author agivens
 */
public class Givens_4_GuessingGame {

    static String username;
    static int guess;
    static int magicnumber;
    static Random rand = new Random();
    static boolean playagain;
    static int guessleft = 6;

    //static shares with the entire program
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        playagain = true;
        System.out.println("Hello, what's your name, user?");
        username = name.nextLine();
        magicnumber = rand.nextInt(100);

        while (playagain) {
            playTheGame();
            guessleft --;
        }
        //A while loop will run as long as the condition
        //in the parenthesis is true.
        //while(1) will always run
        while(guessleft > 0){
            playagain = true;
        }
    }

    static void playTheGame() {
        
        Scanner userguess = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(username + ", please pick a number between 1 and 100, please.");
        guess = userguess.nextInt();
        System.out.println(" ");

        if (magicnumber == guess) {
            playagain = false;
            System.out.println("Nice guess! You win.");
            
        } else if (magicnumber > guess) {
            System.out.println("Your number is too low");
            System.out.println("You have " + guessleft + " guesses left.");
        } else {
            System.out.println("Your number is too high.");
            System.out.println("You have " + guessleft + " guesses left.");
        } 
        if (guessleft == 0 & magicnumber != guess) {
             playagain = false;
             System.out.println("Sorry, you're out of guesses. My number was " + magicnumber);
         }
    }

}
