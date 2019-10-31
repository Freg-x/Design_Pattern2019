package Builder;
import Builder.Order;
import Builder.IBuilderOrder;
public class BuilderOrder implements IBuilderOrder{
    private Order order;

    public BuilderOrder(){

    }

    @Override
    public Order createOrder(int[] number) {
        return this.order;
    }

    public void addRice(){

    }

    public void addPizza(){

    }

    public void addDrink(){

    }

    public void addNoodle(){

    }

    public void addDishes(){

    }

    public void addHumberger(){

    }

}
