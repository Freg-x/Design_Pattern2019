package HotelScene;

import HotelScene.Command.*;
public class CommandTest {
	public static void main(String[] args) {
        CheckClubLevelRooms room1=new CheckClubLevelRooms();
        CheckDeluxeRooms room2=new CheckDeluxeRooms();
        CheckJuniorSuites room3=new CheckJuniorSuites();
        CheckSignatureSuites room4=new CheckSignatureSuites();
        Invoker test=new Invoker();
        test.addCheck(room4);
        test.addCheck(room3);
        test.addCheck(room2);
        test.addCheck(room1);
        test.launchCheck();
    }

}
