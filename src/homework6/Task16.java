package homework6;

public class Task16 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Asia", 21),
                new Person("Kasia", 17),
                new Person("Basia", 45)
        };

        for (Person person : people) {
            if (person.isAdult()){
                System.out.println(person + " is an adult");
            }
        }
    }
}
