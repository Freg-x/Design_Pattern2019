package ServiceModel.AbstractFactory;

public class WemStore implements EatingFactory {
	
	
     public Drink newDrink() {
                	 
		return new Water();
	}
     public Snacks newSnacks() {
    	 
 		return new Chocolate();
 	}
}
