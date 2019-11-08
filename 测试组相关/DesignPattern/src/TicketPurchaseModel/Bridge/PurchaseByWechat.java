package TicketPurchaseModel.Bridge;

public class PurchaseByWechat extends Pay{
	//用微信进行支付
	public void payment(int WechatBalance,int AlipayBalance,int price) {
		WechatBalance=WechatBalance-price;
		System.out.println("PurchaseByWechat: payment(): Purchase by Wechat-----You choose to pay for the money by Wechat!");
		System.out.println("PurchaseByWechat: payment(): Purchase by Wechat-----Buy the ticket successfully!");
	}
}
