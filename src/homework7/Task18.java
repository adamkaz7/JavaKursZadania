package homework7;

public class Task18 {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Butter", Category.FOOD),
                new Product("t-shirt", Category.CLOTHING),
                new Product("Laptop", Category.ELECTRONICS)
        };

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
