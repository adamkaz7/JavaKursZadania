package homework15.Task2.AdnotacjeAgregujace;

public class BuilderTest {
    public static void main(String[] args) {
        BuilderUser builderUser = BuilderUser.create()
                .name("Kamil")
                .age(22)
                .email("kamil@test.pl")
                .finish();

        System.out.println(builderUser);
    }
}
