package BuildModel.BuilderAndPrototype;

//宿舍建造者类，继承Builder类，实现建造者模式
public class DormBuilder extends Builder {
    private Dorm dorm;
    public DormBuilder(){
        dorm=new Dorm();
    }
   @Override
   public Dorm GetBuild()
   {
       return dorm;
   }
    @Override
    void BuildFloor() {
        dorm.SetFloor("Dormitory floor");
    }

    @Override
    void BuildWall() {
        dorm.SetWall("Dormitory wall");
    }

    @Override
    void BUildRoof() {
        dorm.SetRoof("Dormitory roof");
    }

    @Override
    void BuildOther() {
        dorm.SetFurniture("Dormitory furniture");
    }


}
