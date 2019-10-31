package Flyweight;
import Flyweight.FlyweightOrder;
public class FlyweightOrderFactory {
    private FlyweightOrder flyweightOrder;

    public int[] getOrderInf(int number){
        return flyweightOrder.getOrderInf(number);
    }
}
