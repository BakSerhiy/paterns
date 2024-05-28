package behavioral.visitor;

public class DiscountVisitor implements CartVisitor {
    @Override
    public void visit(Product product) {
        double price = product.getPrice();
        double discountedPrice = price * 0.90; // 10% discount
        System.out.println("Product: " + product.getName() + ", Price: " + discountedPrice);
    }
}