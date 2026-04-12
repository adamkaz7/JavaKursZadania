package homework3;

public class Task17 {
    public static void main(String[] args) {
        int[][] arrayNumbers = new int[2][3];
        addNumbersToArray(arrayNumbers);
        sumOfNumbersInDifferentColumns(arrayNumbers);
    }

    private static void sumOfNumbersInDifferentColumns(int[][] arrayNumbers) {
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 2; j++) {
                sum += arrayNumbers[j][i];
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