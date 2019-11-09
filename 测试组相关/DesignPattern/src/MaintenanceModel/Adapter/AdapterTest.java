package MaintenanceModel.Adapter;

import java.util.Scanner;

/**
 * @author zhangyc
 * @date 2019/11/9 19:38
 */

public class AdapterTest {
    public static void main(String[] args) {
        try {
            System.out.println("-----------AdapterTest start-------------");
            System.out.println("Input Motor Type You want to adapt:'ElectricAdapter'or'OpticalAdapter'.");
            Scanner sc = new Scanner(System.in);
            String str1 = sc.nextLine();
            if ("ElectricAdapter".equals(str1) || "OpticalAdapter".equals(str1)) {
                String cName = "MaintenanceModel.Adapter." + str1;
                Class<?> c = Class.forName(cName);
                Object obj = c.newInstance();
                Motor motor = (Motor) obj;
                motor.drive();
            } else {
                System.out.println("Wrong Adapter Type!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
