package FacilityFilter.FilterPattern;

import FacilityFilter.ObserverPattern.Listener.EventListener;
import java.util.ArrayList;
import java.util.List;

public class CriteriaRollerCoster implements Criteria {
    public List<EventListener> meetCriteria(List<EventListener> visitors){
        List<EventListener> RollerCosterAdaptVisitor = new ArrayList<EventListener>();
        for(EventListener visitor:visitors)
        {
            if(visitor.getAge()<=60){
                RollerCosterAdaptVisitor.add(visitor);
            }
        }
        return RollerCosterAdaptVisitor;
    }
}
