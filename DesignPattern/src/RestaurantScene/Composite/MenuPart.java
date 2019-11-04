package RestaurantScene.Composite;
import RestaurantScene.Composite.Menu;
import RestaurantScene.Factory.Food;

import java.util.ArrayList;
import java.util.List;

public class MenuPart {
    private String name;
    private List<Food> foods = new ArrayList<Food>();


    public MenuPart(String name){
        System.out.println("MenuPart "+name+" was created.");
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFoods(Food f){
        foods.add(f);
    }

    public void display(){
        System.out.println(this.getName());
        for (Food f :foods
        ) {
            f.display();
        }
    }
}
