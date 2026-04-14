package homework4;

import java.util.Scanner;

public class Task19 {
    static final Scanner input = new Scanner(System.in);
    private static final int ADD = 1;
    private static final int SUBTRACT = 2;
    private static final int MULTIPLY = 3;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        int option = -1;

        while (option != EXIT) {
            menu();
            option = getOptionFromUser();
            chooseOption(option);
        }
    }

    private static void menu() {
        System.out.println(ADD + " > Add");
        System.out.println(SUBTRACT + " > Subtract");
        System.out.println(MULTIPLY + " > Multiply");
        System.out.println(EXIT + " > Exit");
    }

    private static void chooseOption(int option) {
        switch (option) {
            case ADD -> addNumbers();
            case SUBTRACT -> subtractNumbers();
            case MULTIPLY -> multiplyNumbers();
            case EXIT -> System.out.println("Bye");
            default -> System.out.println("Unknown value");
        }
    }

    public static int getOptionFromUser() {
        int option;
        System.out.println("Choose a option");
        option = input.nextInt();
        input.nextLine();
        return option;
    }

    public static int getValue() {
        System.out.println("Enter a value");
        int value = input.nextInt();
        input.nextLine();
        return value;
    }

    private static void addNumbers() {
        int sum = getValue() + getValue();
        System.out.println("a + b = " + sum + "\n");
    }

    private static void subtractNumbers() {
        int sum = getValue() - getValue();
        System.out.println("a - b = " + sum + "\n");

    }

    private static void multiplyNumbers() {
        int sum = getValue() * getValue();
        System.out.println("a * b = " + sum + "\n");
    }
}
