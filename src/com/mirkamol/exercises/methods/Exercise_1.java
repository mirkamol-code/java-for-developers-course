package com.mirkamol.exercises.methods;

import java.util.Arrays;

public class Exercise_1 {
    static void main() {
        String input = "Hello";
        String reversText = reversText(input);
        System.out.println(reversText);

        String text = "   amig os cod e  ";
        String result = removeSpaces(text);
        System.out.println(result);

        String[] array = {"hello", "bingo", "ola", "bye", "ciao"};
        System.out.println(findLongestString(array));
    }

    public static String reversText(String text) {
        if (text == null || text.isEmpty()) {
            return "Invalid Input";
        }
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    public static String removeSpaces(String input) {
        if (input == null || input.isEmpty()) {
            return "Invalid input";
        }
        String withoutSpaces = input.replaceAll(" ", "");
        System.out.println(withoutSpaces);
        String substringed = withoutSpaces.substring(1);
        String firstLetterOfInput = Character.toString(withoutSpaces.charAt(0));
        String firstLetterOfInputWithUppercase = firstLetterOfInput.toUpperCase();
        return firstLetterOfInputWithUppercase + substringed;

    }

    public static String findLongestString(String[] array) {
        if (array.length == 0 || array == null) {
            return "Invalid input";
        }
        String longestText = "";
        int maxLength = 0;


        for (int i = 0; i < array.length; i++) {
            if (longestText.length() < array[i].length()) {
                maxLength = array[i].length();
                longestText = array[i];
            } else if (array[i].length() == maxLength && !longestText.contains(array[i])) {
                longestText += ", " + array[i];
            }
        }
        return longestText;
    }
}
