package RestaurantScene.Builder;
import RestaurantScene.Builder.Order;
import RestaurantScene.Builder.BuilderOrder;

import java.util.List;

public class OrderDirector {
    private BuilderOrder builder = new BuilderOrder();

    public OrderDirector(){
        System.out.println("A Director is created and it offers API createOderByDirector(int[] number) to create an order.");
        System.out.println("Meanwhile,The Class Director uses Singleton Pattern because it should be the only instance created by Class OrderDirector and it can be asked globally.");
    }
    public Order createOderByDirector(int[] number){
        System.out.println("createOderByDirector() was asked and it would ask API createOrder() provided by a instance of BuildeOder");
        return builder.createOrder(number);
    }
}
