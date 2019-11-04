package FacilityFilter.FilterPattern;

import FacilityFilter.ObserverPattern.Listener.EventListener;

import java.util.List;

public class RollerCosterCriteria implements Criteria {
    private Criteria cri1,cri2;
    public RollerCosterCriteria(Criteria cri1, Criteria cri2){
        this.cri1=cri1;
        this.cri2=cri2;
    }

    /**  implement meetCriteria, combining the two simple criteria as a complex criteria,
     * firstly call the first criteria and call the second criteria.
     *@param  visitors
     *       the whole visitors
     *@return List<EventListener>
     *        the filtered visitors
     */
    public List<EventListener> meetCriteria(List<EventListener> visitors){
        List<EventListener> FirstAdaptVisitor = cri1.meetCriteria(visitors);
        System.out.println("******** Using the Observer Pattern ********");
        return cri2.meetCriteria(FirstAdaptVisitor);
    }
}
