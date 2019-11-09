package visitor;

import visitor.Visitor;

//抽象元素角色

public interface Ticket {
    //接受游客访问
    public void accept(Visitor visitor);


}
