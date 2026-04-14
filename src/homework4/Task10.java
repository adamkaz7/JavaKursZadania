package homework4;

public class Task10 {
    public static void main(String[] args) {
        int[] arrayOfNumber = {5, 2, 3, 1};
        int sum = sumArrayNumbers(arrayOfNumber);
        System.out.println(sum);
    }

    private static int sumArrayNumbers(int[] array) {
        int result = 0;
        for (int i : array) {
            result += i;
        }
        return result;
    }
}
