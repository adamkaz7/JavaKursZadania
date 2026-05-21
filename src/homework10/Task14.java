package homework10;

public class Task14 {
    @FunctionalInterface
    interface PriceStrategy {
        double apply(double basePrice);
    }

    static double calculatePrice(double basePrice, PriceStrategy strategy) {
        return strategy.apply(basePrice);
    }

    public static void main(String[] args) {
        PriceStrategy normal = (basePrice) -> basePrice;
        PriceStrategy student = (basePrice) -> basePrice * 0.90;
        PriceStrategy vip = (basePrice) -> basePrice * 0.80;
        PriceStrategy blackFriday = (basePrice) -> basePrice * 0.70;

        double[] ceny = {100.0, 250.0, 399.0};

        for (double price : ceny) {
            System.out.println("Price: " + price + ", Normal: " + normal.apply(price)
                    + ", student: " + student.apply(price) + ", vip: " + vip.apply(price)
                    + ", blackFriday: " + blackFriday.apply(price));
        }
    }
}
