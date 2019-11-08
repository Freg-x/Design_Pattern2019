package BuildModel.BuilderAndPrototype;

//景点建筑
public class Spot extends Building implements Cloneable{

    //景点内的设施
    private String Facilities;
    public void SetFacilities(String facilities)
    {
        this.Facilities=facilities;
    }
    public String GetFacilities(){
        return this.Facilities;
    }
    //重写验收方法
    @Override
    public String CheckBuilding() {
        return "Spot:CheckBuilding():"+this.GetFloor()+"\n"+this.GetWall()+"\n"+this.GetRoof()
                +"\n"+this.Facilities+"\n"+"Entertainment attractions have been accepted\n";
    }
    //实现clone方法以完成原型模式
    public Spot clone(){
        try{
            Spot spot1=(Spot) super.clone();
            return spot1;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
