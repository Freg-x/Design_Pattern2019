package ServiceModel.StateAndMemento;

import java.util.ArrayList;

//未完成状态
class Unfinished extends State{
    //问题列表与当前问题
    private static ArrayList<String> questions = new ArrayList<>(){
        {
            add("Are you satisfied with our Entertainment Facilities?");/*请问您对我们游乐园的娱乐项目满意吗？*/
            add("Are you satisfied with our Service?");
            add("Are you satisfied with our Markets and Food?");
            add("Are you satisfied with our Security and Maintenancement?");
        }
    };
    private int step;

    //获取问题总数
    static int getQuestionNum(){
        return questions.size();
    }

    //获取未完成问卷当前问题
    @Override
    void getDescription() {
        System.out.println(questions.get(step));
    }

    //更新分数
    @Override
    void updateScore(int score, Questionnaire q) {
        this.score += score;
        if(++step == questions.size()){
            q.setState(new Finished(this.score));
        }
    }
}
