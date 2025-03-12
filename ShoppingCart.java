public class ShoppingCart {
    static class Product {
        static double discount = 10.0; // Static variable shared across all products
        String productName;
        final int productID; // Final variable to ensure unique product ID
        double price;
        int quantity;

        // Constructor using 'this' to initialize attributes
        public Product(String productName, int productID, double price, int quantity) {
            this.productName = productName;
            this.productID = productID;
            this.price = price;
            this.quantity = quantity;
        }

        // Static method to update discount percentage
        public static void updateDiscount(double newDiscount) {
            discount = newDiscount;
            System.out.println("Discount updated to: " + discount + "%");
        }

        // Method to calculate final price after discount
        public double calculateFinalPrice() {
            return price * quantity * (1 - discount / 100);
        }

        // Method to display product details (uses instanceof for validation)
        public void displayProductInfo() {
            if (this instanceof Product) {
                System.out.println("Product Name: " + productName);
                System.out.println("Product ID: " + productID);
                System.out.println("Price per unit: ₹" + price);
                System.out.println("Quantity: " + quantity);
                System.out.println("Discount: " + discount + "%");
                System.out.println("Final Price: ₹" + calculateFinalPrice());
            } else {
                System.out.println("Invalid object.");
            }
        }
    }

    public static void main(String[] args) {
        // Creating product instances
        Product product1 = new Product("Laptop", 101, 80000, 2);
        Product product2 = new Product("Smartphone", 102, 30000, 1);
        Product product3 = new Product("Adapter", 103, 2500, 1);


        // Display product details
        product1.displayProductInfo();
        System.out.println();
        product2.displayProductInfo();

        System.out.println();
        // Update and display new discount
        Product.updateDiscount(15.0);

        System.out.println();
        // Display product details after discount update
        product1.displayProductInfo();
        System.out.println();
        product2.displayProductInfo();
    }
}
