package homework3;

public class Task5 {
    public static void main(String[] args) {
        double[] tab = {4, 2, 2, 5, 3};

        double avgInTab = 0;
        for (double j : tab) {
            avgInTab += j;
        }
        avgInTab /= tab.length;
        System.out.println("Average in array: " + avgInTab);
    }
}
