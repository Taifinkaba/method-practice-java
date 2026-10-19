package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("First name: ");
        String firstName = myScanner.nextLine();

        System.out.print("Last name: ");
        String lastName = myScanner.nextLine();


        System.out.println(formatName(firstName, lastName));

        myScanner.close();
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}
