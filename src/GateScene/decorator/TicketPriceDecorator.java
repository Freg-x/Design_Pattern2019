package GateScene.decorator;

/**
 * Decorator of ticket price, will make some change to the original price
 */
public abstract class TicketPriceDecorator implements TicketPrice {
    private TicketPrice price;

    public TicketPriceDecorator(TicketPrice price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price.getPrice();
    }
}
