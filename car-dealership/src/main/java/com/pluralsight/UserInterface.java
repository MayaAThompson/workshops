package com.pluralsight;

import com.pluralsight.utils.IOUtils;

public class UserInterface {

    Dealership dealership;

    public UserInterface() {

    }

    public void display() {
        this.init();
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println(menuString());
            int choice = Integer.parseInt(IOUtils.messageAndResponse("Make your choice: "));

            switch (choice) {
                case 1-> this.processGetAllVehiclesRequest();
                case 2 -> this.processGetByPriceRequest();
                case 3 -> this.processGetByMakeModelRequest();
                case 4 -> this.processGetByYearRequest();
                case 5 -> this.processGetByColorRequest();
                case 6 -> this.processGetByMileageRequest();
                case 7 -> this.processGetByVehicleTypeRequest();
                case 8 -> this.processAddVehicleRequest();
                case 9 -> this.processRemoveVehicleRequest();
                case 0 -> keepRunning = false;
                default -> System.out.println("Please select one of the available options.");
            }
        }
    }

    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

    private void init() {
        DealershipFileManager initDealer = new DealershipFileManager();
        this.dealership = initDealer.getDealership();
    }

    private String menuString() {
        return "Welcome to " + this.dealership.getName() + "!" +
                "\n\nWhat would you like to do?\n" +
                "\n1) View all vehicles" +
                "\n2) Sort vehicles by price" +
                "\n3) Sort by make and model" +
                "\n4) Sort by year" +
                "\n5) Sort by color" +
                "\n6) Sort by mileage" +
                "\n7) Sort by vehicle type" +
                "\n8) Add new vehicle" +
                "\n9) Remove a vehicle" +
                "\n0) Exit";

    }
}
