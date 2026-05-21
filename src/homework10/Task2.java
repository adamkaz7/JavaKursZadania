package homework10;

import java.util.function.Function;

public class Task2 {
    public static void main(String[] args) {
        Function<String, String> spaceRemover = s -> s.replace(" ", "");
        Function<String, String> lowerCase = String::toLowerCase;
        Function<String, String> normalizeLogin = spaceRemover.andThen(lowerCase);

        String[] loginy = {"  Adam  ", "ANIA K  ", "  k o w a l "};

        String[] loginsAfterChange = new String[loginy.length];
        for (int index = 0; index < loginy.length; index++) {
            loginsAfterChange[index] = normalizeLogin.apply(loginy[index]);
        }

        for (String logins : loginsAfterChange) {
            System.out.println(logins);
        }
    }
}
