package com.mirkamol.exercises.methods;

public class Exercise_2 {
    static void main() {
        sum(3, 4);
        int num1 = 5;
        int num2 = -10;

        int negation1 = negate(num1);
        int negation2 = negate(num2);

        System.out.println("Negation of " + num1 + " is: " + negation1);
        System.out.println("Negation of " + num2 + " is: " + negation2);

        System.out.println("Are Numbers(2,2) equals: " + areNumbersEqual(2, 2));

        checkNumberState(2, 3);
        System.out.println(capitalizeFirstLetter("hello Java"));

        String[] strings = {"Hello", "", "Java", null};
        System.out.println(getNumberOfItemsInArray(strings));

        String text = "My name is Jamila";
        System.out.println(getNumberOfWordsFromString(text));
    }

    static void sum(int num1, int num2) {
        int reuslt = num1 + num2;
        System.out.println("Result: " + reuslt);
    }

    public static int negate(int num) {
        return -num;
    }

    public static boolean areNumbersEqual(int a, int b) {
        return a == b;
    }

    public static void checkNumberState(int a, int b) {
        if (a > b) {
            System.out.println("First number is larger");
        } else if (a < b) {
            System.out.println("Second number is larger");
        } else {
            System.out.println("The numbers are equals");
        }
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String firstLetter = str.substring(0, 1).toUpperCase();
        String restOfString = str.substring(1);

        return firstLetter + restOfString;
    }

    public static int getNumberOfItemsInArray(String[] arr) {
        var numberOfItems = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == null || arr[i].isEmpty())) {
                numberOfItems++;
            }
        }
        return numberOfItems;
    }

    public static int getNumberOfWordsFromString(String sentence){
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] split = sentence.split(" " );
        return split.length;
    }
}
