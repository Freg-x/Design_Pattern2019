package MaintenanceModel.Medium;

//具体工人类:发现者
//是抽象工人类的实现者，当需要与其他工人对象交互时，由中介者对象负责后续的交互。发现需要维修的问题，并且发布信息。
public class FixFinder extends Worker
{
    public FixFinder(String name)
    {
        this.name = name;
    }
    //发送维修信息，由中介者进行转发
    public void send(String ad)
    {
        System.out.println(name+" send message.");
        medium.relay(this, ad);
    }
    //接收信息
    void receive(String from,String ad)
    {
        System.out.println(name+" receive a message from "+from+" : "+ad);
    }

}
