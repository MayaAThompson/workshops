package com.pluralsight;

import java.util.*;

public class MortgageCalculator {

    public static void main(String[] args) {

        double principal = messageAndDoubleResponse("What is your loan amount?");

        double monthlyInterestRate = messageAndDoubleResponse("What is your interest rate percentage?") / 100 / 12;

        double totalMonthlyPayments = messageAndDoubleResponse("What is your loan length (in years)") * 12;

        //   M=P×(i*(1+i)^n / ((1+i)^n)-1)
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonthlyPayments) / (Math.pow(1 + monthlyInterestRate, totalMonthlyPayments) - 1));
        double totalInterest = (monthlyPayment * totalMonthlyPayments) - principal;

        System.out.printf("Your monthly payment is: $%.2f", monthlyPayment);
        System.out.printf("\nYour total interest is: $%.2f", totalInterest);
    }

    static double messageAndDoubleResponse(String message) {
        System.out.print(message + "\nenter here:");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return Double.parseDouble(response);
    }

}
