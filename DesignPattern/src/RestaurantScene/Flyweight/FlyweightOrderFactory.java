package RestaurantScene.Flyweight;
import RestaurantScene.Flyweight.FlyweightOrder;
public class FlyweightOrderFactory {
    private FlyweightOrder flyweightOrder;

    public FlyweightOrderFactory(){
        System.out.println("A FlyweightOrderFactory is created and it offers API getOrderInf(int number) to get some information about a stable order. ");
        System.out.println("Meanwhile,The Class FlyweightOrderFactory uses Singleton Pattern because it should be the only instance created by Class FlyweightOrderFactory and it can be asked globally.");
    }
    public int[] getOrderInf(int number){
        return flyweightOrder.getOrderInf(number);
    }
}
