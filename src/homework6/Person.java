package homework6;

public class Person {
    public static int numberOfPeople = 0;

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfPeople++;
    }

    public Person(String name) { //task13
        this(name, 0); //task14
    }

    public int compareAge(Person other) {
        return Math.abs(this.age - other.age);
    }

    public boolean isAdult() { //task16
        return age >= 18;
    }

    public void introduceYourSelf() { //task11
        System.out.println("Name: " + name + " age: " + age);
    }

    public void introduceYourSelf(String greeting) { //task12
        System.out.println(greeting);
        System.out.println("Name: " + name + " age: " + age);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
