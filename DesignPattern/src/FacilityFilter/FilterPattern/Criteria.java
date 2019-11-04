package FacilityFilter.FilterPattern;

import FacilityFilter.ObserverPattern.Listener.EventListener;
import java.util.List;

public interface Criteria {
     List<EventListener> meetCriteria(List<EventListener> visitors);
}
