package mx.com.tests.ventas;

import mx.com.gm.ventas.Order;
import mx.com.gm.ventas.Product;

public class SalesTests {
    public static void main(String[] args) {
        Product product1 = new Product("camisa", 20.00);
        Product product2 = new Product("Pantalon", 30.00);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        order1.showOrder();

    }
}
