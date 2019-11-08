package ServiceModel.Facade;

//旅行套餐类TourPack中的属性门票类
//含有方法：购买过山车门票，购买水族馆门票，购买摩天轮门票
public class Ticket{
	public Ticket() {
		;
	}
	//购买过山车门票
	void rollCoasterTicket() {
		System.out.println("Ticket: rollCoasterTicket(): Buy a Roll Coaster ticket.");
	}
	//购买水族馆门票
	void aquariumTicket() {
		System.out.println("Ticket: aquariumTicket(): Buy a aquarium ticket.");
	}
	//购买摩天轮门票
	void ferrisWheelTicket() {
		System.out.println("Ticket: ferrisWheelTicket(): Buy a Ferris Wheel ticket");
	}
}
