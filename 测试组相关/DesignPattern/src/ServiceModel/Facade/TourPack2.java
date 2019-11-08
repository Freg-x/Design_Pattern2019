package ServiceModel.Facade;

//第二种旅行套餐类
//含有方法：构造函数，输出旅行套餐信息
public class TourPack2 extends TourPack{
	public TourPack2() {
		t = new Ticket();
		r = new Route();
	}
	//输出旅行套餐2的信息
	public void printTPInfo() {
		t.ferrisWheelTicket();
		t.aquariumTicket();
		r.route2();
	}
}
