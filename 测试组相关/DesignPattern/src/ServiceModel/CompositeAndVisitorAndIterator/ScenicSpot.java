package ServiceModel.CompositeAndVisitorAndIterator;


import java.util.Iterator;

//具体景点类（在主题区里的最小景点单元）
public class ScenicSpot extends Spots {

    //存储景点的评论
    private MyList<String> comments;

    public ScenicSpot(String name, boolean ifVisited, String id) {
        super(name, ifVisited, id);

        comments = new MyList<String>();
    }

    public MyList<String> getCommentslist() {
        return comments;
    }

    @Override
    //展示评论信息
    public void showComments() {
        System.out.println("ScenicSpot:showComments():"+getId() + getName() + " has the following comments: ");
        Iterator iterator = comments.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //展示景点信息
    public void showInfo() {
        System.out.println("ScenicSpot:showInfo():"+getId() + this.getName() + this.getIfVisited());
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
