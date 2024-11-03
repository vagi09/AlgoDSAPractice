package com.arrays;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfWeekExample {
    public static void main(String[] args) {
        // Create a scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the day, month, and year
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Create a LocalDate object based on the input
        LocalDate date = LocalDate.of(year, month, day);

        // Get the name of the day from the LocalDate object
        String dayOfWeek = date.getDayOfWeek().name();

        // Print the day of the week
        System.out.println("The day of the week is: " + dayOfWeek);

        // Close the scanner
        scanner.close();
    }
}
