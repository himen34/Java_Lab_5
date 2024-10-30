package com.example;
/**
 * Represents whole bean coffee, a type of coffee that is sold in its whole form,
 * with an additional attribute for the country of origin.
 */
public class WholeBeanCoffee extends Coffee {
    private String countryOfOrigin;

    public WholeBeanCoffee(double weight, double price, double quality, String brand, double volume, String countryOfOrigin) {
        super(weight, price, quality, brand, volume);
        if (countryOfOrigin == null || countryOfOrigin.isEmpty()) {
            throw new IllegalArgumentException("Country of origin cannot be empty.");
        }
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @Override
    public String getType() {
        return "Whole Bean (" + countryOfOrigin + ")";
    }
}

