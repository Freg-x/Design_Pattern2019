package ObserverPattern.Listener;

public abstract class EventListener {
    public abstract void update(String FacilityType);
    protected String name;
    protected int age;
    protected int height;

    public EventListener(){};

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

}
