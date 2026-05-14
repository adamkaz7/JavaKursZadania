package homework9;

final class CommandProcessor {
    static void processCommand(String cmd) {
        if (cmd.equalsIgnoreCase("ARG")) {
            throw new IllegalArgumentException("bad arg");
        }

        if (cmd.equalsIgnoreCase("STATE")) {
            throw new IllegalStateException("bad state");
        }

        System.out.println("Command: " + cmd);
    }

    static void demo() {
        try {
            processCommand("ARG");
        } catch (IllegalArgumentException | IllegalStateException exception) {
            System.out.println("Command error: " + exception.getMessage());
        }

        try {
            processCommand("STATE");
        } catch (IllegalArgumentException | IllegalStateException exception) {
            System.out.println("Command error: " + exception.getMessage());
        }
    }
}
