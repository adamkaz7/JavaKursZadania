package homework11;

import java.util.List;
import java.util.Optional;

public class Task9 {
    static String describeGrade(Optional<Integer> grade) {
        return grade.filter(s -> s >= 4)
                .map(s -> "Good grade: " + s)
                .orElse("Skipped");
    }

    public static void main(String[] args) {
        List<Optional<Integer>> oceny = List.of(
                Optional.of(5), Optional.of(3), Optional.empty(),
                Optional.of(4), Optional.of(2), Optional.of(5)
        );

        for (Optional<Integer> i : oceny) {
            System.out.println(describeGrade(i));
        }
    }
}
