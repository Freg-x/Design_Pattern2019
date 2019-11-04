package FacilityFilter.FilterPattern;

import FacilityFilter.ObserverPattern.Listener.EventListener;

import java.util.ArrayList;
import java.util.List;

public class CriteriaNormalHeight implements Criteria {
    /*  implement meetCriteria, select the visitors who are at the height of between 100 and 200
     *@param List<EventListener> visitors
     *       the whole visitors
     *@return List<EventListener>
     *        the filtered visitors
     */
    public List<EventListener> meetCriteria(List<EventListener> visitors){
        List<EventListener> NormalHeightVisitor = new ArrayList<EventListener>();
        for(EventListener visitor:visitors)
        {
            if(visitor.getHeight()<=200 && visitor.getHeight()>=100){
                NormalHeightVisitor.add(visitor);
            }
        }
        return NormalHeightVisitor;
    }
}
