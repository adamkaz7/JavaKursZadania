package homework6;


import java.math.BigDecimal;

public class Task20 {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Telephone", new BigDecimal("1599.00")),
                new Product("Bike", new BigDecimal("999.99"))
        };

        Shop market = new Shop("Market", products);
        market.showProduct();
    }
}
