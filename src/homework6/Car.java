package homework6;

public class Car {
    public static int counter = 0;

    String brand;
    int yearOfProduction;

    public Car(String brand, int yearOfProduction) { //task3
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        counter++; //task9
    }

    public Car() { //task2
        this.brand = "unknown";
        this.yearOfProduction = 2000;
    }

    public void changeBrand(String brand) { //task5
        this.brand = brand;
    }

    public void showDifference() { //task4
        String brand = "Audi";
        System.out.println(this.brand);
        System.out.println(brand);
    }

    public void introduceYourSelf() { //task7
        System.out.println("I am a car of brand " + this.brand.toUpperCase() + " from year " + this.yearOfProduction);
    }

    public static void classDescription(){ //task8
        System.out.println("This class represents cars");
    }

    @Override
    public String toString() {
        return brand + " " + yearOfProduction;
    }
}
