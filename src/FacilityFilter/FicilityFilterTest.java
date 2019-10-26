import FilterPattern.Criteria;
import FilterPattern.CriteriaCarrousel;
import FilterPattern.CriteriaRollerCoster;
import ObserverPattern.Edit.Editor;
import ObserverPattern.Listener.CarrouselListener;
import ObserverPattern.Listener.EventListener;
import ObserverPattern.Listener.RollerCosterListener;

import java.util.ArrayList;
import java.util.List;

public class FicilityFilterTest {
    public static void main(String []args){
        Editor editor = new Editor();
        Criteria RollerCoster = new CriteriaRollerCoster();
        Criteria Carrousel = new CriteriaCarrousel();
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

        editor.events.subscribe("RollerCoster",R1);
        RollerPlayer.add(R1);
        editor.events.subscribe("RollerCoster",R2);
        RollerPlayer.add(R2);
        editor.events.subscribe("RollerCoster",R3);
        RollerPlayer.add(R3);
        editor.events.subscribe("RollerCoster",R4);
        RollerPlayer.add(R4);
        editor.events.unsubscribe("RollerCoster",R1);
        RollerPlayer.remove(R1);
        editor.events.subscribe("Carrousel",R5);
        CarrouselPlayer.add(R5);
        editor.events.subscribe("Carrousel",R6);
        CarrouselPlayer.add(R6);
        editor.events.subscribe("Carrousel",R7);
        CarrouselPlayer.add(R7);
        editor.events.subscribe("Carrousel",R8);
        CarrouselPlayer.add(R8);

        editor.openRollerCoster();
        System.out.println("");
        editor.openCarrousel();

        System.out.println("RollerCosterVisitors:");
        printVisitors(RollerCoster.meetCriteria(RollerPlayer));

        System.out.println("CarrouselVisitors:");
        printVisitors(Carrousel.meetCriteria(CarrouselPlayer));
    }

    static void printVisitors(List<EventListener> visitors){

        for(EventListener visitor:visitors)
        {
            System.out.println("name:"+visitor.getName()+" age:"+visitor.getAge()+" height:"+visitor.getHeight());
        }
        System.out.println("");
    }
}
