package RestaurantScene.Factory;

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

    public void display(){
        System.out.println(getName()+"   "+getPrice()+"yuan");
    }

    public Food createFood(String name,int price,String type){
        Food food = new Food();
        food.setName(name);
        food.setPrice(price);
        food.setType(type);
        return  food;
    }
}

