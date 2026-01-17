package com.mirkamol.exercises.scanner;

import java.util.Random;
import java.util.Scanner;

public class Exercise_1 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text: ");
        String input = scanner.nextLine();
        System.out.println("The output: " + input);

        System.out.println("Enter your number: ");
        for (String numberStr : args) {
            int numberValue = Integer.parseInt(numberStr);
            if (numberValue % 2 == 0) {
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");
            }
        }
        hearRandomJokes();

    }
    
    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        // Check for divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void hearRandomJokes(){
        String[] jokes = {
                "Why don't scientists trust atoms? Because they make up everything!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "What do you call fake spaghetti? An impasta!",
                "Why don't skeletons fight each other? They don't have the guts!",
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "Did you hear about the mathematician who's afraid of negative numbers? He'll stop at nothing to avoid them!",
                "Why don't some couples go to the gym? Because some relationships don't work out!",
                "Why was the math book sad? It had too many problems.",
                "Why did the bicycle fall over? Because it was two-tired!",
                "Why don't some fish play piano? You can't tuna fish!"
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Want to hear a joke? (Yes/No): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("no")) {
                System.out.println("Alright, goodbye!");
                break;
            } else if (input.equals("yes")) {
                int randomNumber = random.nextInt(jokes.length);
                System.out.println(jokes[randomNumber]);
            } else {
                System.out.println("Invalid input. Please enter 'Yes' or 'No'.");
            }
        }

        scanner.close();
    }
}