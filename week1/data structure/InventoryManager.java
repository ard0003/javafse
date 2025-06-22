import java.util.HashMap;
import java.util.Map;


class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName +
               ", Quantity: " + quantity + ", Price: " + price;
    }
}


public class InventoryManager{
    
    private Map<Integer, Product> inventory = new HashMap<>();

    
    public void addProduct(Product product) {
        inventory.put(product.productId, product);
        System.out.println("Product added successfully.");
    }

    
    public void updateProduct(int productId, String name, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product product = inventory.get(productId);
            product.productName = name;
            product.quantity = quantity;
            product.price = price;
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    
    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product product : inventory.values()) {
                System.out.println(product);
            }
        }
    }

    
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 75000);
        Product p2 = new Product(102, "Smartphone", 25, 25000);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.displayInventory();

        manager.updateProduct(101, "Laptop Pro", 8, 82000);
        manager.deleteProduct(102);

        manager.displayInventory();
    }
}
