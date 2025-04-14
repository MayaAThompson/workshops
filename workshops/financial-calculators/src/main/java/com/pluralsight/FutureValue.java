package com.pluralsight;

import java.util.*;

public class FutureValue {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is your deposit amount?");
        System.out.print("Answer here: ");
        String principalString = scanner.nextLine();
        double principal = Double.parseDouble(principalString); //P
        System.out.println();

        System.out.println("What is your annual interest rate percentage?");
        System.out.print("Answer here: ");
        String interestString = scanner.nextLine();
        double interestRate = Double.parseDouble(interestString);
        double annualInterestRate = interestRate / 100; //r
        System.out.println();

        System.out.println("In how many years does your deposit mature?");
        System.out.print("Answer here: ");
        String matureYearsString = scanner.nextLine();
        double matureYears = Double.parseDouble(matureYearsString); //t
        double totalDaysMature = matureYears * 365;
        System.out.println();

        // FV = P × (1 + (r / 365))^(365 × t)
        double futureValue = principal * (Math.pow(1 + (annualInterestRate / 365), totalDaysMature));
        double interestEarned = futureValue - principal;

        System.out.printf("Your CD's ending balance will be: $%.2f", futureValue);
        System.out.printf("\nYour earned interest amount is: $%.2f", interestEarned);

    }
}
