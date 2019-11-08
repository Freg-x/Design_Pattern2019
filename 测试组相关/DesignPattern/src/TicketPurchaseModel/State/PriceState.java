package TicketPurchaseModel.State;

//作者：zxy
//抽象状态角色：价格状态
//封装了输入年龄函数和改变价格函数。具体状态类继承这个类实现不同的改变价格函数。
abstract class PriceState {
    protected AgeContext ageContext;
    protected String stateName;
    protected int TicketPrice;
    protected int age;

    //改变价格（0~18）（18~60）（60, ）
    public abstract void changePrice();

    //输入年龄
    public void inputAge(int visitorAge) {
        age = visitorAge;
        System.out.println("PriceState:inputAge():Your age is " + age);
        changePrice();
        System.out.println("PriceState:inputAge():Your ticket is a " + ageContext.getState().stateName + " And The Price is " + ageContext.getState().TicketPrice);
    }

}
