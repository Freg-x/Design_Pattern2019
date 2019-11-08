package EntertainmentModel.Template;

public abstract class Facility
{
    //定义游乐设施运转的模板算法
    public final void FacilityRunTemplate(){
        //步骤1：检票
        Customer_Enter();
        //步骤2：设施准备
        Facility_Prepare();
        //步骤3：设施启动
        Facility_Start();
        //步骤4：设施运转中
        Facility_Run();
        //步骤5：设施停止
        Facility_Stop();
    }
    //公有步骤
    private void Customer_Enter(){
        System.out.println("Facility:Customer_Enter(): Tourists enter the Spot");
    }
    private void Facility_Prepare(){
        System.out.println("Facility:Facility_Prepare(): Facilities are preparing");
    }
    private void Facility_Stop(){ System.out.println("Facility:Facility_Stop(): Facilities stop, tourists leave\n"); }

    //特有步骤
    protected abstract void Facility_Start();
    protected abstract void Facility_Run();
}
