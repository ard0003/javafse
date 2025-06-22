import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " - " + productName + " - " + category;
    }
}

public class SearchExample {

    
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);
            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Chair", "Furniture"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Phone", "Electronics")
        };

        
        System.out.println("Linear Search Result:");
        Product result1 = linearSearch(products, "Chair");
        System.out.println(result1 != null ? result1 : "Product not found");

        
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        
        System.out.println("\nBinary Search Result:");
        Product result2 = binarySearch(products, "Chair");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
