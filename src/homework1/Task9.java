package homework1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = getFirsNumber(input);
        String operator = getOperator(input);
        double b = getSecondNumber(input);
        Double result = miniCalc(operator, a, b);
        getResult(result);
    }

    private static Double miniCalc(String operator, double a, double b) {
        Double result = switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> {
                    if (b == 0){
                        System.out.println("fail");
                        yield null;
                    }
                    yield a / b;
            }
            case "%" -> {
                if (b == 0){
                    System.out.println("fail");
                    yield null;
                }
                yield a % b;
            }
            default -> {
                System.out.println("fail: unknown operator");
                yield null;
            }
        };
        return result;
    }

    private static void getResult(Double result) {
        if (result != null) {
            System.out.println("Result: " + result);
        }
    }

    private static String getOperator(Scanner input) {
        System.out.println("Enter operator (+, -, *, /, %)");
        String operator = input.nextLine();
        return operator;
    }

    private static double getSecondNumber(Scanner input) {
        System.out.println("Enter second number");
        double b = input.nextDouble();
        input.nextLine();
        return b;
    }

    private static double getFirsNumber(Scanner input) {
        System.out.println("Enter firs number");
        double a = input.nextDouble();
        input.nextLine();
        return a;
    }
}
