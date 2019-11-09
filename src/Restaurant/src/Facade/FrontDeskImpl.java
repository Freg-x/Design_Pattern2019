package Facade;

//前台子系统实例
public class FrontDeskImpl implements FrontDesk {

    @Override
    public void Order() {
        System.out.println(this.getClass() + " : " + "Order" + " : " + "Customer order");

    }

}
