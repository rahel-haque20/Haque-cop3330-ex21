/*
* UCF COP 3330 Fall 2021 Assignment 21 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner month = new Scanner(System.in);
        System.out.println("Please enter the number of the month");
        String found;
        int x = month.nextInt();

        found = switch (x) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid input";
        };
        System.out.printf("The name of the month is %s", found);
    }
}