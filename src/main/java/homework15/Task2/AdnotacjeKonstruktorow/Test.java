package homework15.Task2.AdnotacjeKonstruktorow;

public class Test {
    public static void main(String[] args) {
        ConstructorExample noArgs = new ConstructorExample();
        noArgs.setName("Adam");
        noArgs.setAge(18);
        noArgs.setEmail("adam@test.pl");

        ConstructorExample allArgs = new ConstructorExample("Mateusz", 20, "mateusz@test.pl");

        ConstructorExample requiredArgs = new ConstructorExample("required@test.pl");
        requiredArgs.setName("Kamil");
        requiredArgs.setAge(22);

        System.out.println(noArgs);
        System.out.println(allArgs);
        System.out.println(requiredArgs);
    }
}
