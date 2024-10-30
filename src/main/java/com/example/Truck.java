package com.example;
import java.util.Arrays;

/**
 * Class Truck represents a truck that can load various types of coffee based on a maximum volume capacity,
 * and perform operations such as sorting by price-to-weight ratio and finding coffee within a quality range.
 */
public class Truck {
    private Coffee[] cargo;
    private double maxVolume;
    private double currentVolume;
    private int count;

    public Truck(double maxVolume) {
        this.cargo = new Coffee[100]; // Arbitrary large array, volume-based loading limit
        this.maxVolume = maxVolume;
        this.currentVolume = 0;
        this.count = 0;
    }

    /**
     * Loads coffee into the truck if there is enough volume capacity.
     *
     * @param coffee The coffee to load into the truck
     * @throws Exception if there is not enough volume capacity in the truck
     */
    public void loadCoffee(Coffee coffee) throws Exception {
        if (currentVolume + coffee.getVolume() > maxVolume) {
            throw new Exception("Not enough space in the truck to load more coffee.");
        }
        cargo[count++] = coffee;
        currentVolume += coffee.getVolume();
    }

    public void sortCargo() {
        Arrays.sort(cargo, 0, count, (a, b) -> Double.compare(a.getPriceToWeightRatio(), b.getPriceToWeightRatio()));
    }

    public Coffee[] findCoffeeByQuality(double minQuality, double maxQuality) {
        return Arrays.stream(cargo)
                .filter(coffee -> coffee != null && coffee.getQuality() >= minQuality && coffee.getQuality() <= maxQuality)
                .toArray(Coffee[]::new);
    }

    public void displayCargo() {
        for (Coffee coffee : cargo) {
            if (coffee != null) {
                System.out.printf("Brand: %s, Weight: %.2f kg, Price: %.2f%n",
                        coffee.getBrand(), coffee.getWeight(), coffee.getPrice());
            }
        }
    }
}

