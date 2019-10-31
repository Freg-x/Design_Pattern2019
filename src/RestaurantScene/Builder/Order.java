package Builder;
import  Factory.Food;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int number; //number of order
    private int total_price;
    private Date time;
    public List<Food> foods = new ArrayList<Food>();

    public Order(){

    }

    public int getNumber() {
        return number;
    }

    public int  getTotal_price(){
        return total_price;
    }

    public Date getTime() {
        return time;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTime(){
        this.time= new Date();// 获取当前时间
    }

    public void setTotal_price() {
        for (Food f:foods
        ) {
            total_price+=f.getPrice();
        }
    }

    public void display(){
        System.out.println("Following Shows The Information of Current Order");
        System.out.println("Order number:"+number);
        System.out.println(time); // 输出已经格式化的现在时间（24小时制）
        for (Food f:foods
        ) {
            System.out.println(f.getName()+"………………"+f.getPrice()+"yuan");
        }
    }

//    public static void main(String[] args){
//        Order order = new Order();
//        order.setTime();
//        System.out.println(order.getTime());
//    }
}
