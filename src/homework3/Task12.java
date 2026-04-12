package homework3;

public class Task12 {
    public static void main(String[] args) {
        int[] array1 = {5, 10, 15};
        int[] array2 = {5, 10, 15};

        int[] addTwoArrays = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            addTwoArrays[i] = array1[i] + array2[i];
        }

        for (int addTwoArray : addTwoArrays) {
            System.out.print(addTwoArray + " ");
        }
    }
}
