package MaintenanceModel.Medium;

import java.util.ArrayList;
import java.util.List;

//具体中介类：维修平台
//实现中介者接口，定义一个 List 来管理工人对象，协调各个工人角色之间的交互关系，因此它依赖于工人角色。
public class FixMedium implements Medium
{
    //所有工人角色
    private List<Worker> workers=new ArrayList<Worker>();
    //工人信息，其实是一个注册函数，如果新的工人未注册，则将其加入list
    public void fixMessage(Worker worker)
    {
        if(!workers.contains(worker))
        {
            workers.add(worker);
            worker.setMedium(this);
        }
    }
    //转发，参数包括了发送者和信息
    public void relay(Worker from,String ad)
    {

        for(Worker wk: workers)
        {
            if(!wk.equals(from))
            {
                wk.receive(from.name, ad);
            }
        }
    }
}
