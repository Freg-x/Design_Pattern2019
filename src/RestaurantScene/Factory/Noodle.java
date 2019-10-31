package Factory;

public class Noodle {
    private String name = "Noodle";
    private int price = 15;
    private String type = "Noodle";

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
