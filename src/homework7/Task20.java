package homework7;

public class Task20 {
    public static void main(String[] args) {
        Example element1 = Example.ELEMENT;
        Example element2 = Example.ELEMENT;

        System.out.println("Using == : " + (element1 == element2));
        System.out.println("Using equals() : " + element1.equals(element2));
    }
}
