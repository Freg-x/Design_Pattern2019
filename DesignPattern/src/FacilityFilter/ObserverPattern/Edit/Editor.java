package FacilityFilter.ObserverPattern.Edit;

import FacilityFilter.ObserverPattern.Publisher.EventHandler;

public class Editor {
    public EventHandler events;

    public Editor(){
        this.events=new EventHandler("RollerCoster","Carrousel");
    }

    public void openRollerCoster(){
        events.notify("RollerCoster");
    }

    public void openCarrousel(){
        events.notify("Carrousel");
    }

}
