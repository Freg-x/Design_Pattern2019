package FacilityFilter;

import FacilityFilter.FilterPattern.*;

import FacilityFilter.ObserverPattern.Edit.Editor;
import FacilityFilter.ObserverPattern.Listener.CarrouselListener;
import FacilityFilter.ObserverPattern.Listener.EventListener;
import FacilityFilter.ObserverPattern.Listener.RollerCosterListener;

import java.util.ArrayList;
import java.util.List;

public class FicilityFilterTest {
    public static void main(String []args){
        Editor editor = new Editor();
        Criteria adultCri= new CriteriaAdult();
        Criteria normalHeightCri=new CriteriaNormalHeight();
        Criteria harderHeightCri=new CriteriaHarderHeight();
        Criteria RollerCoster = new RollerCosterCriteria(adultCri,harderHeightCri);
        Criteria Carrousel = new CarrouselCriteria(adultCri,normalHeightCri);
        List<EventListener> RollerPlayer=new ArrayList<>();
        List<EventListener> CarrouselPlayer=new ArrayList<>();

        RollerCosterListener R1=new RollerCosterListener("Jack",12,150);
        RollerCosterListener R2=new RollerCosterListener("Mike",66,160);
        RollerCosterListener R3=new RollerCosterListener("Kimmy",6,85);
        RollerCosterListener R4=new RollerCosterListener("Harvey",75,170);

        CarrouselListener R5=new CarrouselListener("Jack",12,150);
        CarrouselListener R6=new CarrouselListener("Mike",66,160);
        CarrouselListener R7=new CarrouselListener("Kimmy",6,85);
        CarrouselListener R8=new CarrouselListener("Harvey",75,170);

        //每个Listener订阅预约游乐设施
        editor.events.subscribe("RollerCoster",R1);
        RollerPlayer.add(R1);
        editor.events.subscribe("RollerCoster",R2);
        RollerPlayer.add(R2);
        editor.events.subscribe("RollerCoster",R3);
        RollerPlayer.add(R3);
        editor.events.subscribe("RollerCoster",R4);
        RollerPlayer.add(R4);
        editor.events.unsubscribe("RollerCoster",R1);//取消订阅一个
        RollerPlayer.remove(R1);
        editor.events.subscribe("Carrousel",R5);
        CarrouselPlayer.add(R5);
        editor.events.subscribe("Carrousel",R6);
        CarrouselPlayer.add(R6);
        editor.events.subscribe("Carrousel",R7);
        CarrouselPlayer.add(R7);
        editor.events.subscribe("Carrousel",R8);
        CarrouselPlayer.add(R8);

        //摩天轮和旋转木马分别开启，通知所有订阅者
        editor.openRollerCoster();
        editor.openCarrousel();

        //摩天轮筛选所有订阅者
        System.out.println("RollerCosterVisitors:");
        printVisitors(RollerCoster.meetCriteria(RollerPlayer));

        //旋转木马筛选所有订阅者
        System.out.println("CarrouselVisitors:");
        printVisitors(Carrousel.meetCriteria(CarrouselPlayer));
    }

    static void printVisitors(List<EventListener> visitors){

        for(EventListener visitor:visitors)
        {
            System.out.println("name:"+visitor.getName()+" age:"+visitor.getAge()+" height:"+visitor.getHeight());
        }
    }
}
