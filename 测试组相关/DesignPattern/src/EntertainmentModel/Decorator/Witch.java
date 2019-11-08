package EntertainmentModel.Decorator;

//具体装饰角色,例如女巫witch
//实现抽象装饰的相关方法，并给具体构件对象添加功能
public class Witch extends Changer
{
    //构造函数
    public Witch(Visitor m)
    {
        super(m);
    }
    //展示函数
    public void display()
    {
        super.display();
        setChanger();
    }
    //换装成为女巫
    public void setChanger()
    {
        System.out.println("Witch:setChanger():Dress up as a witch! ");
    }
}
