package main;

/**
 * 为每个ConcreteColleague提供与{@link Mediator}交互的接口
 */
public interface Colleague {

    void setMediator(Mediator mediator);

    void setColleagueState(ColleagueState colleagueState);

    ColleagueState getColleagueState();

    public String getMyName();

    String getFamilyName();

    void seekHelp();

    void printResult();

    public int getCount();

    public void setCount(int count);
}
