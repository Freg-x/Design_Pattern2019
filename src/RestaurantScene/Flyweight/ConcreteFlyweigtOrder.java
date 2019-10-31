package Flyweight;
import Flyweight.FlyweightOrder;
public class ConcreteFlyweigtOrder extends FlyweightOrder{
    private int[] oInf1 = {0,1,1,0,1,0};//pizza+dishes+drink
    private int[] oInf2 = {0,0,1,0,0,1};//drink+humberger
    private int[] oInf3 = {1,0,0,0,1,0};//rice+drink

    public int[] getOrderInf(int number){
        switch (number) {
            case 1:
                return oInf1;
            case 2:
                return oInf2;
            case 3:
                return oInf3;
        }
        return null;
    }
}
