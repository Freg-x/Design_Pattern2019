package ServiceModel.CompositeAndVisitorAndIterator;

//景点抽象类，主题区与具体景点均继承该抽象类
public abstract class Spots implements Acceptor {
    private String name;//景点名称
    private String Id;//景点编号
    private boolean ifVisited;//游客是否游览过
    public abstract void showComments();//展示评论信息
    public Spots(String name, boolean ifVisited, String id) {
        this.name=name;
        this.ifVisited = ifVisited;
        this.Id=id;
    }
    public String getName() {
        return name;
    }//获取名称
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public boolean isIfVisited() {
        return ifVisited;
    }
    public void setIfVisited(boolean ifVisited) {
        this.ifVisited = ifVisited;
    }
    public String getIfVisited() {
        return (this.isIfVisited() ? " (Visited!) " : " (Unvisited!) ");
    }
    public void showInfo() {
        System.out.println(" ");
    }

}
