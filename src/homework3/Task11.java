package homework3;

public class Task11 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {2, 12, 42, 1 ,3};

        int index0 = arrayOfNumbers[0];
        arrayOfNumbers[0] = arrayOfNumbers[arrayOfNumbers.length - 1];
        arrayOfNumbers[arrayOfNumbers.length - 1] = index0;

        for (int arrayOfNumber : arrayOfNumbers) {
            System.out.print(arrayOfNumber + " ");
        }
    }
}
