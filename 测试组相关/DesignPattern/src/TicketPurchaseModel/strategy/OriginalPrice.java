package TicketPurchaseModel.strategy;

public class OriginalPrice implements SellStrategy{
	//按照原价进行售票
	public void sell() {
		System.out.println("OriginalPrice: sell(): sell ticket with original price-----The price of our ticket is original price, please pay for it!");
	}
}
