package homework4;

public class Task8 {
    public static void main(String[] args) {
        System.out.println(factorialIter(3));
        System.out.println(factorialIter(5));
        System.out.println(factorialIter(7));
    }

    private static int factorialIter(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
