package homework6;

public class Task17 {
    public static void main(String[] args) {
        Person person = new Person("Jakub", 27);
        Person person1 = new Person("Żaneta", 17);

        int difference = person.compareAge(person1);
        System.out.println("Difference between " + person + ", and a " + person1 + " is: " + difference + " years");
    }
}
