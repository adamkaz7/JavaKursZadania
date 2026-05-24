package homework11;

import java.util.Optional;

public class Task10 {
    static Optional<String> findInCache(String key) {
        System.out.println("Looking in cache " + key);
        if (key.equals("A")) {
            return Optional.of("A");
        }

        return Optional.empty();
    }

    static Optional<String> findInDatabase(String key) {
        System.out.println("Looking in database " + key);
        if (key.equals("B")) {
            return Optional.of("B");
        }

        return Optional.empty();
    }

    static Optional<String> findDefault(String key) {
        System.out.println("Looking for default " + key);
        return Optional.of("Default");
    }

    static String findValue(String key) {
        Optional<String> value = findInCache(key).or(() -> findInDatabase(key).or(() -> findDefault(key)));
        return value.orElse("Default");
    }

    public static void main(String[] args) {
        System.out.println("Key A: " + findValue("A"));
        System.out.println("Key B: " + findValue("B"));
        System.out.println("Key C: " + findValue("C"));

        //or jest leniwe, ponieważ odpala się, dopiero gdy poprzedni Optional jest pusty.
    }
}
