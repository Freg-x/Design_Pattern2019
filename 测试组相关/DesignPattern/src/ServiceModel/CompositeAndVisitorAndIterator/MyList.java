package ServiceModel.CompositeAndVisitorAndIterator;

import java.util.Iterator;

//自定义MyList列表集合,实现Iterator接口方法
public class MyList<T> implements List<T> {
//基于Object数组的列表集合

    Object[] objects = new Object[0];

    public void add(T t) {
        Object[] tmp = new Object[objects.length + 1];
        tmp[tmp.length - 1] = t;
        System.arraycopy(objects, 0, tmp, 0, objects.length);
        objects = tmp;
    }

    @Override
    public void remove(T t) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(t)) {
                if (i > 0) {
                    Object object[] = new Object[objects.length - 1];
                    System.arraycopy(objects, 0, object, 0, i);
                    System.arraycopy(objects, i + 1, object, i, objects.length - i - 1);
                    objects = object;
                    break;
                }
            }
        }

    }

    @Override
    public void removeAt(int index) {
        if (index >= 0) {
            Object object[] = new Object[objects.length - 1];
            System.arraycopy(objects, 0, object, 0, index);
            System.arraycopy(objects, index + 1, object, index, objects.length - index - 1);
            objects = object;
        }

    }

    @Override
    public int size() {
        return objects.length;
    }

    @Override
    public void clear() {
        this.objects = new Object[0];

    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void set(T e, int index) {
        objects[index] = e;

    }

    //覆写Iterator接口的方法
    @Override
    public Iterator<T> iterator() {
        Iterator<T> iterator = new Iterator<T>() {
            int index = 0;
            boolean hasNext = true;

            @Override
            public boolean hasNext() {
                if (index < objects.length) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public T next() {
                if (index++ < objects.length - 1) {
                    hasNext = true;
                    return (T) objects[index - 1];
                } else {
                    hasNext = false;
                    return (T) objects[objects.length - 1];
                }
            }

            @Override
            public void remove() {
                objects = new Object[0];
            }

        };
        return iterator;
    }

}


