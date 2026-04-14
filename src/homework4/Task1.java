package homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String userName = input.nextLine();
        helloToUser(userName);


        input.close();
    }

    public static void helloToUser(String name) {
        System.out.println("Hello " + name);
    }
}
