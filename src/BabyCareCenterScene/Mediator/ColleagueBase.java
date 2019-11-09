package BabyCareCenterScene.Mediator;

/**
 * 每个Colleague的抽象基类
 */
public abstract class ColleagueBase implements Colleague {

    private Mediator mediator;
    private String myName;
    private String familyName;
    private ColleagueState colleagueState;
    private int count;

    /**
     * 构造函数
     *
     * @param myName         自己姓名
     * @param familyName     亲人姓名
     * @param colleagueState 聚散状态
     */
    public ColleagueBase(String myName, String familyName, ColleagueState colleagueState) {
        this.myName = myName;
        this.familyName = familyName;
        this.colleagueState = colleagueState;
    }

    /**
     * Mediator获取访问走失儿童认领处次数
     *
     * @return 访问走失儿童认领处次数
     */
    public int getCount() {
        return count;
    }

    /**
     * 计数，Mediator更新访问次数
     *
     * @param count 新的访问次数
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * 设置Mediator
     *
     * @param mediator 中介者
     */
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 设置聚散状态
     *
     * @param colleagueState 聚散状态
     */
    @Override
    public void setColleagueState(ColleagueState colleagueState) {
        this.colleagueState = colleagueState;
    }

    /**
     * 获取聚散状态
     *
     * @return 聚散状态
     */
    @Override
    public ColleagueState getColleagueState() {
        return colleagueState;
    }

    /**
     * 获取自己的姓名
     *
     * @return 自己姓名
     */
    @Override
    public String getMyName() {
        return myName;
    }

    /**
     * 获取家人姓名
     *
     * @return 家人姓名
     */
    @Override
    public String getFamilyName() {
        return familyName;
    }

    /**
     * 通过mediator，向{@link BabyCareCenter}寻求帮助
     */
    @Override
    public void seekHelp() {
        String funcName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if (mediator == null) {
            System.out.println(this.getClass() + " : " + myName + " : " + funcName + " : " + "Sorry, there is no BabyCareCenterScene in Disney.");
            return;
        }
        if (count == 0 && colleagueState == ColleagueState.SEPARATION) {
            System.out.println(this.getClass() + " : " + myName + " : " + funcName + " : " + colleagueState.toString() + " -- " + familyName + "!");
        } else if (count > 0 && ColleagueState.REUNION == colleagueState) {
            System.out.println(this.getClass() + " : " + myName + " : " + funcName + " : " + "I can't find my family members -- " + familyName + "!");
        }
        //需要帮助的时候通知mediator
        mediator.offerHelp(this);
    }

    /**
     * 根据不同状态输出结果
     */
    @Override
    public void printResult() {
        String funcName = Thread.currentThread().getStackTrace()[1].getMethodName();
        if (colleagueState == ColleagueState.REUNION) {
            System.out.println(this.getClass() + " : " + myName + " : " + funcName + " : " + colleagueState.toString());
        } else {
            System.out.println(this.getClass() + " : " + myName + " : " + funcName + " : " + "My Dear, where are you QAQ...");
        }
    }
}
