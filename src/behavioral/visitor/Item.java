package behavioral.visitor;

public interface Item {
    void accept(CartVisitor visitor);
}