package GateScene.decorator;

public class VipTicketPriceDecorator extends TicketPriceDecorator {
    public VipTicketPriceDecorator(TicketPrice price) {
        super(price);
    }

    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
