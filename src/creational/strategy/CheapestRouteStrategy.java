package creational.strategy;

public class CheapestRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Building the cheapest route.");
    }
}
