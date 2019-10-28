package Facade;

//餐馆类
public class Restaurant {
	private FrontDesk frontdesk=new FrontDeskImpl();
	private Kitchen kitchen=new KitchenImpl();
	private Waiter waiter=new WaiterImpl();
	
	public void Order()
	{
		frontdesk.Order();
	}
	
	public void Cooking() {
		kitchen.Cooking();
	}
	
	public void Serve()
	{
		waiter.Serve();
	}

}
