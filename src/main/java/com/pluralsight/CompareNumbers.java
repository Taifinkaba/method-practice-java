package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("First number: ");
        int firstNum = myScanner.nextInt();

        System.out.println("Second number: ");
        int secondNum = myScanner.nextInt();

        System.out.println(isEven(firstNum, secondNum));

        int number = firstNum + secondNum;
        System.out.println(isPositive(number));

        myScanner.close();
    }

    public static boolean isEven(int firstNum, int secondNum) {
        return firstNum == secondNum;

    }

    public static boolean isPositive(double number) {
        return number > 0;

    }


}
