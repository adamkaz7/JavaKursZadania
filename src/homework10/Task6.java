package homework10;

import java.util.function.Predicate;

public class Task6 {
    public static void main(String[] args) {
        String[] loginy = {"adam", "Ala123", "x", "User_01", "ADMIN", "gość"};

        Predicate<String> minLength3 = s -> s != null && s.length() >= 3;
        Predicate<String> onlyLettersOrNumbers = s -> s.matches("[a-zA-Z0-9_]+");
        Predicate<String> startsWithLetters = s -> Character.isLetter(s.charAt(0));
        Predicate<String> isValidLogin = minLength3.and(onlyLettersOrNumbers).and(startsWithLetters);

        int validLoginCount = 0;
        System.out.println("Correct logins: ");
        for (String logins : loginy) {
            if (isValidLogin.test(logins)) {
                validLoginCount++;
                System.out.println(logins);
            }
        }
        System.out.println("Correct logins: " + validLoginCount);
    }
}
