package Factory;

public class Pizza {
    private String name = "Pizza";
    private int price = 20;
    private String type = "Pizza";

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
