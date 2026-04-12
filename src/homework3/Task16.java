package homework3;

public class Task16 {
    public static void main(String[] args) {
        int[][] arrayNumbers = new int[2][3];
        addNumbersToArray(arrayNumbers);
        sumOfNumbersInDifferentRow(arrayNumbers);
    }

    private static void sumOfNumbersInDifferentRow(int[][] arrayNumbers) {
        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arrayNumbers[i][j];
            }
            System.out.println(sum);
        }
    }

    private static void addNumbersToArray(int[][] arrayNumbers) {
        int number = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arrayNumbers[i][j] = number;
                number++;
            }
        }
    }
}
