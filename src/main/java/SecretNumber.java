import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class SecretNumber {

    public static void main(String[] args) {

        //Determines whether the game has been beaten
        boolean victory = false;

        //Generate random secret number between 1 and 10
        Random rndm = new Random();
        int secretNum = rndm.nextInt(10) + 1;

        System.out.println("Guess the secret number between 1 and 10 to win the game");

    //Create a loop that keeps the programme running until the user guesses right
        while (!victory) {

            //Prompt user to input their guess
            Scanner reader = new Scanner(System.in);
            String usersGuess = reader.nextLine();

            //Check whether user's guess is correct or not
            if (secretNum == parseInt(usersGuess)) {
                victory = true;
                System.out.println("Congratulations, you win the game!");
            } else {
                System.out.println("Not quite. Please, try again.");
            }

        }

    }

}
