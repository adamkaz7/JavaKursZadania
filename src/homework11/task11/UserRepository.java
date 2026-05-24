package homework11.task11;

import java.util.List;
import java.util.Optional;

public class UserRepository {
    private final List<User> users = List.of(
            new User(1, "Anna", 25),
            new User(2, "Bartek", 17),
            new User(3, "Celina", 30),
            new User(4, "Dawid", 15)
    );

    Optional<User> findById(Integer id) {
        for (User user : users) {
            if (user.id() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }
}
