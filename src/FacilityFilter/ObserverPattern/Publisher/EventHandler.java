package ObserverPattern.Publisher;

import ObserverPattern.Listener.EventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventHandler {
    private Map<String,List<EventListener>> listeners = new HashMap<>();
    /* Constructor for EventHandler, create empty array list for each facility type
    *@param facilityTypes[]
    *       the array of facilityTypes
    *@return void
    */
    public EventHandler(String... facilityTypes)
    {
        for(String facilityType:facilityTypes)
        {
            this.listeners.put(facilityType,new ArrayList<>());
        }
    }

    /*  The function for event listeners to subscribe one of the facility,
     *  add the listener to the array list of the facility
     *@param FacilityType
     *       the explicit facility type
     *       listener
     *       the listener to subscribe
     * @return void
     */
    public void subscribe(String FacilityType,EventListener listener)
    {
        List<EventListener>users=listeners.get(FacilityType);
        users.add(listener);
    }

    /*  The function for event listeners to unsubscribe one of the facility,
     *  remove the listener to the array list of the facility
     *@param FacilityType
     *       the explicit facility type
     *       listener
     *       the listener to subscribe
     *@return void
     */
    public void unsubscribe(String FacilityType,EventListener listener)
    {
        List<EventListener>users=listeners.get(FacilityType);
        users.remove(listener);
    }

    /*  To notify every listener subscribed the facility while a facility changes
     *@param FacilityType
     *       the explicit facility type
     *@return void
     */
    public void notify(String FacilityType)
    {
        List<EventListener> users=listeners.get(FacilityType);
        for(EventListener listener:users)
        {
            listener.update(FacilityType);
        }
    }
}
