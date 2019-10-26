package FilterPattern;

import ObserverPattern.Listener.EventListener;
import java.util.List;

public abstract class Criteria {
    public abstract List<EventListener> meetCriteria(List<EventListener> visitors);
}
