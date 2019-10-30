package BabyCareCenterScene.Mediator;

/**
 * 与孩子失散的家长，在该设计模式中扮演(ConcreteColleague)角色。
 * 是{@link ColleagueBase}的具体实现
 */

public class Parent extends ColleagueBase {

    public Parent(String myName, String familyName, ColleagueState colleagueState) {
        super(myName, familyName, colleagueState);
    }

}
