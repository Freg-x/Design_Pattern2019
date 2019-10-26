package ObserverPattern.Listener;

public class CarrouselListener  extends EventListener{

    public  CarrouselListener(String name,int age,int height){
        this.name=name;
        this.age=age;
        this.height=height;
    }

    @Override
    public void update(String FacilityType) {
        System.out.println("person "+this.getName()+" age:"+this.getAge()+" height:"+this.getHeight()+" is comming to the Carrousel!");
    }
}
