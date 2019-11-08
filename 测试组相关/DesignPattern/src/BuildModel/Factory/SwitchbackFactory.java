package BuildModel.Factory;

public class SwitchbackFactory implements RidesFactory{
	
    public Rides AddRides()
    {
        System.out.println("Building a new Switchback!");/*新建过山车*/
        return new Switchback();
    }
}
