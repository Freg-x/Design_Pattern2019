package BabyCareCenterScene.Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 走失儿童认领处，是Mediator类 {@link Mediator}的具体实现。
 * 在该设计模式中扮演(ConcreteMediator)角色。
 */

public class BabyCareCenter implements Mediator {

    //存放需要通信的Colleague
    private List<Colleague> colleagues;

    public BabyCareCenter() {
        colleagues = new ArrayList<>();
    }

    /**
     * 登记Colleague，为每个Colleague提供Mediator
     *
     * @param colleague 在走失儿童认领处登记的游客
     */
    @Override
    public void register(Colleague colleague) {
        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    /**
     * 在家长与其失散的孩子团聚后调用此方法。
     * 将家长及其孩子的状态设置为REUNION
     *
     * @param colleague  寻人请求发起方
     * @param colleague1 发起方需要寻找的对象
     */
    @Override
    public void cancellation(Colleague colleague, Colleague colleague1) {
        colleague.setColleagueState(ColleagueState.REUNION);
        colleague1.setColleagueState(ColleagueState.REUNION);
    }

    /**
     * 为每个需要寻找其亲人的Colleague提供帮助
     *
     * @param colleague 寻人请求发起方
     */
    public void offerHelp(Colleague colleague) {
        String funcName = Thread.currentThread().getStackTrace()[1].getMethodName();

        //获取来访次数
        int count = colleague.getCount();
        colleague.setCount(++count);

        //如果发起方已找到其家属，那么将之后的多次来访认定为搞事情
        if (colleague.getColleagueState() == ColleagueState.SEPARATION) {
            System.out.println(this.getClass() + " : " + funcName + " : " + "Don't Worry! We'll do our best for you!");
        } else if (count > 1 && colleague.getColleagueState() == ColleagueState.REUNION) {
            System.out.println(this.getClass() + " : " + funcName + " : " + "Excuse me Sir, are you looking for some trouble?!");
            return;
        }

        boolean isFound = false;
        String initiator = colleague.getMyName();
        String lookingFor = colleague.getFamilyName();
        Colleague colleague1 = null;

        //遍历List，从登记列表中寻找姓名匹配的游客，需要判断同名不同人情况
        for (int i = 0; i < colleagues.size(); i++) {
            colleague1 = colleagues.get(i);
            if (colleague1.getMyName() == lookingFor && colleague1.getFamilyName() == initiator) {
                isFound = true;
                int count1 = colleague1.getCount();
                colleague1.setCount(++count1);
                cancellation(colleague, colleague1);
                break;
            }
        }

        if (isFound && count == 1) {
            System.out.println(this.getClass() + " : " + funcName + " : " + "We have found your family -- " + lookingFor + "!");
            colleague1.printResult();
        } else {
            System.out.println(this.getClass() + " : " + funcName + " : " + "Sorry, We haven't found yet.");
        }

        colleague.printResult();
    }

    /**
     * @return 获取列表
     */
    public List<Colleague> getColleagues() {
        return colleagues;
    }
}
