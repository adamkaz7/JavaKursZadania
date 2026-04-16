package homework6;

public class Shop {
    String name;
    Product[] products;

    public Shop(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public void showProduct() {
        System.out.println("Products in the shop: ");
        for (Product product : products) {
            product.showProduct();
        }
    }
}
