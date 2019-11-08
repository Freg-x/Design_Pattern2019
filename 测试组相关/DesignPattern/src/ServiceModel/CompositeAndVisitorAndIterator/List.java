package ServiceModel.CompositeAndVisitorAndIterator;
//List接口类
//MyList实现该接口类
public interface List<T> extends Iterable<T>{

    void add(T e);
    void remove(T t);
    void removeAt(int index);
    int size();
    void clear();
    int indexOf(Object object);
    void set(T e,int index);
}

