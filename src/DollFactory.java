package com.company;

public class DollFactory extends Factory {
    private static final String FACTORY_TYPE = "Dolls Factory";

    public DollFactory() {
        super(FACTORY_TYPE);
    }

    @Override
    public Toy buildToy() {
        return new Doll(getToysIDs());
    }
}
