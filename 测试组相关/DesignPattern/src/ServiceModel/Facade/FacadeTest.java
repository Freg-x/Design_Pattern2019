package ServiceModel.Facade;

/**
 * @author zhangyc
 * @date 2019/11/9 20:41
 */

public class FacadeTest {
    public static void main(String[] args) {
        System.out.println("-----------FacadeTest start-------------");

        //实例化
        Visitors visitors = new Visitors();
        //测试1
        System.out.println("Facade: main(): Select TourPack one:");
        visitors.chooseTP(1);
        //测试2
        System.out.println("Facade: main(): Select TourPack two:");
        visitors.chooseTP(2);
    }
}
