package homework7;

public enum OrderStatus {
    NEW,
    PROCESSING,
    SHIPPED,
    DELIVERED,
    CANCELED;

    public boolean isActive() {
        switch (this) {
            case NEW, PROCESSING, SHIPPED -> {
                return true;
            }
            default -> {
                return false;
            }
        }
    }
}
