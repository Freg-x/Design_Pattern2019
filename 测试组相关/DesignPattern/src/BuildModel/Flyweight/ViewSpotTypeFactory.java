package BuildModel.Flyweight;

import java.util.HashMap;

//景点标签工厂类
//含有属性：存放景点标签的库viewSpotTypeMap
//含有方法：获得景点标签
public class ViewSpotTypeFactory{
	private static final HashMap<String, ViewSpotType> viewSpotTypeMap = new HashMap<String, ViewSpotType>();
	static {
		viewSpotTypeMap.put("Shopping", new ViewSpotType("Shopping"));
	}
	//获得景点标签
	public static ViewSpotType getViewSpotType(String tag) {
		ViewSpotType vst = (ViewSpotType)viewSpotTypeMap.get(tag);
		if(vst == null) {
			vst = new ViewSpotType(tag);
			viewSpotTypeMap.put(tag, vst);
			System.out.println("ViewSpotType: getViewSpotType(): new a tag of view spot: "+tag);
		}
		return vst;
	}
}
