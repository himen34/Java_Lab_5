package com.example;
public class CoffeeTruckApplication {
    public static void main(String[] args) {
        try {
            Truck truck = new Truck(10);

            // Load different types of coffee with brand, country, and grind size
            truck.loadCoffee(new WholeBeanCoffee(1.0, 10.0, 8.5, "Lavazza", 0.5, "Italy"));
            truck.loadCoffee(new GroundCoffee(0.5, 8.0, 6.0, "Nescafe", 0.3, "Fine"));
            truck.loadCoffee(new InstantCoffee(0.2, 7.0, 9.0, "Taster's Choice", 0.1, "Can"));
            truck.loadCoffee(new GroundCoffee(0.5, 12.0, 4.5,  "Caribou", 0.4, "Medium"));
            truck.loadCoffee(new InstantCoffee(0.1, 4.5, 6.5,  "Starbucks", 0.3,"Packet"));
            truck.loadCoffee(new WholeBeanCoffee(1.5, 15.0, 8.0, "Peet's", 2.0, "Colombia"));
            truck.loadCoffee(new InstantCoffee(1.5, 4.0, 6.0, "Taster's Choice", 2.3, "Can"));

            // Display all cargo
            System.out.println("All Coffee in Truck:");
            truck.displayCargo();

            // Sort coffee based on price-to-weight ratio
            truck.sortCargo();
            System.out.println("\nSorted Coffee by Price-to-Weight Ratio:");
            truck.displayCargo();

            // Find coffee by quality range
            Coffee[] foundCoffee = truck.findCoffeeByQuality(7.0, 9.0);
            System.out.println("\nFound Coffee with Quality between 7.0 and 9.0:");
            for (Coffee coffee : foundCoffee) {
                System.out.printf("Type: %s, Brand: %s, Quality: %.2f%n",
                        coffee.getType(), coffee.getBrand(), coffee.getQuality());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


