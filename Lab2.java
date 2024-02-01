// Programmers:  Gabe and Brodi
// Course:  CS 212
// Due Date: (moodle down) this sunday 2/4?
// Lab Assignment: 2
// Problem Statement: Create powerball tickets
// Data In: User's name
// Data Out: The lottery numbers and the prize

// Imports
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
public class Lab2 {


    // Creating variables
    static Random random = new Random();

    static DecimalFormat prizeFormat = new DecimalFormat("###,###,###.##");
    public static void main(String[] args) {
        int[] winningNumbers = {1,2,3,4,5};
        int multiplier = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");
        String customerName = scanner.nextLine().strip();

        System.out.println("How much would you like to bet?");
        double bet = scanner.nextDouble();

        System.out.println("Here are the tickets:");

        // Creates numbers variable
        String[] numbers;

        // For each loop get the numbers and print them out
        for(int i = 0; i < 10; i++){

            numbers = getLotteryNumbers(winningNumbers);

            System.out.print(numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " " + numbers[4] + " " + numbers[5] );
            System.out.println();

            // Keeps track of hits on winning numbers
            multiplier += Integer.parseInt(numbers[6]);


        }

        // Calculates the new amount of money depending on the amount of hits
        if (multiplier != 0) {
            bet = Math.pow(bet, Math.pow(1.75, multiplier));
        }

        // Ending prints
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Jackpot:");
        System.out.println("$" + prizeFormat.format(bet));
        System.out.println("-----------------");


    }

    static String[] getLotteryNumbers(int[] winningNumbers){

        // Desired format
        DecimalFormat lotteryNumFormat = new DecimalFormat("00");

        // Creates strings
        int[] lotteryNumbers = new int[6];
        String[] formattedNumbers = new String[7];
        int multiplier = 0;

        // Have to use two for loops here, using Integer.parseInt method wasn't working for some reason, still same big O time though
        for (int i = 0; i < 6; i++){
            int randomNumber = random.nextInt(100);
            lotteryNumbers[i] = randomNumber;
            // Checks if it's a winning number
            for (int number : winningNumbers){
                if (randomNumber == number){
                    multiplier++;
                }
            }

        }
        int j = 0;
        for (int number : lotteryNumbers){
            formattedNumbers[j] = lotteryNumFormat.format(number);
            j++;
        }

        // Passes the amount of hits back to the main method
        formattedNumbers[6] = String.valueOf(multiplier);

        return formattedNumbers;


    }

}
