package com.company;

public class BikeFactory extends Factory {
    private static final String FACTORY_TYPE = "Bikes Factory";

    public BikeFactory() {
        super(FACTORY_TYPE);
    }

    @Override
    public Toy buildToy() {
        return new Bike(getToysIDs());
    }
}
