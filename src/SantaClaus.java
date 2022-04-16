package com.company;

import java.util.ArrayList;
import java.util.List;

// Singleton pattern
public class SantaClaus {
    private final List<Toy> bagOfToys;
    private final MagicBoard magicBoard;

    public SantaClaus() {
        this.bagOfToys = new ArrayList<>();
        this.magicBoard = new MagicBoard();
    }

    public MagicBoard getMagicBoard() {
        return this.magicBoard;
    }

    public void subscribeElvesToMagicBord(List<Elf> elves) {
        this.magicBoard.addElves(elves);
    }

    public void addToyToBag(Toy toy) {
        bagOfToys.add(toy);
        System.out.println(toy.getToyDescription() + " added to Santa's bag");
    }

    public void checkBagOfToys() {
        if (bagOfToys.isEmpty()) {
            System.out.println("Bag of toys is empty!");
        }
        for (Toy toy : bagOfToys) {
            System.out.println(toy.getToyDescription());
        }
    }

    public void writeToMagicBoard(String command) throws CommandNotFoundException {
        magicBoard.setCurrentCommand(command);
    }
}
