package homework6;

public class Task5 {
    public static void main(String[] args) {
        Car car = new Car("Bmw", 2000);
        System.out.println("Before change: " + car);

        car.changeBrand("Audi");
        System.out.println("After change: " + car);
    }
}
