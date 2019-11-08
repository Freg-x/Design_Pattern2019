package ServiceModel.StateAndMemento;

//备忘录
class Memento{
    //状态列表
    private State[] states;
    private int cur = -1;
    private int length = -1;

    Memento(int size){
        states = new State[++size];
    }

    //获取Undo状态
    State getUndoState(){
        if(cur == 0) return null;
        else return states[--cur];
    }

    //获取Redo状态
    State getRedoState(){
        if(cur == length) return null;
        else return states[++cur];
    }

    //记录状态
    void setState(State state){
        states[++cur] = state;
        length = cur;
    }
}
