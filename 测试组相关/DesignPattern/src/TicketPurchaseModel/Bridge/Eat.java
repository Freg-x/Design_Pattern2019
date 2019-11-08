package TicketPurchaseModel.Bridge;

public class Eat extends Payment{
	public Eat(Pay pay) {
		super(pay);
	}
	//吃饭时进行购买
	public void purchase(int Price) {
		System.out.println("Eat: purchase(): pay for eating-----You have eaten your food, now, you need to pay for "+Price+" yuan!");
		super.purchase(Price);
	}
}
