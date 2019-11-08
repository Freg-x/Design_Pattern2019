package TicketPurchaseModel;

import TicketPurchaseModel.Bridge.BuyTicket;
import TicketPurchaseModel.Bridge.PurchaseByAlipay;
import TicketPurchaseModel.Bridge.PurchaseByWechat;
import TicketPurchaseModel.Proxy.OnlineProxy;
import TicketPurchaseModel.Proxy.TouristToBuy;
import TicketPurchaseModel.State.AgeContext;
import TicketPurchaseModel.strategy.OriginalPrice;
import TicketPurchaseModel.strategy.Seller;
import TicketPurchaseModel.Interpreter.Context;
//import org.junit.Test;


import java.util.Scanner;

//TicketPurchaseModel模块函数
public class TicketPurchaseTest {
    public void ModelTest() {
        BuyTicketOffLine();
        BuyTicketOnIternet();
        CheckIndentification();
    }

   // @Test
    //线下购票测试模板
    public void BuyTicketOffLine() {
        //
        AgeContext age = new AgeContext();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("TicketPurchaseTest:BuyTicketOffLine():Input your age to buy a ticket:(1~200),and input '0' to stop buying a ticket!  ");
            int ageOfVisitor = sc.nextInt();
            if (ageOfVisitor > 200 || ageOfVisitor < 0) {
                System.out.println("Incorrect Age!");
            } else if (ageOfVisitor == 0) {
                break;
            } else {
                age.input(ageOfVisitor);
            }

            System.out.println("We have extra discounts based on date ,Please tell me what day is today(Use number likes 1,2,...,7)");
            int weeknum = sc.nextInt();
            Seller seller = new Seller(new OriginalPrice());
            seller.sell(weeknum);


            System.out.println("Please choose your pattern of payment:(1-Wechat, 2-Alipay): ");
            int payment = sc.nextInt();
            if (payment == 1) {
                BuyTicket buyTicket = new BuyTicket(new PurchaseByWechat());
                buyTicket.purchase(100);
            } else if (payment == 2) {
                BuyTicket buyTicket = new BuyTicket(new PurchaseByAlipay());
                /* buyTicket.showAlipayBalance();*/
                buyTicket.purchase(100);
            } else System.out.println("Please input it again!");
        }

    }

    //网络代理处购票测试模板
    public void BuyTicketOnIternet() {
        TicketPurchaseModel.Proxy.BuyTicket tourist = new TouristToBuy("Xiao ming");
        TicketPurchaseModel.Proxy.BuyTicket proxy = new OnlineProxy(tourist);
        proxy.BuyAndPay();
    }

    //老人小孩身份验证测试模板
    public void CheckIndentification() {
        System.out.println("Check your Identification ,Please Input your identification (check Children or Olders).");
        Context amusementpark = new Context();
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        amusementpark.freeRide(s);
    }


}
