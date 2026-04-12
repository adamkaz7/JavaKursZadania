package homework3;

public class Task18 {
    public static void main(String[] args) {
        int [][] numbers = new int[3][3];
        addNumbersToArray(numbers);

        int max = numbers[0][0];
        int maxRow = 0;
        int maxCol = 0;

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int value = numbers[i][j];

                if (value > max) {
                    max = value;
                    maxRow = i;
                    maxCol = j;
                }

                if (value > first) {
                    third = second;
                    second = first;
                    first = value;
                } else if (value > second) {
                    third = second;
                    second = value;
                } else if (value > third) {
                    third = value;
                }
            }
        }
        System.out.println("Biggest number: " + max);
        System.out.println("Position of row " + maxRow + ", column " + maxCol);
        System.out.println("Third biggest number: " + third);
    }

    private static void addNumbersToArray(int[][] numbers){
        int numbersToArray = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = numbersToArray;
                numbersToArray++;
            }
        }
    }
}
