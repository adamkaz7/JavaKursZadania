package homework6;

import java.math.BigDecimal;

public class Task18 {
    public static void main(String[] args) {
        Product milk = new Product("Milk", new BigDecimal("2.5"));
        Product bike = new Product("Bike", new BigDecimal("999.99"));

        milk.showProduct();
        bike.showProduct();
    }
}
