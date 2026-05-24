package homework11;

import java.util.Optional;

public class Task8 {
    static String getUserEmail(Optional<User> user) {
        return user.flatMap(User::getEmail).orElse("Empty email");
    }

    public static void main(String[] args) {
        User ala = new User("Ala", "ala@mail.com");
        User bob = new User("Bob", null);

        System.out.println("Ala: " + getUserEmail(Optional.of(ala)));
        System.out.println("Bob: " + getUserEmail(Optional.of(bob)));
        System.out.println("Empty: " + getUserEmail(Optional.empty()));
    }

    static class User {
        private String name;
        private String email;

        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
