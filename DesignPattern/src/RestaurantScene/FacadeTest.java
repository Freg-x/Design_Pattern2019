package RestaurantScene;

import RestaurantScene.Facade.Restaurant;

public class FacadeTest {
	
	public static void main(final String[] args)
	{
		Restaurant restaurant=new Restaurant();
		restaurant.Order();
		restaurant.Cooking();
		restaurant.Serve();
	}

}
