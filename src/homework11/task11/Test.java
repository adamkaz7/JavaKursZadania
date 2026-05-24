package homework11.task11;

public class Test {
    static String getAdultNameById(UserRepository repo, int id) {
        return repo.findById(id)
                .filter(user1-> user1.age() >= 18)
                .map(User::name)
                .map(String::toUpperCase)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    public static void main(String[] args) {
        UserRepository userRepo = new UserRepository();
        System.out.println("ID=1 > " + getAdultNameById(userRepo, 1));
        System.out.println("ID=3 > " + getAdultNameById(userRepo, 3));
        try {
            System.out.println("ID=2 > " + getAdultNameById(userRepo, 2));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }

        try {
            System.out.println("ID99 > " + getAdultNameById(userRepo, 99));
        }  catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
