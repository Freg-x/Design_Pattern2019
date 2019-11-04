package FacilityFilter.ObserverPattern.Listener;

public class RollerCosterListener extends EventListener {

    public  RollerCosterListener(String name,int age,int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }
    @Override
    public void update(String FacilityType) {
         System.out.println("******** Using the Observer Pattern ********");
         System.out.println("person "+this.getName()+" age:"+this.getAge()+" height:"+this.getHeight()+" is comming to the RollerCoster!");
    }
}
