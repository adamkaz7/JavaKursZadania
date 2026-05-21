package homework10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task13 {
    record Product(String name, double price, int rating) {}

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Mysz",        89.99, 4),
                new Product("Klawiatura", 199.00, 5),
                new Product("Mysz pro",    89.99, 5),
                new Product("Słuchawki",  349.00, 3),
                new Product("Mata",        89.99, 3)
        ));

        Comparator<Product> sort = Comparator.comparingDouble(Product::price)
                .thenComparing(Comparator.comparingInt(Product::rating).reversed());

        products.sort(sort);
        System.out.println(products);
    }
}
