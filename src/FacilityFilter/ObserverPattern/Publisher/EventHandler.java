package ObserverPattern.Publisher;

import ObserverPattern.Listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventHandler {
    private Map<String,List<EventListener>> listeners = new HashMap<>();

    public EventHandler(String... facilitys)
    {
        for(String facility:facilitys)
        {
            this.listeners.put(facility,new ArrayList<>());
        }
    }

    public void subscribe(String FacilityType,EventListener listener)
    {
        List<EventListener>users=listeners.get(FacilityType);
        users.add(listener);
    }

    public void unsubscribe(String FacilityType,EventListener listener)
    {
        List<EventListener>users=listeners.get(FacilityType);
        users.remove(listener);
    }

    public void notify(String FacilityType)
    {
        List<EventListener> users=listeners.get(FacilityType);
        for(EventListener listener:users)
        {
            listener.update(FacilityType);
        }
    }
}
