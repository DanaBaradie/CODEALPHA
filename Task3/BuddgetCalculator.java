package Task3;

public class BuddgetCalculator {
    public double calculateBudget(Path path) {
        double ForEveryDestination = 1000.0;
        return path.getDestinations().size()*ForEveryDestination;
    }
}