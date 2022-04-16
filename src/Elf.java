import java.util.List;

public class Elf {
    private final List<Factory> toyFactories;
    private final String name;
    private final SantaClaus santaClaus;
    private final MagicBoard magicBoard;

    public Elf(String name, List<Factory> toyFactories, SantaClaus santaClaus) {
        this.toyFactories = toyFactories;
        this.name = name;
        this.santaClaus = santaClaus;
        this.magicBoard = santaClaus.getMagicBoard();
    }

    public String getName() {
        return name;
    }

    public void readFromMagicBoard() {
        if (!magicBoard.getCurrentWorkingElfName().equals(name)) {
            return;
        }
        System.out.println("Elf " + name + " is building the toy\n"
                + "-------------------------");
        for (Factory factory : toyFactories) {
           MagicCommand command = magicBoard.getCurrentCommand();
            String factoryType = factory.getFactoryType().split("\\W+")[0];
            if (command.getToyTypeFromCommand().equals(factoryType.toLowerCase())) {
                Toy toy = factory.buildToy();
                santaClaus.addToyToBag(toy);
                return;
            }
        }
    }
}
