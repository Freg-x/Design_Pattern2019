package TicketPurchaseModel.State;

//具体状态类：老年票
//年龄在60岁以上的游客将能够购买老年票，票价为150。调用时检测年龄，如果年龄不在这一范围会改变当前状态
class OldPriceState extends PriceState {
    public OldPriceState(AgeContext a) {
        ageContext = a;
        stateName = "OlderTicket";
        TicketPrice = 150;
    }

    public OldPriceState(PriceState state) {
        ageContext = state.ageContext;
        stateName = "OlderTicket";
        age = state.age;
        TicketPrice = 150;
    }

    //改变票价
    public void changePrice() {
        if (age < 18) {
            ageContext.setState(new ChildrenPriceState(this));
        } else if (age <= 60) {
            ageContext.setState(new NormalPriceState(this));
        }
    }
}
