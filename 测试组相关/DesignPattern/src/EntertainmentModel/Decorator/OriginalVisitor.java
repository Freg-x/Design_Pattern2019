package EntertainmentModel.Decorator;

//具体构件类：新游客
public class OriginalVisitor implements Visitor
{
    //构造函数：创建具体构建角色
    public OriginalVisitor()
    {
        System.out.println("OriginalVisitor:OriginalVisitor():This a new visitor attending the Dress up parade! ");
    }
    //这里可以调用具体构件角色的方法
    public void display()
    {
        System.out.println("OriginalVisitor:display():The visitor attendS the dress up parade , ");
    }
}
