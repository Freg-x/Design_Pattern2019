package Builder;
import  Factory.Food;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Order {
    private int number; //number of order
    private int total_price;
    private Date time;

    public Food foods[];

    public Order(){
        System.out.println("An order has been created");
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
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        this.time= new Date();// 获取当前时间
        System.out.println(sdf.format(this.time)); // 输出已经格式化的现在时间（24小时制）
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public void display(){

    }

    public static void main(String[] args){
        Order order = new Order();
        order.setTime();
        System.out.println(order.getTime());
    }
}
