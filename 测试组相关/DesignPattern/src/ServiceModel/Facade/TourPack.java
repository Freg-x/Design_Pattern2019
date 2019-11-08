package ServiceModel.Facade;

//旅行套餐抽象类
//含有虚函数：输出旅行套餐信息
abstract class TourPack{
	protected Ticket t;
	protected Route r;
	//虚函数：输出旅行信息
	abstract public void printTPInfo();
}
