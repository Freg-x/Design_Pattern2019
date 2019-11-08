package TicketPurchaseModel.Bridge;

public class BuyTicket extends Payment{
	public BuyTicket(Pay pay) {
		super(pay);
	}
	//购票时需要进行付款
	public void purchase(int Price) {
		System.out.println("BuyTicket:purchase():pay for ticket-----You have selected a ticket, now, you need to pay for it!");
		super.purchase(Price);
	}
}
