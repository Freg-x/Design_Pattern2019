package ServiceModel.CompositeAndVisitorAndIterator;

//用于景点打卡的Visitor类
public class RecordVisitor extends Visitor {
    @Override
    //对具体景点的打卡
    public void visit(ScenicSpot scenicspot) {
        scenicspot.setIfVisited(true);
        scenicspot.showInfo();
    }

    @Override
    //对主题园区的打卡
    public void visit(ThemeDistrict themeDistrict) {
        themeDistrict.setIfVisited(true);
        themeDistrict.showInfo();
    }
}
