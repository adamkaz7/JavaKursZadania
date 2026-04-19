package homework7;

import java.util.Scanner;

public class Task17 {
    static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Options: ");
        for (MenuOption options : MenuOption.values()){
            System.out.println(options);
        }

        System.out.println("Enter option: ");
        MenuOption userInput = MenuOption.valueOf(input.nextLine().toUpperCase());

        switch (userInput) {
            case START -> System.out.println("Start");
            case STOP -> System.out.println("Stop");
            case EXIT -> System.out.println("Exit");
        }

        input.close();
    }
}
