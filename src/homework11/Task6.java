package homework11;

import java.util.Optional;

public class Task6 {
    public static void main(String[] args) {
        String[] nicki = {"Janek", null, "Ania", null, "Kuba"};
        System.out.println("Version A: ");
        for (String nick : nicki) {
            Optional<String> optional = Optional.ofNullable(nick);
            optional.ifPresent(s -> System.out.println("Found: " + s));
        }

        System.out.println("\nVersion B: ");
        for (String nick : nicki) {
            Optional<String> optional = Optional.ofNullable(nick);
            optional.ifPresentOrElse(s -> System.out.println("Found: " + s), () -> System.out.println("Not found"));
        }
    }
}
