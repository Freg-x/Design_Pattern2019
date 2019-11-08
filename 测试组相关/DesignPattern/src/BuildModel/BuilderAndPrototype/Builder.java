package BuildModel.BuilderAndPrototype;

public abstract class Builder{//抽象的建造者类
    abstract void BuildFloor();
    abstract void BuildWall();
    abstract void BUildRoof();
    abstract void BuildOther();
    abstract Object GetBuild();
}
