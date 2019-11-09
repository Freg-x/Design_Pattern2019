package GateScene.decorator;

// Use coupon directly
public class CouponDecorator extends TicketPriceDecorator {
    private long minus;

    public CouponDecorator(TicketPrice price, long minus) {
        super(price);
        this.minus = minus;
    }

    public double getPrice() {
        if (super.getPrice() < minus) {
            return 0;
        } else {
            return super.getPrice() - minus;
        }
    }
}
