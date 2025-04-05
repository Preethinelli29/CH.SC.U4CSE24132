class Product {
    private double price;

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }
}

public class Encapsulation3 {
    public static void main(String[] args) {
        Product p = new Product();
        p.setPrice(2000);

        System.out.println("Original Price: " + p.getPrice());
        System.out.println("Discounted Price (10%): " + p.getDiscountedPrice(10));
    }
}
