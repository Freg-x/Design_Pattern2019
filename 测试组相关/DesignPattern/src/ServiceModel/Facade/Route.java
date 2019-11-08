package ServiceModel.Facade;

//旅行套餐类TourPack中的属性路线类
//含有方法：构造第一种路线方案，构造第二种路线方案
public class Route{
	public Route() {
		;
	}
	//第一种路线方案
	void route1(){
		System.out.println("Route： route1(): The plan: Roll Coaster -> Lunch -> Aquarium.");
	}
	//第二种路线方案
	void route2() {
		System.out.println("Route： route2(): The plan: Ferris Wheel -> Lunch -> Aquarium.");
	}
}
