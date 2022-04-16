package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SantaClaus santaClaus = new SantaClaus();

        Factory bikeFactory = new BikeFactory();
        Factory dollFactory = new DollFactory();
        List<Factory> factories = Arrays.asList(bikeFactory, dollFactory);

        Elf elf1 = new Elf("Genc", factories, santaClaus);
        Elf elf2 = new Elf("Lia", factories, santaClaus);
        Elf elf3 = new Elf("Nemo", factories, santaClaus);

        santaClaus.subscribeElvesToMagicBord(Arrays.asList(elf1, elf2, elf3));

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("\nList of commands: " +
                    "\nI need bikes" +
                    "\nI need dolls" +
                    "\nToys" +
                    "\nClose\n");
            System.out.println("Santa, please write a command: ");
            String command = in.nextLine();
            if (command.equalsIgnoreCase("toys")) {
                santaClaus.checkBagOfToys();
            } else if (command.equalsIgnoreCase("exit")) {
                break;
            } else {
                try {
                    santaClaus.writeToMagicBoard(command);
                } catch (CommandNotFoundException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
