package BuildModel.Singlon;

public class Casino {
	
    private static volatile Casino instance=null;     //保证instance在所有线程中同步
    //private避免类在外部被实例化
    private Casino()
    {
        System.out.println("Create A New Casino Amusement Park!");
    }
    public static synchronized Casino getInstance()
    {
        //在getInstance方法上加同步
        if(instance==null)
        {
               instance=new Casino();
        }
        else
        {
           System.out.println("Casino: getInstance(): There is already a Casino Amusement Park A and cannot create a new one! ");
        }
        return instance;
    }
    public void getName()
    {
        System.out.println("Casino: getName():Casino Amusement Park");
    }
}
