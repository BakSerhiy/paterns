package creational.strategy;

public class FastestRouteStrategy implements RouteStrategy {
    @Override
    public void buildRoute() {
        System.out.println("Building the fastest route.");
    }
}