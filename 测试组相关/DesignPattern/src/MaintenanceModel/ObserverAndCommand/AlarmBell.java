package MaintenanceModel.ObserverAndCommand;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

//监听者：警铃
class AlarmBell implements Observer{
    private Timer timer;
    private TimerTask timerTask;
    private int point = 0;
    private ArrayList<BellCommand> bellCommands = new ArrayList<>();

    //初始化时设置timerTask，使警铃开始时循环执行铃声命令
    AlarmBell(){
        timerTask = new TimerTask() {
            @Override
            public void run() {
                bellCommands.get(point).execute();
                point = (++point) % bellCommands.size();
            }
        };
    }

    //设置警铃的铃声命令
    void setAlarm(BellCommand command){
        if(timer == null){
            bellCommands.add(command);
        }
        else System.out.println("AlarmBell: setAlarm(): The AlarmBell is turning on, can't setAlarm."); /*警铃正在启动，无法设置*/
    }

    //控制警铃开关
    @Override
    public void update(int order) {
        if(order > 0) alarm();
        else if (order == 0) stopAlarm();
        else System.out.println("AlarmBell: update(): Invalid Order!");
    }

    //打开警铃，循环执行铃声命令
    private void alarm(){
        if(timer == null && bellCommands.size() != 0){
            System.out.println("AlarmBell: alarm(): The AlarmBell is turning on");
            point = 0;
            timer = new Timer(true);
            timer.schedule(timerTask, 0, 1000);
        }
        else System.out.println("AlarmBell: alarm(): The AlarmBell has turned on or hasn't set.");/*警铃已起动或未设置*/
    }

    //关闭警铃
    private void stopAlarm(){
        if(timer != null) {
            timer.cancel();
            timer = null;
            System.out.println("AlarmBell: stopAlarm(): The AlarmBell has turned off.");/*警铃已停止*/
        }
        else System.out.println("AlarmBell: stopAlarm(): The AlarmBell is not used.");/*警铃并未启用*/
    }
}
