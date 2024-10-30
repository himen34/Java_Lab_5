package com.example;
/**
 * Represents instant coffee, a type of coffee that is sold in instant form and packaged
 * in various types, such as cans or packets.
 */
public class InstantCoffee extends Coffee {
    private String packageType;

    public InstantCoffee(double weight, double price, double quality, String brand, double volume, String packageType) {
        super(weight, price, quality, brand, volume);
        if (packageType == null || packageType.isEmpty()) {
            throw new IllegalArgumentException("Package type cannot be empty.");
        }
        this.packageType = packageType;
    }

    public String getPackageType() {
        return packageType;
    }

    @Override
    public String getType() {
        return "Instant (" + packageType + ")";
    }
}

