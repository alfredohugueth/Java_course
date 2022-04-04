package mx.com.gm.ventas;

public class Order {

    // Class variables
    private static int counterOrders;
    private static final int MAX_PRODUCTS = 10;

    // Objects variables
    private int idOrder;
    private Product products[];
    private int counterProducts;

    // Public constructor to initialize variables from the objects
    public Order() {
        this.idOrder = ++Order.counterOrders;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (this.counterProducts > Order.MAX_PRODUCTS) {
            System.out.println("MAX of products reach" + Order.MAX_PRODUCTS);
            return;
        }

        this.products[this.counterProducts++] = product;
    }

    public double calculateTotal() {
        double total = 0;

        for (int i = 0; i < this.counterProducts; i++) {
            total += this.products[i].getPrice();
        }
        return total;
    }

    public void showOrder() {
        System.out.println("Id Order: " + this.idOrder );
        System.out.println("Total of the order: $" + this.calculateTotal());
        System.out.println("Products of the order: ");
        for (int i = 0; i < this.counterProducts; i++) {
            System.out.println(this.products[i]);
        }
    }
}
