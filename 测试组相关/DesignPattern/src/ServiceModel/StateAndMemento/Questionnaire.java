package ServiceModel.StateAndMemento;

import java.util.Scanner;

//问卷，包含问卷的状态与状态备忘录
public class Questionnaire{
    private State currentState;
    private Memento memento;

    //填写问卷
    public void fillInQuestionnaire(){
        System.out.println("Please Input 'A','B','C' to complete the questionnaire，Input 'undo' to do the former step,Input 'redo' to do the next step,Input'0' to exit.");
        System.out.println("'A' is regarded as five points,'B' is regarded as four points,'C' is regarded as three points");

        Scanner scanner = new Scanner(System.in);
        String order = "";
        currentState = new Unfinished();
        memento = new Memento(Unfinished.getQuestionNum());
        memento.setState(currentState.clone());

        //输入命令来填写问卷
        while (!order.equals("0")){
            currentState.getDescription();
            order = scanner.nextLine();
            switch (order){
                case "A": {
                    addScore(5);
                    break;
                }
                case "B": {
                    addScore(3);
                    break;
                }
                case "C": {
                    addScore(1);
                    break;
                }
                case "undo": {
                    undo();
                    break;
                }
                case "redo": {
                    redo();
                    break;
                }
                case "0": break;
                default: {
                    System.out.println("Incorrect Input,Please Input Again!");
                    break;
                }
            }
        }
    }

    //Undo操作
    private void undo(){
        State state = memento.getUndoState();
        if(state != null){
            currentState = state;
            System.out.println("undo successful!");
        }
        else System.out.println("NO former step, can't undo");
    }

    //Redo操作
    private void redo(){
        State state = memento.getRedoState();
        if(state != null){
            currentState = state;
            System.out.println("redo successful!");
        }
        else System.out.println("NO next step,can't redo");
    }

    //更新问卷状态记录的分数
    private void addScore(int score){
        if(currentState instanceof Unfinished){
            currentState.updateScore(score,this);
            memento.setState(currentState.clone());
        }
        else currentState.updateScore(score,this);
    }

    //设置问卷当前状态
    void setState(State state){
        currentState = state;
    }
}
