package TicketPurchaseModel.State;

//具体状态类：成人票
//年龄在18岁到60岁之间的游客将能够购买成人票，票价为200。调用时检测年龄，如果年龄不在这一范围会改变当前状态
class NormalPriceState extends PriceState {
    public NormalPriceState(AgeContext a) {
        ageContext = a;
        stateName = "NormalTicket";
        TicketPrice = 200;
    }

    public NormalPriceState(PriceState state) {
        ageContext = state.ageContext;
        stateName = "NormalTicket";
        age = state.age;
        TicketPrice = 200;
    }

    //改变票价
    public void changePrice() {
        if (age > 60) {
            ageContext.setState(new OldPriceState(this));
        } else if (age < 18) {
            ageContext.setState(new ChildrenPriceState(this));
        }
    }
}
