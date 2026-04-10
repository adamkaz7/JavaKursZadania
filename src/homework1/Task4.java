package homework1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature");
        int temperature = input.nextInt();
        temperatureCheck(temperature);


        input.close();
    }

    private static void temperatureCheck(int temperature) {
        if (temperature < 0) {
            System.out.println("Frost");
        } else if (temperature <= 15) {
            System.out.println("Cold");
        } else if (temperature <= 25) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}
