package homework3;

public class Task14 {
    public static void main(String[] args) {
        int[][] tab = new int[3][3];

        int number = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = number;
                number++;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
