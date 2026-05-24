package homework11;

import java.util.Optional;

public class Task4 {
    static String generateDefault() {
        System.out.println(" >> Generating default value");
        return "DEFAULT";
    }

    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        System.out.println("Test on empty: ");
        System.out.println(optional.orElse(generateDefault()));
        System.out.println(optional.orElseGet(() -> generateDefault()));

        System.out.println("Test on optional value: ");
        Optional<String> optional2 = Optional.of("value");
        System.out.println(optional2.orElse(generateDefault()));
        System.out.println(optional2.orElseGet(() -> generateDefault()));
    }
}
