package TicketPurchaseModel.Bridge;

public class PurchaseByAlipay extends Pay{
	//用支付宝进行支付
	public void payment(int WechatBalance,int AlipayBalance,int Price) {
		AlipayBalance=AlipayBalance-Price;
		System.out.println("PurchaseByAlipay: payment(): Purchase by Alipay-----You choose to pay for the money by Alipay!");
		System.out.println("PurchaseByAlipay: payment(): Purchase by Alipay-----Buy the ticket successfully! ");
	}
}