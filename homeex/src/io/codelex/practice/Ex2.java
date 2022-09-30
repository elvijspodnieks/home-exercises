package io.codelex.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<LocalDate> needUpdate = new ArrayList<LocalDate>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a start date [yyyy/mm/dd]: ");
        String input = scan.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate start = LocalDate.parse(input, dtf);
        LocalDate end = start.plusMonths(12);

        System.out.println("Server was launched in " + start);

        for (LocalDate date = start; date.isBefore(end); date = date.plusDays(14)) {
            needUpdate.add(date);
        }
        System.out.print("Enter a month: ");
        int inputMonth = scan.nextInt();

        System.out.print("Enter a year: ");
        int inputYear = scan.nextInt();

        for (LocalDate date = start; date.isBefore(end); date = date.plusDays(14)) {
            if (date.getYear() == inputYear && date.getMonthValue() == inputMonth) {
                System.out.println(date);
            }
        }
    }
}
