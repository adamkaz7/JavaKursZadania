package homework10;

public class Task11 {
    @FunctionalInterface
    interface StringFormatter {
        String format(String input);
    }

    static String applyFormatter(StringFormatter formatter, String input) {
        return formatter.format(input);
    }

    public static void main(String[] args) {
        StringFormatter upperCase = s -> s.toUpperCase();
        StringFormatter prefix = s -> ">>> " + s;
        StringFormatter reversed = s -> new StringBuilder(s).reverse().toString();

        String text = "Java";
        System.out.println(applyFormatter(upperCase, text));
        System.out.println(applyFormatter(prefix, text));
        System.out.println(applyFormatter(reversed, text));
    }
}
