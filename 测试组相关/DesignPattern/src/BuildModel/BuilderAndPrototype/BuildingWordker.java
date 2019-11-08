package BuildModel.BuilderAndPrototype;

//建筑工人类，负责指挥具体的Builder类构建建筑，可以根据传入不同的Builder对象返回不同的建筑
 public class BuildingWordker{
    public Object Build(Builder builder)
    {
        builder.BuildFloor();
        builder.BuildWall();
        builder.BUildRoof();
        builder.BuildOther();
        return builder.GetBuild();
    }

}
