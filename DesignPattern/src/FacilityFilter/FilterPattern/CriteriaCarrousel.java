package FacilityFilter.FilterPattern;

import FacilityFilter.ObserverPattern.Listener.EventListener;
import java.util.ArrayList;
import java.util.List;

public class CriteriaCarrousel implements Criteria {
    public List<EventListener> meetCriteria(List<EventListener> visitors){
        List<EventListener> CarrouselAdaptVisitor = new ArrayList<EventListener>();
        for(EventListener visitor:visitors)
        {
            if(visitor.getAge()<=70 && visitor.getHeight()>100){
                CarrouselAdaptVisitor.add(visitor);
            }
        }
        return CarrouselAdaptVisitor;
    }
}