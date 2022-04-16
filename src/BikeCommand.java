package com.company;

public class BikeCommand implements MagicCommand {
    private static final String BIKE_COMMAND = "i need bikes";

    @Override
    public void printCommandOnBoard() {
        System.out.println("****** \nBIKES \n******");
    }

    @Override
    public String getToyTypeFromCommand() {
        return BIKE_COMMAND.substring(7);
    }

    @Override
    public String getCommandText() {
        return BIKE_COMMAND;
    }
}
