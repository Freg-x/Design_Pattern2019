package MaintenanceModel.Medium;

//具体工人类:维修者
//是抽象工人类的实现者，当需要与其他工人对象交互时，由中介者对象负责后续的交互。接收维修的问题并且去维修。
public class FixWorker extends Worker
{
    public FixWorker(String name)
    {
        this.name = name;
    }
    //发送信息ad，由中介者实现转发
    public void send(String ad)
    {
        System.out.println(name+" send message.");
        medium.relay(this, ad);
    }
    //接收信息，能识别接收到来自谁的信息
    void receive(String from,String ad)
    {
        System.out.println(name+" receive a message from "+from+" : "+ad);
    }

}
