package homework3;

public class Task19 {
    public static void main(String[] args) {
        int [][] arrayNumbers = new int[10][10];
        addNumbersToArray(arrayNumbers);
        printNumbers(arrayNumbers);
    }

    private static void printNumbers(int[][] arrayNumbers) {
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println(arrayNumbers[i][i]);
        }
    }

    public static void addNumbersToArray(int[][] numbersArray){
        int addNumbers = 1;
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = 0; j < numbersArray[i].length; j++) {
                numbersArray[i][j] = addNumbers;
                addNumbers++;
            }
        }
    }
}
