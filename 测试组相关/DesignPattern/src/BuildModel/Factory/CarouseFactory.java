package BuildModel.Factory;

public class
CarouseFactory implements RidesFactory{
	
    public Rides AddRides()
    {
        System.out.println("Building a new Carouse!");//新建旋转木马
        return new Carouse();
    }
}
