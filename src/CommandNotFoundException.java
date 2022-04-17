public class CommandNotFoundException extends Exception {
    public CommandNotFoundException(String message) {
        super(message);
    }

    public void printWarningMsg() {
        System.out.println(getMessage() + "\nPlease use one of the known commands!");
    }
}
