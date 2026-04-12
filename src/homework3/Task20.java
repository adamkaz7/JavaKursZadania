package homework3;

public class Task20 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        addNumbersToArray(array);
        swapColumns(array);
        swapDiagonals(array);
        printArray(array);
    }

    private static void swapDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            int columnNumber = array[i][i];
            array[i][i] = array[i][array.length - 1 - i];
            array[i][array.length - 1 - i] = columnNumber;
        }
    }

    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static void swapColumns(int[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            int columnNumber = array[0][i];
            array[0][i] = array[array.length - 1][i];
            array[array.length - 1][i] = columnNumber;
        }
    }

    private static void addNumbersToArray(int[][] array) {
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = number;
                number++;
            }
        }
    }
}
