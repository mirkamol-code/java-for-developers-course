package com.mirkamol.exercises.loops;

import java.util.Arrays;

public class Exercise_1 {
    static void main(String[] args) {
        // Exercise
        // declare an empty integer array of length = 3
        // print the contents to the console
        int[] foo = new int[3];
        System.out.println(Arrays.toString(foo));
        // fill it with the number `4`
        // print the array to the console
        foo[0] = 4;
        System.out.println(Arrays.toString(foo));
        // reassign the second value in the array to the number `17`
        // print the array to the console
        foo[1] = 17;
        System.out.println(Arrays.toString(foo));

        int[] numbers = {1, 2, 3, 4, 5};
//        numbers[5] = 6;
//        System.out.println(Arrays.toString(numbers)); // an ArrayIndexOutOfBoundsException at runtime will be encountered
        System.out.println("Original Array:");
        String[] letters = {"a", "b", "c", "d"};
        for (int i = 0; i < letters.length; i++) {
            System.out.println("Element at index: " + i + " " + letters[i]);
        }

        String[] secondLetters = letters;
        secondLetters[0] = "z";
        System.out.println("New Array: ");
        for (int i = 0; i < secondLetters.length; i++) {
            System.out.println("Element at index: " + i + " " + secondLetters[i]);
        }

        String[] copiedArray = Arrays.copyOf(letters, 4);
        copiedArray[0] = "z";
        System.out.println("Copied array: ");
        for (String letter : copiedArray) {
            System.out.println(letter);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Total sum: " + sum);

        String[] words = {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toUpperCase();
        }
        System.out.println(Arrays.toString(words));

        String[] editedWords = {"i", "sure", "do", "love", "bees"};
        char firstLetter = editedWords[0].charAt(0);
        String upperCaseFirstLetter = Character.toString(firstLetter).toUpperCase();

        for (int i = 0; i < editedWords.length; i++) {
            editedWords[i] = upperCaseFirstLetter + editedWords[i].substring(1);
        }
        System.out.println(Arrays.toString(editedWords));

        String[] content = {"you", "are", "how", "hello"};

        for (int i = content.length - 1; i >= 0; i--) {
            System.out.print(content[i] + " ");
        }
        System.out.print("?");

        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0.0;

        // Convert the string to an array of numbers
        String[] numbersFromString = input.split(", ");

        // Loop through the array and convert each string to a double and add to the result
        for (String numberStr : numbersFromString) {
            double num = Double.parseDouble(numberStr);
            result += num;
        }

        System.out.println("Total amount: " + result);


        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

}


