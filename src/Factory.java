package com.company;

// Factory pattern
public abstract class Factory {
    private int toyID;
    private final String factoryType;

    public Factory(String factoryType) {
        this.toyID = 0;
        this.factoryType = factoryType;
    }

    public int getToysIDs() {
        return this.toyID++;
    }

    public String getFactoryType() {
        return this.factoryType;
    }

    public abstract Toy buildToy();
}
