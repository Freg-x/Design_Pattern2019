package HotelScene.Memento;

import java.util.*;

public class Memento {
    public List<ReservationInformation> roomList=new ArrayList<ReservationInformation>();
    public void addRoomList(ReservationInformation a) {
       roomList.add(a);
    }
    public void showList(){
        System.out.println("\n\n------------Memento test------------");
        System.out.println("We will show all the key information in Memento(roomList)");
        for(ReservationInformation a:roomList){
            System.out.println("roomNumber:"+a.roomNumber+"   empty:"+a.empty);
        }
    }
}
