package TicketPurchaseModel.State;

//具体状态类：儿童票
//年龄在18岁以下的孩子将能够购买儿童票，票价为100。调用时检测年龄，如果年龄不在这一范围会改变当前状态
class ChildrenPriceState extends PriceState {
    public ChildrenPriceState(AgeContext a) {
        ageContext = a;
        stateName = "ChildrenTicket";
        TicketPrice = 100;
    }

    public ChildrenPriceState(PriceState state) {
        ageContext = state.ageContext;
        stateName = "ChildrenTicket";
        age = state.age;
        TicketPrice = 100;
    }

    //改变票价状态
    public void changePrice() {
        if (age > 60) {
            ageContext.setState(new OldPriceState(this));
        } else if (age >= 18) {
            ageContext.setState(new NormalPriceState(this));
        }
    }
}
