package Factory;

public class Food {
    private String name;
    private int price;
    private String type;

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

