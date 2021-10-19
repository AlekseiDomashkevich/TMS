package lesson15;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Calendar;

public class DateApp {
    public static void main(String[] args) {

        getProgrammersDayDate(2019);
        countDaysOfLife(LocalDate.of(1988, 7, 13));
        printMonthCalendar(2021, 10);
    }

    public static void printMonthCalendar(int year, int month) {
        var date = LocalDate.of(year, month, 1);
        for (int i = 1; i < date.getDayOfWeek().getValue(); i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= date.lengthOfMonth(); i++) {
            var d = LocalDate.of(year, month, i);
            if (d.getDayOfMonth() < 10) {
                System.out.print(" " + d.getDayOfMonth() + " ");
            }else {
                System.out.print(d.getDayOfMonth() + " ");
            }
            if (d.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
                System.out.println();
            }
        }
    }

    public static void countDaysOfLife(LocalDate birthday) {
        var today = LocalDate.now();

        //simple solution
        var daysOfLife = birthday.until(today, ChronoUnit.DAYS);
        System.out.println(daysOfLife);

        //with while-loop
        int day = 0;
        while (!today.equals(birthday)) {
            birthday = birthday.plusDays(1);
            day++;
        }
        System.out.println(day);

    }

    public static void getProgrammersDayDate(int year) {
        int programmersDay = 256;

        //simple solution
        System.out.println(LocalDate.ofYearDay(year, programmersDay));


        //hardcore
        int day = 1;
        LocalDate date;
        do {
            day++;
            date = LocalDate.of(year, 9, day);

        }
        while (date.getDayOfYear() != programmersDay);
        System.out.println(date);
    }


}
