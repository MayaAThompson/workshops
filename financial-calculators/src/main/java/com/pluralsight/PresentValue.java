package com.pluralsight;

import java.util.Scanner;

public class PresentValue {

    public static void main(String[] args) {


    }

    static double messageAndDoubleResponse(String message) {
        System.out.print(message + "\nenter here:");
        Scanner scanner = new Scanner(System.in);
        String response = scanner.nextLine();
        return Double.parseDouble(response);
    }
}
