package homework3;

public class Task15 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        addNewNumbersToArray(array);
        int number = addAllNumbersInArray(array);
        System.out.println(number);
    }

    private static int addAllNumbersInArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    private static void addNewNumbersToArray(int[][] array) {
        int number = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = number;
                number++;
            }
        }
    }
}
