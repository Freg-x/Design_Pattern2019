package TicketPurchaseModel.strategy;

public class Seller {
	private SellStrategy sellStrategy;

	public Seller(SellStrategy sellStrategy) {
		this.sellStrategy=sellStrategy;

	}
	//根据星期几来判断采用哪种销售策略
	public void sell(int weeknum) {

		if(weeknum>=1&&weeknum<=4) {
		this.sellStrategy=new OriginalPrice();

			this.sellStrategy.sell();
		}
		else if (weeknum==6||weeknum==7) {
			this.sellStrategy=new  FullReduction();
			this.sellStrategy.sell();
		}
		else if(weeknum==5) {
			this.sellStrategy=new  HalfPrice();
			this.sellStrategy.sell();
		}
		else System.out.println("Please print it again!");
	}
}
