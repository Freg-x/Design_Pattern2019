package BuildModel.Flyweight;

//经典类
//含有属性：景点名称name，经典类型vst
//含有方法：构造方法，输出景点信息
public class ViewSpot{
	private String name;
	private ViewSpotType vst;
	public ViewSpot(String name, ViewSpotType vst) {
		this.name = name;
		this.vst = vst;
	}
	//输出景点信息
	public void printInfo() {
		System.out.print("ViewSpot: printInfo(): " + name);
		vst.printTypeInfo();
	}
}
