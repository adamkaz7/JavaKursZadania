package homework6;

public class Task9 {
    public static void main(String[] args) {
        Car car = new Car("Audi", 2000);
        Car car1 = new Car("Bmw", 2020);
        Car car2 = new Car("Opel", 1990);
        Car car3 = new Car("Nissan", 2010);
        Car car4 = new Car("Subaru", 2011);

        int counter = Car.counter;
        System.out.println(counter);
    }
}
