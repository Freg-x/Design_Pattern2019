package TicketPurchaseModel.Proxy;

public class OnlineProxy implements BuyTicket {
    private BuyTicket buyTicket = null;

    public OnlineProxy(BuyTicket _buyTicket) {
        System.out.println("OnlineProxy: OnlineProxy(): Buy ticket online constructor-----This is Internet Ticket  Proxy Office!");
        this.buyTicket = _buyTicket;
    }

    //购票
    public void BuyAndPay() {
        System.out.println("OnlineProxy: BuyAndPay(): Buy and pay for ticket-----This is the methods of internet ticket office proxy");
        this.buyTicket.BuyAndPay();
    }
}
