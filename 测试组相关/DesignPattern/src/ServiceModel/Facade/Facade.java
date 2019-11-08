package ServiceModel.Facade;

public class Facade {
	public static void main(String[] args) {
		Visitors v = new Visitors();
		System.out.println("Facade: main(): Select TourPack one:");
		v.chooseTP(1);
		System.out.println("Facade: main(): Select TourPack two:");
		v.chooseTP(2);
	}
}

