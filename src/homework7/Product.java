package homework7;

public class Product {
    String name;
    Category category;

    public Product(String name, Category category) {
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " " + category;
    }
}
