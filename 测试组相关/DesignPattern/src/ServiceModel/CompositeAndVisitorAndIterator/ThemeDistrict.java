package ServiceModel.CompositeAndVisitorAndIterator;

import java.util.Iterator;

//主题区类（一个主题区里可以有多个具体景点，也可包含次级主题区）
public class ThemeDistrict extends Spots {

    private MyList<Spots> themedistrict;

    public ThemeDistrict(String name, boolean ifVisited, String id) {
        super(name, ifVisited, id);
        themedistrict = new MyList<Spots>();
    }

    public MyList<Spots> getthemedistrict() {
        return themedistrict;
    }

    @Override
    //展示评论信息
    public void showComments() {
        Iterator iterator = themedistrict.iterator();

        System.out.println("ThemeDistrict:showComments():" + getId() + "ThemeDistrict: " + getName() + " has the following scenic spots and their comments: ");

        while (iterator.hasNext()) {
            Spots spot = (Spots) iterator.next();
            spot.showComments();
        }
    }

    //设置游客是否游览过
    public void setIfVisited(boolean ifVisited) {
        Iterator iterator = themedistrict.iterator();
        while (iterator.hasNext()) {
            Spots s = (Spots) iterator.next();
            s.setIfVisited(true);
        }
    }

    public Spots add(Spots spot) {
        themedistrict.add(spot);
        return this;
    }

    //展示景点信息
    public void showInfo() {
        Iterator iterator = themedistrict.iterator();
        if (iterator.hasNext() == false) {
            System.out.println("ThemeDistrict:showInfo():" + getId() + "ThemeDistrict: We are sorry to inform you that " + getName() + " has not any  spot yet! ");
        } else {
            System.out.println("ThemeDistrict:showInfo():" + getId() + "ThemeDistrict: " + getName() + " has the following  spots: ");
        }

        while (iterator.hasNext()) {
            Spots spot = (Spots) iterator.next();
            spot.showInfo();
        }
    }

    //查找主题区内指定景点
    public Spots seekSpot(String spotname) {
        Iterator iterator = themedistrict.iterator();

        while (iterator.hasNext()) {
            Spots spot = (Spots) iterator.next();
            if (spot.getName().equals(spotname)) {
                return spot;
            } else if (spot instanceof ThemeDistrict) {
                seekSpot(spotname);
            }

        }
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
