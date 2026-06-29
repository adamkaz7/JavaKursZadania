package homework15.Task2.AdnotacjeAgregujace;

public class TeamTest {
    public static void main(String[] args) {
        Team team = Team.builder()
                .name("Team")
                .member("Adam")
                .member("Mateusz")
                .member("Kamil")
                .build();

        System.out.println(team);
    }
}
