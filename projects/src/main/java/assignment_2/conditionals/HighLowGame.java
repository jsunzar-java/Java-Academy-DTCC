package assignment_2.conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class HighLowGame {

    public static void main (String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter your name!");
        String name =  reader.readLine();
        System.out.println(String.format("Welcome %s to High Low", name));
        System.out.println("The point of the game is to figure try to guess the correct number," +
                "given hints whether you're guessing higher or lower.");

        int low = 0;
        int max = 1000;
        int answer =  ThreadLocalRandom.current().nextInt(low, max + 1);
        while(true) {
            System.out.println(String.format("Please input an integer %s!", name));
            int guess = Integer.parseInt(reader.readLine());

            if(guess == answer) {
                System.out.println(String.format("The answer was %s, you win!", String.valueOf(guess)));
                break;
            }

            else if (guess < answer){
                System.out.println(String.format("Your answer is lower, guess higher!"));
            }

            else if (guess > answer){
                System.out.println(String.format("Your answer is higher, guess lower!"));
            }
        }
    }
}
