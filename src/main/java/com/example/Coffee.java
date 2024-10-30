package com.example;
/**
 * Abstract class Coffee represents a general type of coffee with attributes like weight,
 * price, quality, brand, and volume, and provides methods for calculating the price-to-weight ratio.
 */
public abstract class Coffee {
    private double weight;
    private double price;
    private double quality;
    private String brand;
    private double volume;

    /**
     * Constructs a Coffee object with specified weight, price, quality, brand, and volume.
     *
     * @param weight The weight of the coffee in kilograms
     * @param price The price of the coffee
     * @param quality The quality rating of the coffee, from 0 to 10
     * @param brand The brand name of the coffee
     * @param volume The volume of the coffee in cubic meters
     */
    public Coffee(double weight, double price, double quality, String brand, double volume) {
        if (weight <= 0 || price <= 0) {
            throw new IllegalArgumentException("Weight and price must be positive.");
        }
        if (quality < 0 || quality > 10) {
            throw new IllegalArgumentException("Quality must be between 0 and 10.");
        }
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
        if (volume <= 0) {
            throw new IllegalArgumentException("Volume must be positive.");
        }
        this.weight = weight;
        this.price = price;
        this.quality = quality;
        this.brand = brand;
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public double getQuality() {
        return quality;
    }

    public String getBrand() {
        return brand;
    }

    public double getVolume() {
        return volume;
    }

    public double getPriceToWeightRatio() {
        return price / weight;
    }

    public abstract String getType();
}

