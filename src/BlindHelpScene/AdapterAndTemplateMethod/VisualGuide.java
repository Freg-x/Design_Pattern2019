package BlindHelpScene.AdapterAndTemplateMethod;

/**
 * 被适配类（在该设计模式中扮演adaptee角色），此类能被复用。
 * 景区提供普通指南。
 */
public class VisualGuide extends Guide {

    public VisualGuide(){
        super("Visual");
    }

    public void guide() {
        String funcName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(this.getClass() + " : " + funcName + " : " + "The Visual guide will help you enjoy the travel in DisneyLand.");
    }
}
