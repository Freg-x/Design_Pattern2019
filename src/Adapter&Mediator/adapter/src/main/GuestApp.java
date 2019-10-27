package main;

public class GuestApp {

    /**
     * 程序入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        System.out.println("------------Adapter & Template Method test in XXX------------");
        // 构造两种指南
        TalkingGuide talkingGuide = new TalkingGuide();
        VisualGuide visualGuide = new VisualGuide();
        // 视障游客能借助有声指南获取信息
        System.out.println("1. A blind read a talking guide");
        GuestWithDisabilities guestWithDisabilities = new GuestWithDisabilities(talkingGuide);
        guestWithDisabilities.readGuide();
        // 视障游客无法使用普通指南
        System.out.println("2. A blind read a visual guide");
        guestWithDisabilities.setGuide(visualGuide);
        guestWithDisabilities.readGuide();
        // 当普通指南转化成有声指南输出后，视障游客可获取信息
        System.out.println("3. A blind read a visual guide with the help of an adapter");
        VisualGuideAdapter visualGuideAdapter = new VisualGuideAdapter(visualGuide);
        guestWithDisabilities.setGuide(visualGuideAdapter);
        guestWithDisabilities.readGuide();
    }
}
