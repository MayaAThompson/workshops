package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        while(true) {

            int menuSelection;
            menuSelection = getMainMenuChoice();
            if (menuSelection == 1) {
                Inventory.inventoryMenu();
            }
            if (menuSelection == 2) {
                Cart.displayCart();
            }
            if (menuSelection == 3) {
                break;
            }
            else {
                System.out.println("Please choose one of the available options");
            }
        }
    }
    
    private static int getMainMenuChoice() {
        int choice;
        System.out.println("MY ONLINE STORE");
        System.out.println("\n(1) Inventory\n(2) Cart\n(3) Exit");
        choice = Integer.parseInt(Utils.messageAndResponse("Make your choice: "));
        return choice;
    }
}
