package ServiceModel.StateAndMemento;

//状态类
abstract class State implements Cloneable{
    int score;
    abstract void getDescription();
    abstract void updateScore(int score, Questionnaire q);

    @Override
    protected State clone() {
        try{
            return (State)super.clone();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
