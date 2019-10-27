package main;

/**
 * 视力障碍行动不便的游客只能借助 {@link TalkingGuide}
 * 在该设计模式中扮演Client（请求者）角色
 */
public class GuestWithDisabilities {

    private Guide guide;

    /**
     * 构造函数
     *
     * @param guide 指南
     */
    public GuestWithDisabilities(Guide guide) {
        this.guide = guide;
    }

    /**
     * 设置指南的种类
     *
     * @param guide 指南种类
     */
    public void setGuide(Guide guide) {
        this.guide = guide;
    }

    /**
     * 游客阅读地图
     */
    public void readGuide() {
        String funcName = Thread.currentThread().getStackTrace()[1].getMethodName();
        boolean result;
        result = (this.guide.getType() == "Soundable");
        if (result) {
            this.guide.guide();
            System.out.println(this.getClass() + " : " + funcName + " : " + "What a considerate park!");
        } else {
            System.out.println(this.getClass() + " : " + funcName + " : " + "Sadly, I'm like a chicken without the head.");
        }
    }

}
