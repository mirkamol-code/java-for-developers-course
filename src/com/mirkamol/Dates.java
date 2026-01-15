package com.mirkamol;

import java.time.*;

public class Dates {
    static void main() {
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now());

    }

    void showAnotherTimeZoneInOthersCountry(){
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowSydney = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        LocalDateTime nowMoscow = LocalDateTime.now(ZoneId.of("Europe/Moscow"));
        System.out.println(now);
        System.out.println(nowSydney);
        System.out.println(nowMoscow);

        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println(availableZoneId);
        }
    }

    void customizeDateTime(){
        LocalDateTime someDate = LocalDateTime.of(
                2000,
                Month.APRIL,
                1,
                14,
                55,
                22
        );
        System.out.println(someDate);

        LocalDate dateOnly = LocalDate.of(
                2005,
                12,
                12
        );

        System.out.println("Only date: " + dateOnly);
    }

    void useLocalDate() {
        // Working with Dates
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.minusDays(5));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
    }

    void useLocalDateTime() {
        // Working with Dates and Time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.minusDays(5));
    }
}
