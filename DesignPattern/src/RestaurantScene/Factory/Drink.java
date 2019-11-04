package RestaurantScene.Factory;

public class Drink extends Food{
    private String name = "Drink";
    private int price = 5;
    private String type = "Drink";

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
