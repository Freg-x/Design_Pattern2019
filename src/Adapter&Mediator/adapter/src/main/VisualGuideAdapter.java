package main;

/**
 * 适配器类。将普通指南 ({@link VisualGuide}) 适配成有声指南 {@link TalkingGuide}
 * 视障游客 ({@link GuestWithDisabilities}) 需要从该类获取有声指南 {@link TalkingGuide}
 */
public class VisualGuideAdapter extends TalkingGuide {
    private VisualGuide visualGuide;

    /**
     * 构造适配器
     * @param visualGuide 普通指南
     */
    public VisualGuideAdapter(VisualGuide visualGuide) {
        this.visualGuide = visualGuide;
    }

    public void guide(){
        String funcName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(this.getClass() + " : " + funcName + " : " + "Conversion start...");
        visualGuide.guide();
    }
}
