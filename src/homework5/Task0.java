package homework5;

public class Task0 {
    public static void main(String[] args) {
        String text = "    Abcd123  ";
        String empty = "";
        String blank = "    ";
        String sentence = "Java Programming";
        String unicode = "\u2003Java\u2003";

        System.out.println("text length" + text.length());
        System.out.println("isEmpty: " + empty.isEmpty());
        System.out.println("isBlank: " + blank.isBlank());
        System.out.println();

        System.out.println("trim: " + unicode.trim());
        System.out.println("strip: " + unicode.strip());
        System.out.println("stripLeading: " + text.stripLeading());
        System.out.println("stripTrailing: " + text.stripTrailing());
        System.out.println();

        System.out.println("charAt(1): " + sentence.charAt(1));
        System.out.println("codePointAt(1): " + sentence.codePointAt(1));
        System.out.println();

        System.out.println("substring(5): " + sentence.substring(5));
        System.out.println("substring(0, 5): " + sentence.substring(0, 5));
        System.out.println();

        System.out.println("indexOf('a'): " + sentence.indexOf('a'));
        System.out.println("lastIndexOf('a'): " + sentence.lastIndexOf('a'));
        System.out.println();

        System.out.println("contains(\"Program\"): " + sentence.contains("Program"));
        System.out.println("startsWith(\"Java\"): " + sentence.startsWith("Java"));
        System.out.println("endsWith(\"ing\"): " + sentence.endsWith("ing"));
        System.out.println();

        String a = "Java";
        String b = "java";
        String c = "Java";

        System.out.println("equals: " + a.equals(c));
        System.out.println("equalsIgnoreCase: " + a.equalsIgnoreCase(b));
        System.out.println("compareTo: " + a.compareTo(b));
    }
}
