package ServiceModel.AbstractFactory;

public class WsStore  implements EatingFactory {

	 public Drink newDrink() {
    	 
			return new Juice();
		}
	     public Snacks newSnacks() {
	    	 
	 		return new Icecream();
	 	}

}
