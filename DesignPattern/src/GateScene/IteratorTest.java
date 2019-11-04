package GateScene;

import GateScene.decorator.CouponDecorator;
import GateScene.decorator.DisneylandTicketPrice;
import GateScene.decorator.TicketPrice;
import GateScene.decorator.VipTicketPriceDecorator;

public class IteratorTest {
    public static void main(String[] args) {
        System.out.println("This is the scene of Design Pattern `Decorator`");
        System.out.println("You can use different decorator to modify the ticket price");
        TicketPrice p = new DisneylandTicketPrice();
        System.out.println("You have create a ticket price object");
        System.out.println("The original price of the ticket is $"+p.getPrice());
        p = new VipTicketPriceDecorator(p);
        System.out.println("After use vip decorator, the price is $"+p.getPrice());
        p = new CouponDecorator(p,5);
        System.out.println("After use coupon decorator to get $5 coupon, the price is $"+p.getPrice());
    }
}
