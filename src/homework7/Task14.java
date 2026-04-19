package homework7;

public class Task14 {
    public static void main(String[] args) {
        for (OrderStatus status : OrderStatus.values()) {
            System.out.println("Status: " + status + ", is active: " + status.isActive());
        }
    }
}
