package ServiceModel.CompositeAndVisitorAndIterator;

//接口类：Acceptor
//提供用于接受Visitor对象的抽象方法
public interface  Acceptor {
    public abstract void accept(Visitor visitor);
}
