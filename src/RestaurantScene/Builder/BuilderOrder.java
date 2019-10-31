package Builder;
import Builder.Order;
import Builder.IBuilderOrder;
import Factory.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BuilderOrder implements IBuilderOrder{
    private Order order = new Order();

    public BuilderOrder(){
        System.out.println("A BuilderOrder instance was created and only Director can ask it.");
    }

    @Override
    public Order createOrder(int[] number){
        int a = (int) Math.random();
        order.setNumber(a);
        order.setTime();
        addRice(number[0]);
        addPizza(number[1]);
        addDrink(number[2]);
        addNoodle(number[3]);
        addDishes(number[4]);
        addHumberger(number[5]);
        return this.order;
    }

    public void addRice(int number){
        Rice rice = new Rice();
        order.foods.add(rice);
    }

    public void addPizza(int number){
        Pizza pizza = new Pizza();
        order.foods.add(pizza);
    }

    public void addDrink(int number){
        Drink drink = new Drink();
        order.foods.add(drink);
    }

    public void addNoodle(int number){
        Noodle noodle = new Noodle();
        order.foods.add(noodle);
    }

    public void addDishes(int number){
        Dishes dishes = new Dishes();
        order.foods.add(dishes);
    }

    public void addHumberger(int number){
        Humberger humberger = new Humberger();
        order.foods.add(humberger);
    }

}
