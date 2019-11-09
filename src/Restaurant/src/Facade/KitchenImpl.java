package Facade;

//厨房子系统实例
public class KitchenImpl implements Kitchen {

    @Override
    public void Cooking() {
        System.out.println(this.getClass() + " : " + "Cooking" + " : " + "Kitchen cooking");

    }

}
