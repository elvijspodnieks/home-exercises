package io.codelex.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex1dup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a start date [yyyy/mm/dd]: ");
        String startDate = scan.nextLine();
        System.out.print("Enter a end date [yyyy/mm/dd]: ");
        String endDate = scan.nextLine();

        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);

        int workingHours = countWorkingDays(start, end) * 8;

        System.out.println("The employee worked " + workingHours + " hours in that period.");
    }

    public static int countWorkingDays(LocalDate start, LocalDate end) {
        int days = Period.between(start, end).getDays();
        for (LocalDate date = start; date.isBefore(end); date = date.plusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY || date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                days--;
            }
        }
        return days;
    }
}