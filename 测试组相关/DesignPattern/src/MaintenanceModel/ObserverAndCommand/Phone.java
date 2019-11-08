package MaintenanceModel.ObserverAndCommand;


//监听者：电话
class Phone implements Observer{

    //控制电话的行为
    @Override
    public void update(int order) {
        if(order > 0) callSecurityCenter();
        else if(order == 0) callCancel();
        else System.out.println("Phone: update(): Invalid Order!");
    }

    //通知安保中心
    private void callSecurityCenter(){
        System.out.println("Phone: callSecurityCenter(): call the Security Center!");
    }

    //告诉安保中心警报已解除
    private void callCancel(){
        System.out.println("Phone: callCancel(): Call the Security Center that the alarm has stopped!");
    }
}
