package MaintenanceModel.ChainOfResponsibility;

//投诉责任链上的节点类
//含有属性：负责人的姓名name，连向下一责任人的指针responsibilityHandler
//含有方法：构造方法，返回下一责任链上的节点，设置下一责任人，处理投诉
public class ResponsibilityHandler{
	private ResponsibilityHandler responsibilityHandler = null;
	private String name;
	public ResponsibilityHandler(String name) {
		this.name = name;
	}
	//返回下一责任链上的节点
	public ResponsibilityHandler next() {
		return this.responsibilityHandler;
	}
	//设置下一责任人
	public void setResponsibilityHandler(ResponsibilityHandler responsibilityHandler) {
		this.responsibilityHandler = responsibilityHandler;
	}
	//处理投诉
	public void work(String r) {
		if(this.name == r) {
			System.out.println("ResponsibilityHandler:work():"+name+" is handling!");
		}
		else {
			System.out.println("ResponsibilityHandler:work():"+name+" pass complaints to "+this.next().name);
			this.next().work(r);
		}
	}
}
