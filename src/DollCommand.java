package com.company;

public class DollCommand implements MagicCommand {
    private static final String DOLL_COMMAND = "i need dolls";

    @Override
    public void printCommandOnBoard() {
        System.out.println("****** \nDOLLS \n******");
    }

    @Override
    public String getToyTypeFromCommand() {
        return DOLL_COMMAND.substring(7);
    }

    @Override
    public String getCommandText() {
        return DOLL_COMMAND;
    }
}
