package com.mirkamol.exceptions;


public class Exercise_1 {
    static void main(String[] args) {
        int sum = 0;
        StringBuilder nonIntValues = new StringBuilder();

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                if (nonIntValues.length() > 0) {
                    nonIntValues.append(", ");
                }
                nonIntValues.append(arg);
            }
        }

        System.out.println("Sum: " + sum);

        if (nonIntValues.length() > 0) {
            System.out.println("and " + nonIntValues + " are not numbers.");
        }
        int result;
        try {
            result = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("Cannot Divide by 0");
        }
    }
}
