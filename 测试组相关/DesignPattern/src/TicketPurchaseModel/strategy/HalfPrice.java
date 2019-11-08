package TicketPurchaseModel.strategy;

public class HalfPrice implements SellStrategy{
	//采用半价的优惠策略进行售票
	public void sell() {
		System.out.println("HalfPrice: sell(): sell ticket with half price-----Today is our surprising day. You can get a half price based on your original price!!! please pay for it!");
	}
}
