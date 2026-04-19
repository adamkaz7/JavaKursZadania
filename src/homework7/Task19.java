package homework7;

public class Task19 {
    public static void main(String[] args) {
        int numberA = 10;
        int numberB = 5;

        for (Calculation calculation : Calculation.values()) {
            int result = calculation.calculate(numberA, numberB);
            System.out.println("Calculation " + calculation + " result: " + result);
        }
    }
}
