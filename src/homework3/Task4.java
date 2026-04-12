package homework3;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};

        int sumOfNumbers = 0;
        for (int number : numbers) {
            sumOfNumbers += number;
        }
        System.out.println("Sum of numbers in array: " + sumOfNumbers);
    }
}
