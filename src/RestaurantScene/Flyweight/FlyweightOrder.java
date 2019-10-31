package Flyweight;

public class FlyweightOrder {
    private ConcreteFlyweigtOrder  concreteFlyweigtOrder = new ConcreteFlyweigtOrder();
    public int[] getOrderInf(int number){
        return concreteFlyweigtOrder.getOrderInf(number);
    }
}
