package RestaurantScene.Facade;

//服务员子系统实例
public class WaiterImpl implements Waiter{

	@Override
	public void Serve() {
		System.out.println(this.getClass() + " : " + "Serve" + " : " + "Waiter serve");	
	}

}
