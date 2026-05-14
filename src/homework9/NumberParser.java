package homework9;

class NumberParser {
    static int parsePositiveInt(String s) {
        int number;
        try {
            number = Integer.parseInt(s);
        } catch (NumberFormatException exception) {
            throw new InvalidNumberException("Invalid number: " + "'" + s + "'", exception);
        }

        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive: " + number);
        }
        return number;
    }
}
