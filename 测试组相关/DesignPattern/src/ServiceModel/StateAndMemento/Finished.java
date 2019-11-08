package ServiceModel.StateAndMemento;

//完成状态
class Finished extends State{
    Finished(int score){
        this.score = score;
    }

    //获取介绍
    @Override
    void getDescription() {
        System.out.println("Thanks for giving " + this.score + " Points to our Amusement Park! and Input 0 to exit");
    }

    //更新分数
    @Override
    void updateScore(int score, Questionnaire q) {
        System.out.println("Have finished the Questionnaire!");/*问卷已完成，无需给出评价*/
    }
}
