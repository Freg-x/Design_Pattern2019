package CommandandMemento.memento;

import CommandandMemento.RoomClass;

import java.util.*;

public class ReservationInformation {
    protected String customerName;
    protected int peopleNumber;
    protected Calendar checkInTime;
    protected Calendar departureTime;
    protected int roomNumber;
    public RoomClass roomType;
    public int totalPrice;
    public boolean empty;
    public void ReservationInformation(){
        customerName=null;
        peopleNumber=1;
        checkInTime=Calendar.getInstance();
        departureTime=Calendar.getInstance();
        departureTime.add(Calendar.DATE,1);
        roomNumber=101;
        roomType=RoomClass.SignatureSuites;
        totalPrice=1000;
        empty=false;
    }

    public void ReservationInformation(String name,int numberPeople,Calendar timeCheckIn,Calendar timeDeparture,int numberRoom,RoomClass typeRoom,int priceTotal,List<ReservationInformation>a){
        customerName=name;
        peopleNumber=numberPeople;
        checkInTime=timeCheckIn;
        checkInTime.add(Calendar.MONTH,-1);
        departureTime=timeDeparture;
        departureTime.add(Calendar.MONTH,-1);
        roomNumber=numberRoom;
        roomType=typeRoom;
        totalPrice=priceTotal;
        empty=false;
        a.add(this);
    }

    public void checkReservation(){
        System.out.println("customerName:"+ customerName);
        System.out.println("peopleNumber:"+ peopleNumber);
        System.out.println("checkInTime:"+ checkInTime.get(Calendar.YEAR)+"-"+(checkInTime.get(Calendar.MONTH)+1)+"-"+checkInTime.get(Calendar.DAY_OF_MONTH));
        System.out.println("departureTime:"+ departureTime.get(Calendar.YEAR)+"-"+(departureTime.get(Calendar.MONTH)+1)+"-"+departureTime.get(Calendar.DAY_OF_MONTH));
        System.out.println("roomNumber:"+ roomNumber);
        System.out.println("roomType:"+ roomType);
        System.out.println("totalPrice:"+ totalPrice);
        System.out.println("empty:"+empty);
    }

    public void modifyReservation(String name, int numberPeople, int beginYear, int beginMonth, int beginDay, int endYear, int endMonth, int endDay, int numberRoom, RoomClass typeRoom, int priceTotal,boolean isEmpty){
        Calendar beginTime=Calendar.getInstance();
        Calendar endTime=Calendar.getInstance();
        beginTime.set(beginYear,beginMonth-1,beginDay);
        endTime.set(endYear,endMonth-1,endDay);
        customerName=name;
        peopleNumber=numberPeople;
        checkInTime=beginTime;
        departureTime=endTime;
        roomNumber=numberRoom;
        roomType=typeRoom;
        totalPrice=priceTotal;
        empty=isEmpty;
    }
}
