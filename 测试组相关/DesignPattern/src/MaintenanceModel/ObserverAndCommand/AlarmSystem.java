package MaintenanceModel.ObserverAndCommand;

import java.util.ArrayList;

//警报系统
public class AlarmSystem{
    private static ArrayList<Observer> observers = new ArrayList<>();
    private static AlarmSystem alarmSystem = new AlarmSystem();
    private Phone phone = new Phone();
    private AlarmBell alarmBell = new AlarmBell();

    //初始化警报系统，添加监听者：警铃与电话
    private AlarmSystem(){
        observers.add(alarmBell);
        observers.add(phone);
    }

    //获取警报系统实例
    public static AlarmSystem entry(){
        return alarmSystem;
    }

    //设置警铃
    public void addAlarmBellCommand(String command){
        if(command.equals("longBell")) alarmBell.setAlarm(new AlarmLong());
        else if(command.equals("shortBell"))alarmBell.setAlarm(new AlarmShort());
        else System.out.println("AlarmSystem: addAlarmBellCommand(): Invalid Command");
    }

    //打开警报
    public void open(){
        notify(1);
    }

    //关闭警报
    public void close(){
        notify(0);
    }

    //通知监听者
    private void notify(int order){
        int i = 0;
        for (Observer observer: observers)
        {
            observer.update(order);
        }
    }
}


