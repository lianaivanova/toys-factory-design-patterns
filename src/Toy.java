package com.company;

class Toy {
    private final int id;
    private final String type;

    public Toy(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getToyDescription() {
        return this.type + " with ID " + this.id;
    }
}
