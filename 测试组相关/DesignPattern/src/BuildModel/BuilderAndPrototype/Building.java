package BuildModel.BuilderAndPrototype;

//建筑基类
public abstract class Building{
    private String Floor;
    private String Wall;
    private String Roof;
    public String GetFloor(){
        return this.Floor;
    }
    public String GetWall(){
        return this.Wall;
    }
    public String GetRoof(){
        return this.Roof;
    }
    public void  SetFloor(String floor){
        this.Floor=floor;
    }
    public void SetWall(String wall){
        this.Wall=wall;
    }
    public void SetRoof(String roof){
        this.Roof=roof;
    }
    //抽象方法，验收建筑
    public abstract String CheckBuilding();
}
