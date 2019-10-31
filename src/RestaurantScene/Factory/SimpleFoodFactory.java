package Factory;
import Factory.Food;
public class SimpleFoodFactory {
    private SimpleFoodFactory FoodFactory;

    public Food createFood(String name,int price,String type) {
        Food food = new Food();
        food.setName(name);
        food.setPrice(price);
        food.setType(type);
        return food;
    }
}
