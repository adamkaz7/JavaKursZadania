package homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Task8 {
    static void printWithNumbers(List<String> lines, Consumer<String> consumer) {
        for (int index = 0; index < lines.size(); index++) {
            consumer.accept((index + 1) + ") " + lines.get(index));
        }
    }

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>(Arrays.asList("test", "znaki123", "Java", "Programming"));
        Consumer<String> logger = System.out::println;
        printWithNumbers(lines, logger);
    }
}
