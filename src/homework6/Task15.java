package homework6;

public class Task15 {
    public static void main(String[] args) {
        Person person = new Person("Asia", 21);
        Person person1 = new Person("Kasia", 18);
        Person person2 = new Person("Basia", 40);
        Person person3 = new Person("Kevin", 25);

        System.out.println("Via class: " + Person.numberOfPeople);
        System.out.println("Via object: " + person.numberOfPeople);
    }
}
