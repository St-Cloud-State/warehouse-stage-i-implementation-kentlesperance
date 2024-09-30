public class ProductTests {
    private static Product product1;
    private static Product product2;
    private static Product product3;

    public static void main(String[] args) {
        setUp();
        testIdIncrementation();
        testGettingProductInformation();
        testChangingStockLevel();
    }

    private static void setUp() {
        product1 = new Product("Laptop", 999.99, 2);
        product2 = new Product("Keyboard", 49.99, 20);
        product3 = new Product("Mouse", 29.99, 10);
    }

    private static void testIdIncrementation() {
        System.out.println("Product 1 ID: " + product1.id());
        System.out.println("Product 2 ID: " + product2.id());
        System.out.println("Product 3 ID: " + product3.id());
    }

    private static void testGettingProductInformation() {
        System.out.println("Product ID: " + product1.id());
        System.out.println("Product Name: " + product1.name());
        System.out.println("Product Price: $" + product1.price());
        System.out.println("Amount in Stock: " + product1.stockLevel());
    }

    private static void testChangingStockLevel() {
        System.out.println("Initial Amount in Stock: " + product1.stockLevel());
        product1.setStockLevel(product1.stockLevel()-1);
        System.out.println("New Amount in Stock: " + product1.stockLevel());
    }
}
