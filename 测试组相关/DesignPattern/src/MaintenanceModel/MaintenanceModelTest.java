package MaintenanceModel;

import MaintenanceModel.Adapter.Motor;
import MaintenanceModel.ChainOfResponsibility.ResponsibilityHandler;
import MaintenanceModel.Medium.*;
import MaintenanceModel.ObserverAndCommand.AlarmSystem;

import java.util.Scanner;

//MaintenanceModel模块测试模板
public class MaintenanceModelTest {
    public void ModelTest() {
       /* Overhaul();
        sleep(2000);
        chainOfResponsibility();
        sleep(2000);
        alarm();
        sleep(2000);*/
        AdapterTest();
    }

    //休眠一段时间
    private void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //责任链设计模式测试模板
    public void chainOfResponsibility() {
        //创建责任链
        ResponsibilityHandler security = new ResponsibilityHandler("Security Guard");
        ResponsibilityHandler regionalManager = new ResponsibilityHandler("Regional Manager");
        ResponsibilityHandler chiefOfficer = new ResponsibilityHandler("Chief Officer");
        ResponsibilityHandler manager = new ResponsibilityHandler("Manager");
        security.setResponsibilityHandler(regionalManager);
        regionalManager.setResponsibilityHandler(chiefOfficer);
        chiefOfficer.setResponsibilityHandler(manager);

        //调用此责任链
        System.out.println("Tourists make the first type of complaint, which needs to be handled by security guard");
        security.work("Security Guard");
        System.out.println();
        System.out.println("Tourists make the second type of complaint, which needs to be handled by regional manager");
        security.work("Regional Manager");
        System.out.println();
        System.out.println("Tourists make the third type of complaint, which needs to be handled by chief officer");
        security.work("Chief Officer");
        System.out.println();
        System.out.println("Tourists make the fourth type of complaint, which needs to be handled by manager");
        security.work("Manager");
        System.out.println();
    }


    //中介者设计模式（维修中心）测试模板
    public void Overhaul() {
        //获取维修中心，工人实例
        FixMedium md = new FixMedium();
        Worker f1, f2, w1, w2;
        f1 = new FixFinder("Inspector1");
        f2 = new FixFinder("Inspector2");
        w1 = new FixWorker("Repairman1");
        w2 = new FixWorker("Repairman2");

        //维修中心注册工人
        md.fixMessage(f1);
        md.fixMessage(f2);
        md.fixMessage(w1);
        md.fixMessage(w2);

        //工人之间发送信息
        f1.send("The device needs to be repaired! ");
        System.out.println("After a while...");
        w1.send("Finish the repair! ");
        System.out.println("After a while...");
        f2.send("The device needs to be repaired! ");
        System.out.println("After a while...");
        w2.send("Finish the repair! ");
    }


    //命令模式与监听者模式（警报系统）测试模板
    public void alarm() {
        //获取警报中心实例
        AlarmSystem alarmSystem = AlarmSystem.entry();

        //设置警铃
        alarmSystem.addAlarmBellCommand("longBell");
        alarmSystem.addAlarmBellCommand("longBell");
        alarmSystem.addAlarmBellCommand("shortBell");

        //开启与关闭
        alarmSystem.open();
        sleep(8000);
        alarmSystem.close();
    }

    public void AdapterTest() {
        try {
            System.out.println("Adapter test:");
            System.out.println("Input Motor Type You want to adapter:'ElectricAdapter'or'OpticalAdapter'.");
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
            return;
        }
    }

}


