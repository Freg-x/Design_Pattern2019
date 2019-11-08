package TicketPurchaseModel.strategy;

public class FullReduction implements SellStrategy{
	//使用满减的优惠策略进行销售
	public void sell() {
		System.out.println("FullReduction: sell(): sell ticket with reduction-----Today is weekend. You can  get a 20 yuan reduction!!! please pay for it!");
	}
}
