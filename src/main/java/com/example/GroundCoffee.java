package com.example;
import java.util.Arrays;
import java.util.List;

/**
 * Represents ground coffee, a type of coffee that is sold in ground form,
 * with an additional attribute for the grind size.
 */
public class GroundCoffee extends Coffee {
    private String grindSize;
    private static final List<String> VALID_GRIND_SIZES = Arrays.asList("Fine", "Medium", "Coarse");

    public GroundCoffee(double weight, double price, double quality, String brand, double volume, String grindSize) {
        super(weight, price, quality, brand, volume);
        setGrindSize(grindSize);
    }

    public String getGrindSize() {
        return grindSize;
    }

    private void setGrindSize(String grindSize) {
        if (!VALID_GRIND_SIZES.contains(grindSize)) {
            throw new IllegalArgumentException("Invalid grind size. Valid options are: " + VALID_GRIND_SIZES);
        }
        this.grindSize = grindSize;
    }

    @Override
    public String getType() {
        return "Ground (" + grindSize + ")";
    }
}

