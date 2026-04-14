package homework4;

public class Task14 {
    public static void main(String[] args) {
        int[] tab1 = {1, 3, 5, 7, 9, 11};
        int[] tab2 = {2, 4, 6, 8, 12};

        int[] margedTabs = margeArray(tab1, tab2);
        for (int margedTab : margedTabs) {
            System.out.print(margedTab + " ");
        }

    }

    private static int[] margeArray(int[] array1, int[] array2) {
        int[] marge = new int[array1.length + array2.length];
        int position = 0;

        for (int number : array1) {
            marge[position] = number;
            position++;
        }

        for (int number : array2) {
            marge[position] = number;
            position++;
        }
        return marge;
    }
}
