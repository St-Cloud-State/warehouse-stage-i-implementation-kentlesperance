import java.util.ArrayList;
import java.util.List;

public class ProductListTests {
    private static Product product1;
    private static Product product2;
    private static Product product3;
    private static ProductList productList;
    
    public static void main(String[] args) {
        setUp();
        testAddingProductsToProductList();
        testFindingProduct();
        testGetProductsReturnsACopy();
    }

    private static void setUp() {
        product1 = new Product("Laptop", 999.99, 2);
        product2 = new Product("Keyboard", 49.99, 20);
        product3 = new Product("Mouse", 29.99, 10);
        productList = new ProductList();
    }

    private static void testAddingProductsToProductList() {
        System.out.println("--- Test adding products to the Product List ---");
        System.out.println("Product Count: " + productList.getProducts().size());
        
        System.out.println("--- Add Products ---");
        productList.addProduct(product1);
        productList.addProduct(product2);
        productList.addProduct(product3);

        System.out.println("Product Count: " + productList.getProducts().size());

        for (Product product : productList.getProducts()) {
            System.out.println("Product: " + product.name() + ", ID: " + product.id());
        }
    }

    private static void testFindingProduct() {
        System.out.println("--- Test finding products from the Product List ---");
        List<String> ids = new ArrayList<String>();
        ids.add(product1.id());
        ids.add(product2.id());
        ids.add("1");

        for (String id : ids) {
            Product foundProduct = productList.findProduct(id);
            if(foundProduct != null) {
                System.out.println("ID matches this product: " + foundProduct.name() + ", Price: $" + foundProduct.price());
            } else {
                System.out.println("Product missing.");
            }
        }    
    }

    private static void testGetProductsReturnsACopy()
    {
        System.out.println("--- Test getProducts Method Returns a copy of the Product List ---");
        List<Product> products = productList.getProducts();
        products.remove(0);
        System.out.println("-- Remove one product from list returned by method --");
        System.out.println("Number of products in copy: " + products.size());
        System.out.println("Number of products in original: " + productList.getProducts().size());
    }
}
