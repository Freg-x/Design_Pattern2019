package EntertainmentModel.Decorator;

//具体装饰角色,例如超人superman
//实现抽象装饰的相关方法，并给具体构件对象添加功能
public class Superman extends Changer
{
    //构造函数
    public Superman(Visitor m)
    {
        super(m);
    }
    //展示函数
    public void display()
    {
        super.display();
        setChanger();
    }
    //换装成为超人
    public void setChanger()
    {
        System.out.println("Superman:setChanger():Dress up as a superman");
    }
}
