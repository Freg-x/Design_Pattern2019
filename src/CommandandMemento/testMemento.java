package CommandandMemento;

import CommandandMemento.RoomClass;
import CommandandMemento.memento.*;

import java.util.Calendar;

public class testMemento {
    public static void main(String[] args) {
        ReservationInformation a = new ReservationInformation();
        ReservationInformation b = new ReservationInformation();
        ReservationInformation f = new ReservationInformation();
        Memento c = new Memento();
        Calendar d = Calendar.getInstance();
        Calendar e = Calendar.getInstance();
        d.set(2008, 10, 1);
        e.set(2008, 10, 5);
        a.ReservationInformation("Tan", 5, d, e, 501, RoomClass.SignatureSuites, 1000, c.roomList);
        b.ReservationInformation("HE", 3, d, e, 204, RoomClass.ClubLevelRooms, 1050, c.roomList);
        a.modifyReservation("Lv", 3, 2019, 5, 5, 2019, 5, 7, 105, RoomClass.ClubLevelRooms, 10054, true);
        c.showList();
    }
}