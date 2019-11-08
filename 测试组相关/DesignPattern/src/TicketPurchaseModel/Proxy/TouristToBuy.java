package TicketPurchaseModel.Proxy;

import TicketPurchaseModel.TicketPurchaseTest;

public class TouristToBuy implements BuyTicket {
    private String name = " ";

    public TouristToBuy(String Name) {
        this.name = Name;
    }

    //购票
    public void BuyAndPay() {
        System.out.println("TouristToBuy: BuyAndPay():Buy and pay for ticket-----This is the methods of real ticket office,You want to buy a ticket," + this.name + "!");
        TicketPurchaseTest ticketPurchase = new TicketPurchaseTest();
        ticketPurchase.BuyTicketOffLine();
    }
}
