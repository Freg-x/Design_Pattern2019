package TicketPurchaseModel.Bridge;

public abstract class Payment {
	private Pay pay;
	private int WechatBalance=1000;
	private int AlipayBalance=1000;
	public Payment(Pay pay) {
		this.pay=pay;
	}
	//进行购买
	public void purchase(int Price) {
		this.pay.payment(WechatBalance,AlipayBalance,Price);
	}
	//展示微信余额
	public void showWechatBalance() {
		System.out.println("Payment: showWechatBalance():show Wechat balance-----Your Wechat balance is: "+WechatBalance);
	}
	//展示支付宝余额
	public void showAlipayBalance(){
		System.out.println("Payment: showAlipayBalance():show Alipay balance-----Your Alipay balance is: "+AlipayBalance);
	}
}
