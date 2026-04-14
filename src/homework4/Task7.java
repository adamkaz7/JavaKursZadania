package homework4;

public class Task7 {
    public static void main(String[] args) {
        int x = 5;

        System.out.println("x in main before method: " + x);
        changeX(x);
        System.out.println("x in main after method: " + x);
    }

    private static void changeX(int x) {
        x = 10;
        System.out.println("x in method: " + x);
    }
}
