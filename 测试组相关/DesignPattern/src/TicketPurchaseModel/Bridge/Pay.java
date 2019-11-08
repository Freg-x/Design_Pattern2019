package TicketPurchaseModel.Bridge;

public abstract class Pay {
	public int WechatBalance;//微信余额
	public int AlipayBalance;//支付宝余额
	public int Price;//价格，所需支付金额
	//进行付款
	public abstract void payment(int WechatBalance,int AlipayBalance,int Price);
}
