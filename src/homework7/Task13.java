package homework7;

public class Task13 {
    public static void main(String[] args) {
        int numberA = 10;
        int numberB = 5;

        for(Operation operation : Operation.values()) {
            int result = operation.calculate(numberA, numberB);
            System.out.println("Operation " + operation + " result: " + result);
        }
    }
}
