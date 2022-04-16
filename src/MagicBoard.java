import java.util.Arrays;
import java.util.List;

public class MagicBoard {

    // List of the Observers
    private List<Elf> elves;
    private final List<MagicCommand> commands;
    private String currentWorkingElfName;

    private MagicCommand currentCommand;

    public MagicBoard() {
        MagicCommand dollCommand = new DollCommand();
        MagicCommand bikeCommand = new BikeCommand();
        this.commands = Arrays.asList(dollCommand, bikeCommand);
    }

    public void addElves(List<Elf> elves) {
        this.elves = elves;
        for (Elf elf : elves) {
            System.out.println(elf.getName() + " subscribed to the Magic Board!");
        }
        this.currentWorkingElfName = elves.get(0).getName();
    }

    public MagicCommand getCurrentCommand() {
        return this.currentCommand;
    }

    public void setCurrentCommand(String santaCommandText) throws CommandNotFoundException {
        for (MagicCommand command : commands) {
            if (command.getCommandText().equals(santaCommandText)) {
                currentCommand = command;
                currentCommand.printCommandOnBoard();
                notifyElves();
                return;
            }
        }
        throw new CommandNotFoundException("Command not found!");
    }

    // Observer pattern
    public void notifyElves() {
        for (Elf elf : elves) {
            elf.readFromMagicBoard();
        }
        updateCurrentWorkingElfName();
    }

    public String getCurrentWorkingElfName() {
        return this.currentWorkingElfName;
    }

    // Elves take turns on making toys
    public void updateCurrentWorkingElfName() {
        for (int i = 0; i < elves.size(); i++) {
            if (elves.get(i).getName().equals(currentWorkingElfName)) {
                if (++i >= elves.size()) {
                    i = 0;
                }
                currentWorkingElfName = elves.get(i).getName();
                break;
            }
        }
    }
}
