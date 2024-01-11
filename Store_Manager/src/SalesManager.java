import java.util.ArrayList;
import java.util.List;

public class SalesManager extends AbstractManager<Product>{
    private List<Product> cart;

    public SalesManager() {
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            cart.add(product);
        }
    }
    public  void createAndSaveBill() {
        if (!cart.isEmpty()) {
            double totalAmount = 0;
            for (Product product:
                 cart) {
                totalAmount += product.getPrice();
            }

            Bill bill = new Bill(cart, totalAmount);
        }
    }
}
