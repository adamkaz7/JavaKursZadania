package homework6;

public class Task10 {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Bmw", 1990),
                new Car("Audi", 2020),
                new Car("Opel", 2010)
        };

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
