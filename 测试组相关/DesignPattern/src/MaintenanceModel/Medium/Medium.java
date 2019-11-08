package MaintenanceModel.Medium;

//抽象中介类：平台
//它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。
interface Medium
{
    //修理信息
    void fixMessage(Worker Worker);
    //转发
    void relay(Worker from, String ad);
}
