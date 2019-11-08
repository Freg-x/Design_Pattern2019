package BuildModel.Flyweight;

//景点标签类
//含有属性：标签tag
//含有方法：构造函数，输出标签信息
public class ViewSpotType{
	private String tag;
	public ViewSpotType(String tag) {
		this.tag = tag;
	}
	//输出标签信息
	public void printTypeInfo() {
		System.out.println("ViewSpotType: printTypeInfo():  is a "+tag+" view spot.");
	}
}
