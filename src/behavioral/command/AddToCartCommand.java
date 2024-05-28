package behavioral.command;

public class AddToCartCommand implements Command {
    private String product;

    public AddToCartCommand(String product) {
        this.product = product;
    }

    @Override
    public void execute() {
        System.out.println("Added " + product + " to cart.");
    }
}