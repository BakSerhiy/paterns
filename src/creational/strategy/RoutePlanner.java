package creational.strategy;

public class RoutePlanner {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void planRoute() {
        strategy.buildRoute();
    }
}