package BuildModel.BuilderAndPrototype;

//员工宿舍
public class Dorm extends Building implements Cloneable{

    //宿舍家具
    private String Furniture;
    public void SetFurniture(String furniture)
    {
        this.Furniture=furniture;
    }
    public String GetFurniture(){
        return this.Furniture;
    }
    //重写验收方法
    @Override
    public String CheckBuilding() {
        return "Dorm:CheckBuilding():"+this.GetFloor()+"\n"+this.GetWall()+"\n"+this.GetRoof()
                +"\n"+this.Furniture+"\n"+"Employee dormitory acceptance completed!\n";
    }
    //实现clone方法以完成原型模式
    public Dorm clone(){
        try{
            Dorm dorm1=(Dorm)super.clone();
            return dorm1;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
