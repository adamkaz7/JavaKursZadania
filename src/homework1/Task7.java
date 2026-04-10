package homework1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        String ageStatus = (age <= 17) ? "Not adult" : "Adult";
        System.out.println(ageStatus);
    }
}
