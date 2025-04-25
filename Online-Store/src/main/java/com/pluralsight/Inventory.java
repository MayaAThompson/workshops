package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Inventory {


    public static ArrayList<Product> loadInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        String filePath = "src/main/resources/products.csv";
        String input;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((input = reader.readLine()) != null) {
                String[] parts = input.split("\\|");
                if (parts[0].equals("SKU")) {
                    continue;
                }

                String sku = parts[0];
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                String department = parts[3];

                inventory.add(new Product(sku, name, price, department));
            }
        } catch (Exception e) {
            System.out.println("Something went wrong! " + e.getMessage());
        }
        return inventory;
    }
    public static void inventoryMenu() {
        int choice;
        while(true) {
            System.out.println("--INVENTORY OPTIONS--");
            System.out.println("\n(1) Search\n(2) Add to cart\n(3) Go back");
            choice = Integer.parseInt(Utils.messageAndResponse("Select: "));
            if (choice == 1) {
                String search = Utils.messageAndResponse("Search: ");
                String result = searchInventory(search);
                System.out.println("Here's what we found: \n" + result);
            }
            if (choice == 2) {
                Cart.addItem();
            }
            if (choice == 3) {
                break;
            }
            else {
                System.out.println("Please choose one of the available options.");
            }
        }
    }
    public static String searchInventory(String search) {
        for (Product product : Inventory.loadInventory()) {
            if (product.getName().equalsIgnoreCase(search) || (product.getDepartment().equalsIgnoreCase(search)) || (product.getPrice() == Integer.parseInt(search))) {
                return product.toString();
            }
        }
        return "Product not found.";
    }
}
