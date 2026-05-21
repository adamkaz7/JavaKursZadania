package homework10;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Task9 {
    static void printReport(Map<String, Integer> map, BiConsumer<String, Integer> consumer) {
        for (Map.Entry<String, Integer> key : map.entrySet()) {
            consumer.accept(key.getKey(), key.getValue());
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> productToQty = new HashMap<>();
        productToQty.put("Laptop", 5);
        productToQty.put("Mysz", 12);
        productToQty.put("Klawiatura", 7);

        BiConsumer<String, Integer> reporter =
                (product, qty) -> {
                    System.out.println("Product " + product + " Qty: " + qty);
                };
    printReport(productToQty, reporter);
    }
}
