package homework9;

class Task2 {
    public static void main(String[] args) {
        System.out.println(NumberParser.parsePositiveInt("123"));
        System.out.println(NumberParser.parsePositiveInt("abc"));
        System.out.println(NumberParser.parsePositiveInt("-123"));
    }
}
