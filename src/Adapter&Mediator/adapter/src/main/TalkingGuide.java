package main;

/**
 * 景区需要提供有声指南服务 client（视障游客）
 * 在该设计模式中扮演 Target（对象）角色
 */
public class TalkingGuide extends Guide {

    public TalkingGuide(){
        super("Soundable");
    }

    public void guide(){
        String funcName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(this.getClass() + " : " + funcName + " : " + "The talking guide will help you enjoy the travel in DisneyLand.");
    }

}
