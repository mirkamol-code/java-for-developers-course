package com.mirkamol.exercises.conditionals;

public class Exercise_2 {
    static void main() {
        int number1 = 2;
        int number2 = 3;

        if (number1 == number2){
            System.out.println(number2 + "=="+number1);
        }

        String myString = "Hello!";
        String myString2 = "Hello!";

        if (myString.equals(myString2)){
            System.out.println(myString + " equals to "+myString2);
        }

        String myStringNew = new String("Hello!");
        if (myString.equals(myStringNew)){
            System.out.println(myString + "=="+myStringNew);
        }

        int n1 = 10;
        int n2 = 7;

        if (n1 > n2){
            System.out.println("n1 is greater");
        }else{
            System.out.println("n1 is not greater");
        }

        int n3 = 12;
        if (n1 > n2 || n1 < n3){
            System.out.println("n1 is greater or n1 is less than n3");
        }else{
            System.out.println("the condition is not met");
        }

        String abc = "ABCa";
        char A = abc.charAt(0);

        char a = 'a';
        if (A == a){
            System.out.println(A + "==" + a);
        }else {
            System.out.println(A + " doesn't equal to " + a);

        }

        for (int i = 0; i < abc.length(); i++) {
            if (abc.charAt(i) == a){
                System.out.println(abc.charAt(i) + "==" + a);
                break;
            }else {
                System.out.println(abc.charAt(i) + " doesn't equal to " + a);
            }
        }

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }



    }
}
