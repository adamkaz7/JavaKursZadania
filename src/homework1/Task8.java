package homework1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter category of product (food, books, services, clothes, electronics, others)");
        String category = input.nextLine();

        switch (category) {
            case "food" -> System.out.println("VAT for food 5%");
            case "books" -> System.out.println("VAT for books 23%");
            case "services" -> System.out.println("VAT for services 23%");
            case "clothes" -> System.out.println("VAT for clothes 5%");
            case "electronics" -> System.out.println("VAT for electronics 8%");
            case "others" -> System.out.println("VAT for other 8%");
            default -> System.out.println("Wrong category");
        }

    }
}
