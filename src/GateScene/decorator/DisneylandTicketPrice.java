package GateScene.decorator;

/**
 * Real implementation of ticket price
 */
public class DisneylandTicketPrice implements TicketPrice {
    private double originalPrice;

    public DisneylandTicketPrice() {
        this.originalPrice = 100;
    }

    public double getPrice() {
        return originalPrice;
    }
}
