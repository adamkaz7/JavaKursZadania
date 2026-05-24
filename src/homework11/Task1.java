package homework11;

import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        Optional<String> opt1 = Optional.of("Hello");
        Optional<String> opt2 = Optional.ofNullable(null);
        Optional<String> opt3 = Optional.empty();

        System.out.println("opt1: " + "isPresent(): " + opt1.isPresent() + ", isEmpty(): " + opt1.isEmpty());
        System.out.println("opt2: " + "isPresent(): " + opt2.isPresent() + ", isEmpty(): " + opt2.isEmpty());
        System.out.println("opt3: " + "isPresent(): " + opt3.isPresent() + ", isEmpty(): " + opt3.isEmpty());
    }
}
