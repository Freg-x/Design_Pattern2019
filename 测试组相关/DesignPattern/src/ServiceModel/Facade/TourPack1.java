package ServiceModel.Facade;

//第一种旅行套餐类
//含有方法：构造函数，输出旅行套餐信息
class TourPack1 extends TourPack{
	public TourPack1() {
		t = new Ticket();
		r = new Route();
	}
	//输出旅行套餐1的信息
	public void printTPInfo() {
		t.rollCoasterTicket();
		t.aquariumTicket();
		r.route1();
	}
}
