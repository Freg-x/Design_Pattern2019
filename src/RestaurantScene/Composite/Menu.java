package Composite;
import Composite.MenuPart;
import Factory.Pizza;
import Factory.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    private List<MenuPart> menuParts = new ArrayList<MenuPart>();
    private List<Food> foods = new ArrayList<Food>()
        {{
            add(new Rice());
            add(new Pizza());
            add(new Drink());
            add(new Noodle());
            add(new Dishes());
            add(new Humberger());
        }};
    private String[] mName = new String[]{"Rice", "Pizza","Drink","Noodle","Dishes","Humberger"};

    public Menu() {
        System.out.println("A Menu is created.");
        for(int i = 0;i<mName.length;i++) {
            menuParts.add(new MenuPart(mName[i]));
        }
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFood(Food f){
        foods.add(f);
        updateMenu();
    }

    public void updateMenu(){
        for (Food f:foods
        ) {
            for (MenuPart m:menuParts
            ) {
                if (f.getType() == m.getName()) m.addFoods(f);
            }
        }
    }
    public void display(){
        System.out .println("*** The folloing is the full menu. ***");
        for (MenuPart m :menuParts
             ) {
            m.display();
        }
    }
}
