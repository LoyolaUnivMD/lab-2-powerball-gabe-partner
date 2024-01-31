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
class Lab2 {


    // Creating variables
    static Random random = new Random();

    static DecimalFormat prizeFormat = new DecimalFormat("###,###,###");
    public static void main(String[] args) {
        long prize = 225938745L;
        Scanner input = new Scanner(System.in);

        System.out.println("CS 212 - Lab 2");
        System.out.println("This program generates 10 lottery tickets.");
        
        System.out.print("What's your name? ");
        String customerName = input.nextLine().strip();

        System.out.println("Here are the tickets:");

        // Creates numbers variable
        String[] numbers;

        // For each loop get the numbers and print them out
        for(int i = 0; i < 10; i++){

            numbers = getLotteryNumbers();

            System.out.print(numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " " + numbers[4] + " " + numbers[5] );
            System.out.println();
        }

        // Ending prints
        System.out.println("-----------------");
        System.out.println("Good luck " + customerName + "!");
        System.out.println("Estimated Jackpot:");
        System.out.println("$" + prizeFormat.format(prize));
        System.out.println("-----------------");


    }

    static String[] getLotteryNumbers(){

        // Desired format
        DecimalFormat lotteryNumFormat = new DecimalFormat("00");

        // Creates strings
        int[] lotteryNumbers = new int[6];
        String[] formattedNumbers = new String[6];

        // Have to use two for loops here, using Integer.parseInt method wasn't working for some reason, still same big O time though
        for (int i = 0; i < 6; i++){
            lotteryNumbers[i] = random.nextInt(100);
        }
        int j = 0;
        for (int number : lotteryNumbers){
            formattedNumbers[j] = lotteryNumFormat.format(number);
            j++;
        }

        return formattedNumbers;


    }

}
