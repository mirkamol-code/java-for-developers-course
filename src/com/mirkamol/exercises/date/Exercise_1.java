package com.mirkamol.exercises.date;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exercise_1 {
    static void main() {
        System.out.println("Today's date: " + LocalDate.now());
        System.out.println("Time" + LocalTime.now());
        LocalDate myBirthDay = LocalDate.of(
                2006,
                5,
                26);
        System.out.println("My birthday: " + myBirthDay);
        System.out.println("Date after 100 days from my birthday: " + myBirthDay.plusDays(100));

        calculateAge(myBirthDay);
    }

    static void calculateAge(LocalDate birthdate){
        int year = LocalDate.now().getYear();
        int birthYear = birthdate.getYear();
        int age = year - birthYear;
        System.out.println("Your age is " + age);

    }
}
