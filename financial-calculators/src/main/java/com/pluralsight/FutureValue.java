package com.pluralsight;

import java.util.*;

public class FutureValue {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double principal = FutureValue.messageAndDoubleResponse("What is your deposit amount?");

        double annualInterestRate = FutureValue.messageAndDoubleResponse("What is your Interest rate?") / 100;

        double totalDaysMature = FutureValue.messageAndDoubleResponse("In how many years does your deposit mature?") * 365;

        // FV = P × (1 + (r / 365))^(365 × t)
        double futureValue = principal * (Math.pow(1 + (annualInterestRate / 365), totalDaysMature));
        double interestEarned = futureValue - principal;

        System.out.printf("Your CD's ending balance will be: $%.2f \nYour earned interest amount is: $%.2f", futureValue, interestEarned);

    }
    static double messageAndDoubleResponse(String message) {
        System.out.print(message + "\nenter here:");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return Double.parseDouble(response);
    }
}
