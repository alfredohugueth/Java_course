package mx.com.gm.ventas;

public class Product {
    private final int idProduct;
    private String name;
    private double price;
    private static int counterProducts;

    private Product() {
        this.idProduct = ++Product.counterProducts;
    }

    public Product(String name, double price) {
        this(); // Private constructor

        this.name = name;
        this.price = price;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getIdProduct() {
        return this.idProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
