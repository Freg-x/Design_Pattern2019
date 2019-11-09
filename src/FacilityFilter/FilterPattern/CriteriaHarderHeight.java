package FacilityFilter.FilterPattern;

import FacilityFilter.ObserverPattern.Listener.EventListener;

import java.util.ArrayList;
import java.util.List;

public class CriteriaHarderHeight implements Criteria {
    /**  implement meetCriteria, select the visitors who are at the height of between 120 and 180
     *@param visitors
     *       the whole visitors
     *@return List<EventListener>
     *        the filtered visitors
     */
    public List<EventListener> meetCriteria(List<EventListener> visitors) {
        List<EventListener> HardHeightVisitor = new ArrayList<EventListener>();
        for (EventListener visitor : visitors) {
            if (visitor.getHeight() <= 180 && visitor.getHeight() >= 120) {
                HardHeightVisitor.add(visitor);
            }
        }
        return HardHeightVisitor;
    }
}
