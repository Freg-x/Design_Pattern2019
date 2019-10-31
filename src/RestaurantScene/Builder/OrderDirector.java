package Builder;
import Builder.Order;
import Builder.BuilderOrder;
public class OrderDirector {
    private BuilderOrder builder = new BuilderOrder();
    public Order createOderByDirector(int[] number){
        return builder.createOrder(number);
    }
}
