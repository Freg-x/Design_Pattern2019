package ServiceModel.Facade;

//游客类
//含有方法：选择旅行套餐
public class Visitors{
	public Visitors() {
		;
	}
	//选择旅行套餐
	public void chooseTP(int n) {
		if(n == 1) {
			TourPack1 tp = new TourPack1();
			tp.printTPInfo();
		}
		if(n == 2) {
			TourPack2 tp = new TourPack2();
			tp.printTPInfo();
		}
	}
}
