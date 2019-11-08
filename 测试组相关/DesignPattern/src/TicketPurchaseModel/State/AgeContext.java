package TicketPurchaseModel.State;

//环境类：年龄环境
//定义了一个strategy指向pricestate，维护了一个价格状态，类里面包括构造函数、设置状态函数、获得当前状态函数和输入年龄函数
public class AgeContext {
    private PriceState priceState;

    //构造函数
    public AgeContext() {
        this.priceState = new NormalPriceState(this);
    }

    //设置价格状态
    public void setState(PriceState priceState) {
        this.priceState = priceState;
    }

    //获得价格状态
    public PriceState getState() {
        return priceState;
    }

    //输入年龄
    public void input(int age) {
        priceState.inputAge(age);
    }

}
