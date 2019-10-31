package Factory;

public class Humberger extends Food{
    private String name = "Humberger";
    private int price = 8;
    private String type = "Humberger";

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setType(String type){
        this.type=type;
    }
}
