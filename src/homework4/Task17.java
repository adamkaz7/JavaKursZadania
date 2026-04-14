package homework4;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int userNumberA = input.nextInt();
        System.out.println("Enter a number");
        int userNumberB = input.nextInt();

        int result = nwdIter(userNumberA, userNumberB);
        System.out.println(result);

        input.close();
    }

    private static int nwdIter(int a, int b) {

        if (a == 0){
            return b;
        }

        if (b == 0){
            return a;
        }

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
