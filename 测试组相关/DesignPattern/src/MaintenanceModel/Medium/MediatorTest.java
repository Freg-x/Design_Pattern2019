package MaintenanceModel.Medium;

import java.util.Scanner;
/**
 * @author zhangyc
 * @date 2019/11/9 18:20
 */

public class MediatorTest {
    public static void main(String[] args) {
        System.out.println("-----------MediatorTest start-------------");

        //实例化
        FixMedium medium = new FixMedium();
        FixWorker worker = new FixWorker("worker");
        FixFinder finder = new FixFinder("finder");

        //注册登记worker到medium
        medium.fixMessage(worker);
        medium.fixMessage(finder);

        //发送信息
        worker.send("worker call finder");
        finder.send("finder call worker");

    }

}
