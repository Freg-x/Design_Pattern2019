package ServiceModel.CompositeAndVisitorAndIterator;

import java.util.Iterator;
//根据composite模式构建的结构初始化一份游乐园景点地图，并根据Visitor与Iterator模式提供操作地图的若干方法
public class Map {
    MyList<Spots> maplist;

    public Map() {
        maplist = new MyList<>();
        //地图景点初始化（可自由修改）
        //第一个主题区是梦想世界，有景点冰雪世界，林间世界
        System.out.println("The first theme district is  Dream World, which contains scenic spots: Frozen World and Forest World");
        ThemeDistrict dreamWorld = new ThemeDistrict("Dream World", false, "1.");
        dreamWorld.add(new ScenicSpot("Frozen World", false, "1.1 "));
        dreamWorld.add(new ScenicSpot("Forest World", false, "1.2 "));//主题区添加景点测试
        //dreamWorld.showInfo();//展示主题区信息
        maplist.add(dreamWorld);

        //第二个主题区未来世界，有景点星际贸易港，漫威英雄总部
        System.out.println("The second theme district is  Future World, which contains scenic spots: Star Trade Port and Marvel Hero Headquarters");
        ThemeDistrict futureWorld = new ThemeDistrict("Future World", false, "2.");
        ScenicSpot stp = new ScenicSpot("Star Trade Port", false, "2.1 ");
        futureWorld.add(stp);
        futureWorld.add(new ScenicSpot("Marvel Hero Headquarters", false, "2.2 "));
        //futureWorld.showInfo();//展示主题区信息
        maplist.add(futureWorld);

        //第三个主题区奇幻花园，暂时没有景点（还在建设中）
        System.out.println("The third theme district is MagicGarden, which doesn't have any scenic spot yet(Under Construction)! ");
        ThemeDistrict magicgarden = new ThemeDistrict("Magic Garden", false, "3.");
        //magicgarden.showInfo();//展示没有景点的主题区信息
        maplist.add(magicgarden);

        //第四个主题区冒险岛有次级主题区宝藏岛，还有景点飞跃地平线
        System.out.println("The forth theme district is  Advanture Island, which contains scenic spots: Flying Over The Horizen and secondary theme district:Treasure Bay");
        ThemeDistrict AdvantureIsland = new ThemeDistrict("Advanture Island", false, "4.");
        AdvantureIsland.add(new ScenicSpot("Flying Over The Horizen", false, "4.1 "));
        ThemeDistrict TreasureBay = new ThemeDistrict("Treasure Bay", false, "4.2 ");
        TreasureBay.add(new ScenicSpot("Pirates of the Caribbean", false, "4.2.1 "));

        AdvantureIsland.add(TreasureBay);
        maplist.add(AdvantureIsland);
    }

    //展示地图内所有景点信息
    public void showAllInfo() {
        Iterator iterator = maplist.iterator();
        while (iterator.hasNext()) {
            Spots spot = (Spots) iterator.next();
            spot.showInfo();
        }

    }

    //根据景点名称查找景点
    public Spots findSpot(String spotname) {
        Iterator iterator = maplist.iterator();
        while (iterator.hasNext()) {
            Spots spot = (Spots) iterator.next();
            if (spot instanceof ThemeDistrict) {
                if (spot.getName().equals(spotname)) {
                    return spot;
                } else if (((ThemeDistrict) spot).seekSpot(spotname) != null) {
                    return ((ThemeDistrict) spot).seekSpot(spotname);
                }
            }
            if (spot instanceof ScenicSpot) {
                if (spot.getName().equals(spotname)) {
                    return spot;
                }
            }
        }
        return null;
    }

    //根据景点名称获取景点信息
    public void getInfo(String spotname) {
        Spots spot = findSpot(spotname);
        if (spot == null) {
            System.out.println("Sorry,We don't have such spot yet!");
        } else {
            spot.showInfo();
        }
    }

    //根据景点名称获取景点评论
    public void getComment(String spotname) {
        Spots spot = findSpot(spotname);
        if (spot == null) {
            System.out.println("Sorry,We don't have such spot yet!");
        } else {
            spot.showComments();
        }
    }

    //打卡指定景点
    public void RecoedVisted(String spotname) {
        Spots spot = findSpot(spotname);
        if (spot == null) {
            System.out.println("Sorry,We don't have such spot yet!");
        } else {
            spot.accept(new RecordVisitor());
        }
    }

    //评论指定景点
    public void CommentOnSpot(String spotname) {
        Spots spot = findSpot(spotname);
        if (spot == null) {
            System.out.println("Sorry,We don't have such spot yet!");
        } else {
            spot.accept(new CommentVisitor());
        }
    }

}
