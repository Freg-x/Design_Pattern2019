package FacilityFilter.FilterPattern;

import FacilityFilter.ObserverPattern.Listener.EventListener;

import java.util.ArrayList;
import java.util.List;


public class CriteriaAdult implements Criteria {

    /*  implement meetCriteria, select the visitors who are at the age between 12 and 70
     *@param List<EventListener> visitors
     *       the whole visitors
     *@return List<EventListener>
     *        the filtered visitors
     */
    public List<EventListener> meetCriteria(List<EventListener> visitors){
        List<EventListener> AdultsVisitor = new ArrayList<EventListener>();
        for(EventListener visitor:visitors)
        {
            if(visitor.getAge()<=70 && visitor.getAge()>=12){
                AdultsVisitor.add(visitor);
            }
        }
        return AdultsVisitor;
    }
}
