package com.pluralsight;

import java.util.*;

public class MortgageCalculator {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("What is your loan amount?");
        System.out.print("Answer here: ");
        String principalString = scanner.nextLine();
        double principal = Double.parseDouble(principalString); //P
        System.out.println();

        System.out.println("What is your annual interest rate percentage?");
        System.out.print("Answer here: ");
        String interestString = scanner.nextLine();
        double interestRate = Double.parseDouble(interestString);
        double AnnualInterestRate = interestRate / 100; //r
        double monthlyInterestRate = AnnualInterestRate / 12; //i
        System.out.println();

        System.out.println("What is your loan length? (in years)");
        System.out.print("Answer here: ");
        String loanLengthString = scanner.nextLine();
        double loanLength = Double.parseDouble(loanLengthString); //y
        Double totalMonthlyPayments = loanLength * 12; //n
        System.out.println();

        //   M=P×(i*(1+i)^n / ((1+i)^n)-1)
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonthlyPayments) / (Math.pow(1 + monthlyInterestRate, totalMonthlyPayments) - 1));
        double totalInterest = (monthlyPayment * totalMonthlyPayments) - principal;

        System.out.printf("Your monthly payment is: $%.2f", monthlyPayment);
        System.out.printf("\nYour total interest is: $%.2f", totalInterest);


    }

}
