package Facade;

//测试
public class Client {
	
		public static void main(final String[] args)
		{
			Restaurant restaurant=new Restaurant();
			restaurant.Order();
			restaurant.Cooking();
			restaurant.Serve();
		}

}
