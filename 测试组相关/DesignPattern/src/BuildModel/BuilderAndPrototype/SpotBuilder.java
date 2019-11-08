package BuildModel.BuilderAndPrototype;

//娱乐景点建造者类，继承Builder类，实现建造者模式
public class SpotBuilder extends Builder {
    private Spot spot;
    public SpotBuilder(){
        spot=new Spot();
    }
    @Override
    public Spot GetBuild()
    {
        return spot;
    }
    @Override
    void BuildFloor() {
        spot.SetFloor("Spot Floor");
    }

    @Override
    void BuildWall() {
        spot.SetWall("Spot Wall");
    }

    @Override
    void BUildRoof() {
        spot.SetRoof("Spot Roof");
    }

    @Override
    void BuildOther() {
        spot.SetFacilities("Spot Facilities");
    }


}
