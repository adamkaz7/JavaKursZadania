package homework10;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Task4 {
    static BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
    static BiFunction<Integer, Integer, Integer> sub = (a, b) -> a - b;
    static BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
    static BiFunction<Integer, Integer, Integer> div = (a, b) -> {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    };

    static int calculate(int a, int b, BiFunction<Integer, Integer, Integer> op) {
        return op.apply(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj a: ");
        int a = sc.nextInt();
        System.out.print("Podaj b: ");
        int b = sc.nextInt();
        System.out.print("Podaj operator (+ - * / %): ");
        String op = sc.next();
        sc.close();

        BiFunction<Integer, Integer, Integer> option = switch (op) {
            case "+" -> add;
            case "-" -> sub;
            case "*" -> mul;
            case "/" -> div;
            default -> throw new IllegalArgumentException("Invalid input" + op);
        };
        System.out.println("Result: " + calculate(a, b, option));
    }
}
