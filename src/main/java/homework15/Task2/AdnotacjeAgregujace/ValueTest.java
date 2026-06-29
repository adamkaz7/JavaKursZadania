package homework15.Task2.AdnotacjeAgregujace;

public class ValueTest {
    public static void main(String[] args) {
        ValueUser valueUser = new ValueUser("Mateusz", 20);

        System.out.println(valueUser.getName());
        System.out.println(valueUser.getAge());
        System.out.println(valueUser);
    }
}
