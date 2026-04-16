package homework6;

import java.math.BigDecimal;

public class Task19 {
    public static void main(String[] args) {
        Product telephone = new Product("Telephone", new BigDecimal("1599.00"));
        Product bike = new Product("Bike", new BigDecimal("999.99"));

        bike.showProduct();
        telephone.showProduct();

        bike.reducePrice(100.00);
        telephone.reducePrice(200.00, "Product after repair");

        System.out.println();
        System.out.println("After reduce: ");
        bike.showProduct();
        telephone.showProduct();
    }
}
