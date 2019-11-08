package MaintenanceModel.Medium;

//抽象类:工人
//定义工人类的接口，保存中介者对象，提供工人对象交互的抽象方法，实现所有相互影响的工人类的公共功能。
public abstract class Worker
{
    protected Medium medium;//中介者对象
    protected String name;//工人姓名
    //初始化中介者
    void setMedium(Medium medium)
    {
        this.medium=medium;
    }
    //发送信息
    public abstract void send(String ad);
    //接收信息
    abstract void receive(String from,String ad);
}
