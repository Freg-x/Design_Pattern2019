package RestaurantScene.Factory;
import RestaurantScene.Factory.Food;
public class SimpleFoodFactory {
    private Food food = new Food();

    public  SimpleFoodFactory(){
        System.out.println("A SimpleFoodFactory is created and it offers API createFood(String name,int price,String type) to create a food.");
        System.out.println("The food you create will be added in the menu.");
        System.out.println("Meanwhile,The Class SimpleFoodFactory also uses Singleton Pattern because it should be the only instance created by Class OrderDirector and it can be asked globally.");
    }
    public Food createFood(String name,int price,String type) {
        return food.createFood(name, price, type);
    }
}
