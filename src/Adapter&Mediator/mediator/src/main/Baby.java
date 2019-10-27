package main;

/**
 * 与家长走失的孩子，在该设计模式中扮演(ConcreteColleague)角色。
 * 是{@link ColleagueBase}的具体实现
 */

public class Baby extends ColleagueBase {

    public Baby(String myName, String familyName, ColleagueState colleagueState) {
        super(myName, familyName, colleagueState);
    }

}
