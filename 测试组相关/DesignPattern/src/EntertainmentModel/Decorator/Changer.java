package EntertainmentModel.Decorator;

//抽象装饰角色：changer
//继承抽象构件，包括具体构件的实例，可以通过其子类扩展具体构件的功能。
public class Changer implements Visitor
{
    private Visitor visitor;//具体构件的实例
    //换装成为某角色
    public Changer(Visitor visitor)
    {
        this.visitor=visitor;
    }
    //展示当前装扮
    public void display()
    {
        visitor.display();
    }
}
