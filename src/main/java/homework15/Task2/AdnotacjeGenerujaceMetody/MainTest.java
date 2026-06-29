package homework15.Task2.AdnotacjeGenerujaceMetody;

public class MainTest {
    public static void main(String[] args) {
        GeneratingMethods gm = new GeneratingMethods();
        gm.setName("Adam");
        gm.setAge(18);

        GeneratingMethods gm2 = new GeneratingMethods();
        gm2.setName("Adam");
        gm2.setAge(99);

        System.out.println(gm.getName());
        System.out.println(gm.getAge());
        System.out.println("toString gm: " + gm);
        System.out.println("toString gm2: " + gm2);

        System.out.println("gm equals gm2: " + gm.equals(gm2));
        System.out.println("gm hashCode: " + gm.hashCode());
        System.out.println("gm2 hashCode: " + gm2.hashCode());
    }
}
