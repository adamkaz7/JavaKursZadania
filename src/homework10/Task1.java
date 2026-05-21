package homework10;

public class Task1 {
    static Runnable r1 = () -> System.out.println("Start of program!");
    static Runnable r2 = () -> System.out.println("End of program!");

    public static void main(String[] args) {
        r1.run();
        r2.run();
    }
}
