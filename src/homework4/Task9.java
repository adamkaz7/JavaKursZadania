package homework4;

public class Task9 {
    public static void main(String[] args) {
        System.out.println(factorialRec(3));
        System.out.println(factorialRec(5));
        System.out.println(factorialRec(7));
    }

    private static int factorialRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialRec(n - 1);
    }
}
